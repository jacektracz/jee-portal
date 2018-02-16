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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_coupons", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCoupons.findAll", query = "SELECT j FROM Joo2VirtuemartCoupons j"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByVirtuemartCouponId", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.virtuemartCouponId = :virtuemartCouponId"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponCode", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponCode = :couponCode"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByPercentOrTotal", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.percentOrTotal = :percentOrTotal"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponType", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponType = :couponType"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponValue", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponValue = :couponValue"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponStartDate", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponStartDate = :couponStartDate"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponExpiryDate", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponExpiryDate = :couponExpiryDate"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCouponValueValid", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.couponValueValid = :couponValueValid"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByPublished", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCoupons.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCoupons j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCoupons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_coupon_id", nullable = false)
    private Integer virtuemartCouponId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "coupon_code", nullable = false, length = 32)
    private String couponCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "percent_or_total", nullable = false, length = 8)
    private String percentOrTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "coupon_type", nullable = false, length = 9)
    private String couponType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_value", nullable = false, precision = 15, scale = 5)
    private BigDecimal couponValue;
    @Column(name = "coupon_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponStartDate;
    @Column(name = "coupon_expiry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponExpiryDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coupon_value_valid", nullable = false, precision = 15, scale = 5)
    private BigDecimal couponValueValid;
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

    public Joo2VirtuemartCoupons() {
    }

    public Joo2VirtuemartCoupons(Integer virtuemartCouponId) {
        this.virtuemartCouponId = virtuemartCouponId;
    }

    public Joo2VirtuemartCoupons(Integer virtuemartCouponId, String couponCode, String percentOrTotal, String couponType, BigDecimal couponValue, BigDecimal couponValueValid, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCouponId = virtuemartCouponId;
        this.couponCode = couponCode;
        this.percentOrTotal = percentOrTotal;
        this.couponType = couponType;
        this.couponValue = couponValue;
        this.couponValueValid = couponValueValid;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Integer getVirtuemartCouponId() {
        return virtuemartCouponId;
    }

    public void setVirtuemartCouponId(Integer virtuemartCouponId) {
        this.virtuemartCouponId = virtuemartCouponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getPercentOrTotal() {
        return percentOrTotal;
    }

    public void setPercentOrTotal(String percentOrTotal) {
        this.percentOrTotal = percentOrTotal;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    public Date getCouponStartDate() {
        return couponStartDate;
    }

    public void setCouponStartDate(Date couponStartDate) {
        this.couponStartDate = couponStartDate;
    }

    public Date getCouponExpiryDate() {
        return couponExpiryDate;
    }

    public void setCouponExpiryDate(Date couponExpiryDate) {
        this.couponExpiryDate = couponExpiryDate;
    }

    public BigDecimal getCouponValueValid() {
        return couponValueValid;
    }

    public void setCouponValueValid(BigDecimal couponValueValid) {
        this.couponValueValid = couponValueValid;
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
        hash += (virtuemartCouponId != null ? virtuemartCouponId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCoupons)) {
            return false;
        }
        Joo2VirtuemartCoupons other = (Joo2VirtuemartCoupons) object;
        if ((this.virtuemartCouponId == null && other.virtuemartCouponId != null) || (this.virtuemartCouponId != null && !this.virtuemartCouponId.equals(other.virtuemartCouponId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCoupons[ virtuemartCouponId=" + virtuemartCouponId + " ]";
    }
    
}
