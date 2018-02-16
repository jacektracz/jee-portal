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
@Table(name = "joo2_virtuemart_shoppergroups", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_shoppergroup_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findAll", query = "SELECT j FROM Joo2VirtuemartShoppergroups j"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByVirtuemartShoppergroupId", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.virtuemartShoppergroupId = :virtuemartShoppergroupId"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByShopperGroupName", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.shopperGroupName = :shopperGroupName"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByCustomPriceDisplay", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.customPriceDisplay = :customPriceDisplay"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByDefault1", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.default1 = :default1"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByOrdering", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByShared", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByPublished", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartShoppergroups.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartShoppergroups j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartShoppergroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_shoppergroup_id", nullable = false)
    private Long virtuemartShoppergroupId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Size(max = 32)
    @Column(name = "shopper_group_name", length = 32)
    private String shopperGroupName;
    @Lob
    @Size(max = 65535)
    @Column(name = "shopper_group_desc", length = 65535)
    private String shopperGroupDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_price_display", nullable = false)
    private boolean customPriceDisplay;
    @Lob
    @Column(name = "price_display")
    private byte[] priceDisplay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default", nullable = false)
    private boolean default1;
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

    public Joo2VirtuemartShoppergroups() {
    }

    public Joo2VirtuemartShoppergroups(Long virtuemartShoppergroupId) {
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
    }

    public Joo2VirtuemartShoppergroups(Long virtuemartShoppergroupId, boolean customPriceDisplay, boolean default1, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
        this.customPriceDisplay = customPriceDisplay;
        this.default1 = default1;
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

    public Long getVirtuemartShoppergroupId() {
        return virtuemartShoppergroupId;
    }

    public void setVirtuemartShoppergroupId(Long virtuemartShoppergroupId) {
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getShopperGroupName() {
        return shopperGroupName;
    }

    public void setShopperGroupName(String shopperGroupName) {
        this.shopperGroupName = shopperGroupName;
    }

    public String getShopperGroupDesc() {
        return shopperGroupDesc;
    }

    public void setShopperGroupDesc(String shopperGroupDesc) {
        this.shopperGroupDesc = shopperGroupDesc;
    }

    public boolean getCustomPriceDisplay() {
        return customPriceDisplay;
    }

    public void setCustomPriceDisplay(boolean customPriceDisplay) {
        this.customPriceDisplay = customPriceDisplay;
    }

    public byte[] getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(byte[] priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public boolean getDefault1() {
        return default1;
    }

    public void setDefault1(boolean default1) {
        this.default1 = default1;
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
        hash += (virtuemartShoppergroupId != null ? virtuemartShoppergroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartShoppergroups)) {
            return false;
        }
        Joo2VirtuemartShoppergroups other = (Joo2VirtuemartShoppergroups) object;
        if ((this.virtuemartShoppergroupId == null && other.virtuemartShoppergroupId != null) || (this.virtuemartShoppergroupId != null && !this.virtuemartShoppergroupId.equals(other.virtuemartShoppergroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartShoppergroups[ virtuemartShoppergroupId=" + virtuemartShoppergroupId + " ]";
    }
    
}
