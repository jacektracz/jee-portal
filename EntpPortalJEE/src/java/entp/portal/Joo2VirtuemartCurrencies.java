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
@Table(name = "joo2_virtuemart_currencies", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_currency_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findAll", query = "SELECT j FROM Joo2VirtuemartCurrencies j"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByVirtuemartCurrencyId", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.virtuemartCurrencyId = :virtuemartCurrencyId"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyName", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyName = :currencyName"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyCode2", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyCode2 = :currencyCode2"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyCode3", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyCode3 = :currencyCode3"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyNumericCode", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyNumericCode = :currencyNumericCode"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyExchangeRate", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyExchangeRate = :currencyExchangeRate"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencySymbol", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencySymbol = :currencySymbol"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyDecimalPlace", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyDecimalPlace = :currencyDecimalPlace"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyDecimalSymbol", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyDecimalSymbol = :currencyDecimalSymbol"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyThousands", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyThousands = :currencyThousands"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyPositiveStyle", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyPositiveStyle = :currencyPositiveStyle"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCurrencyNegativeStyle", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.currencyNegativeStyle = :currencyNegativeStyle"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByShared", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByPublished", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCurrencies.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCurrencies j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCurrencies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_currency_id", nullable = false)
    private Long virtuemartCurrencyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Size(max = 64)
    @Column(name = "currency_name", length = 64)
    private String currencyName;
    @Size(max = 2)
    @Column(name = "currency_code_2", length = 2)
    private String currencyCode2;
    @Size(max = 3)
    @Column(name = "currency_code_3", length = 3)
    private String currencyCode3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency_numeric_code", nullable = false)
    private int currencyNumericCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "currency_exchange_rate", precision = 12)
    private Float currencyExchangeRate;
    @Size(max = 4)
    @Column(name = "currency_symbol", length = 4)
    private String currencySymbol;
    @Size(max = 4)
    @Column(name = "currency_decimal_place", length = 4)
    private String currencyDecimalPlace;
    @Size(max = 4)
    @Column(name = "currency_decimal_symbol", length = 4)
    private String currencyDecimalSymbol;
    @Size(max = 4)
    @Column(name = "currency_thousands", length = 4)
    private String currencyThousands;
    @Size(max = 64)
    @Column(name = "currency_positive_style", length = 64)
    private String currencyPositiveStyle;
    @Size(max = 64)
    @Column(name = "currency_negative_style", length = 64)
    private String currencyNegativeStyle;
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

    public Joo2VirtuemartCurrencies() {
    }

    public Joo2VirtuemartCurrencies(Long virtuemartCurrencyId) {
        this.virtuemartCurrencyId = virtuemartCurrencyId;
    }

    public Joo2VirtuemartCurrencies(Long virtuemartCurrencyId, int virtuemartVendorId, int currencyNumericCode, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCurrencyId = virtuemartCurrencyId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.currencyNumericCode = currencyNumericCode;
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

    public Long getVirtuemartCurrencyId() {
        return virtuemartCurrencyId;
    }

    public void setVirtuemartCurrencyId(Long virtuemartCurrencyId) {
        this.virtuemartCurrencyId = virtuemartCurrencyId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode2() {
        return currencyCode2;
    }

    public void setCurrencyCode2(String currencyCode2) {
        this.currencyCode2 = currencyCode2;
    }

    public String getCurrencyCode3() {
        return currencyCode3;
    }

    public void setCurrencyCode3(String currencyCode3) {
        this.currencyCode3 = currencyCode3;
    }

    public int getCurrencyNumericCode() {
        return currencyNumericCode;
    }

    public void setCurrencyNumericCode(int currencyNumericCode) {
        this.currencyNumericCode = currencyNumericCode;
    }

    public Float getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    public void setCurrencyExchangeRate(Float currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyDecimalPlace() {
        return currencyDecimalPlace;
    }

    public void setCurrencyDecimalPlace(String currencyDecimalPlace) {
        this.currencyDecimalPlace = currencyDecimalPlace;
    }

    public String getCurrencyDecimalSymbol() {
        return currencyDecimalSymbol;
    }

    public void setCurrencyDecimalSymbol(String currencyDecimalSymbol) {
        this.currencyDecimalSymbol = currencyDecimalSymbol;
    }

    public String getCurrencyThousands() {
        return currencyThousands;
    }

    public void setCurrencyThousands(String currencyThousands) {
        this.currencyThousands = currencyThousands;
    }

    public String getCurrencyPositiveStyle() {
        return currencyPositiveStyle;
    }

    public void setCurrencyPositiveStyle(String currencyPositiveStyle) {
        this.currencyPositiveStyle = currencyPositiveStyle;
    }

    public String getCurrencyNegativeStyle() {
        return currencyNegativeStyle;
    }

    public void setCurrencyNegativeStyle(String currencyNegativeStyle) {
        this.currencyNegativeStyle = currencyNegativeStyle;
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
        hash += (virtuemartCurrencyId != null ? virtuemartCurrencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCurrencies)) {
            return false;
        }
        Joo2VirtuemartCurrencies other = (Joo2VirtuemartCurrencies) object;
        if ((this.virtuemartCurrencyId == null && other.virtuemartCurrencyId != null) || (this.virtuemartCurrencyId != null && !this.virtuemartCurrencyId.equals(other.virtuemartCurrencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCurrencies[ virtuemartCurrencyId=" + virtuemartCurrencyId + " ]";
    }
    
}
