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
@Table(name = "joo2_virtuemart_orderstates", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_orderstate_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findAll", query = "SELECT j FROM Joo2VirtuemartOrderstates j"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByVirtuemartOrderstateId", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.virtuemartOrderstateId = :virtuemartOrderstateId"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByOrderStatusCode", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.orderStatusCode = :orderStatusCode"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByOrderStatusName", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.orderStatusName = :orderStatusName"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByOrdering", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByPublished", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderstates.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartOrderstates j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartOrderstates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_orderstate_id", nullable = false)
    private Long virtuemartOrderstateId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_status_code", nullable = false)
    private char orderStatusCode;
    @Size(max = 64)
    @Column(name = "order_status_name", length = 64)
    private String orderStatusName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "order_status_description", nullable = false, length = 65535)
    private String orderStatusDescription;
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

    public Joo2VirtuemartOrderstates() {
    }

    public Joo2VirtuemartOrderstates(Long virtuemartOrderstateId) {
        this.virtuemartOrderstateId = virtuemartOrderstateId;
    }

    public Joo2VirtuemartOrderstates(Long virtuemartOrderstateId, char orderStatusCode, String orderStatusDescription, int ordering, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartOrderstateId = virtuemartOrderstateId;
        this.orderStatusCode = orderStatusCode;
        this.orderStatusDescription = orderStatusDescription;
        this.ordering = ordering;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartOrderstateId() {
        return virtuemartOrderstateId;
    }

    public void setVirtuemartOrderstateId(Long virtuemartOrderstateId) {
        this.virtuemartOrderstateId = virtuemartOrderstateId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public char getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(char orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
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
        hash += (virtuemartOrderstateId != null ? virtuemartOrderstateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartOrderstates)) {
            return false;
        }
        Joo2VirtuemartOrderstates other = (Joo2VirtuemartOrderstates) object;
        if ((this.virtuemartOrderstateId == null && other.virtuemartOrderstateId != null) || (this.virtuemartOrderstateId != null && !this.virtuemartOrderstateId.equals(other.virtuemartOrderstateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartOrderstates[ virtuemartOrderstateId=" + virtuemartOrderstateId + " ]";
    }
    
}
