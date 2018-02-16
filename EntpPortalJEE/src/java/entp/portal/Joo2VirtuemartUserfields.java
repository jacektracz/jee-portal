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
@Table(name = "joo2_virtuemart_userfields", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_userfield_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartUserfields.findAll", query = "SELECT j FROM Joo2VirtuemartUserfields j"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByVirtuemartUserfieldId", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.virtuemartUserfieldId = :virtuemartUserfieldId"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByName", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByTitle", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByType", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByMaxlength", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.maxlength = :maxlength"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findBySize", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.size = :size"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByRequired", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.required = :required"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByCols", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.cols = :cols"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByRows", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.rows = :rows"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByValue", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.value = :value"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByDefault1", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.default1 = :default1"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByRegistration", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.registration = :registration"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByShipping", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.shipping = :shipping"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByAccount", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.account = :account"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByReadonly", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.readonly = :readonly"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByCalculated", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.calculated = :calculated"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findBySys", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.sys = :sys"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByOrdering", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByShared", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByPublished", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfields.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartUserfields j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartUserfields implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_userfield_id", nullable = false)
    private Long virtuemartUserfieldId;
    @Column(name = "virtuemart_vendor_id")
    private Integer virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "description", nullable = false, length = 16777215)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "type", nullable = false, length = 50)
    private String type;
    @Column(name = "maxlength")
    private Integer maxlength;
    @Column(name = "size")
    private Integer size;
    @Column(name = "required")
    private Short required;
    @Column(name = "cols")
    private Integer cols;
    @Column(name = "rows")
    private Integer rows;
    @Size(max = 50)
    @Column(name = "value", length = 50)
    private String value;
    @Column(name = "default")
    private Integer default1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registration", nullable = false)
    private boolean registration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shipping", nullable = false)
    private boolean shipping;
    @Basic(optional = false)
    @NotNull
    @Column(name = "account", nullable = false)
    private boolean account;
    @Basic(optional = false)
    @NotNull
    @Column(name = "readonly", nullable = false)
    private boolean readonly;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calculated", nullable = false)
    private boolean calculated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sys", nullable = false)
    private short sys;
    @Lob
    @Size(max = 16777215)
    @Column(name = "params", length = 16777215)
    private String params;
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

    public Joo2VirtuemartUserfields() {
    }

    public Joo2VirtuemartUserfields(Long virtuemartUserfieldId) {
        this.virtuemartUserfieldId = virtuemartUserfieldId;
    }

    public Joo2VirtuemartUserfields(Long virtuemartUserfieldId, String name, String title, String description, String type, boolean registration, boolean shipping, boolean account, boolean readonly, boolean calculated, short sys, int ordering, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartUserfieldId = virtuemartUserfieldId;
        this.name = name;
        this.title = title;
        this.description = description;
        this.type = type;
        this.registration = registration;
        this.shipping = shipping;
        this.account = account;
        this.readonly = readonly;
        this.calculated = calculated;
        this.sys = sys;
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

    public Long getVirtuemartUserfieldId() {
        return virtuemartUserfieldId;
    }

    public void setVirtuemartUserfieldId(Long virtuemartUserfieldId) {
        this.virtuemartUserfieldId = virtuemartUserfieldId;
    }

    public Integer getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(Integer virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(Integer maxlength) {
        this.maxlength = maxlength;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Short getRequired() {
        return required;
    }

    public void setRequired(Short required) {
        this.required = required;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDefault1() {
        return default1;
    }

    public void setDefault1(Integer default1) {
        this.default1 = default1;
    }

    public boolean getRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public boolean getShipping() {
        return shipping;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public boolean getAccount() {
        return account;
    }

    public void setAccount(boolean account) {
        this.account = account;
    }

    public boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    public boolean getCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }

    public short getSys() {
        return sys;
    }

    public void setSys(short sys) {
        this.sys = sys;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        hash += (virtuemartUserfieldId != null ? virtuemartUserfieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartUserfields)) {
            return false;
        }
        Joo2VirtuemartUserfields other = (Joo2VirtuemartUserfields) object;
        if ((this.virtuemartUserfieldId == null && other.virtuemartUserfieldId != null) || (this.virtuemartUserfieldId != null && !this.virtuemartUserfieldId.equals(other.virtuemartUserfieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartUserfields[ virtuemartUserfieldId=" + virtuemartUserfieldId + " ]";
    }
    
}
