/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_phocagallery_categories", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryCategories.findAll", query = "SELECT j FROM Joo2PhocagalleryCategories j"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findById", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByParentId", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByOwnerId", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.ownerId = :ownerId"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByTitle", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByName", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByAlias", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByImage", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.image = :image"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findBySection", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.section = :section"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByImagePosition", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.imagePosition = :imagePosition"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByDate", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.date = :date"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByPublished", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByApproved", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.approved = :approved"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByEditor", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.editor = :editor"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByAccess", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByCount", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.count = :count"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByHits", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByLatitude", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.latitude = :latitude"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByLongitude", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.longitude = :longitude"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByZoom", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.zoom = :zoom"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByGeotitle", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.geotitle = :geotitle"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExtid", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.extid = :extid"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExta", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.exta = :exta"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExtu", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.extu = :extu"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExtauth", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.extauth = :extauth"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExtfbuid", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.extfbuid = :extfbuid"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByExtfbcatid", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.extfbcatid = :extfbcatid"),
    @NamedQuery(name = "Joo2PhocagalleryCategories.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryCategories j WHERE j.language = :language")})
public class Joo2PhocagalleryCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id", nullable = false)
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "owner_id", nullable = false)
    private int ownerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image", nullable = false, length = 255)
    private String image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "section", nullable = false, length = 50)
    private String section;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "image_position", nullable = false, length = 30)
    private String imagePosition;
    @Lob
    @Size(max = 65535)
    @Column(name = "description", length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approved", nullable = false)
    private boolean approved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Size(max = 50)
    @Column(name = "editor", length = 50)
    private String editor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access", nullable = false)
    private short access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count", nullable = false)
    private int count;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Lob
    @Size(max = 65535)
    @Column(name = "accessuserid", length = 65535)
    private String accessuserid;
    @Lob
    @Size(max = 65535)
    @Column(name = "uploaduserid", length = 65535)
    private String uploaduserid;
    @Lob
    @Size(max = 65535)
    @Column(name = "deleteuserid", length = 65535)
    private String deleteuserid;
    @Lob
    @Size(max = 65535)
    @Column(name = "userfolder", length = 65535)
    private String userfolder;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "latitude", nullable = false, length = 20)
    private String latitude;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "longitude", nullable = false, length = 20)
    private String longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zoom", nullable = false)
    private int zoom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "geotitle", nullable = false, length = 255)
    private String geotitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extid", nullable = false, length = 255)
    private String extid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "exta", nullable = false, length = 255)
    private String exta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extu", nullable = false, length = 255)
    private String extu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extauth", nullable = false, length = 255)
    private String extauth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extfbuid", nullable = false)
    private int extfbuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extfbcatid", nullable = false, length = 255)
    private String extfbcatid;
    @Lob
    @Size(max = 65535)
    @Column(name = "params", length = 65535)
    private String params;
    @Lob
    @Size(max = 65535)
    @Column(name = "metakey", length = 65535)
    private String metakey;
    @Lob
    @Size(max = 65535)
    @Column(name = "metadesc", length = 65535)
    private String metadesc;
    @Lob
    @Size(max = 65535)
    @Column(name = "metadata", length = 65535)
    private String metadata;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2PhocagalleryCategories() {
    }

    public Joo2PhocagalleryCategories(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryCategories(Integer id, int parentId, int ownerId, String title, String name, String alias, String image, String section, String imagePosition, Date date, boolean published, boolean approved, int checkedOut, Date checkedOutTime, int ordering, short access, int count, int hits, String latitude, String longitude, int zoom, String geotitle, String extid, String exta, String extu, String extauth, int extfbuid, String extfbcatid, String language) {
        this.id = id;
        this.parentId = parentId;
        this.ownerId = ownerId;
        this.title = title;
        this.name = name;
        this.alias = alias;
        this.image = image;
        this.section = section;
        this.imagePosition = imagePosition;
        this.date = date;
        this.published = published;
        this.approved = approved;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.access = access;
        this.count = count;
        this.hits = hits;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
        this.geotitle = geotitle;
        this.extid = extid;
        this.exta = exta;
        this.extu = extu;
        this.extauth = extauth;
        this.extfbuid = extfbuid;
        this.extfbcatid = extfbcatid;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(String imagePosition) {
        this.imagePosition = imagePosition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public short getAccess() {
        return access;
    }

    public void setAccess(short access) {
        this.access = access;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getAccessuserid() {
        return accessuserid;
    }

    public void setAccessuserid(String accessuserid) {
        this.accessuserid = accessuserid;
    }

    public String getUploaduserid() {
        return uploaduserid;
    }

    public void setUploaduserid(String uploaduserid) {
        this.uploaduserid = uploaduserid;
    }

    public String getDeleteuserid() {
        return deleteuserid;
    }

    public void setDeleteuserid(String deleteuserid) {
        this.deleteuserid = deleteuserid;
    }

    public String getUserfolder() {
        return userfolder;
    }

    public void setUserfolder(String userfolder) {
        this.userfolder = userfolder;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public String getGeotitle() {
        return geotitle;
    }

    public void setGeotitle(String geotitle) {
        this.geotitle = geotitle;
    }

    public String getExtid() {
        return extid;
    }

    public void setExtid(String extid) {
        this.extid = extid;
    }

    public String getExta() {
        return exta;
    }

    public void setExta(String exta) {
        this.exta = exta;
    }

    public String getExtu() {
        return extu;
    }

    public void setExtu(String extu) {
        this.extu = extu;
    }

    public String getExtauth() {
        return extauth;
    }

    public void setExtauth(String extauth) {
        this.extauth = extauth;
    }

    public int getExtfbuid() {
        return extfbuid;
    }

    public void setExtfbuid(int extfbuid) {
        this.extfbuid = extfbuid;
    }

    public String getExtfbcatid() {
        return extfbcatid;
    }

    public void setExtfbcatid(String extfbcatid) {
        this.extfbcatid = extfbcatid;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2PhocagalleryCategories)) {
            return false;
        }
        Joo2PhocagalleryCategories other = (Joo2PhocagalleryCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryCategories[ id=" + id + " ]";
    }
    
}
