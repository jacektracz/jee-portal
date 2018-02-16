package entp.portal.managedbean;

import entp.portal.Joo2VirtuemartManufacturercategories;
import entp.portal.managedbean.util.JsfUtil;
import entp.portal.managedbean.util.PaginationHelper;
import entp.portal.session.Joo2VirtuemartManufacturercategoriesFacade;

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

@Named("joo2VirtuemartManufacturercategoriesController")
@SessionScoped
public class Joo2VirtuemartManufacturercategoriesController implements Serializable {

    private Joo2VirtuemartManufacturercategories current;
    private DataModel items = null;
    @EJB
    private entp.portal.session.Joo2VirtuemartManufacturercategoriesFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2VirtuemartManufacturercategoriesController() {
    }

    public Joo2VirtuemartManufacturercategories getSelected() {
        if (current == null) {
            current = new Joo2VirtuemartManufacturercategories();
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2VirtuemartManufacturercategoriesFacade getFacade() {
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
        current = (Joo2VirtuemartManufacturercategories) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2VirtuemartManufacturercategories();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2VirtuemartManufacturercategoriesCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2VirtuemartManufacturercategories) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2VirtuemartManufacturercategoriesUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2VirtuemartManufacturercategories) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2VirtuemartManufacturercategoriesDeleted"));
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

    public Joo2VirtuemartManufacturercategories getJoo2VirtuemartManufacturercategories(java.lang.Long id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2VirtuemartManufacturercategories.class)
    public static class Joo2VirtuemartManufacturercategoriesControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Joo2VirtuemartManufacturercategoriesController controller = (Joo2VirtuemartManufacturercategoriesController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2VirtuemartManufacturercategoriesController");
            return controller.getJoo2VirtuemartManufacturercategories(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Joo2VirtuemartManufacturercategories) {
                Joo2VirtuemartManufacturercategories o = (Joo2VirtuemartManufacturercategories) object;
                return getStringKey(o.getVirtuemartManufacturercategoriesId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2VirtuemartManufacturercategories.class.getName());
            }
        }
    }
}
