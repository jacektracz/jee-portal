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
@Table(name = "joo2_virtuemart_product_prices", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_product_price_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findAll", query = "SELECT j FROM Joo2VirtuemartProductPrices j"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByVirtuemartProductPriceId", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.virtuemartProductPriceId = :virtuemartProductPriceId"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByVirtuemartShoppergroupId", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.virtuemartShoppergroupId = :virtuemartShoppergroupId"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductPrice", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productPrice = :productPrice"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByOverride", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.override = :override"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductOverridePrice", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productOverridePrice = :productOverridePrice"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductTaxId", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productTaxId = :productTaxId"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductDiscountId", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productDiscountId = :productDiscountId"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductCurrency", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productCurrency = :productCurrency"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductPriceVdate", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productPriceVdate = :productPriceVdate"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByProductPriceEdate", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.productPriceEdate = :productPriceEdate"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByPriceQuantityStart", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.priceQuantityStart = :priceQuantityStart"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByPriceQuantityEnd", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.priceQuantityEnd = :priceQuantityEnd"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductPrices.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartProductPrices j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartProductPrices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_product_price_id", nullable = false)
    private Long virtuemartProductPriceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Column(name = "virtuemart_shoppergroup_id")
    private Integer virtuemartShoppergroupId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "product_price", precision = 15, scale = 5)
    private BigDecimal productPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "override", nullable = false)
    private boolean override;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_override_price", nullable = false, precision = 15, scale = 5)
    private BigDecimal productOverridePrice;
    @Column(name = "product_tax_id")
    private Integer productTaxId;
    @Column(name = "product_discount_id")
    private Integer productDiscountId;
    @Size(max = 16)
    @Column(name = "product_currency", length = 16)
    private String productCurrency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_price_vdate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date productPriceVdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_price_edate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date productPriceEdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price_quantity_start", nullable = false)
    private int priceQuantityStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price_quantity_end", nullable = false)
    private int priceQuantityEnd;
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

    public Joo2VirtuemartProductPrices() {
    }

    public Joo2VirtuemartProductPrices(Long virtuemartProductPriceId) {
        this.virtuemartProductPriceId = virtuemartProductPriceId;
    }

    public Joo2VirtuemartProductPrices(Long virtuemartProductPriceId, int virtuemartProductId, boolean override, BigDecimal productOverridePrice, Date productPriceVdate, Date productPriceEdate, int priceQuantityStart, int priceQuantityEnd, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartProductPriceId = virtuemartProductPriceId;
        this.virtuemartProductId = virtuemartProductId;
        this.override = override;
        this.productOverridePrice = productOverridePrice;
        this.productPriceVdate = productPriceVdate;
        this.productPriceEdate = productPriceEdate;
        this.priceQuantityStart = priceQuantityStart;
        this.priceQuantityEnd = priceQuantityEnd;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartProductPriceId() {
        return virtuemartProductPriceId;
    }

    public void setVirtuemartProductPriceId(Long virtuemartProductPriceId) {
        this.virtuemartProductPriceId = virtuemartProductPriceId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public Integer getVirtuemartShoppergroupId() {
        return virtuemartShoppergroupId;
    }

    public void setVirtuemartShoppergroupId(Integer virtuemartShoppergroupId) {
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public boolean getOverride() {
        return override;
    }

    public void setOverride(boolean override) {
        this.override = override;
    }

    public BigDecimal getProductOverridePrice() {
        return productOverridePrice;
    }

    public void setProductOverridePrice(BigDecimal productOverridePrice) {
        this.productOverridePrice = productOverridePrice;
    }

    public Integer getProductTaxId() {
        return productTaxId;
    }

    public void setProductTaxId(Integer productTaxId) {
        this.productTaxId = productTaxId;
    }

    public Integer getProductDiscountId() {
        return productDiscountId;
    }

    public void setProductDiscountId(Integer productDiscountId) {
        this.productDiscountId = productDiscountId;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }

    public Date getProductPriceVdate() {
        return productPriceVdate;
    }

    public void setProductPriceVdate(Date productPriceVdate) {
        this.productPriceVdate = productPriceVdate;
    }

    public Date getProductPriceEdate() {
        return productPriceEdate;
    }

    public void setProductPriceEdate(Date productPriceEdate) {
        this.productPriceEdate = productPriceEdate;
    }

    public int getPriceQuantityStart() {
        return priceQuantityStart;
    }

    public void setPriceQuantityStart(int priceQuantityStart) {
        this.priceQuantityStart = priceQuantityStart;
    }

    public int getPriceQuantityEnd() {
        return priceQuantityEnd;
    }

    public void setPriceQuantityEnd(int priceQuantityEnd) {
        this.priceQuantityEnd = priceQuantityEnd;
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
        hash += (virtuemartProductPriceId != null ? virtuemartProductPriceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartProductPrices)) {
            return false;
        }
        Joo2VirtuemartProductPrices other = (Joo2VirtuemartProductPrices) object;
        if ((this.virtuemartProductPriceId == null && other.virtuemartProductPriceId != null) || (this.virtuemartProductPriceId != null && !this.virtuemartProductPriceId.equals(other.virtuemartProductPriceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartProductPrices[ virtuemartProductPriceId=" + virtuemartProductPriceId + " ]";
    }
    
}
