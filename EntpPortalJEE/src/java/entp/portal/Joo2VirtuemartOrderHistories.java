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
@Table(name = "joo2_virtuemart_order_histories", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_order_history_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findAll", query = "SELECT j FROM Joo2VirtuemartOrderHistories j"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByVirtuemartOrderHistoryId", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.virtuemartOrderHistoryId = :virtuemartOrderHistoryId"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByVirtuemartOrderId", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.virtuemartOrderId = :virtuemartOrderId"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByOrderStatusCode", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.orderStatusCode = :orderStatusCode"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByDateAdded", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.dateAdded = :dateAdded"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByCustomerNotified", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.customerNotified = :customerNotified"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByPublished", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderHistories.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartOrderHistories j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartOrderHistories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_order_history_id", nullable = false)
    private Long virtuemartOrderHistoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_order_id", nullable = false)
    private int virtuemartOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_status_code", nullable = false)
    private char orderStatusCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Column(name = "customer_notified")
    private Integer customerNotified;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments", length = 65535)
    private String comments;
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

    public Joo2VirtuemartOrderHistories() {
    }

    public Joo2VirtuemartOrderHistories(Long virtuemartOrderHistoryId) {
        this.virtuemartOrderHistoryId = virtuemartOrderHistoryId;
    }

    public Joo2VirtuemartOrderHistories(Long virtuemartOrderHistoryId, int virtuemartOrderId, char orderStatusCode, Date dateAdded, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartOrderHistoryId = virtuemartOrderHistoryId;
        this.virtuemartOrderId = virtuemartOrderId;
        this.orderStatusCode = orderStatusCode;
        this.dateAdded = dateAdded;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartOrderHistoryId() {
        return virtuemartOrderHistoryId;
    }

    public void setVirtuemartOrderHistoryId(Long virtuemartOrderHistoryId) {
        this.virtuemartOrderHistoryId = virtuemartOrderHistoryId;
    }

    public int getVirtuemartOrderId() {
        return virtuemartOrderId;
    }

    public void setVirtuemartOrderId(int virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public char getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(char orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Integer customerNotified) {
        this.customerNotified = customerNotified;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
        hash += (virtuemartOrderHistoryId != null ? virtuemartOrderHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartOrderHistories)) {
            return false;
        }
        Joo2VirtuemartOrderHistories other = (Joo2VirtuemartOrderHistories) object;
        if ((this.virtuemartOrderHistoryId == null && other.virtuemartOrderHistoryId != null) || (this.virtuemartOrderHistoryId != null && !this.virtuemartOrderHistoryId.equals(other.virtuemartOrderHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartOrderHistories[ virtuemartOrderHistoryId=" + virtuemartOrderHistoryId + " ]";
    }
    
}
