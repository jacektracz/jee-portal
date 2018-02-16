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
@Table(name = "joo2_virtuemart_vmusers", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_user_id", "virtuemart_vendor_id"}),
    @UniqueConstraint(columnNames = {"virtuemart_user_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartVmusers.findAll", query = "SELECT j FROM Joo2VirtuemartVmusers j"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByUserIsVendor", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.userIsVendor = :userIsVendor"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByCustomerNumber", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.customerNumber = :customerNumber"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByPerms", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.perms = :perms"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByVirtuemartPaymentmethodId", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.virtuemartPaymentmethodId = :virtuemartPaymentmethodId"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByVirtuemartShippingcarrierId", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.virtuemartShippingcarrierId = :virtuemartShippingcarrierId"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByAgreed", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.agreed = :agreed"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartVmusers.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartVmusers j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartVmusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private Long virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_is_vendor", nullable = false)
    private boolean userIsVendor;
    @Size(max = 32)
    @Column(name = "customer_number", length = 32)
    private String customerNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "perms", nullable = false, length = 40)
    private String perms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_paymentmethod_id", nullable = false)
    private int virtuemartPaymentmethodId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_shippingcarrier_id", nullable = false)
    private int virtuemartShippingcarrierId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agreed", nullable = false)
    private boolean agreed;
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

    public Joo2VirtuemartVmusers() {
    }

    public Joo2VirtuemartVmusers(Long virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public Joo2VirtuemartVmusers(Long virtuemartUserId, int virtuemartVendorId, boolean userIsVendor, String perms, int virtuemartPaymentmethodId, int virtuemartShippingcarrierId, boolean agreed, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartUserId = virtuemartUserId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.userIsVendor = userIsVendor;
        this.perms = perms;
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
        this.virtuemartShippingcarrierId = virtuemartShippingcarrierId;
        this.agreed = agreed;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(Long virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public boolean getUserIsVendor() {
        return userIsVendor;
    }

    public void setUserIsVendor(boolean userIsVendor) {
        this.userIsVendor = userIsVendor;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public int getVirtuemartPaymentmethodId() {
        return virtuemartPaymentmethodId;
    }

    public void setVirtuemartPaymentmethodId(int virtuemartPaymentmethodId) {
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
    }

    public int getVirtuemartShippingcarrierId() {
        return virtuemartShippingcarrierId;
    }

    public void setVirtuemartShippingcarrierId(int virtuemartShippingcarrierId) {
        this.virtuemartShippingcarrierId = virtuemartShippingcarrierId;
    }

    public boolean getAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
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
        hash += (virtuemartUserId != null ? virtuemartUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartVmusers)) {
            return false;
        }
        Joo2VirtuemartVmusers other = (Joo2VirtuemartVmusers) object;
        if ((this.virtuemartUserId == null && other.virtuemartUserId != null) || (this.virtuemartUserId != null && !this.virtuemartUserId.equals(other.virtuemartUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartVmusers[ virtuemartUserId=" + virtuemartUserId + " ]";
    }
    
}
