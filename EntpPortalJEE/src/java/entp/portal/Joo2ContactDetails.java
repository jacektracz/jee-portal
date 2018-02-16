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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_contact_details", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2ContactDetails.findAll", query = "SELECT j FROM Joo2ContactDetails j"),
    @NamedQuery(name = "Joo2ContactDetails.findById", query = "SELECT j FROM Joo2ContactDetails j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2ContactDetails.findByName", query = "SELECT j FROM Joo2ContactDetails j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2ContactDetails.findByAlias", query = "SELECT j FROM Joo2ContactDetails j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2ContactDetails.findByConPosition", query = "SELECT j FROM Joo2ContactDetails j WHERE j.conPosition = :conPosition"),
    @NamedQuery(name = "Joo2ContactDetails.findBySuburb", query = "SELECT j FROM Joo2ContactDetails j WHERE j.suburb = :suburb"),
    @NamedQuery(name = "Joo2ContactDetails.findByState", query = "SELECT j FROM Joo2ContactDetails j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2ContactDetails.findByCountry", query = "SELECT j FROM Joo2ContactDetails j WHERE j.country = :country"),
    @NamedQuery(name = "Joo2ContactDetails.findByPostcode", query = "SELECT j FROM Joo2ContactDetails j WHERE j.postcode = :postcode"),
    @NamedQuery(name = "Joo2ContactDetails.findByTelephone", query = "SELECT j FROM Joo2ContactDetails j WHERE j.telephone = :telephone"),
    @NamedQuery(name = "Joo2ContactDetails.findByFax", query = "SELECT j FROM Joo2ContactDetails j WHERE j.fax = :fax"),
    @NamedQuery(name = "Joo2ContactDetails.findByImage", query = "SELECT j FROM Joo2ContactDetails j WHERE j.image = :image"),
    @NamedQuery(name = "Joo2ContactDetails.findByImagepos", query = "SELECT j FROM Joo2ContactDetails j WHERE j.imagepos = :imagepos"),
    @NamedQuery(name = "Joo2ContactDetails.findByEmailTo", query = "SELECT j FROM Joo2ContactDetails j WHERE j.emailTo = :emailTo"),
    @NamedQuery(name = "Joo2ContactDetails.findByDefaultCon", query = "SELECT j FROM Joo2ContactDetails j WHERE j.defaultCon = :defaultCon"),
    @NamedQuery(name = "Joo2ContactDetails.findByPublished", query = "SELECT j FROM Joo2ContactDetails j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2ContactDetails.findByCheckedOut", query = "SELECT j FROM Joo2ContactDetails j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2ContactDetails.findByCheckedOutTime", query = "SELECT j FROM Joo2ContactDetails j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2ContactDetails.findByOrdering", query = "SELECT j FROM Joo2ContactDetails j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2ContactDetails.findByUserId", query = "SELECT j FROM Joo2ContactDetails j WHERE j.userId = :userId"),
    @NamedQuery(name = "Joo2ContactDetails.findByCatid", query = "SELECT j FROM Joo2ContactDetails j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2ContactDetails.findByAccess", query = "SELECT j FROM Joo2ContactDetails j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2ContactDetails.findByMobile", query = "SELECT j FROM Joo2ContactDetails j WHERE j.mobile = :mobile"),
    @NamedQuery(name = "Joo2ContactDetails.findByWebpage", query = "SELECT j FROM Joo2ContactDetails j WHERE j.webpage = :webpage"),
    @NamedQuery(name = "Joo2ContactDetails.findBySortname1", query = "SELECT j FROM Joo2ContactDetails j WHERE j.sortname1 = :sortname1"),
    @NamedQuery(name = "Joo2ContactDetails.findBySortname2", query = "SELECT j FROM Joo2ContactDetails j WHERE j.sortname2 = :sortname2"),
    @NamedQuery(name = "Joo2ContactDetails.findBySortname3", query = "SELECT j FROM Joo2ContactDetails j WHERE j.sortname3 = :sortname3"),
    @NamedQuery(name = "Joo2ContactDetails.findByLanguage", query = "SELECT j FROM Joo2ContactDetails j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2ContactDetails.findByCreated", query = "SELECT j FROM Joo2ContactDetails j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2ContactDetails.findByCreatedBy", query = "SELECT j FROM Joo2ContactDetails j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2ContactDetails.findByCreatedByAlias", query = "SELECT j FROM Joo2ContactDetails j WHERE j.createdByAlias = :createdByAlias"),
    @NamedQuery(name = "Joo2ContactDetails.findByModified", query = "SELECT j FROM Joo2ContactDetails j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2ContactDetails.findByModifiedBy", query = "SELECT j FROM Joo2ContactDetails j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2ContactDetails.findByFeatured", query = "SELECT j FROM Joo2ContactDetails j WHERE j.featured = :featured"),
    @NamedQuery(name = "Joo2ContactDetails.findByXreference", query = "SELECT j FROM Joo2ContactDetails j WHERE j.xreference = :xreference"),
    @NamedQuery(name = "Joo2ContactDetails.findByPublishUp", query = "SELECT j FROM Joo2ContactDetails j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2ContactDetails.findByPublishDown", query = "SELECT j FROM Joo2ContactDetails j WHERE j.publishDown = :publishDown")})
