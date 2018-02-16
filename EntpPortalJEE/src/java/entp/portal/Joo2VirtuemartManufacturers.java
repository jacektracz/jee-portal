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
@Table(name = "joo2_virtuemart_manufacturers", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_manufacturer_id"}),
    @UniqueConstraint(columnNames = {"slug"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findAll", query = "SELECT j FROM Joo2VirtuemartManufacturers j"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByVirtuemartManufacturerId", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.virtuemartManufacturerId = :virtuemartManufacturerId"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByMfName", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.mfName = :mfName"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findBySlug", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.slug = :slug"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByMfEmail", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.mfEmail = :mfEmail"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByVirtuemartManufacturercategoriesId", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.virtuemartManufacturercategoriesId = :virtuemartManufacturercategoriesId"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByMfUrl", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.mfUrl = :mfUrl"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByHits", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByPublished", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturers.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartManufacturers j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartManufacturers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_manufacturer_id", nullable = false)
    private Long virtuemartManufacturerId;
    @Size(max = 64)
    @Column(name = "mf_name", length = 64)
    private String mfName;
    @Size(max = 128)
    @Column(name = "slug", length = 128)
    private String slug;
    @Size(max = 255)
    @Column(name = "mf_email", length = 255)
    private String mfEmail;
    @Lob
    @Size(max = 65535)
    @Column(name = "mf_desc", length = 65535)
    private String mfDesc;
    @Column(name = "virtuemart_manufacturercategories_id")
    private Integer virtuemartManufacturercategoriesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mf_url", nullable = false, length = 255)
    private String mfUrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
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

    public Joo2VirtuemartManufacturers() {
    }

    public Joo2VirtuemartManufacturers(Long virtuemartManufacturerId) {
        this.virtuemartManufacturerId = virtuemartManufacturerId;
    }

    public Joo2VirtuemartManufacturers(Long virtuemartManufacturerId, String mfUrl, int hits, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartManufacturerId = virtuemartManufacturerId;
        this.mfUrl = mfUrl;
        this.hits = hits;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartManufacturerId() {
        return virtuemartManufacturerId;
    }

    public void setVirtuemartManufacturerId(Long virtuemartManufacturerId) {
        this.virtuemartManufacturerId = virtuemartManufacturerId;
    }

    public String getMfName() {
        return mfName;
    }

    public void setMfName(String mfName) {
        this.mfName = mfName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getMfEmail() {
        return mfEmail;
    }

    public void setMfEmail(String mfEmail) {
        this.mfEmail = mfEmail;
    }

    public String getMfDesc() {
        return mfDesc;
    }

    public void setMfDesc(String mfDesc) {
        this.mfDesc = mfDesc;
    }

    public Integer getVirtuemartManufacturercategoriesId() {
        return virtuemartManufacturercategoriesId;
    }

    public void setVirtuemartManufacturercategoriesId(Integer virtuemartManufacturercategoriesId) {
        this.virtuemartManufacturercategoriesId = virtuemartManufacturercategoriesId;
    }

    public String getMfUrl() {
        return mfUrl;
    }

    public void setMfUrl(String mfUrl) {
        this.mfUrl = mfUrl;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
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
        hash += (virtuemartManufacturerId != null ? virtuemartManufacturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartManufacturers)) {
            return false;
        }
        Joo2VirtuemartManufacturers other = (Joo2VirtuemartManufacturers) object;
        if ((this.virtuemartManufacturerId == null && other.virtuemartManufacturerId != null) || (this.virtuemartManufacturerId != null && !this.virtuemartManufacturerId.equals(other.virtuemartManufacturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartManufacturers[ virtuemartManufacturerId=" + virtuemartManufacturerId + " ]";
    }
    
}
