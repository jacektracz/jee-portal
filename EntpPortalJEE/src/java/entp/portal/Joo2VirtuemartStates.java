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
@Table(name = "joo2_virtuemart_states", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_country_id", "state_2_code"}),
    @UniqueConstraint(columnNames = {"virtuemart_country_id", "state_3_code"}),
    @UniqueConstraint(columnNames = {"virtuemart_state_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartStates.findAll", query = "SELECT j FROM Joo2VirtuemartStates j"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByVirtuemartStateId", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.virtuemartStateId = :virtuemartStateId"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByVirtuemartCountryId", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.virtuemartCountryId = :virtuemartCountryId"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByVirtuemartWorldzoneId", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.virtuemartWorldzoneId = :virtuemartWorldzoneId"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByStateName", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.stateName = :stateName"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByState3Code", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.state3Code = :state3Code"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByState2Code", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.state2Code = :state2Code"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByOrdering", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByShared", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByPublished", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartStates.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartStates j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartStates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_state_id", nullable = false)
    private Long virtuemartStateId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_country_id", nullable = false)
    private int virtuemartCountryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_worldzone_id", nullable = false)
    private int virtuemartWorldzoneId;
    @Size(max = 64)
    @Column(name = "state_name", length = 64)
    private String stateName;
    @Size(max = 3)
    @Column(name = "state_3_code", length = 3)
    private String state3Code;
    @Size(max = 2)
    @Column(name = "state_2_code", length = 2)
    private String state2Code;
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

    public Joo2VirtuemartStates() {
    }

    public Joo2VirtuemartStates(Long virtuemartStateId) {
        this.virtuemartStateId = virtuemartStateId;
    }

    public Joo2VirtuemartStates(Long virtuemartStateId, int virtuemartCountryId, int virtuemartWorldzoneId, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartStateId = virtuemartStateId;
        this.virtuemartCountryId = virtuemartCountryId;
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
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

    public Long getVirtuemartStateId() {
        return virtuemartStateId;
    }

    public void setVirtuemartStateId(Long virtuemartStateId) {
        this.virtuemartStateId = virtuemartStateId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public int getVirtuemartCountryId() {
        return virtuemartCountryId;
    }

    public void setVirtuemartCountryId(int virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
    }

    public int getVirtuemartWorldzoneId() {
        return virtuemartWorldzoneId;
    }

    public void setVirtuemartWorldzoneId(int virtuemartWorldzoneId) {
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getState3Code() {
        return state3Code;
    }

    public void setState3Code(String state3Code) {
        this.state3Code = state3Code;
    }

    public String getState2Code() {
        return state2Code;
    }

    public void setState2Code(String state2Code) {
        this.state2Code = state2Code;
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
        hash += (virtuemartStateId != null ? virtuemartStateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartStates)) {
            return false;
        }
        Joo2VirtuemartStates other = (Joo2VirtuemartStates) object;
        if ((this.virtuemartStateId == null && other.virtuemartStateId != null) || (this.virtuemartStateId != null && !this.virtuemartStateId.equals(other.virtuemartStateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartStates[ virtuemartStateId=" + virtuemartStateId + " ]";
    }
    
}
