package entp.portal.managedbean;

import entp.portal.Joo2BannerTracks;
import entp.portal.managedbean.util.JsfUtil;
import entp.portal.managedbean.util.PaginationHelper;
import entp.portal.session.Joo2BannerTracksFacade;

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

@Named("joo2BannerTracksController")
@SessionScoped
public class Joo2BannerTracksController implements Serializable {

    private Joo2BannerTracks current;
    private DataModel items = null;
    @EJB
    private entp.portal.session.Joo2BannerTracksFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2BannerTracksController() {
    }

    public Joo2BannerTracks getSelected() {
        if (current == null) {
            current = new Joo2BannerTracks();
            current.setJoo2BannerTracksPK(new entp.portal.Joo2BannerTracksPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2BannerTracksFacade getFacade() {
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
        current = (Joo2BannerTracks) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2BannerTracks();
        current.setJoo2BannerTracksPK(new entp.portal.Joo2BannerTracksPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2BannerTracksCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2BannerTracks) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2BannerTracksUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2BannerTracks) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("Joo2BannerTracksDeleted"));
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

    public Joo2BannerTracks getJoo2BannerTracks(entp.portal.Joo2BannerTracksPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2BannerTracks.class)
    public static class Joo2BannerTracksControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Joo2BannerTracksController controller = (Joo2BannerTracksController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2BannerTracksController");
            return controller.getJoo2BannerTracks(getKey(value));
        }

        entp.portal.Joo2BannerTracksPK getKey(String value) {
            entp.portal.Joo2BannerTracksPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new entp.portal.Joo2BannerTracksPK();
            key.setTrackDate(java.sql.Date.valueOf(values[0]));
            key.setTrackType(Integer.parseInt(values[1]));
            key.setBannerId(Integer.parseInt(values[2]));
            return key;
        }

        String getStringKey(entp.portal.Joo2BannerTracksPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getTrackDate());
            sb.append(SEPARATOR);
            sb.append(value.getTrackType());
            sb.append(SEPARATOR);
            sb.append(value.getBannerId());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Joo2BannerTracks) {
                Joo2BannerTracks o = (Joo2BannerTracks) object;
                return getStringKey(o.getJoo2BannerTracksPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2BannerTracks.class.getName());
            }
        }
    }
}
