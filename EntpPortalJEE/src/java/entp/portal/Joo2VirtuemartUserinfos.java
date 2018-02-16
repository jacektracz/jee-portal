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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_userinfos", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findAll", query = "SELECT j FROM Joo2VirtuemartUserinfos j"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByVirtuemartUserinfoId", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.virtuemartUserinfoId = :virtuemartUserinfoId"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByAddressType", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.addressType = :addressType"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByAddressTypeName", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.addressTypeName = :addressTypeName"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByName", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByCompany", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.company = :company"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByTitle", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByLastName", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.lastName = :lastName"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByFirstName", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.firstName = :firstName"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByMiddleName", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.middleName = :middleName"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByPhone1", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.phone1 = :phone1"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByPhone2", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.phone2 = :phone2"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByFax", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.fax = :fax"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByAddress1", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.address1 = :address1"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByAddress2", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.address2 = :address2"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByCity", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.city = :city"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByVirtuemartStateId", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.virtuemartStateId = :virtuemartStateId"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByVirtuemartCountryId", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.virtuemartCountryId = :virtuemartCountryId"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByZip", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.zip = :zip"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByExtraField1", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.extraField1 = :extraField1"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByExtraField2", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.extraField2 = :extraField2"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByExtraField3", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.extraField3 = :extraField3"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByExtraField4", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.extraField4 = :extraField4"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByExtraField5", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.extraField5 = :extraField5"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserinfos.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartUserinfos j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartUserinfos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "virtuemart_userinfo_id", nullable = false, length = 32)
    private String virtuemartUserinfoId;
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
    @Column(name = "name", length = 64)
    private String name;
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
    @Column(name = "virtuemart_state_id", nullable = false)
    private int virtuemartStateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_country_id", nullable = false)
    private int virtuemartCountryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "zip", nullable = false, length = 32)
    private String zip;
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

    public Joo2VirtuemartUserinfos() {
    }

    public Joo2VirtuemartUserinfos(String virtuemartUserinfoId) {
        this.virtuemartUserinfoId = virtuemartUserinfoId;
    }

    public Joo2VirtuemartUserinfos(String virtuemartUserinfoId, int virtuemartUserId, String address1, String city, int virtuemartStateId, int virtuemartCountryId, String zip, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartUserinfoId = virtuemartUserinfoId;
        this.virtuemartUserId = virtuemartUserId;
        this.address1 = address1;
        this.city = city;
        this.virtuemartStateId = virtuemartStateId;
        this.virtuemartCountryId = virtuemartCountryId;
        this.zip = zip;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public String getVirtuemartUserinfoId() {
        return virtuemartUserinfoId;
    }

    public void setVirtuemartUserinfoId(String virtuemartUserinfoId) {
        this.virtuemartUserinfoId = virtuemartUserinfoId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getVirtuemartStateId() {
        return virtuemartStateId;
    }

    public void setVirtuemartStateId(int virtuemartStateId) {
        this.virtuemartStateId = virtuemartStateId;
    }

    public int getVirtuemartCountryId() {
        return virtuemartCountryId;
    }

    public void setVirtuemartCountryId(int virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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
        hash += (virtuemartUserinfoId != null ? virtuemartUserinfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartUserinfos)) {
            return false;
        }
        Joo2VirtuemartUserinfos other = (Joo2VirtuemartUserinfos) object;
        if ((this.virtuemartUserinfoId == null && other.virtuemartUserinfoId != null) || (this.virtuemartUserinfoId != null && !this.virtuemartUserinfoId.equals(other.virtuemartUserinfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartUserinfos[ virtuemartUserinfoId=" + virtuemartUserinfoId + " ]";
    }
    
}
