package entp.portal.managedbean;

import entp.portal.Joo2ModulesMenu;
import entp.portal.managedbean.util.JsfUtil;
import entp.portal.managedbean.util.PaginationHelper;
import entp.portal.session.Joo2ModulesMenuFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("joo2ModulesMenuController")
@SessionScoped
public class Joo2ModulesMenuController implements Serializable {

    private Joo2ModulesMenu current;
    private DataModel items = null;
    @EJB
    private entp.portal.session.Joo2ModulesMenuFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2ModulesMenuController() {
    }

    public Joo2ModulesMenu getSelected() {
        if (current == null) {
            current = new Joo2ModulesMenu();
            current.setJoo2ModulesMenuPK(new entp.portal.Joo2ModulesMenuPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2ModulesMenuFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {
                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (Joo2ModulesMenu) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2ModulesMenu();
        current.setJoo2ModulesMenuPK(new entp.portal.Joo2ModulesMenuPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2ModulesMenuCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2ModulesMenu) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2ModulesMenuUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2ModulesMenu) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2ModulesMenuDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Joo2ModulesMenu getJoo2ModulesMenu(entp.portal.Joo2ModulesMenuPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2ModulesMenu.class)
    public static class Joo2ModulesMenuControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Joo2ModulesMenuController controller = (Joo2ModulesMenuController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2ModulesMenuController");
            return controller.getJoo2ModulesMenu(getKey(value));
        }

        entp.portal.Joo2ModulesMenuPK getKey(String value) {
            entp.portal.Joo2ModulesMenuPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new entp.portal.Joo2ModulesMenuPK();
            key.setModuleid(Integer.parseInt(values[0]));
            key.setMenuid(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(entp.portal.Joo2ModulesMenuPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getModuleid());
            sb.append(SEPARATOR);
            sb.append(value.getMenuid());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Joo2ModulesMenu) {
                Joo2ModulesMenu o = (Joo2ModulesMenu) object;
                return getStringKey(o.getJoo2ModulesMenuPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2ModulesMenu.class.getName());
            }
        }
    }
}