public class Joo2ContactDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Size(max = 255)
    @Column(name = "con_position", length = 255)
    private String conPosition;
    @Lob
    @Size(max = 65535)
    @Column(name = "address", length = 65535)
    private String address;
    @Size(max = 100)
    @Column(name = "suburb", length = 100)
    private String suburb;
    @Size(max = 100)
    @Column(name = "state", length = 100)
    private String state;
    @Size(max = 100)
    @Column(name = "country", length = 100)
    private String country;
    @Size(max = 100)
    @Column(name = "postcode", length = 100)
    private String postcode;
    @Size(max = 255)
    @Column(name = "telephone", length = 255)
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "fax", length = 255)
    private String fax;
    @Lob
    @Size(max = 16777215)
    @Column(name = "misc", length = 16777215)
    private String misc;
    @Size(max = 255)
    @Column(name = "image", length = 255)
    private String image;
    @Size(max = 20)
    @Column(name = "imagepos", length = 20)
    private String imagepos;
    @Size(max = 255)
    @Column(name = "email_to", length = 255)
    private String emailTo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default_con", nullable = false)
    private boolean defaultCon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mobile", nullable = false, length = 255)
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "webpage", nullable = false, length = 255)
    private String webpage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sortname1", nullable = false, length = 255)
    private String sortname1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sortname2", nullable = false, length = 255)
    private String sortname2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sortname3", nullable = false, length = 255)
    private String sortname3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by", nullable = false)
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "created_by_alias", nullable = false, length = 255)
    private String createdByAlias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by", nullable = false)
    private int modifiedBy;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadesc", nullable = false, length = 65535)
    private String metadesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metadata", nullable = false, length = 65535)
    private String metadata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "featured", nullable = false)
    private short featured;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "xreference", nullable = false, length = 50)
    private String xreference;
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

    public Joo2ContactDetails() {
    }

    public Joo2ContactDetails(Integer id) {
        this.id = id;
    }

    public Joo2ContactDetails(Integer id, String name, String alias, boolean defaultCon, boolean published, int checkedOut, Date checkedOutTime, int ordering, String params, int userId, int catid, String mobile, String webpage, String sortname1, String sortname2, String sortname3, String language, Date created, int createdBy, String createdByAlias, Date modified, int modifiedBy, String metakey, String metadesc, String metadata, short featured, String xreference, Date publishUp, Date publishDown) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.defaultCon = defaultCon;
        this.published = published;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.params = params;
        this.userId = userId;
        this.catid = catid;
        this.mobile = mobile;
        this.webpage = webpage;
        this.sortname1 = sortname1;
        this.sortname2 = sortname2;
        this.sortname3 = sortname3;
        this.language = language;
        this.created = created;
        this.createdBy = createdBy;
        this.createdByAlias = createdByAlias;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.metadata = metadata;
        this.featured = featured;
        this.xreference = xreference;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getConPosition() {
        return conPosition;
    }

    public void setConPosition(String conPosition) {
        this.conPosition = conPosition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImagepos() {
        return imagepos;
    }

    public void setImagepos(String imagepos) {
        this.imagepos = imagepos;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public boolean getDefaultCon() {
        return defaultCon;
    }

    public void setDefaultCon(boolean defaultCon) {
        this.defaultCon = defaultCon;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getSortname1() {
        return sortname1;
    }

    public void setSortname1(String sortname1) {
        this.sortname1 = sortname1;
    }

    public String getSortname2() {
        return sortname2;
    }

    public void setSortname2(String sortname2) {
        this.sortname2 = sortname2;
    }

    public String getSortname3() {
        return sortname3;
    }

    public void setSortname3(String sortname3) {
        this.sortname3 = sortname3;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByAlias() {
        return createdByAlias;
    }

    public void setCreatedByAlias(String createdByAlias) {
        this.createdByAlias = createdByAlias;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public short getFeatured() {
        return featured;
    }

    public void setFeatured(short featured) {
        this.featured = featured;
    }

    public String getXreference() {
        return xreference;
    }

    public void setXreference(String xreference) {
        this.xreference = xreference;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2ContactDetails)) {
            return false;
        }
        Joo2ContactDetails other = (Joo2ContactDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ContactDetails[ id=" + id + " ]";
    }
    
}
