/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "joo2_virtuemart_products", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"slug"}),
    @UniqueConstraint(columnNames = {"virtuemart_product_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartProducts.findAll", query = "SELECT j FROM Joo2VirtuemartProducts j"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductParentId", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productParentId = :productParentId"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductSku", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productSku = :productSku"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductName", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productName = :productName"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findBySlug", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.slug = :slug"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductWeight", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productWeight = :productWeight"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductWeightUom", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productWeightUom = :productWeightUom"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductLength", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productLength = :productLength"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductWidth", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productWidth = :productWidth"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductHeight", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productHeight = :productHeight"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductLwhUom", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productLwhUom = :productLwhUom"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductUrl", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productUrl = :productUrl"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductInStock", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productInStock = :productInStock"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductOrdered", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productOrdered = :productOrdered"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByLowStockNotification", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.lowStockNotification = :lowStockNotification"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductAvailableDate", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productAvailableDate = :productAvailableDate"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductAvailability", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productAvailability = :productAvailability"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductSpecial", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productSpecial = :productSpecial"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByShipCodeId", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.shipCodeId = :shipCodeId"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductSales", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productSales = :productSales"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductUnit", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productUnit = :productUnit"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductPackaging", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productPackaging = :productPackaging"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByProductOrderLevels", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.productOrderLevels = :productOrderLevels"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByHits", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByLayout", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.layout = :layout"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByPublished", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartProducts.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartProducts j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartProducts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_product_id", nullable = false)
    private Long virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_parent_id", nullable = false)
    private int productParentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "product_sku", nullable = false, length = 64)
    private String productSku;
    @Size(max = 255)
    @Column(name = "product_name", length = 255)
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "slug", nullable = false, length = 255)
    private String slug;
    @Lob
    @Size(max = 65535)
    @Column(name = "product_s_desc", length = 65535)
    private String productSDesc;
    @Lob
    @Size(max = 65535)
    @Column(name = "product_desc", length = 65535)
    private String productDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "product_weight", precision = 10, scale = 4)
    private BigDecimal productWeight;
    @Size(max = 32)
    @Column(name = "product_weight_uom", length = 32)
    private String productWeightUom;
    @Column(name = "product_length", precision = 10, scale = 4)
    private BigDecimal productLength;
    @Column(name = "product_width", precision = 10, scale = 4)
    private BigDecimal productWidth;
    @Column(name = "product_height", precision = 10, scale = 4)
    private BigDecimal productHeight;
    @Size(max = 32)
    @Column(name = "product_lwh_uom", length = 32)
    private String productLwhUom;
    @Size(max = 255)
    @Column(name = "product_url", length = 255)
    private String productUrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_in_stock", nullable = false)
    private int productInStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_ordered", nullable = false)
    private int productOrdered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "low_stock_notification", nullable = false)
    private int lowStockNotification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_available_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date productAvailableDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 56)
    @Column(name = "product_availability", nullable = false, length = 56)
    private String productAvailability;
    @Column(name = "product_special")
    private Character productSpecial;
    @Column(name = "ship_code_id")
    private Integer shipCodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_sales", nullable = false)
    private int productSales;
    @Size(max = 32)
    @Column(name = "product_unit", length = 32)
    private String productUnit;
    @Column(name = "product_packaging")
    private Integer productPackaging;
    @Size(max = 45)
    @Column(name = "product_order_levels", length = 45)
    private String productOrderLevels;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Lob
    @Size(max = 65535)
    @Column(name = "intnotes", length = 65535)
    private String intnotes;
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
    @Size(min = 1, max = 255)
    @Column(name = "layout", nullable = false, length = 255)
    private String layout;
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

    public Joo2VirtuemartProducts() {
    }

    public Joo2VirtuemartProducts(Long virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public Joo2VirtuemartProducts(Long virtuemartProductId, int virtuemartVendorId, int productParentId, String productSku, String slug, int productInStock, int productOrdered, int lowStockNotification, Date productAvailableDate, String productAvailability, int productSales, int hits, String metadesc, String metakey, String metarobot, String metaauthor, String layout, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartProductId = virtuemartProductId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.productParentId = productParentId;
        this.productSku = productSku;
        this.slug = slug;
        this.productInStock = productInStock;
        this.productOrdered = productOrdered;
        this.lowStockNotification = lowStockNotification;
        this.productAvailableDate = productAvailableDate;
        this.productAvailability = productAvailability;
        this.productSales = productSales;
        this.hits = hits;
        this.metadesc = metadesc;
        this.metakey = metakey;
        this.metarobot = metarobot;
        this.metaauthor = metaauthor;
        this.layout = layout;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(Long virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public int getProductParentId() {
        return productParentId;
    }

    public void setProductParentId(int productParentId) {
        this.productParentId = productParentId;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getProductSDesc() {
        return productSDesc;
    }

    public void setProductSDesc(String productSDesc) {
        this.productSDesc = productSDesc;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductWeightUom() {
        return productWeightUom;
    }

    public void setProductWeightUom(String productWeightUom) {
        this.productWeightUom = productWeightUom;
    }

    public BigDecimal getProductLength() {
        return productLength;
    }

    public void setProductLength(BigDecimal productLength) {
        this.productLength = productLength;
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public String getProductLwhUom() {
        return productLwhUom;
    }

    public void setProductLwhUom(String productLwhUom) {
        this.productLwhUom = productLwhUom;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public int getProductInStock() {
        return productInStock;
    }

    public void setProductInStock(int productInStock) {
        this.productInStock = productInStock;
    }

    public int getProductOrdered() {
        return productOrdered;
    }

    public void setProductOrdered(int productOrdered) {
        this.productOrdered = productOrdered;
    }

    public int getLowStockNotification() {
        return lowStockNotification;
    }

    public void setLowStockNotification(int lowStockNotification) {
        this.lowStockNotification = lowStockNotification;
    }

    public Date getProductAvailableDate() {
        return productAvailableDate;
    }

    public void setProductAvailableDate(Date productAvailableDate) {
        this.productAvailableDate = productAvailableDate;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public Character getProductSpecial() {
        return productSpecial;
    }

    public void setProductSpecial(Character productSpecial) {
        this.productSpecial = productSpecial;
    }

    public Integer getShipCodeId() {
        return shipCodeId;
    }

    public void setShipCodeId(Integer shipCodeId) {
        this.shipCodeId = shipCodeId;
    }

    public int getProductSales() {
        return productSales;
    }

    public void setProductSales(int productSales) {
        this.productSales = productSales;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getProductPackaging() {
        return productPackaging;
    }

    public void setProductPackaging(Integer productPackaging) {
        this.productPackaging = productPackaging;
    }

    public String getProductOrderLevels() {
        return productOrderLevels;
    }

    public void setProductOrderLevels(String productOrderLevels) {
        this.productOrderLevels = productOrderLevels;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getIntnotes() {
        return intnotes;
    }

    public void setIntnotes(String intnotes) {
        this.intnotes = intnotes;
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

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
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
        hash += (virtuemartProductId != null ? virtuemartProductId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartProducts)) {
            return false;
        }
        Joo2VirtuemartProducts other = (Joo2VirtuemartProducts) object;
        if ((this.virtuemartProductId == null && other.virtuemartProductId != null) || (this.virtuemartProductId != null && !this.virtuemartProductId.equals(other.virtuemartProductId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartProducts[ virtuemartProductId=" + virtuemartProductId + " ]";
    }
    
}
