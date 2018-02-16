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
@Table(name = "joo2_virtuemart_waitingusers", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_waitinguser_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findAll", query = "SELECT j FROM Joo2VirtuemartWaitingusers j"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByVirtuemartWaitinguserId", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.virtuemartWaitinguserId = :virtuemartWaitinguserId"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByNotifyEmail", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.notifyEmail = :notifyEmail"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByNotified", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.notified = :notified"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByNotifyDate", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.notifyDate = :notifyDate"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByOrdering", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartWaitingusers.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartWaitingusers j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartWaitingusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_waitinguser_id", nullable = false)
    private Long virtuemartWaitinguserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private int virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "notify_email", nullable = false, length = 150)
    private String notifyEmail;
    @Size(max = 2)
    @Column(name = "notified", length = 2)
    private String notified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notify_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date notifyDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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

    public Joo2VirtuemartWaitingusers() {
    }

    public Joo2VirtuemartWaitingusers(Long virtuemartWaitinguserId) {
        this.virtuemartWaitinguserId = virtuemartWaitinguserId;
    }

    public Joo2VirtuemartWaitingusers(Long virtuemartWaitinguserId, int virtuemartProductId, int virtuemartUserId, String notifyEmail, Date notifyDate, int ordering, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartWaitinguserId = virtuemartWaitinguserId;
        this.virtuemartProductId = virtuemartProductId;
        this.virtuemartUserId = virtuemartUserId;
        this.notifyEmail = notifyEmail;
        this.notifyDate = notifyDate;
        this.ordering = ordering;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartWaitinguserId() {
        return virtuemartWaitinguserId;
    }

    public void setVirtuemartWaitinguserId(Long virtuemartWaitinguserId) {
        this.virtuemartWaitinguserId = virtuemartWaitinguserId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(int virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public String getNotifyEmail() {
        return notifyEmail;
    }

    public void setNotifyEmail(String notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public String getNotified() {
        return notified;
    }

    public void setNotified(String notified) {
        this.notified = notified;
    }

    public Date getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        hash += (virtuemartWaitinguserId != null ? virtuemartWaitinguserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartWaitingusers)) {
            return false;
        }
        Joo2VirtuemartWaitingusers other = (Joo2VirtuemartWaitingusers) object;
        if ((this.virtuemartWaitinguserId == null && other.virtuemartWaitinguserId != null) || (this.virtuemartWaitinguserId != null && !this.virtuemartWaitinguserId.equals(other.virtuemartWaitinguserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartWaitingusers[ virtuemartWaitinguserId=" + virtuemartWaitinguserId + " ]";
    }
    
}
