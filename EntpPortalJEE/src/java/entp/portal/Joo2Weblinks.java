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
@Table(name = "joo2_weblinks", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Weblinks.findAll", query = "SELECT j FROM Joo2Weblinks j"),
    @NamedQuery(name = "Joo2Weblinks.findById", query = "SELECT j FROM Joo2Weblinks j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Weblinks.findByCatid", query = "SELECT j FROM Joo2Weblinks j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2Weblinks.findBySid", query = "SELECT j FROM Joo2Weblinks j WHERE j.sid = :sid"),
    @NamedQuery(name = "Joo2Weblinks.findByTitle", query = "SELECT j FROM Joo2Weblinks j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Weblinks.findByAlias", query = "SELECT j FROM Joo2Weblinks j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Weblinks.findByUrl", query = "SELECT j FROM Joo2Weblinks j WHERE j.url = :url"),
    @NamedQuery(name = "Joo2Weblinks.findByDate", query = "SELECT j FROM Joo2Weblinks j WHERE j.date = :date"),
    @NamedQuery(name = "Joo2Weblinks.findByHits", query = "SELECT j FROM Joo2Weblinks j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2Weblinks.findByState", query = "SELECT j FROM Joo2Weblinks j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2Weblinks.findByCheckedOut", query = "SELECT j FROM Joo2Weblinks j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Weblinks.findByCheckedOutTime", query = "SELECT j FROM Joo2Weblinks j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Weblinks.findByOrdering", query = "SELECT j FROM Joo2Weblinks j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Weblinks.findByArchived", query = "SELECT j FROM Joo2Weblinks j WHERE j.archived = :archived"),
    @NamedQuery(name = "Joo2Weblinks.findByApproved", query = "SELECT j FROM Joo2Weblinks j WHERE j.approved = :approved"),
    @NamedQuery(name = "Joo2Weblinks.findByAccess", query = "SELECT j FROM Joo2Weblinks j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Weblinks.findByLanguage", query = "SELECT j FROM Joo2Weblinks j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Weblinks.findByCreated", query = "SELECT j FROM Joo2Weblinks j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2Weblinks.findByCreatedBy", query = "SELECT j FROM Joo2Weblinks j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2Weblinks.findByCreatedByAlias", query = "SELECT j FROM Joo2Weblinks j WHERE j.createdByAlias = :createdByAlias"),
    @NamedQuery(name = "Joo2Weblinks.findByModified", query = "SELECT j FROM Joo2Weblinks j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2Weblinks.findByModifiedBy", query = "SELECT j FROM Joo2Weblinks j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2Weblinks.findByFeatured", query = "SELECT j FROM Joo2Weblinks j WHERE j.featured = :featured"),
    @NamedQuery(name = "Joo2Weblinks.findByXreference", query = "SELECT j FROM Joo2Weblinks j WHERE j.xreference = :xreference"),
    @NamedQuery(name = "Joo2Weblinks.findByPublishUp", query = "SELECT j FROM Joo2Weblinks j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2Weblinks.findByPublishDown", query = "SELECT j FROM Joo2Weblinks j WHERE j.publishDown = :publishDown")})
public class Joo2Weblinks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sid", nullable = false)
    private int sid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "title", nullable = false, length = 250)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "url", nullable = false, length = 250)
    private String url;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state", nullable = false)
    private boolean state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "archived", nullable = false)
    private boolean archived;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approved", nullable = false)
    private boolean approved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access", nullable = false)
    private int access;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by", nullable = false)
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "created_by_alias", nullable = false, length = 255)
    private String createdByAlias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by", nullable = false)
    private int modifiedBy;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadesc", nullable = false, length = 65535)
    private String metadesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadata", nullable = false, length = 65535)
    private String metadata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "featured", nullable = false)
    private short featured;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "xreference", nullable = false, length = 50)
    private String xreference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_up", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_down", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDown;

    public Joo2Weblinks() {
    }

    public Joo2Weblinks(Integer id) {
        this.id = id;
    }

    public Joo2Weblinks(Integer id, int catid, int sid, String title, String alias, String url, String description, Date date, int hits, boolean state, int checkedOut, Date checkedOutTime, int ordering, boolean archived, boolean approved, int access, String params, String language, Date created, int createdBy, String createdByAlias, Date modified, int modifiedBy, String metakey, String metadesc, String metadata, short featured, String xreference, Date publishUp, Date publishDown) {
        this.id = id;
        this.catid = catid;
        this.sid = sid;
        this.title = title;
        this.alias = alias;
        this.url = url;
        this.description = description;
        this.date = date;
        this.hits = hits;
        this.state = state;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.archived = archived;
        this.approved = approved;
        this.access = access;
        this.params = params;
        this.language = language;
        this.created = created;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.metadata = metadata;
        this.featured = featured;
        this.xreference = xreference;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
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

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByAlias() {
        return createdByAlias;
    }

    public void setCreatedByAlias(String createdByAlias) {
        this.createdByAlias = createdByAlias;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
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

    public short getFeatured() {
        return featured;
    }

    public void setFeatured(short featured) {
        this.featured = featured;
    }

    public String getXreference() {
        return xreference;
    }

    public void setXreference(String xreference) {
        this.xreference = xreference;
    }

    public Date getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Date publishUp) {
        this.publishUp = publishUp;
    }

    public Date getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Date publishDown) {
        this.publishDown = publishDown;
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
        if (!(object instanceof Joo2Weblinks)) {
            return false;
        }
        Joo2Weblinks other = (Joo2Weblinks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Weblinks[ id=" + id + " ]";
    }
    
}
