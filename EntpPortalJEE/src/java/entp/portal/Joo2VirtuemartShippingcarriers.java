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
@Table(name = "joo2_virtuemart_shippingcarriers", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_shippingcarrier_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findAll", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByVirtuemartShippingcarrierId", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.virtuemartShippingcarrierId = :virtuemartShippingcarrierId"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierJpluginId", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierJpluginId = :shippingCarrierJpluginId"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierName", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierName = :shippingCarrierName"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierElement", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierElement = :shippingCarrierElement"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierValue", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierValue = :shippingCarrierValue"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierPackageFee", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierPackageFee = :shippingCarrierPackageFee"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShippingCarrierVatId", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shippingCarrierVatId = :shippingCarrierVatId"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByOrdering", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByShared", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByPublished", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartShippingcarriers.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartShippingcarriers j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartShippingcarriers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_shippingcarrier_id", nullable = false)
    private Long virtuemartShippingcarrierId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_carrier_jplugin_id", nullable = false)
    private int shippingCarrierJpluginId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "shipping_carrier_name", nullable = false, length = 200)
    private String shippingCarrierName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "shipping_carrier_desc", nullable = false, length = 65535)
    private String shippingCarrierDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "shipping_carrier_element", nullable = false, length = 50)
    private String shippingCarrierElement;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "shipping_carrier_params", nullable = false, length = 65535)
    private String shippingCarrierParams;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_carrier_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal shippingCarrierValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_carrier_package_fee", nullable = false, precision = 10, scale = 2)
    private BigDecimal shippingCarrierPackageFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping_carrier_vat_id", nullable = false)
    private int shippingCarrierVatId;
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

    public Joo2VirtuemartShippingcarriers() {
    }

    public Joo2VirtuemartShippingcarriers(Long virtuemartShippingcarrierId) {
        this.virtuemartShippingcarrierId = virtuemartShippingcarrierId;
    }

    public Joo2VirtuemartShippingcarriers(Long virtuemartShippingcarrierId, int shippingCarrierJpluginId, String shippingCarrierName, String shippingCarrierDesc, String shippingCarrierElement, String shippingCarrierParams, BigDecimal shippingCarrierValue, BigDecimal shippingCarrierPackageFee, int shippingCarrierVatId, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartShippingcarrierId = virtuemartShippingcarrierId;
        this.shippingCarrierJpluginId = shippingCarrierJpluginId;
        this.shippingCarrierName = shippingCarrierName;
        this.shippingCarrierDesc = shippingCarrierDesc;
        this.shippingCarrierElement = shippingCarrierElement;
        this.shippingCarrierParams = shippingCarrierParams;
        this.shippingCarrierValue = shippingCarrierValue;
        this.shippingCarrierPackageFee = shippingCarrierPackageFee;
        this.shippingCarrierVatId = shippingCarrierVatId;
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

    public Long getVirtuemartShippingcarrierId() {
        return virtuemartShippingcarrierId;
    }

    public void setVirtuemartShippingcarrierId(Long virtuemartShippingcarrierId) {
        this.virtuemartShippingcarrierId = virtuemartShippingcarrierId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public int getShippingCarrierJpluginId() {
        return shippingCarrierJpluginId;
    }

    public void setShippingCarrierJpluginId(int shippingCarrierJpluginId) {
        this.shippingCarrierJpluginId = shippingCarrierJpluginId;
    }

    public String getShippingCarrierName() {
        return shippingCarrierName;
    }

    public void setShippingCarrierName(String shippingCarrierName) {
        this.shippingCarrierName = shippingCarrierName;
    }

    public String getShippingCarrierDesc() {
        return shippingCarrierDesc;
    }

    public void setShippingCarrierDesc(String shippingCarrierDesc) {
        this.shippingCarrierDesc = shippingCarrierDesc;
    }

    public String getShippingCarrierElement() {
        return shippingCarrierElement;
    }

    public void setShippingCarrierElement(String shippingCarrierElement) {
        this.shippingCarrierElement = shippingCarrierElement;
    }

    public String getShippingCarrierParams() {
        return shippingCarrierParams;
    }

    public void setShippingCarrierParams(String shippingCarrierParams) {
        this.shippingCarrierParams = shippingCarrierParams;
    }

    public BigDecimal getShippingCarrierValue() {
        return shippingCarrierValue;
    }

    public void setShippingCarrierValue(BigDecimal shippingCarrierValue) {
        this.shippingCarrierValue = shippingCarrierValue;
    }

    public BigDecimal getShippingCarrierPackageFee() {
        return shippingCarrierPackageFee;
    }

    public void setShippingCarrierPackageFee(BigDecimal shippingCarrierPackageFee) {
        this.shippingCarrierPackageFee = shippingCarrierPackageFee;
    }

    public int getShippingCarrierVatId() {
        return shippingCarrierVatId;
    }

    public void setShippingCarrierVatId(int shippingCarrierVatId) {
        this.shippingCarrierVatId = shippingCarrierVatId;
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
        hash += (virtuemartShippingcarrierId != null ? virtuemartShippingcarrierId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartShippingcarriers)) {
            return false;
        }
        Joo2VirtuemartShippingcarriers other = (Joo2VirtuemartShippingcarriers) object;
        if ((this.virtuemartShippingcarrierId == null && other.virtuemartShippingcarrierId != null) || (this.virtuemartShippingcarrierId != null && !this.virtuemartShippingcarrierId.equals(other.virtuemartShippingcarrierId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartShippingcarriers[ virtuemartShippingcarrierId=" + virtuemartShippingcarrierId + " ]";
    }
    
}
