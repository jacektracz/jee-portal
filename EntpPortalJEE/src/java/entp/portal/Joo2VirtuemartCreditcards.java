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
@Table(name = "joo2_virtuemart_creditcards", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_creditcard_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findAll", query = "SELECT j FROM Joo2VirtuemartCreditcards j"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByVirtuemartCreditcardId", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.virtuemartCreditcardId = :virtuemartCreditcardId"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByCreditcardName", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.creditcardName = :creditcardName"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByCreditcardCode", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.creditcardCode = :creditcardCode"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByShared", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByPublished", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCreditcards.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCreditcards j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCreditcards implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_creditcard_id", nullable = false)
    private Long virtuemartCreditcardId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "creditcard_name", nullable = false, length = 70)
    private String creditcardName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "creditcard_code", nullable = false, length = 30)
    private String creditcardCode;
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

    public Joo2VirtuemartCreditcards() {
    }

    public Joo2VirtuemartCreditcards(Long virtuemartCreditcardId) {
        this.virtuemartCreditcardId = virtuemartCreditcardId;
    }

    public Joo2VirtuemartCreditcards(Long virtuemartCreditcardId, int virtuemartVendorId, String creditcardName, String creditcardCode, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCreditcardId = virtuemartCreditcardId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.creditcardName = creditcardName;
        this.creditcardCode = creditcardCode;
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

    public Long getVirtuemartCreditcardId() {
        return virtuemartCreditcardId;
    }

    public void setVirtuemartCreditcardId(Long virtuemartCreditcardId) {
        this.virtuemartCreditcardId = virtuemartCreditcardId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getCreditcardName() {
        return creditcardName;
    }

    public void setCreditcardName(String creditcardName) {
        this.creditcardName = creditcardName;
    }

    public String getCreditcardCode() {
        return creditcardCode;
    }

    public void setCreditcardCode(String creditcardCode) {
        this.creditcardCode = creditcardCode;
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
        hash += (virtuemartCreditcardId != null ? virtuemartCreditcardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCreditcards)) {
            return false;
        }
        Joo2VirtuemartCreditcards other = (Joo2VirtuemartCreditcards) object;
        if ((this.virtuemartCreditcardId == null && other.virtuemartCreditcardId != null) || (this.virtuemartCreditcardId != null && !this.virtuemartCreditcardId.equals(other.virtuemartCreditcardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCreditcards[ virtuemartCreditcardId=" + virtuemartCreditcardId + " ]";
    }
    
}
