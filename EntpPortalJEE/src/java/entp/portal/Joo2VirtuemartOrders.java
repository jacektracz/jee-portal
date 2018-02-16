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
@Table(name = "joo2_virtuemart_orders", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_order_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartOrders.findAll", query = "SELECT j FROM Joo2VirtuemartOrders j"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByVirtuemartOrderId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.virtuemartOrderId = :virtuemartOrderId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderNumber", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderNumber = :orderNumber"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderPass", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderPass = :orderPass"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByVirtuemartUserinfoId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.virtuemartUserinfoId = :virtuemartUserinfoId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderTotal", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderTotal = :orderTotal"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderSubtotal", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderSubtotal = :orderSubtotal"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderTax", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderTax = :orderTax"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderShipping", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderShipping = :orderShipping"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderShippingTax", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderShippingTax = :orderShippingTax"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByCouponDiscount", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.couponDiscount = :couponDiscount"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByCouponCode", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.couponCode = :couponCode"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderDiscount", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderDiscount = :orderDiscount"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderCurrency", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderCurrency = :orderCurrency"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByOrderStatus", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.orderStatus = :orderStatus"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByUserCurrencyId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.userCurrencyId = :userCurrencyId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByUserCurrencyRate", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.userCurrencyRate = :userCurrencyRate"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByPaymentMethodId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.paymentMethodId = :paymentMethodId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByShipMethodId", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.shipMethodId = :shipMethodId"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByIpAddress", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.ipAddress = :ipAddress"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrders.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartOrders j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartOrders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_order_id", nullable = false)
    private Long virtuemartOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private int virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Size(max = 32)
    @Column(name = "order_number", length = 32)
    private String orderNumber;
    @Size(max = 8)
    @Column(name = "order_pass", length = 8)
    private String orderPass;
    @Size(max = 32)
    @Column(name = "virtuemart_userinfo_id", length = 32)
    private String virtuemartUserinfoId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_total", nullable = false, precision = 15, scale = 5)
    private BigDecimal orderTotal;
    @Column(name = "order_subtotal", precision = 15, scale = 5)
    private BigDecimal orderSubtotal;
    @Column(name = "order_tax", precision = 10, scale = 5)
    private BigDecimal orderTax;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "order_tax_details", nullable = false, length = 65535)
    private String orderTaxDetails;
    @Column(name = "order_shipping", precision = 10, scale = 2)
    private BigDecimal orderShipping;
    @Column(name = "order_shipping_tax", precision = 10, scale = 5)
    private BigDecimal orderShippingTax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_discount", nullable = false, precision = 12, scale = 2)
    private BigDecimal couponDiscount;
    @Size(max = 32)
    @Column(name = "coupon_code", length = 32)
    private String couponCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_discount", nullable = false, precision = 12, scale = 2)
    private BigDecimal orderDiscount;
    @Column(name = "order_currency")
    private Integer orderCurrency;
    @Column(name = "order_status")
    private Character orderStatus;
    @Column(name = "user_currency_id")
    private Integer userCurrencyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_currency_rate", nullable = false, precision = 10, scale = 5)
    private BigDecimal userCurrencyRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_method_id", nullable = false)
    private int paymentMethodId;
    @Size(max = 255)
    @Column(name = "ship_method_id", length = 255)
    private String shipMethodId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "customer_note", nullable = false, length = 65535)
    private String customerNote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ip_address", nullable = false, length = 15)
    private String ipAddress;
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

    public Joo2VirtuemartOrders() {
    }

    public Joo2VirtuemartOrders(Long virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public Joo2VirtuemartOrders(Long virtuemartOrderId, int virtuemartUserId, int virtuemartVendorId, BigDecimal orderTotal, String orderTaxDetails, BigDecimal couponDiscount, BigDecimal orderDiscount, BigDecimal userCurrencyRate, int paymentMethodId, String customerNote, String ipAddress, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartOrderId = virtuemartOrderId;
        this.virtuemartUserId = virtuemartUserId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.orderTotal = orderTotal;
        this.orderTaxDetails = orderTaxDetails;
        this.couponDiscount = couponDiscount;
        this.orderDiscount = orderDiscount;
        this.userCurrencyRate = userCurrencyRate;
        this.paymentMethodId = paymentMethodId;
        this.customerNote = customerNote;
        this.ipAddress = ipAddress;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartOrderId() {
        return virtuemartOrderId;
    }

    public void setVirtuemartOrderId(Long virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public int getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(int virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderPass() {
        return orderPass;
    }

    public void setOrderPass(String orderPass) {
        this.orderPass = orderPass;
    }

    public String getVirtuemartUserinfoId() {
        return virtuemartUserinfoId;
    }

    public void setVirtuemartUserinfoId(String virtuemartUserinfoId) {
        this.virtuemartUserinfoId = virtuemartUserinfoId;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public BigDecimal getOrderSubtotal() {
        return orderSubtotal;
    }

    public void setOrderSubtotal(BigDecimal orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    public BigDecimal getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(BigDecimal orderTax) {
        this.orderTax = orderTax;
    }

    public String getOrderTaxDetails() {
        return orderTaxDetails;
    }

    public void setOrderTaxDetails(String orderTaxDetails) {
        this.orderTaxDetails = orderTaxDetails;
    }

    public BigDecimal getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(BigDecimal orderShipping) {
        this.orderShipping = orderShipping;
    }

    public BigDecimal getOrderShippingTax() {
        return orderShippingTax;
    }

    public void setOrderShippingTax(BigDecimal orderShippingTax) {
        this.orderShippingTax = orderShippingTax;
    }

    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Integer getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(Integer orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public Character getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Character orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getUserCurrencyId() {
        return userCurrencyId;
    }

    public void setUserCurrencyId(Integer userCurrencyId) {
        this.userCurrencyId = userCurrencyId;
    }

    public BigDecimal getUserCurrencyRate() {
        return userCurrencyRate;
    }

    public void setUserCurrencyRate(BigDecimal userCurrencyRate) {
        this.userCurrencyRate = userCurrencyRate;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(String shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
        hash += (virtuemartOrderId != null ? virtuemartOrderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartOrders)) {
            return false;
        }
        Joo2VirtuemartOrders other = (Joo2VirtuemartOrders) object;
        if ((this.virtuemartOrderId == null && other.virtuemartOrderId != null) || (this.virtuemartOrderId != null && !this.virtuemartOrderId.equals(other.virtuemartOrderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartOrders[ virtuemartOrderId=" + virtuemartOrderId + " ]";
    }
    
}
