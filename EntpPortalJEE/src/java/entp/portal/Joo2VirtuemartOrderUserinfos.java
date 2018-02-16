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
@Table(name = "joo2_virtuemart_order_userinfos", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_order_userinfo_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findAll", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByVirtuemartOrderUserinfoId", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.virtuemartOrderUserinfoId = :virtuemartOrderUserinfoId"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByVirtuemartOrderId", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.virtuemartOrderId = :virtuemartOrderId"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByAddressType", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.addressType = :addressType"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByAddressTypeName", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.addressTypeName = :addressTypeName"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByCompany", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.company = :company"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByTitle", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByLastName", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.lastName = :lastName"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByFirstName", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.firstName = :firstName"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByMiddleName", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.middleName = :middleName"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByPhone1", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.phone1 = :phone1"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByPhone2", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.phone2 = :phone2"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByFax", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.fax = :fax"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByAddress1", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.address1 = :address1"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByAddress2", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.address2 = :address2"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByCity", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.city = :city"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByVirtuemartStateId", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.virtuemartStateId = :virtuemartStateId"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByVirtuemartCountryId", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.virtuemartCountryId = :virtuemartCountryId"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByZip", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.zip = :zip"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByEmail", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.email = :email"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByAgreed", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.agreed = :agreed"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByExtraField1", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.extraField1 = :extraField1"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByExtraField2", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.extraField2 = :extraField2"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByExtraField3", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.extraField3 = :extraField3"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByExtraField4", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.extraField4 = :extraField4"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByExtraField5", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.extraField5 = :extraField5"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartOrderUserinfos.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartOrderUserinfos j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartOrderUserinfos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_order_userinfo_id", nullable = false)
    private Long virtuemartOrderUserinfoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_order_id", nullable = false)
    private int virtuemartOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private int virtuemartUserId;
    @Size(max = 2)
    @Column(name = "address_type", length = 2)
    private String addressType;
    @Size(max = 32)
    @Column(name = "address_type_name", length = 32)
    private String addressTypeName;
    @Size(max = 64)
    @Column(name = "company", length = 64)
    private String company;
    @Size(max = 32)
    @Column(name = "title", length = 32)
    private String title;
    @Size(max = 32)
    @Column(name = "last_name", length = 32)
    private String lastName;
    @Size(max = 32)
    @Column(name = "first_name", length = 32)
    private String firstName;
    @Size(max = 32)
    @Column(name = "middle_name", length = 32)
    private String middleName;
    @Size(max = 32)
    @Column(name = "phone_1", length = 32)
    private String phone1;
    @Size(max = 32)
    @Column(name = "phone_2", length = 32)
    private String phone2;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 32)
    @Column(name = "fax", length = 32)
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "address_1", nullable = false, length = 64)
    private String address1;
    @Size(max = 64)
    @Column(name = "address_2", length = 64)
    private String address2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "city", nullable = false, length = 32)
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "virtuemart_state_id", nullable = false, length = 32)
    private String virtuemartStateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "virtuemart_country_id", nullable = false, length = 32)
    private String virtuemartCountryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "zip", nullable = false, length = 32)
    private String zip;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email", length = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agreed", nullable = false)
    private boolean agreed;
    @Size(max = 255)
    @Column(name = "extra_field_1", length = 255)
    private String extraField1;
    @Size(max = 255)
    @Column(name = "extra_field_2", length = 255)
    private String extraField2;
    @Size(max = 255)
    @Column(name = "extra_field_3", length = 255)
    private String extraField3;
    @Column(name = "extra_field_4")
    private Character extraField4;
    @Column(name = "extra_field_5")
    private Character extraField5;
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

    public Joo2VirtuemartOrderUserinfos() {
    }

    public Joo2VirtuemartOrderUserinfos(Long virtuemartOrderUserinfoId) {
        this.virtuemartOrderUserinfoId = virtuemartOrderUserinfoId;
    }

    public Joo2VirtuemartOrderUserinfos(Long virtuemartOrderUserinfoId, int virtuemartOrderId, int virtuemartUserId, String address1, String city, String virtuemartStateId, String virtuemartCountryId, String zip, boolean agreed, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartOrderUserinfoId = virtuemartOrderUserinfoId;
        this.virtuemartOrderId = virtuemartOrderId;
        this.virtuemartUserId = virtuemartUserId;
        this.address1 = address1;
        this.city = city;
        this.virtuemartStateId = virtuemartStateId;
        this.virtuemartCountryId = virtuemartCountryId;
        this.zip = zip;
        this.agreed = agreed;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartOrderUserinfoId() {
        return virtuemartOrderUserinfoId;
    }

    public void setVirtuemartOrderUserinfoId(Long virtuemartOrderUserinfoId) {
        this.virtuemartOrderUserinfoId = virtuemartOrderUserinfoId;
    }

    public int getVirtuemartOrderId() {
        return virtuemartOrderId;
    }

    public void setVirtuemartOrderId(int virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public int getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(int virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressTypeName() {
        return addressTypeName;
    }

    public void setAddressTypeName(String addressTypeName) {
        this.addressTypeName = addressTypeName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVirtuemartStateId() {
        return virtuemartStateId;
    }

    public void setVirtuemartStateId(String virtuemartStateId) {
        this.virtuemartStateId = virtuemartStateId;
    }

    public String getVirtuemartCountryId() {
        return virtuemartCountryId;
    }

    public void setVirtuemartCountryId(String virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getExtraField1() {
        return extraField1;
    }

    public void setExtraField1(String extraField1) {
        this.extraField1 = extraField1;
    }

    public String getExtraField2() {
        return extraField2;
    }

    public void setExtraField2(String extraField2) {
        this.extraField2 = extraField2;
    }

    public String getExtraField3() {
        return extraField3;
    }

    public void setExtraField3(String extraField3) {
        this.extraField3 = extraField3;
    }

    public Character getExtraField4() {
        return extraField4;
    }

    public void setExtraField4(Character extraField4) {
        this.extraField4 = extraField4;
    }

    public Character getExtraField5() {
        return extraField5;
    }

    public void setExtraField5(Character extraField5) {
        this.extraField5 = extraField5;
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
        hash += (virtuemartOrderUserinfoId != null ? virtuemartOrderUserinfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartOrderUserinfos)) {
            return false;
        }
        Joo2VirtuemartOrderUserinfos other = (Joo2VirtuemartOrderUserinfos) object;
        if ((this.virtuemartOrderUserinfoId == null && other.virtuemartOrderUserinfoId != null) || (this.virtuemartOrderUserinfoId != null && !this.virtuemartOrderUserinfoId.equals(other.virtuemartOrderUserinfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartOrderUserinfos[ virtuemartOrderUserinfoId=" + virtuemartOrderUserinfoId + " ]";
    }
    
}
