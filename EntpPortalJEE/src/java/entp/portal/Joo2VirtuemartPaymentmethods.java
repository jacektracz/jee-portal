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
@Table(name = "joo2_virtuemart_paymentmethods", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_paymentmethod_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findAll", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByVirtuemartPaymentmethodId", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.virtuemartPaymentmethodId = :virtuemartPaymentmethodId"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByPaymentJpluginId", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.paymentJpluginId = :paymentJpluginId"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByPaymentName", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.paymentName = :paymentName"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByPaymentElement", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.paymentElement = :paymentElement"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByDiscount", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.discount = :discount"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByDiscountIsPercentage", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.discountIsPercentage = :discountIsPercentage"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByDiscountMaxAmount", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.discountMaxAmount = :discountMaxAmount"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByDiscountMinAmount", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.discountMinAmount = :discountMinAmount"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByShared", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByOrdering", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByPublished", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethods.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartPaymentmethods j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartPaymentmethods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_paymentmethod_id", nullable = false)
    private Long virtuemartPaymentmethodId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_jplugin_id", nullable = false)
    private int paymentJpluginId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "payment_name", nullable = false, length = 255)
    private String paymentName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "payment_element", nullable = false, length = 50)
    private String paymentElement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount", nullable = false, precision = 12, scale = 2)
    private BigDecimal discount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount_is_percentage", nullable = false)
    private boolean discountIsPercentage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount_max_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal discountMaxAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount_min_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal discountMinAmount;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "payment_params", nullable = false, length = 65535)
    private String paymentParams;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared", nullable = false)
    private boolean shared;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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

    public Joo2VirtuemartPaymentmethods() {
    }

    public Joo2VirtuemartPaymentmethods(Long virtuemartPaymentmethodId) {
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
    }

    public Joo2VirtuemartPaymentmethods(Long virtuemartPaymentmethodId, int virtuemartVendorId, int paymentJpluginId, String paymentName, String paymentElement, BigDecimal discount, boolean discountIsPercentage, BigDecimal discountMaxAmount, BigDecimal discountMinAmount, String paymentParams, boolean shared, int ordering, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.paymentJpluginId = paymentJpluginId;
        this.paymentName = paymentName;
        this.paymentElement = paymentElement;
        this.discount = discount;
        this.discountIsPercentage = discountIsPercentage;
        this.discountMaxAmount = discountMaxAmount;
        this.discountMinAmount = discountMinAmount;
        this.paymentParams = paymentParams;
        this.shared = shared;
        this.ordering = ordering;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartPaymentmethodId() {
        return virtuemartPaymentmethodId;
    }

    public void setVirtuemartPaymentmethodId(Long virtuemartPaymentmethodId) {
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public int getPaymentJpluginId() {
        return paymentJpluginId;
    }

    public void setPaymentJpluginId(int paymentJpluginId) {
        this.paymentJpluginId = paymentJpluginId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getPaymentElement() {
        return paymentElement;
    }

    public void setPaymentElement(String paymentElement) {
        this.paymentElement = paymentElement;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public boolean getDiscountIsPercentage() {
        return discountIsPercentage;
    }

    public void setDiscountIsPercentage(boolean discountIsPercentage) {
        this.discountIsPercentage = discountIsPercentage;
    }

    public BigDecimal getDiscountMaxAmount() {
        return discountMaxAmount;
    }

    public void setDiscountMaxAmount(BigDecimal discountMaxAmount) {
        this.discountMaxAmount = discountMaxAmount;
    }

    public BigDecimal getDiscountMinAmount() {
        return discountMinAmount;
    }

    public void setDiscountMinAmount(BigDecimal discountMinAmount) {
        this.discountMinAmount = discountMinAmount;
    }

    public String getPaymentParams() {
        return paymentParams;
    }

    public void setPaymentParams(String paymentParams) {
        this.paymentParams = paymentParams;
    }

    public boolean getShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        hash += (virtuemartPaymentmethodId != null ? virtuemartPaymentmethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartPaymentmethods)) {
            return false;
        }
        Joo2VirtuemartPaymentmethods other = (Joo2VirtuemartPaymentmethods) object;
        if ((this.virtuemartPaymentmethodId == null && other.virtuemartPaymentmethodId != null) || (this.virtuemartPaymentmethodId != null && !this.virtuemartPaymentmethodId.equals(other.virtuemartPaymentmethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartPaymentmethods[ virtuemartPaymentmethodId=" + virtuemartPaymentmethodId + " ]";
    }
    
}
