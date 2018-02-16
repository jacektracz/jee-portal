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
@Table(name = "joo2_newsfeeds", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Newsfeeds.findAll", query = "SELECT j FROM Joo2Newsfeeds j"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCatid", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2Newsfeeds.findById", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Newsfeeds.findByName", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Newsfeeds.findByAlias", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Newsfeeds.findByLink", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.link = :link"),
    @NamedQuery(name = "Joo2Newsfeeds.findByFilename", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.filename = :filename"),
    @NamedQuery(name = "Joo2Newsfeeds.findByPublished", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Newsfeeds.findByNumarticles", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.numarticles = :numarticles"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCacheTime", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.cacheTime = :cacheTime"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCheckedOut", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCheckedOutTime", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Newsfeeds.findByOrdering", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Newsfeeds.findByRtl", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.rtl = :rtl"),
    @NamedQuery(name = "Joo2Newsfeeds.findByAccess", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Newsfeeds.findByLanguage", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCreated", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCreatedBy", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2Newsfeeds.findByCreatedByAlias", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.createdByAlias = :createdByAlias"),
    @NamedQuery(name = "Joo2Newsfeeds.findByModified", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2Newsfeeds.findByModifiedBy", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2Newsfeeds.findByXreference", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.xreference = :xreference"),
    @NamedQuery(name = "Joo2Newsfeeds.findByPublishUp", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2Newsfeeds.findByPublishDown", query = "SELECT j FROM Joo2Newsfeeds j WHERE j.publishDown = :publishDown")})
public class Joo2Newsfeeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "link", nullable = false, length = 200)
    private String link;
    @Size(max = 200)
    @Column(name = "filename", length = 200)
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numarticles", nullable = false)
    private int numarticles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cache_time", nullable = false)
    private int cacheTime;
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
    @Column(name = "rtl", nullable = false)
    private short rtl;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
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

    public Joo2Newsfeeds() {
    }

    public Joo2Newsfeeds(Integer id) {
        this.id = id;
    }

    public Joo2Newsfeeds(Integer id, int catid, String name, String alias, String link, boolean published, int numarticles, int cacheTime, int checkedOut, Date checkedOutTime, int ordering, short rtl, String language, String params, Date created, int createdBy, String createdByAlias, Date modified, int modifiedBy, String metakey, String metadesc, String metadata, String xreference, Date publishUp, Date publishDown) {
        this.id = id;
        this.catid = catid;
        this.name = name;
        this.alias = alias;
        this.link = link;
        this.published = published;
        this.numarticles = numarticles;
        this.cacheTime = cacheTime;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.rtl = rtl;
        this.language = language;
        this.params = params;
        this.created = created;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.metadata = metadata;
        this.xreference = xreference;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getNumarticles() {
        return numarticles;
    }

    public void setNumarticles(int numarticles) {
        this.numarticles = numarticles;
    }

    public int getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(int cacheTime) {
        this.cacheTime = cacheTime;
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

    public short getRtl() {
        return rtl;
    }

    public void setRtl(short rtl) {
        this.rtl = rtl;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        if (!(object instanceof Joo2Newsfeeds)) {
            return false;
        }
        Joo2Newsfeeds other = (Joo2Newsfeeds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Newsfeeds[ id=" + id + " ]";
    }
    
}
