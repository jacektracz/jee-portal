package entp.portal.managedbean;

import entp.portal.Joo2KunenaModeration;
import entp.portal.managedbean.util.JsfUtil;
import entp.portal.managedbean.util.PaginationHelper;
import entp.portal.session.Joo2KunenaModerationFacade;

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

@Named("joo2KunenaModerationController")
@SessionScoped
public class Joo2KunenaModerationController implements Serializable {

    private Joo2KunenaModeration current;
    private DataModel items = null;
    @EJB
    private entp.portal.session.Joo2KunenaModerationFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2KunenaModerationController() {
    }

    public Joo2KunenaModeration getSelected() {
        if (current == null) {
            current = new Joo2KunenaModeration();
            current.setJoo2KunenaModerationPK(new entp.portal.Joo2KunenaModerationPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2KunenaModerationFacade getFacade() {
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
        current = (Joo2KunenaModeration) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2KunenaModeration();
        current.setJoo2KunenaModerationPK(new entp.portal.Joo2KunenaModerationPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2KunenaModerationCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2KunenaModeration) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2KunenaModerationUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2KunenaModeration) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2KunenaModerationDeleted"));
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

    public Joo2KunenaModeration getJoo2KunenaModeration(entp.portal.Joo2KunenaModerationPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2KunenaModeration.class)
    public static class Joo2KunenaModerationControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Joo2KunenaModerationController controller = (Joo2KunenaModerationController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2KunenaModerationController");
            return controller.getJoo2KunenaModeration(getKey(value));
        }

        entp.portal.Joo2KunenaModerationPK getKey(String value) {
            entp.portal.Joo2KunenaModerationPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new entp.portal.Joo2KunenaModerationPK();
            key.setCatid(Integer.parseInt(values[0]));
            key.setUserid(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(entp.portal.Joo2KunenaModerationPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getCatid());
            sb.append(SEPARATOR);
            sb.append(value.getUserid());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Joo2KunenaModeration) {
                Joo2KunenaModeration o = (Joo2KunenaModeration) object;
                return getStringKey(o.getJoo2KunenaModerationPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2KunenaModeration.class.getName());
            }
        }
    }
}
