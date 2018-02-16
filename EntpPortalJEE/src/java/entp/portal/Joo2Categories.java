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
@Table(name = "joo2_categories", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Categories.findAll", query = "SELECT j FROM Joo2Categories j"),
    @NamedQuery(name = "Joo2Categories.findById", query = "SELECT j FROM Joo2Categories j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Categories.findByAssetId", query = "SELECT j FROM Joo2Categories j WHERE j.assetId = :assetId"),
    @NamedQuery(name = "Joo2Categories.findByParentId", query = "SELECT j FROM Joo2Categories j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2Categories.findByLft", query = "SELECT j FROM Joo2Categories j WHERE j.lft = :lft"),
    @NamedQuery(name = "Joo2Categories.findByRgt", query = "SELECT j FROM Joo2Categories j WHERE j.rgt = :rgt"),
    @NamedQuery(name = "Joo2Categories.findByLevel", query = "SELECT j FROM Joo2Categories j WHERE j.level = :level"),
    @NamedQuery(name = "Joo2Categories.findByPath", query = "SELECT j FROM Joo2Categories j WHERE j.path = :path"),
    @NamedQuery(name = "Joo2Categories.findByExtension", query = "SELECT j FROM Joo2Categories j WHERE j.extension = :extension"),
    @NamedQuery(name = "Joo2Categories.findByTitle", query = "SELECT j FROM Joo2Categories j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Categories.findByAlias", query = "SELECT j FROM Joo2Categories j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Categories.findByNote", query = "SELECT j FROM Joo2Categories j WHERE j.note = :note"),
    @NamedQuery(name = "Joo2Categories.findByPublished", query = "SELECT j FROM Joo2Categories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Categories.findByCheckedOut", query = "SELECT j FROM Joo2Categories j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Categories.findByCheckedOutTime", query = "SELECT j FROM Joo2Categories j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Categories.findByAccess", query = "SELECT j FROM Joo2Categories j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Categories.findByMetadesc", query = "SELECT j FROM Joo2Categories j WHERE j.metadesc = :metadesc"),
    @NamedQuery(name = "Joo2Categories.findByMetakey", query = "SELECT j FROM Joo2Categories j WHERE j.metakey = :metakey"),
    @NamedQuery(name = "Joo2Categories.findByMetadata", query = "SELECT j FROM Joo2Categories j WHERE j.metadata = :metadata"),
    @NamedQuery(name = "Joo2Categories.findByCreatedUserId", query = "SELECT j FROM Joo2Categories j WHERE j.createdUserId = :createdUserId"),
    @NamedQuery(name = "Joo2Categories.findByCreatedTime", query = "SELECT j FROM Joo2Categories j WHERE j.createdTime = :createdTime"),
    @NamedQuery(name = "Joo2Categories.findByModifiedUserId", query = "SELECT j FROM Joo2Categories j WHERE j.modifiedUserId = :modifiedUserId"),
    @NamedQuery(name = "Joo2Categories.findByModifiedTime", query = "SELECT j FROM Joo2Categories j WHERE j.modifiedTime = :modifiedTime"),
    @NamedQuery(name = "Joo2Categories.findByHits", query = "SELECT j FROM Joo2Categories j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2Categories.findByLanguage", query = "SELECT j FROM Joo2Categories j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Categories.findByEpMenuid", query = "SELECT j FROM Joo2Categories j WHERE j.epMenuid = :epMenuid"),
    @NamedQuery(name = "Joo2Categories.findByEpMenuPath", query = "SELECT j FROM Joo2Categories j WHERE j.epMenuPath = :epMenuPath"),
    @NamedQuery(name = "Joo2Categories.findByEpCopyCatId", query = "SELECT j FROM Joo2Categories j WHERE j.epCopyCatId = :epCopyCatId"),
    @NamedQuery(name = "Joo2Categories.findByEpRedirectedToCatId", query = "SELECT j FROM Joo2Categories j WHERE j.epRedirectedToCatId = :epRedirectedToCatId"),
    @NamedQuery(name = "Joo2Categories.findByEpReferencedCount", query = "SELECT j FROM Joo2Categories j WHERE j.epReferencedCount = :epReferencedCount"),
    @NamedQuery(name = "Joo2Categories.findByEpReferencedParentcatCount", query = "SELECT j FROM Joo2Categories j WHERE j.epReferencedParentcatCount = :epReferencedParentcatCount"),
    @NamedQuery(name = "Joo2Categories.findByEpReferencedParentContentid", query = "SELECT j FROM Joo2Categories j WHERE j.epReferencedParentContentid = :epReferencedParentContentid"),
    @NamedQuery(name = "Joo2Categories.findByEpOrdering", query = "SELECT j FROM Joo2Categories j WHERE j.epOrdering = :epOrdering"),
    @NamedQuery(name = "Joo2Categories.findByEpImportFromDir", query = "SELECT j FROM Joo2Categories j WHERE j.epImportFromDir = :epImportFromDir"),
    @NamedQuery(name = "Joo2Categories.findByEpImportFromFile", query = "SELECT j FROM Joo2Categories j WHERE j.epImportFromFile = :epImportFromFile"),
    @NamedQuery(name = "Joo2Categories.findByEptLft", query = "SELECT j FROM Joo2Categories j WHERE j.eptLft = :eptLft"),
    @NamedQuery(name = "Joo2Categories.findByEptRgt", query = "SELECT j FROM Joo2Categories j WHERE j.eptRgt = :eptRgt"),
    @NamedQuery(name = "Joo2Categories.findByEptCount", query = "SELECT j FROM Joo2Categories j WHERE j.eptCount = :eptCount"),
    @NamedQuery(name = "Joo2Categories.findByEpLft", query = "SELECT j FROM Joo2Categories j WHERE j.epLft = :epLft"),
    @NamedQuery(name = "Joo2Categories.findByEpRgt", query = "SELECT j FROM Joo2Categories j WHERE j.epRgt = :epRgt"),
    @NamedQuery(name = "Joo2Categories.findByEpCount", query = "SELECT j FROM Joo2Categories j WHERE j.epCount = :epCount")})
