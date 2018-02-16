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
@Table(name = "joo2_virtuemart_vendors", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_vendor_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartVendors.findAll", query = "SELECT j FROM Joo2VirtuemartVendors j"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorName", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorName = :vendorName"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorPhone", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorPhone = :vendorPhone"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorStoreName", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorStoreName = :vendorStoreName"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorCurrency", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorCurrency = :vendorCurrency"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorImagePath", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorImagePath = :vendorImagePath"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorUrl", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorUrl = :vendorUrl"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorMinPov", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorMinPov = :vendorMinPov"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorFreeshipping", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorFreeshipping = :vendorFreeshipping"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByVendorDateFormat", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.vendorDateFormat = :vendorDateFormat"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartVendors.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartVendors j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartVendors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private Long virtuemartVendorId;
    @Size(max = 64)
    @Column(name = "vendor_name", length = 64)
    private String vendorName;
    @Size(max = 32)
    @Column(name = "vendor_phone", length = 32)
    private String vendorPhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "vendor_store_name", nullable = false, length = 128)
    private String vendorStoreName;
    @Lob
    @Size(max = 65535)
    @Column(name = "vendor_store_desc", length = 65535)
    private String vendorStoreDesc;
    @Column(name = "vendor_currency")
    private Integer vendorCurrency;
    @Size(max = 255)
    @Column(name = "vendor_image_path", length = 255)
    private String vendorImagePath;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "vendor_terms_of_service", nullable = false, length = 65535)
    private String vendorTermsOfService;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vendor_url", nullable = false, length = 255)
    private String vendorUrl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vendor_min_pov", precision = 10, scale = 2)
    private BigDecimal vendorMinPov;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vendor_freeshipping", nullable = false, precision = 10, scale = 2)
    private BigDecimal vendorFreeshipping;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "vendor_accepted_currencies", nullable = false, length = 65535)
    private String vendorAcceptedCurrencies;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "vendor_address_format", nullable = false, length = 65535)
    private String vendorAddressFormat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vendor_date_format", nullable = false, length = 255)
    private String vendorDateFormat;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "config", nullable = false, length = 65535)
    private String config;
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

    public Joo2VirtuemartVendors() {
    }

    public Joo2VirtuemartVendors(Long virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public Joo2VirtuemartVendors(Long virtuemartVendorId, String vendorStoreName, String vendorTermsOfService, String vendorUrl, BigDecimal vendorFreeshipping, String vendorAcceptedCurrencies, String vendorAddressFormat, String vendorDateFormat, String config, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartVendorId = virtuemartVendorId;
        this.vendorStoreName = vendorStoreName;
        this.vendorTermsOfService = vendorTermsOfService;
        this.vendorUrl = vendorUrl;
        this.vendorFreeshipping = vendorFreeshipping;
        this.vendorAcceptedCurrencies = vendorAcceptedCurrencies;
        this.vendorAddressFormat = vendorAddressFormat;
        this.vendorDateFormat = vendorDateFormat;
        this.config = config;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Long virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorStoreName() {
        return vendorStoreName;
    }

    public void setVendorStoreName(String vendorStoreName) {
        this.vendorStoreName = vendorStoreName;
    }

    public String getVendorStoreDesc() {
        return vendorStoreDesc;
    }

    public void setVendorStoreDesc(String vendorStoreDesc) {
        this.vendorStoreDesc = vendorStoreDesc;
    }

    public Integer getVendorCurrency() {
        return vendorCurrency;
    }

    public void setVendorCurrency(Integer vendorCurrency) {
        this.vendorCurrency = vendorCurrency;
    }

    public String getVendorImagePath() {
        return vendorImagePath;
    }

    public void setVendorImagePath(String vendorImagePath) {
        this.vendorImagePath = vendorImagePath;
    }

    public String getVendorTermsOfService() {
        return vendorTermsOfService;
    }

    public void setVendorTermsOfService(String vendorTermsOfService) {
        this.vendorTermsOfService = vendorTermsOfService;
    }

    public String getVendorUrl() {
        return vendorUrl;
    }

    public void setVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }

    public BigDecimal getVendorMinPov() {
        return vendorMinPov;
    }

    public void setVendorMinPov(BigDecimal vendorMinPov) {
        this.vendorMinPov = vendorMinPov;
    }

    public BigDecimal getVendorFreeshipping() {
        return vendorFreeshipping;
    }

    public void setVendorFreeshipping(BigDecimal vendorFreeshipping) {
        this.vendorFreeshipping = vendorFreeshipping;
    }

    public String getVendorAcceptedCurrencies() {
        return vendorAcceptedCurrencies;
    }

    public void setVendorAcceptedCurrencies(String vendorAcceptedCurrencies) {
        this.vendorAcceptedCurrencies = vendorAcceptedCurrencies;
    }

    public String getVendorAddressFormat() {
        return vendorAddressFormat;
    }

    public void setVendorAddressFormat(String vendorAddressFormat) {
        this.vendorAddressFormat = vendorAddressFormat;
    }

    public String getVendorDateFormat() {
        return vendorDateFormat;
    }

    public void setVendorDateFormat(String vendorDateFormat) {
        this.vendorDateFormat = vendorDateFormat;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
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
        hash += (virtuemartVendorId != null ? virtuemartVendorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartVendors)) {
            return false;
        }
        Joo2VirtuemartVendors other = (Joo2VirtuemartVendors) object;
        if ((this.virtuemartVendorId == null && other.virtuemartVendorId != null) || (this.virtuemartVendorId != null && !this.virtuemartVendorId.equals(other.virtuemartVendorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartVendors[ virtuemartVendorId=" + virtuemartVendorId + " ]";
    }
    
}
