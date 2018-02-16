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
@Table(name = "joo2_virtuemart_countries", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_country_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCountries.findAll", query = "SELECT j FROM Joo2VirtuemartCountries j"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByVirtuemartCountryId", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.virtuemartCountryId = :virtuemartCountryId"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByVirtuemartWorldzoneId", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.virtuemartWorldzoneId = :virtuemartWorldzoneId"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByCountryName", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.countryName = :countryName"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByCountry3Code", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.country3Code = :country3Code"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByCountry2Code", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.country2Code = :country2Code"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByPublished", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCountries.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCountries j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCountries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_country_id", nullable = false)
    private Long virtuemartCountryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_worldzone_id", nullable = false)
    private int virtuemartWorldzoneId;
    @Size(max = 64)
    @Column(name = "country_name", length = 64)
    private String countryName;
    @Size(max = 3)
    @Column(name = "country_3_code", length = 3)
    private String country3Code;
    @Size(max = 2)
    @Column(name = "country_2_code", length = 2)
    private String country2Code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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

    public Joo2VirtuemartCountries() {
    }

    public Joo2VirtuemartCountries(Long virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
    }

    public Joo2VirtuemartCountries(Long virtuemartCountryId, int virtuemartWorldzoneId, int ordering, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCountryId = virtuemartCountryId;
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
        this.ordering = ordering;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartCountryId() {
        return virtuemartCountryId;
    }

    public void setVirtuemartCountryId(Long virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
    }

    public int getVirtuemartWorldzoneId() {
        return virtuemartWorldzoneId;
    }

    public void setVirtuemartWorldzoneId(int virtuemartWorldzoneId) {
        this.virtuemartWorldzoneId = virtuemartWorldzoneId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountry3Code() {
        return country3Code;
    }

    public void setCountry3Code(String country3Code) {
        this.country3Code = country3Code;
    }

    public String getCountry2Code() {
        return country2Code;
    }

    public void setCountry2Code(String country2Code) {
        this.country2Code = country2Code;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        hash += (virtuemartCountryId != null ? virtuemartCountryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCountries)) {
            return false;
        }
        Joo2VirtuemartCountries other = (Joo2VirtuemartCountries) object;
        if ((this.virtuemartCountryId == null && other.virtuemartCountryId != null) || (this.virtuemartCountryId != null && !this.virtuemartCountryId.equals(other.virtuemartCountryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCountries[ virtuemartCountryId=" + virtuemartCountryId + " ]";
    }
    
}
