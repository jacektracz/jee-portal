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
@Table(name = "joo2_virtuemart_order_items", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_order_item_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findAll", query = "SELECT j FROM Joo2VirtuemartOrderItems j"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByVirtuemartOrderItemId", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.virtuemartOrderItemId = :virtuemartOrderItemId"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByVirtuemartOrderId", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.virtuemartOrderId = :virtuemartOrderId"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByVirtuemartUserinfoId", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.virtuemartUserinfoId = :virtuemartUserinfoId"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByOrderItemSku", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.orderItemSku = :orderItemSku"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByOrderItemName", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.orderItemName = :orderItemName"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByProductQuantity", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.productQuantity = :productQuantity"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByProductItemPrice", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.productItemPrice = :productItemPrice"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByProductFinalPrice", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.productFinalPrice = :productFinalPrice"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByOrderItemCurrency", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.orderItemCurrency = :orderItemCurrency"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByOrderStatus", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.orderStatus = :orderStatus"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderItems.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartOrderItems j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartOrderItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_order_item_id", nullable = false)
    private Long virtuemartOrderItemId;
    @Column(name = "virtuemart_order_id")
    private Integer virtuemartOrderId;
    @Size(max = 32)
    @Column(name = "virtuemart_userinfo_id", length = 32)
    private String virtuemartUserinfoId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Column(name = "virtuemart_product_id")
    private Integer virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "order_item_sku", nullable = false, length = 64)
    private String orderItemSku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "order_item_name", nullable = false, length = 64)
    private String orderItemName;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "product_item_price", precision = 15, scale = 5)
    private BigDecimal productItemPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_final_price", nullable = false, precision = 15, scale = 5)
    private BigDecimal productFinalPrice;
    @Column(name = "order_item_currency")
    private Integer orderItemCurrency;
    @Column(name = "order_status")
    private Character orderStatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "product_attribute", length = 65535)
    private String productAttribute;
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

    public Joo2VirtuemartOrderItems() {
    }

    public Joo2VirtuemartOrderItems(Long virtuemartOrderItemId) {
        this.virtuemartOrderItemId = virtuemartOrderItemId;
    }

    public Joo2VirtuemartOrderItems(Long virtuemartOrderItemId, String orderItemSku, String orderItemName, BigDecimal productFinalPrice, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartOrderItemId = virtuemartOrderItemId;
        this.orderItemSku = orderItemSku;
        this.orderItemName = orderItemName;
        this.productFinalPrice = productFinalPrice;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartOrderItemId() {
        return virtuemartOrderItemId;
    }

    public void setVirtuemartOrderItemId(Long virtuemartOrderItemId) {
        this.virtuemartOrderItemId = virtuemartOrderItemId;
    }

    public Integer getVirtuemartOrderId() {
        return virtuemartOrderId;
    }

    public void setVirtuemartOrderId(Integer virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public String getVirtuemartUserinfoId() {
        return virtuemartUserinfoId;
    }

    public void setVirtuemartUserinfoId(String virtuemartUserinfoId) {
        this.virtuemartUserinfoId = virtuemartUserinfoId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public Integer getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(Integer virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public String getOrderItemSku() {
        return orderItemSku;
    }

    public void setOrderItemSku(String orderItemSku) {
        this.orderItemSku = orderItemSku;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getProductItemPrice() {
        return productItemPrice;
    }

    public void setProductItemPrice(BigDecimal productItemPrice) {
        this.productItemPrice = productItemPrice;
    }

    public BigDecimal getProductFinalPrice() {
        return productFinalPrice;
    }

    public void setProductFinalPrice(BigDecimal productFinalPrice) {
        this.productFinalPrice = productFinalPrice;
    }

    public Integer getOrderItemCurrency() {
        return orderItemCurrency;
    }

    public void setOrderItemCurrency(Integer orderItemCurrency) {
        this.orderItemCurrency = orderItemCurrency;
    }

    public Character getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Character orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
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
        hash += (virtuemartOrderItemId != null ? virtuemartOrderItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartOrderItems)) {
            return false;
        }
        Joo2VirtuemartOrderItems other = (Joo2VirtuemartOrderItems) object;
        if ((this.virtuemartOrderItemId == null && other.virtuemartOrderItemId != null) || (this.virtuemartOrderItemId != null && !this.virtuemartOrderItemId.equals(other.virtuemartOrderItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartOrderItems[ virtuemartOrderItemId=" + virtuemartOrderItemId + " ]";
    }
    
}
