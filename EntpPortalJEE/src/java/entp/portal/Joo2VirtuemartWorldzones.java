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
@Table(name = "joo2_virtuemart_worldzones", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_worldzone_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findAll", query = "SELECT j FROM Joo2VirtuemartWorldzones j"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByVirtuemartWorldzoneId", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.virtuemartWorldzoneId = :virtuemartWorldzoneId"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByZoneName", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.zoneName = :zoneName"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByZoneCost", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.zoneCost = :zoneCost"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByZoneLimit", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.zoneLimit = :zoneLimit"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByZoneTaxRate", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.zoneTaxRate = :zoneTaxRate"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByOrdering", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByShared", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByPublished", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartWorldzones.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartWorldzones j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartWorldzones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_worldzone_id", nullable = false)
    private Long virtuemartWorldzoneId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Size(max = 255)
    @Column(name = "zone_name", length = 255)
    private String zoneName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "zone_cost", precision = 10, scale = 2)
    private BigDecimal zoneCost;
    @Column(name = "zone_limit", precision = 10, scale = 2)
    private BigDecimal zoneLimit;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "zone_description", nullable = false, length = 65535)
    private String zoneDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zone_tax_rate", nullable = false)
    private int zoneTaxRate;
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

    public Joo2VirtuemartWorldzones() {
    }

    public Joo2VirtuemartWorldzones(Long virtuemartWorldzoneId) {
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
    }

    public Joo2VirtuemartWorldzones(Long virtuemartWorldzoneId, String zoneDescription, int zoneTaxRate, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
        this.zoneDescription = zoneDescription;
        this.zoneTaxRate = zoneTaxRate;
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

    public Long getVirtuemartWorldzoneId() {
        return virtuemartWorldzoneId;
    }

    public void setVirtuemartWorldzoneId(Long virtuemartWorldzoneId) {
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public BigDecimal getZoneCost() {
        return zoneCost;
    }

    public void setZoneCost(BigDecimal zoneCost) {
        this.zoneCost = zoneCost;
    }

    public BigDecimal getZoneLimit() {
        return zoneLimit;
    }

    public void setZoneLimit(BigDecimal zoneLimit) {
        this.zoneLimit = zoneLimit;
    }

    public String getZoneDescription() {
        return zoneDescription;
    }

    public void setZoneDescription(String zoneDescription) {
        this.zoneDescription = zoneDescription;
    }

    public int getZoneTaxRate() {
        return zoneTaxRate;
    }

    public void setZoneTaxRate(int zoneTaxRate) {
        this.zoneTaxRate = zoneTaxRate;
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
        hash += (virtuemartWorldzoneId != null ? virtuemartWorldzoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartWorldzones)) {
            return false;
        }
        Joo2VirtuemartWorldzones other = (Joo2VirtuemartWorldzones) object;
        if ((this.virtuemartWorldzoneId == null && other.virtuemartWorldzoneId != null) || (this.virtuemartWorldzoneId != null && !this.virtuemartWorldzoneId.equals(other.virtuemartWorldzoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartWorldzones[ virtuemartWorldzoneId=" + virtuemartWorldzoneId + " ]";
    }
    
}
