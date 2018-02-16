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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_category_id"}),
    @UniqueConstraint(columnNames = {"slug", "virtuemart_vendor_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCategories.findAll", query = "SELECT j FROM Joo2VirtuemartCategories j"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByVirtuemartCategoryId", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.virtuemartCategoryId = :virtuemartCategoryId"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCategoryName", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.categoryName = :categoryName"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findBySlug", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.slug = :slug"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCategoryTemplate", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.categoryTemplate = :categoryTemplate"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCategoryLayout", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.categoryLayout = :categoryLayout"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCategoryProductLayout", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.categoryProductLayout = :categoryProductLayout"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByProductsPerRow", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.productsPerRow = :productsPerRow"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLimitListStart", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.limitListStart = :limitListStart"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLimitListStep", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.limitListStep = :limitListStep"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLimitListMax", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.limitListMax = :limitListMax"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLimitListInitial", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.limitListInitial = :limitListInitial"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByHits", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByShared", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByPublished", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCategories.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCategories j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_category_id", nullable = false)
    private Long virtuemartCategoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "category_name", nullable = false, length = 128)
    private String categoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "slug", nullable = false, length = 128)
    private String slug;
    @Lob
    @Size(max = 65535)
    @Column(name = "category_description", length = 65535)
    private String categoryDescription;
    @Size(max = 255)
    @Column(name = "category_template", length = 255)
    private String categoryTemplate;
    @Size(max = 255)
    @Column(name = "category_layout", length = 255)
    private String categoryLayout;
    @Size(max = 255)
    @Column(name = "category_product_layout", length = 255)
    private String categoryProductLayout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "products_per_row", nullable = false)
    private short productsPerRow;
    @Column(name = "limit_list_start")
    private Integer limitListStart;
    @Column(name = "limit_list_step")
    private Integer limitListStep;
    @Column(name = "limit_list_max")
    private Integer limitListMax;
    @Column(name = "limit_list_initial")
    private Integer limitListInitial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
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
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metarobot", nullable = false, length = 65535)
    private String metarobot;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metaauthor", nullable = false, length = 65535)
    private String metaauthor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared", nullable = false)
    private boolean shared;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by", nullable = false)
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by", nullable = false)
    private int modifiedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockedOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_by", nullable = false)
    private int lockedBy;

    public Joo2VirtuemartCategories() {
    }

    public Joo2VirtuemartCategories(Long virtuemartCategoryId) {
        this.virtuemartCategoryId = virtuemartCategoryId;
    }

    public Joo2VirtuemartCategories(Long virtuemartCategoryId, int virtuemartVendorId, String categoryName, String slug, short productsPerRow, int hits, String metadesc, String metakey, String metarobot, String metaauthor, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCategoryId = virtuemartCategoryId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.categoryName = categoryName;
        this.slug = slug;
        this.productsPerRow = productsPerRow;
        this.hits = hits;
        this.metadesc = metadesc;
        this.metakey = metakey;
        this.metarobot = metarobot;
        this.metaauthor = metaauthor;
        this.ordering = ordering;
        this.shared = shared;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartCategoryId() {
        return virtuemartCategoryId;
    }

    public void setVirtuemartCategoryId(Long virtuemartCategoryId) {
        this.virtuemartCategoryId = virtuemartCategoryId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryTemplate() {
        return categoryTemplate;
    }

    public void setCategoryTemplate(String categoryTemplate) {
        this.categoryTemplate = categoryTemplate;
    }

    public String getCategoryLayout() {
        return categoryLayout;
    }

    public void setCategoryLayout(String categoryLayout) {
        this.categoryLayout = categoryLayout;
    }

    public String getCategoryProductLayout() {
        return categoryProductLayout;
    }

    public void setCategoryProductLayout(String categoryProductLayout) {
        this.categoryProductLayout = categoryProductLayout;
    }

    public short getProductsPerRow() {
        return productsPerRow;
    }

    public void setProductsPerRow(short productsPerRow) {
        this.productsPerRow = productsPerRow;
    }

    public Integer getLimitListStart() {
        return limitListStart;
    }

    public void setLimitListStart(Integer limitListStart) {
        this.limitListStart = limitListStart;
    }

    public Integer getLimitListStep() {
        return limitListStep;
    }

    public void setLimitListStep(Integer limitListStep) {
        this.limitListStep = limitListStep;
    }

    public Integer getLimitListMax() {
        return limitListMax;
    }

    public void setLimitListMax(Integer limitListMax) {
        this.limitListMax = limitListMax;
    }

    public Integer getLimitListInitial() {
        return limitListInitial;
    }

    public void setLimitListInitial(Integer limitListInitial) {
        this.limitListInitial = limitListInitial;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
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

    public String getMetarobot() {
        return metarobot;
    }

    public void setMetarobot(String metarobot) {
        this.metarobot = metarobot;
    }

    public String getMetaauthor() {
        return metaauthor;
    }

    public void setMetaauthor(String metaauthor) {
        this.metaauthor = metaauthor;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public boolean getShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getLockedOn() {
        return lockedOn;
    }

    public void setLockedOn(Date lockedOn) {
        this.lockedOn = lockedOn;
    }

    public int getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(int lockedBy) {
        this.lockedBy = lockedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartCategoryId != null ? virtuemartCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCategories)) {
            return false;
        }
        Joo2VirtuemartCategories other = (Joo2VirtuemartCategories) object;
        if ((this.virtuemartCategoryId == null && other.virtuemartCategoryId != null) || (this.virtuemartCategoryId != null && !this.virtuemartCategoryId.equals(other.virtuemartCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCategories[ virtuemartCategoryId=" + virtuemartCategoryId + " ]";
    }
    
}
