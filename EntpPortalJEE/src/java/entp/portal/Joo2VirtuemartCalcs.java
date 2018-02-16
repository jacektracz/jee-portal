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
@Table(name = "joo2_virtuemart_calcs", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_calc_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCalcs.findAll", query = "SELECT j FROM Joo2VirtuemartCalcs j"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByVirtuemartCalcId", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.virtuemartCalcId = :virtuemartCalcId"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcValue", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcValue = :calcValue"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcCurrency", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcCurrency = :calcCurrency"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcShopperPublished", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcShopperPublished = :calcShopperPublished"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcVendorPublished", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcVendorPublished = :calcVendorPublished"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByPublishUp", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByPublishDown", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.publishDown = :publishDown"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcQualify", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcQualify = :calcQualify"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcAffected", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcAffected = :calcAffected"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCalcAmountCond", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.calcAmountCond = :calcAmountCond"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByForOverride", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.forOverride = :forOverride"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByShared", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByPublished", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCalcs.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCalcs j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCalcs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_calc_id", nullable = false)
    private Long virtuemartCalcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "calc_name", nullable = false, length = 65535)
    private String calcName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "calc_descr", nullable = false, length = 65535)
    private String calcDescr;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "calc_kind", nullable = false, length = 65535)
    private String calcKind;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "calc_value_mathop", nullable = false, length = 65535)
    private String calcValueMathop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_value", nullable = false)
    private float calcValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_currency", nullable = false)
    private int calcCurrency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_shopper_published", nullable = false)
    private boolean calcShopperPublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_vendor_published", nullable = false)
    private boolean calcVendorPublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_up", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_down", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDown;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_qualify", nullable = false)
    private int calcQualify;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_affected", nullable = false)
    private int calcAffected;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calc_amount_cond", nullable = false)
    private float calcAmountCond;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "calc_amount_dimunit", nullable = false, length = 65535)
    private String calcAmountDimunit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "for_override", nullable = false)
    private boolean forOverride;
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

    public Joo2VirtuemartCalcs() {
    }

    public Joo2VirtuemartCalcs(Long virtuemartCalcId) {
        this.virtuemartCalcId = virtuemartCalcId;
    }

    public Joo2VirtuemartCalcs(Long virtuemartCalcId, int virtuemartVendorId, String calcName, String calcDescr, String calcKind, String calcValueMathop, float calcValue, int calcCurrency, boolean calcShopperPublished, boolean calcVendorPublished, Date publishUp, Date publishDown, int calcQualify, int calcAffected, float calcAmountCond, String calcAmountDimunit, boolean forOverride, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCalcId = virtuemartCalcId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.calcName = calcName;
        this.calcDescr = calcDescr;
        this.calcKind = calcKind;
        this.calcValueMathop = calcValueMathop;
        this.calcValue = calcValue;
        this.calcCurrency = calcCurrency;
        this.calcShopperPublished = calcShopperPublished;
        this.calcVendorPublished = calcVendorPublished;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.calcQualify = calcQualify;
        this.calcAffected = calcAffected;
        this.calcAmountCond = calcAmountCond;
        this.calcAmountDimunit = calcAmountDimunit;
        this.forOverride = forOverride;
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

    public Long getVirtuemartCalcId() {
        return virtuemartCalcId;
    }

    public void setVirtuemartCalcId(Long virtuemartCalcId) {
        this.virtuemartCalcId = virtuemartCalcId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getCalcName() {
        return calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

    public String getCalcDescr() {
        return calcDescr;
    }

    public void setCalcDescr(String calcDescr) {
        this.calcDescr = calcDescr;
    }

    public String getCalcKind() {
        return calcKind;
    }

    public void setCalcKind(String calcKind) {
        this.calcKind = calcKind;
    }

    public String getCalcValueMathop() {
        return calcValueMathop;
    }

    public void setCalcValueMathop(String calcValueMathop) {
        this.calcValueMathop = calcValueMathop;
    }

    public float getCalcValue() {
        return calcValue;
    }

    public void setCalcValue(float calcValue) {
        this.calcValue = calcValue;
    }

    public int getCalcCurrency() {
        return calcCurrency;
    }

    public void setCalcCurrency(int calcCurrency) {
        this.calcCurrency = calcCurrency;
    }

    public boolean getCalcShopperPublished() {
        return calcShopperPublished;
    }

    public void setCalcShopperPublished(boolean calcShopperPublished) {
        this.calcShopperPublished = calcShopperPublished;
    }

    public boolean getCalcVendorPublished() {
        return calcVendorPublished;
    }

    public void setCalcVendorPublished(boolean calcVendorPublished) {
        this.calcVendorPublished = calcVendorPublished;
    }

    public Date getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Date publishUp) {
        this.publishUp = publishUp;
    }

    public Date getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Date publishDown) {
        this.publishDown = publishDown;
    }

    public int getCalcQualify() {
        return calcQualify;
    }

    public void setCalcQualify(int calcQualify) {
        this.calcQualify = calcQualify;
    }

    public int getCalcAffected() {
        return calcAffected;
    }

    public void setCalcAffected(int calcAffected) {
        this.calcAffected = calcAffected;
    }

    public float getCalcAmountCond() {
        return calcAmountCond;
    }

    public void setCalcAmountCond(float calcAmountCond) {
        this.calcAmountCond = calcAmountCond;
    }

    public String getCalcAmountDimunit() {
        return calcAmountDimunit;
    }

    public void setCalcAmountDimunit(String calcAmountDimunit) {
        this.calcAmountDimunit = calcAmountDimunit;
    }

    public boolean getForOverride() {
        return forOverride;
    }

    public void setForOverride(boolean forOverride) {
        this.forOverride = forOverride;
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
        hash += (virtuemartCalcId != null ? virtuemartCalcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCalcs)) {
            return false;
        }
        Joo2VirtuemartCalcs other = (Joo2VirtuemartCalcs) object;
        if ((this.virtuemartCalcId == null && other.virtuemartCalcId != null) || (this.virtuemartCalcId != null && !this.virtuemartCalcId.equals(other.virtuemartCalcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCalcs[ virtuemartCalcId=" + virtuemartCalcId + " ]";
    }
    
}
