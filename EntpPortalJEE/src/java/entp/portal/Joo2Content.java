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
@Table(name = "joo2_content", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Content.findAll", query = "SELECT j FROM Joo2Content j"),
    @NamedQuery(name = "Joo2Content.findById", query = "SELECT j FROM Joo2Content j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Content.findByAssetId", query = "SELECT j FROM Joo2Content j WHERE j.assetId = :assetId"),
    @NamedQuery(name = "Joo2Content.findByTitle", query = "SELECT j FROM Joo2Content j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Content.findByAlias", query = "SELECT j FROM Joo2Content j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Content.findByTitleAlias", query = "SELECT j FROM Joo2Content j WHERE j.titleAlias = :titleAlias"),
    @NamedQuery(name = "Joo2Content.findByState", query = "SELECT j FROM Joo2Content j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2Content.findBySectionid", query = "SELECT j FROM Joo2Content j WHERE j.sectionid = :sectionid"),
    @NamedQuery(name = "Joo2Content.findByMask", query = "SELECT j FROM Joo2Content j WHERE j.mask = :mask"),
    @NamedQuery(name = "Joo2Content.findByCatid", query = "SELECT j FROM Joo2Content j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2Content.findByCreated", query = "SELECT j FROM Joo2Content j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2Content.findByCreatedBy", query = "SELECT j FROM Joo2Content j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2Content.findByCreatedByAlias", query = "SELECT j FROM Joo2Content j WHERE j.createdByAlias = :createdByAlias"),
    @NamedQuery(name = "Joo2Content.findByModified", query = "SELECT j FROM Joo2Content j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2Content.findByModifiedBy", query = "SELECT j FROM Joo2Content j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2Content.findByCheckedOut", query = "SELECT j FROM Joo2Content j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Content.findByCheckedOutTime", query = "SELECT j FROM Joo2Content j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Content.findByPublishUp", query = "SELECT j FROM Joo2Content j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2Content.findByPublishDown", query = "SELECT j FROM Joo2Content j WHERE j.publishDown = :publishDown"),
    @NamedQuery(name = "Joo2Content.findByAttribs", query = "SELECT j FROM Joo2Content j WHERE j.attribs = :attribs"),
    @NamedQuery(name = "Joo2Content.findByVersion", query = "SELECT j FROM Joo2Content j WHERE j.version = :version"),
    @NamedQuery(name = "Joo2Content.findByParentid", query = "SELECT j FROM Joo2Content j WHERE j.parentid = :parentid"),
    @NamedQuery(name = "Joo2Content.findByOrdering", query = "SELECT j FROM Joo2Content j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Content.findByAccess", query = "SELECT j FROM Joo2Content j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Content.findByHits", query = "SELECT j FROM Joo2Content j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2Content.findByFeatured", query = "SELECT j FROM Joo2Content j WHERE j.featured = :featured"),
    @NamedQuery(name = "Joo2Content.findByLanguage", query = "SELECT j FROM Joo2Content j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Content.findByXreference", query = "SELECT j FROM Joo2Content j WHERE j.xreference = :xreference"),
    @NamedQuery(name = "Joo2Content.findByEpHrefMain", query = "SELECT j FROM Joo2Content j WHERE j.epHrefMain = :epHrefMain"),
    @NamedQuery(name = "Joo2Content.findByEpImage", query = "SELECT j FROM Joo2Content j WHERE j.epImage = :epImage"),
    @NamedQuery(name = "Joo2Content.findByEpDownButtin", query = "SELECT j FROM Joo2Content j WHERE j.epDownButtin = :epDownButtin"),
    @NamedQuery(name = "Joo2Content.findByEpDownButton", query = "SELECT j FROM Joo2Content j WHERE j.epDownButton = :epDownButton"),
    @NamedQuery(name = "Joo2Content.findByEpType", query = "SELECT j FROM Joo2Content j WHERE j.epType = :epType"),
    @NamedQuery(name = "Joo2Content.findByEpImageType", query = "SELECT j FROM Joo2Content j WHERE j.epImageType = :epImageType"),
    @NamedQuery(name = "Joo2Content.findByEpFunction", query = "SELECT j FROM Joo2Content j WHERE j.epFunction = :epFunction"),
    @NamedQuery(name = "Joo2Content.findByEpRegenerationState", query = "SELECT j FROM Joo2Content j WHERE j.epRegenerationState = :epRegenerationState"),
    @NamedQuery(name = "Joo2Content.findByEpFeaturedPosition", query = "SELECT j FROM Joo2Content j WHERE j.epFeaturedPosition = :epFeaturedPosition"),
    @NamedQuery(name = "Joo2Content.findByEpImageBig", query = "SELECT j FROM Joo2Content j WHERE j.epImageBig = :epImageBig"),
    @NamedQuery(name = "Joo2Content.findByEpImageOrg", query = "SELECT j FROM Joo2Content j WHERE j.epImageOrg = :epImageOrg"),
    @NamedQuery(name = "Joo2Content.findByEpReferencedCatid", query = "SELECT j FROM Joo2Content j WHERE j.epReferencedCatid = :epReferencedCatid"),
    @NamedQuery(name = "Joo2Content.findByEpHrefOrg", query = "SELECT j FROM Joo2Content j WHERE j.epHrefOrg = :epHrefOrg"),
    @NamedQuery(name = "Joo2Content.findByEpReferencedMenuid", query = "SELECT j FROM Joo2Content j WHERE j.epReferencedMenuid = :epReferencedMenuid"),
    @NamedQuery(name = "Joo2Content.findByEpUnpublished", query = "SELECT j FROM Joo2Content j WHERE j.epUnpublished = :epUnpublished"),
    @NamedQuery(name = "Joo2Content.findByEpTheme", query = "SELECT j FROM Joo2Content j WHERE j.epTheme = :epTheme"),
    @NamedQuery(name = "Joo2Content.findByEpMenuid", query = "SELECT j FROM Joo2Content j WHERE j.epMenuid = :epMenuid"),
    @NamedQuery(name = "Joo2Content.findByEpHrefAll", query = "SELECT j FROM Joo2Content j WHERE j.epHrefAll = :epHrefAll"),
    @NamedQuery(name = "Joo2Content.findByEpHrefText", query = "SELECT j FROM Joo2Content j WHERE j.epHrefText = :epHrefText"),
    @NamedQuery(name = "Joo2Content.findByEpHrefTitle", query = "SELECT j FROM Joo2Content j WHERE j.epHrefTitle = :epHrefTitle"),
    @NamedQuery(name = "Joo2Content.findByEpHrefImg", query = "SELECT j FROM Joo2Content j WHERE j.epHrefImg = :epHrefImg"),
    @NamedQuery(name = "Joo2Content.findByEpIsThreeSummary", query = "SELECT j FROM Joo2Content j WHERE j.epIsThreeSummary = :epIsThreeSummary"),
    @NamedQuery(name = "Joo2Content.findByEpRefToOutsideCatId", query = "SELECT j FROM Joo2Content j WHERE j.epRefToOutsideCatId = :epRefToOutsideCatId"),
    @NamedQuery(name = "Joo2Content.findByEpImportFromDir", query = "SELECT j FROM Joo2Content j WHERE j.epImportFromDir = :epImportFromDir"),
    @NamedQuery(name = "Joo2Content.findByEpImportFromFile", query = "SELECT j FROM Joo2Content j WHERE j.epImportFromFile = :epImportFromFile"),
    @NamedQuery(name = "Joo2Content.findByEpImportFromFileShort", query = "SELECT j FROM Joo2Content j WHERE j.epImportFromFileShort = :epImportFromFileShort"),
    @NamedQuery(name = "Joo2Content.findByEpLeadingImported", query = "SELECT j FROM Joo2Content j WHERE j.epLeadingImported = :epLeadingImported")})
