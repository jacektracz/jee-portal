package entp.portal.managedbean;

import entp.portal.Joo2Schemas;
import entp.portal.managedbean.util.JsfUtil;
import entp.portal.managedbean.util.PaginationHelper;
import entp.portal.session.Joo2SchemasFacade;

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

@Named("joo2SchemasController")
@SessionScoped
public class Joo2SchemasController implements Serializable {

    private Joo2Schemas current;
    private DataModel items = null;
    @EJB
    private entp.portal.session.Joo2SchemasFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2SchemasController() {
    }

    public Joo2Schemas getSelected() {
        if (current == null) {
            current = new Joo2Schemas();
            current.setJoo2SchemasPK(new entp.portal.Joo2SchemasPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2SchemasFacade getFacade() {
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
        current = (Joo2Schemas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2Schemas();
        current.setJoo2SchemasPK(new entp.portal.Joo2SchemasPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2SchemasCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2Schemas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2SchemasUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2Schemas) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2SchemasDeleted"));
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

    public Joo2Schemas getJoo2Schemas(entp.portal.Joo2SchemasPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2Schemas.class)
    public static class Joo2SchemasControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Joo2SchemasController controller = (Joo2SchemasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2SchemasController");
            return controller.getJoo2Schemas(getKey(value));
        }

        entp.portal.Joo2SchemasPK getKey(String value) {
            entp.portal.Joo2SchemasPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new entp.portal.Joo2SchemasPK();
            key.setExtensionId(Integer.parseInt(values[0]));
            key.setVersionId(values[1]);
            return key;
        }

        String getStringKey(entp.portal.Joo2SchemasPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getExtensionId());
            sb.append(SEPARATOR);
            sb.append(value.getVersionId());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Joo2Schemas) {
                Joo2Schemas o = (Joo2Schemas) object;
                return getStringKey(o.getJoo2SchemasPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2Schemas.class.getName());
            }
        }
    }
}
