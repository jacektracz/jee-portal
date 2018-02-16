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
@Table(name = "joo2_virtuemart_permgroups", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_permgroup_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findAll", query = "SELECT j FROM Joo2VirtuemartPermgroups j"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByVirtuemartPermgroupId", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.virtuemartPermgroupId = :virtuemartPermgroupId"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByGroupName", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.groupName = :groupName"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByGroupLevel", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.groupLevel = :groupLevel"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByOrdering", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByShared", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByPublished", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartPermgroups.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartPermgroups j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartPermgroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_permgroup_id", nullable = false)
    private Long virtuemartPermgroupId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Size(max = 128)
    @Column(name = "group_name", length = 128)
    private String groupName;
    @Column(name = "group_level")
    private Integer groupLevel;
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

    public Joo2VirtuemartPermgroups() {
    }

    public Joo2VirtuemartPermgroups(Long virtuemartPermgroupId) {
        this.virtuemartPermgroupId = virtuemartPermgroupId;
    }

    public Joo2VirtuemartPermgroups(Long virtuemartPermgroupId, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartPermgroupId = virtuemartPermgroupId;
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

    public Long getVirtuemartPermgroupId() {
        return virtuemartPermgroupId;
    }

    public void setVirtuemartPermgroupId(Long virtuemartPermgroupId) {
        this.virtuemartPermgroupId = virtuemartPermgroupId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
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
        hash += (virtuemartPermgroupId != null ? virtuemartPermgroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartPermgroups)) {
            return false;
        }
        Joo2VirtuemartPermgroups other = (Joo2VirtuemartPermgroups) object;
        if ((this.virtuemartPermgroupId == null && other.virtuemartPermgroupId != null) || (this.virtuemartPermgroupId != null && !this.virtuemartPermgroupId.equals(other.virtuemartPermgroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartPermgroups[ virtuemartPermgroupId=" + virtuemartPermgroupId + " ]";
    }
    
}