public class Joo2Categories implements Serializable {
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
    @Column(name = "parent_id", nullable = false)
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lft", nullable = false)
    private int lft;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rgt", nullable = false)
    private int rgt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level", nullable = false)
    private int level;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "path", nullable = false, length = 255)
    private String path;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "extension", nullable = false, length = 50)
    private String extension;
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
    @Column(name = "note", nullable = false, length = 255)
    private String note;
    @Lob
    @Size(max = 16777215)
    @Column(name = "description", length = 16777215)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "metadesc", nullable = false, length = 1024)
    private String metadesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "metakey", nullable = false, length = 1024)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "metadata", nullable = false, length = 2048)
    private String metadata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_user_id", nullable = false)
    private int createdUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_user_id", nullable = false)
    private int modifiedUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Column(name = "ep_menuid")
    private Integer epMenuid;
    @Size(max = 1024)
    @Column(name = "ep_menu_path", length = 1024)
    private String epMenuPath;
    @Column(name = "ep_copy_cat_id")
    private Integer epCopyCatId;
    @Column(name = "ep_redirected_to_cat_id")
    private Integer epRedirectedToCatId;
    @Column(name = "ep_referenced_count")
    private Integer epReferencedCount;
    @Column(name = "ep_referenced_parentcat_count")
    private Integer epReferencedParentcatCount;
    @Column(name = "ep_referenced_parent_contentid")
    private Integer epReferencedParentContentid;
    @Column(name = "ep_ordering")
    private Integer epOrdering;
    @Size(max = 1024)
    @Column(name = "ep_import_from_dir", length = 1024)
    private String epImportFromDir;
    @Size(max = 1024)
    @Column(name = "ep_import_from_file", length = 1024)
    private String epImportFromFile;
    @Size(max = 32)
    @Column(name = "ept_lft", length = 32)
    private String eptLft;
    @Size(max = 32)
    @Column(name = "ept_rgt", length = 32)
    private String eptRgt;
    @Size(max = 32)
    @Column(name = "ept_count", length = 32)
    private String eptCount;
    @Size(max = 32)
    @Column(name = "ep_lft", length = 32)
    private String epLft;
    @Size(max = 32)
    @Column(name = "ep_rgt", length = 32)
    private String epRgt;
    @Size(max = 32)
    @Column(name = "ep_count", length = 32)
    private String epCount;

    public Joo2Categories() {
    }

    public Joo2Categories(Integer id) {
        this.id = id;
    }

    public Joo2Categories(Integer id, int assetId, int parentId, int lft, int rgt, int level, String path, String extension, String title, String alias, String note, boolean published, int checkedOut, Date checkedOutTime, String params, String metadesc, String metakey, String metadata, int createdUserId, Date createdTime, int modifiedUserId, Date modifiedTime, int hits, String language) {
        this.id = id;
        this.assetId = assetId;
        this.parentId = parentId;
        this.lft = lft;
        this.rgt = rgt;
        this.level = level;
        this.path = path;
        this.extension = extension;
        this.title = title;
        this.alias = alias;
        this.note = note;
        this.published = published;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.params = params;
        this.metadesc = metadesc;
        this.metakey = metakey;
        this.metadata = metadata;
        this.createdUserId = createdUserId;
        this.createdTime = createdTime;
        this.modifiedUserId = modifiedUserId;
        this.modifiedTime = modifiedTime;
        this.hits = hits;
        this.language = language;
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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
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

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
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

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public int getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(int modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getEpMenuid() {
        return epMenuid;
    }

    public void setEpMenuid(Integer epMenuid) {
        this.epMenuid = epMenuid;
    }

    public String getEpMenuPath() {
        return epMenuPath;
    }

    public void setEpMenuPath(String epMenuPath) {
        this.epMenuPath = epMenuPath;
    }

    public Integer getEpCopyCatId() {
        return epCopyCatId;
    }

    public void setEpCopyCatId(Integer epCopyCatId) {
        this.epCopyCatId = epCopyCatId;
    }

    public Integer getEpRedirectedToCatId() {
        return epRedirectedToCatId;
    }

    public void setEpRedirectedToCatId(Integer epRedirectedToCatId) {
        this.epRedirectedToCatId = epRedirectedToCatId;
    }

    public Integer getEpReferencedCount() {
        return epReferencedCount;
    }

    public void setEpReferencedCount(Integer epReferencedCount) {
        this.epReferencedCount = epReferencedCount;
    }

    public Integer getEpReferencedParentcatCount() {
        return epReferencedParentcatCount;
    }

    public void setEpReferencedParentcatCount(Integer epReferencedParentcatCount) {
        this.epReferencedParentcatCount = epReferencedParentcatCount;
    }

    public Integer getEpReferencedParentContentid() {
        return epReferencedParentContentid;
    }

    public void setEpReferencedParentContentid(Integer epReferencedParentContentid) {
        this.epReferencedParentContentid = epReferencedParentContentid;
    }

    public Integer getEpOrdering() {
        return epOrdering;
    }

    public void setEpOrdering(Integer epOrdering) {
        this.epOrdering = epOrdering;
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

    public String getEptLft() {
        return eptLft;
    }

    public void setEptLft(String eptLft) {
        this.eptLft = eptLft;
    }

    public String getEptRgt() {
        return eptRgt;
    }

    public void setEptRgt(String eptRgt) {
        this.eptRgt = eptRgt;
    }

    public String getEptCount() {
        return eptCount;
    }

    public void setEptCount(String eptCount) {
        this.eptCount = eptCount;
    }

    public String getEpLft() {
        return epLft;
    }

    public void setEpLft(String epLft) {
        this.epLft = epLft;
    }

    public String getEpRgt() {
        return epRgt;
    }

    public void setEpRgt(String epRgt) {
        this.epRgt = epRgt;
    }

    public String getEpCount() {
        return epCount;
    }

    public void setEpCount(String epCount) {
        this.epCount = epCount;
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
        if (!(object instanceof Joo2Categories)) {
            return false;
        }
        Joo2Categories other = (Joo2Categories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Categories[ id=" + id + " ]";
    }
    
}