public class Joo2Content implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asset_id", nullable = false)
    private int assetId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title_alias", nullable = false, length = 255)
    private String titleAlias;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "state", nullable = false)
    private short state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sectionid", nullable = false)
    private int sectionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mask", nullable = false)
    private int mask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
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
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "images", nullable = false, length = 65535)
    private String images;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "urls", nullable = false, length = 65535)
    private String urls;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5120)
    @Column(name = "attribs", nullable = false, length = 5120)
    private String attribs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version", nullable = false)
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parentid", nullable = false)
    private int parentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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
    @Column(name = "access", nullable = false)
    private int access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
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
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "xreference", nullable = false, length = 50)
    private String xreference;
    @Size(max = 512)
    @Column(name = "ep_href_main", length = 512)
    private String epHrefMain;
    @Size(max = 512)
    @Column(name = "ep_image", length = 512)
    private String epImage;
    @Lob
    @Size(max = 16777215)
    @Column(name = "ep_intro_raw", length = 16777215)
    private String epIntroRaw;
    @Size(max = 16)
    @Column(name = "ep_down_buttin", length = 16)
    private String epDownButtin;
    @Size(max = 16)
    @Column(name = "ep_down_button", length = 16)
    private String epDownButton;
    @Size(max = 64)
    @Column(name = "ep_type", length = 64)
    private String epType;
    @Size(max = 128)
    @Column(name = "ep_image_type", length = 128)
    private String epImageType;
    @Size(max = 128)
    @Column(name = "ep_function", length = 128)
    private String epFunction;
    @Size(max = 64)
    @Column(name = "ep_regeneration_state", length = 64)
    private String epRegenerationState;
    @Size(max = 64)
    @Column(name = "ep_featured_position", length = 64)
    private String epFeaturedPosition;
    @Size(max = 512)
    @Column(name = "ep_image_big", length = 512)
    private String epImageBig;
    @Size(max = 512)
    @Column(name = "ep_image_org", length = 512)
    private String epImageOrg;
    @Column(name = "ep_referenced_catid")
    private Integer epReferencedCatid;
    @Size(max = 512)
    @Column(name = "ep_href_org", length = 512)
    private String epHrefOrg;
    @Column(name = "ep_referenced_menuid")
    private Integer epReferencedMenuid;
    @Size(max = 32)
    @Column(name = "ep_unpublished", length = 32)
    private String epUnpublished;
    @Size(max = 64)
    @Column(name = "ep_theme", length = 64)
    private String epTheme;
    @Column(name = "ep_menuid")
    private Integer epMenuid;
    @Size(max = 32)
    @Column(name = "ep_href_all", length = 32)
    private String epHrefAll;
    @Size(max = 32)
    @Column(name = "ep_href_text", length = 32)
    private String epHrefText;
    @Size(max = 32)
    @Column(name = "ep_href_title", length = 32)
    private String epHrefTitle;
    @Size(max = 32)
    @Column(name = "ep_href_img", length = 32)
    private String epHrefImg;
    @Size(max = 16)
    @Column(name = "ep_is_three_summary", length = 16)
    private String epIsThreeSummary;
    @Column(name = "ep_ref_to_outside_cat_id")
    private Integer epRefToOutsideCatId;
    @Size(max = 1024)
    @Column(name = "ep_import_from_dir", length = 1024)
    private String epImportFromDir;
    @Size(max = 1024)
    @Column(name = "ep_import_from_file", length = 1024)
    private String epImportFromFile;
    @Size(max = 512)
    @Column(name = "ep_import_from_file_short", length = 512)
    private String epImportFromFileShort;
    @Size(max = 32)
    @Column(name = "ep_leading_imported", length = 32)
    private String epLeadingImported;

    public Joo2Content() {
    }

    public Joo2Content(Integer id) {
        this.id = id;
    }

    public Joo2Content(Integer id, int assetId, String title, String alias, String titleAlias, String introtext, String fulltext, short state, int sectionid, int mask, int catid, Date created, int createdBy, String createdByAlias, Date modified, int modifiedBy, int checkedOut, Date checkedOutTime, Date publishUp, Date publishDown, String images, String urls, String attribs, int version, int parentid, int ordering, String metakey, String metadesc, int access, int hits, String metadata, short featured, String language, String xreference) {
        this.id = id;
        this.assetId = assetId;
        this.title = title;
        this.alias = alias;
        this.titleAlias = titleAlias;
        this.introtext = introtext;
        this.fulltext = fulltext;
        this.state = state;
        this.sectionid = sectionid;
        this.mask = mask;
        this.catid = catid;
        this.created = created;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.images = images;
        this.urls = urls;
        this.attribs = attribs;
        this.version = version;
        this.parentid = parentid;
        this.ordering = ordering;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.access = access;
        this.hits = hits;
        this.metadata = metadata;
        this.featured = featured;
        this.language = language;
        this.xreference = xreference;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
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

    public String getTitleAlias() {
        return titleAlias;
    }

    public void setTitleAlias(String titleAlias) {
        this.titleAlias = titleAlias;
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

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getSectionid() {
        return sectionid;
    }

    public void setSectionid(int sectionid) {
        this.sectionid = sectionid;
    }

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getAttribs() {
        return attribs;
    }

    public void setAttribs(String attribs) {
        this.attribs = attribs;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getXreference() {
        return xreference;
    }

    public void setXreference(String xreference) {
        this.xreference = xreference;
    }

    public String getEpHrefMain() {
        return epHrefMain;
    }

    public void setEpHrefMain(String epHrefMain) {
        this.epHrefMain = epHrefMain;
    }

    public String getEpImage() {
        return epImage;
    }

    public void setEpImage(String epImage) {
        this.epImage = epImage;
    }

    public String getEpIntroRaw() {
        return epIntroRaw;
    }

    public void setEpIntroRaw(String epIntroRaw) {
        this.epIntroRaw = epIntroRaw;
    }

    public String getEpDownButtin() {
        return epDownButtin;
    }

    public void setEpDownButtin(String epDownButtin) {
        this.epDownButtin = epDownButtin;
    }

    public String getEpDownButton() {
        return epDownButton;
    }

    public void setEpDownButton(String epDownButton) {
        this.epDownButton = epDownButton;
    }

    public String getEpType() {
        return epType;
    }

    public void setEpType(String epType) {
        this.epType = epType;
    }

    public String getEpImageType() {
        return epImageType;
    }

    public void setEpImageType(String epImageType) {
        this.epImageType = epImageType;
    }

    public String getEpFunction() {
        return epFunction;
    }

    public void setEpFunction(String epFunction) {
        this.epFunction = epFunction;
    }

    public String getEpRegenerationState() {
        return epRegenerationState;
    }

    public void setEpRegenerationState(String epRegenerationState) {
        this.epRegenerationState = epRegenerationState;
    }

    public String getEpFeaturedPosition() {
        return epFeaturedPosition;
    }

    public void setEpFeaturedPosition(String epFeaturedPosition) {
        this.epFeaturedPosition = epFeaturedPosition;
    }

    public String getEpImageBig() {
        return epImageBig;
    }

    public void setEpImageBig(String epImageBig) {
        this.epImageBig = epImageBig;
    }

    public String getEpImageOrg() {
        return epImageOrg;
    }

    public void setEpImageOrg(String epImageOrg) {
        this.epImageOrg = epImageOrg;
    }

    public Integer getEpReferencedCatid() {
        return epReferencedCatid;
    }

    public void setEpReferencedCatid(Integer epReferencedCatid) {
        this.epReferencedCatid = epReferencedCatid;
    }

    public String getEpHrefOrg() {
        return epHrefOrg;
    }

    public void setEpHrefOrg(String epHrefOrg) {
        this.epHrefOrg = epHrefOrg;
    }

    public Integer getEpReferencedMenuid() {
        return epReferencedMenuid;
    }

    public void setEpReferencedMenuid(Integer epReferencedMenuid) {
        this.epReferencedMenuid = epReferencedMenuid;
    }

    public String getEpUnpublished() {
        return epUnpublished;
    }

    public void setEpUnpublished(String epUnpublished) {
        this.epUnpublished = epUnpublished;
    }

    public String getEpTheme() {
        return epTheme;
    }

    public void setEpTheme(String epTheme) {
        this.epTheme = epTheme;
    }

    public Integer getEpMenuid() {
        return epMenuid;
    }

    public void setEpMenuid(Integer epMenuid) {
        this.epMenuid = epMenuid;
    }

    public String getEpHrefAll() {
        return epHrefAll;
    }

    public void setEpHrefAll(String epHrefAll) {
        this.epHrefAll = epHrefAll;
    }

    public String getEpHrefText() {
        return epHrefText;
    }

    public void setEpHrefText(String epHrefText) {
        this.epHrefText = epHrefText;
    }

    public String getEpHrefTitle() {
        return epHrefTitle;
    }

    public void setEpHrefTitle(String epHrefTitle) {
        this.epHrefTitle = epHrefTitle;
    }

    public String getEpHrefImg() {
        return epHrefImg;
    }

    public void setEpHrefImg(String epHrefImg) {
        this.epHrefImg = epHrefImg;
    }

    public String getEpIsThreeSummary() {
        return epIsThreeSummary;
    }

    public void setEpIsThreeSummary(String epIsThreeSummary) {
        this.epIsThreeSummary = epIsThreeSummary;
    }

    public Integer getEpRefToOutsideCatId() {
        return epRefToOutsideCatId;
    }

    public void setEpRefToOutsideCatId(Integer epRefToOutsideCatId) {
        this.epRefToOutsideCatId = epRefToOutsideCatId;
    }

    public String getEpImportFromDir() {
        return epImportFromDir;
    }

    public void setEpImportFromDir(String epImportFromDir) {
        this.epImportFromDir = epImportFromDir;
    }

    public String getEpImportFromFile() {
        return epImportFromFile;
    }

    public void setEpImportFromFile(String epImportFromFile) {
        this.epImportFromFile = epImportFromFile;
    }

    public String getEpImportFromFileShort() {
        return epImportFromFileShort;
    }

    public void setEpImportFromFileShort(String epImportFromFileShort) {
        this.epImportFromFileShort = epImportFromFileShort;
    }

    public String getEpLeadingImported() {
        return epLeadingImported;
    }

    public void setEpLeadingImported(String epLeadingImported) {
        this.epLeadingImported = epLeadingImported;
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
        if (!(object instanceof Joo2Content)) {
            return false;
        }
        Joo2Content other = (Joo2Content) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Content[ id=" + id + " ]";
    }
    
}
