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
@Table(name = "joo2_virtuemart_manufacturercategories", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_manufacturercategories_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findAll", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByVirtuemartManufacturercategoriesId", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.virtuemartManufacturercategoriesId = :virtuemartManufacturercategoriesId"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByMfCategoryName", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.mfCategoryName = :mfCategoryName"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByPublished", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartManufacturercategories.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartManufacturercategories j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartManufacturercategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_manufacturercategories_id", nullable = false)
    private Long virtuemartManufacturercategoriesId;
    @Size(max = 64)
    @Column(name = "mf_category_name", length = 64)
    private String mfCategoryName;
    @Lob
    @Size(max = 65535)
    @Column(name = "mf_category_desc", length = 65535)
    private String mfCategoryDesc;
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

    public Joo2VirtuemartManufacturercategories() {
    }

    public Joo2VirtuemartManufacturercategories(Long virtuemartManufacturercategoriesId) {
        this.virtuemartManufacturercategoriesId = virtuemartManufacturercategoriesId;
    }

    public Joo2VirtuemartManufacturercategories(Long virtuemartManufacturercategoriesId, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartManufacturercategoriesId = virtuemartManufacturercategoriesId;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartManufacturercategoriesId() {
        return virtuemartManufacturercategoriesId;
    }

    public void setVirtuemartManufacturercategoriesId(Long virtuemartManufacturercategoriesId) {
        this.virtuemartManufacturercategoriesId = virtuemartManufacturercategoriesId;
    }

    public String getMfCategoryName() {
        return mfCategoryName;
    }

    public void setMfCategoryName(String mfCategoryName) {
        this.mfCategoryName = mfCategoryName;
    }

    public String getMfCategoryDesc() {
        return mfCategoryDesc;
    }

    public void setMfCategoryDesc(String mfCategoryDesc) {
        this.mfCategoryDesc = mfCategoryDesc;
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
        hash += (virtuemartManufacturercategoriesId != null ? virtuemartManufacturercategoriesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartManufacturercategories)) {
            return false;
        }
        Joo2VirtuemartManufacturercategories other = (Joo2VirtuemartManufacturercategories) object;
        if ((this.virtuemartManufacturercategoriesId == null && other.virtuemartManufacturercategoriesId != null) || (this.virtuemartManufacturercategoriesId != null && !this.virtuemartManufacturercategoriesId.equals(other.virtuemartManufacturercategoriesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartManufacturercategories[ virtuemartManufacturercategoriesId=" + virtuemartManufacturercategoriesId + " ]";
    }
    
}
