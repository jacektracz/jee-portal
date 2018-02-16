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
@Table(name = "joo2_k2_items", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Items.findAll", query = "SELECT j FROM Joo2K2Items j"),
    @NamedQuery(name = "Joo2K2Items.findById", query = "SELECT j FROM Joo2K2Items j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Items.findByTitle", query = "SELECT j FROM Joo2K2Items j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2K2Items.findByAlias", query = "SELECT j FROM Joo2K2Items j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2K2Items.findByCatid", query = "SELECT j FROM Joo2K2Items j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2K2Items.findByPublished", query = "SELECT j FROM Joo2K2Items j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2K2Items.findByGallery", query = "SELECT j FROM Joo2K2Items j WHERE j.gallery = :gallery"),
    @NamedQuery(name = "Joo2K2Items.findByCreated", query = "SELECT j FROM Joo2K2Items j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2K2Items.findByCreatedBy", query = "SELECT j FROM Joo2K2Items j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2K2Items.findByCreatedByAlias", query = "SELECT j FROM Joo2K2Items j WHERE j.createdByAlias = :createdByAlias"),
    @NamedQuery(name = "Joo2K2Items.findByCheckedOut", query = "SELECT j FROM Joo2K2Items j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2K2Items.findByCheckedOutTime", query = "SELECT j FROM Joo2K2Items j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2K2Items.findByModified", query = "SELECT j FROM Joo2K2Items j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2K2Items.findByModifiedBy", query = "SELECT j FROM Joo2K2Items j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2K2Items.findByPublishUp", query = "SELECT j FROM Joo2K2Items j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2K2Items.findByPublishDown", query = "SELECT j FROM Joo2K2Items j WHERE j.publishDown = :publishDown"),
    @NamedQuery(name = "Joo2K2Items.findByTrash", query = "SELECT j FROM Joo2K2Items j WHERE j.trash = :trash"),
    @NamedQuery(name = "Joo2K2Items.findByAccess", query = "SELECT j FROM Joo2K2Items j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2K2Items.findByOrdering", query = "SELECT j FROM Joo2K2Items j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2K2Items.findByFeatured", query = "SELECT j FROM Joo2K2Items j WHERE j.featured = :featured"),
    @NamedQuery(name = "Joo2K2Items.findByFeaturedOrdering", query = "SELECT j FROM Joo2K2Items j WHERE j.featuredOrdering = :featuredOrdering"),
    @NamedQuery(name = "Joo2K2Items.findByImageCredits", query = "SELECT j FROM Joo2K2Items j WHERE j.imageCredits = :imageCredits"),
    @NamedQuery(name = "Joo2K2Items.findByVideoCredits", query = "SELECT j FROM Joo2K2Items j WHERE j.videoCredits = :videoCredits"),
    @NamedQuery(name = "Joo2K2Items.findByHits", query = "SELECT j FROM Joo2K2Items j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2K2Items.findByLanguage", query = "SELECT j FROM Joo2K2Items j WHERE j.language = :language")})
public class Joo2K2Items implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Size(max = 255)
    @Column(name = "alias", length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "introtext", nullable = false, length = 16777215)
    private String introtext;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "fulltext", nullable = false, length = 16777215)
    private String fulltext;
    @Lob
    @Size(max = 65535)
    @Column(name = "video", length = 65535)
    private String video;
    @Size(max = 255)
    @Column(name = "gallery", length = 255)
    private String gallery;
    @Lob
    @Size(max = 65535)
    @Column(name = "extra_fields", length = 65535)
    private String extraFields;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "extra_fields_search", nullable = false, length = 65535)
    private String extraFieldsSearch;
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
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
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
    @Column(name = "publish_up", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_down", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDown;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trash", nullable = false)
    private short trash;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access", nullable = false)
    private int access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "featured", nullable = false)
    private short featured;
    @Basic(optional = false)
    @NotNull
    @Column(name = "featured_ordering", nullable = false)
    private int featuredOrdering;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "image_caption", nullable = false, length = 65535)
    private String imageCaption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image_credits", nullable = false, length = 255)
    private String imageCredits;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "video_caption", nullable = false, length = 65535)
    private String videoCaption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "video_credits", nullable = false, length = 255)
    private String videoCredits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "plugins", nullable = false, length = 65535)
    private String plugins;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2K2Items() {
    }

    public Joo2K2Items(Integer id) {
        this.id = id;
    }

    public Joo2K2Items(Integer id, String title, int catid, short published, String introtext, String fulltext, String extraFieldsSearch, Date created, int createdBy, String createdByAlias, int checkedOut, Date checkedOutTime, Date modified, int modifiedBy, Date publishUp, Date publishDown, short trash, int access, int ordering, short featured, int featuredOrdering, String imageCaption, String imageCredits, String videoCaption, String videoCredits, int hits, String params, String metadesc, String metadata, String metakey, String plugins, String language) {
        this.id = id;
        this.title = title;
        this.catid = catid;
        this.published = published;
        this.introtext = introtext;
        this.fulltext = fulltext;
        this.extraFieldsSearch = extraFieldsSearch;
        this.created = created;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.trash = trash;
        this.access = access;
        this.ordering = ordering;
        this.featured = featured;
        this.featuredOrdering = featuredOrdering;
        this.imageCaption = imageCaption;
        this.imageCredits = imageCredits;
        this.videoCaption = videoCaption;
        this.videoCredits = videoCredits;
        this.hits = hits;
        this.params = params;
        this.metadesc = metadesc;
        this.metadata = metadata;
        this.metakey = metakey;
        this.plugins = plugins;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(String extraFields) {
        this.extraFields = extraFields;
    }

    public String getExtraFieldsSearch() {
        return extraFieldsSearch;
    }

    public void setExtraFieldsSearch(String extraFieldsSearch) {
        this.extraFieldsSearch = extraFieldsSearch;
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

    public short getTrash() {
        return trash;
    }

    public void setTrash(short trash) {
        this.trash = trash;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public short getFeatured() {
        return featured;
    }

    public void setFeatured(short featured) {
        this.featured = featured;
    }

    public int getFeaturedOrdering() {
        return featuredOrdering;
    }

    public void setFeaturedOrdering(int featuredOrdering) {
        this.featuredOrdering = featuredOrdering;
    }

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption;
    }

    public String getImageCredits() {
        return imageCredits;
    }

    public void setImageCredits(String imageCredits) {
        this.imageCredits = imageCredits;
    }

    public String getVideoCaption() {
        return videoCaption;
    }

    public void setVideoCaption(String videoCaption) {
        this.videoCaption = videoCaption;
    }

    public String getVideoCredits() {
        return videoCredits;
    }

    public void setVideoCredits(String videoCredits) {
        this.videoCredits = videoCredits;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getPlugins() {
        return plugins;
    }

    public void setPlugins(String plugins) {
        this.plugins = plugins;
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
        if (!(object instanceof Joo2K2Items)) {
            return false;
        }
        Joo2K2Items other = (Joo2K2Items) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Items[ id=" + id + " ]";
    }
    
}
