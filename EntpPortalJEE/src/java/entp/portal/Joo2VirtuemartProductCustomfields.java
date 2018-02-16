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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_product_customfields", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findAll", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByVirtuemartCustomfieldId", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.virtuemartCustomfieldId = :virtuemartCustomfieldId"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByVirtuemartCustomId", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.virtuemartCustomId = :virtuemartCustomId"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByCustomValue", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.customValue = :customValue"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByCustomPrice", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.customPrice = :customPrice"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByPublished", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.lockedBy = :lockedBy"),
    @NamedQuery(name = "Joo2VirtuemartProductCustomfields.findByOrdering", query = "SELECT j FROM Joo2VirtuemartProductCustomfields j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartProductCustomfields implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_customfield_id", nullable = false)
    private Integer virtuemartCustomfieldId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_custom_id", nullable = false)
    private int virtuemartCustomId;
    @Size(max = 255)
    @Column(name = "custom_value", length = 255)
    private String customValue;
    @Size(max = 255)
    @Column(name = "custom_price", length = 255)
    private String customPrice;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2VirtuemartProductCustomfields() {
    }

    public Joo2VirtuemartProductCustomfields(Integer virtuemartCustomfieldId) {
        this.virtuemartCustomfieldId = virtuemartCustomfieldId;
    }

    public Joo2VirtuemartProductCustomfields(Integer virtuemartCustomfieldId, int virtuemartProductId, int virtuemartCustomId, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy, int ordering) {
        this.virtuemartCustomfieldId = virtuemartCustomfieldId;
        this.virtuemartProductId = virtuemartProductId;
        this.virtuemartCustomId = virtuemartCustomId;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
        this.ordering = ordering;
    }

    public Integer getVirtuemartCustomfieldId() {
        return virtuemartCustomfieldId;
    }

    public void setVirtuemartCustomfieldId(Integer virtuemartCustomfieldId) {
        this.virtuemartCustomfieldId = virtuemartCustomfieldId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getVirtuemartCustomId() {
        return virtuemartCustomId;
    }

    public void setVirtuemartCustomId(int virtuemartCustomId) {
        this.virtuemartCustomId = virtuemartCustomId;
    }

    public String getCustomValue() {
        return customValue;
    }

    public void setCustomValue(String customValue) {
        this.customValue = customValue;
    }

    public String getCustomPrice() {
        return customPrice;
    }

    public void setCustomPrice(String customPrice) {
        this.customPrice = customPrice;
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

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartCustomfieldId != null ? virtuemartCustomfieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartProductCustomfields)) {
            return false;
        }
        Joo2VirtuemartProductCustomfields other = (Joo2VirtuemartProductCustomfields) object;
        if ((this.virtuemartCustomfieldId == null && other.virtuemartCustomfieldId != null) || (this.virtuemartCustomfieldId != null && !this.virtuemartCustomfieldId.equals(other.virtuemartCustomfieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartProductCustomfields[ virtuemartCustomfieldId=" + virtuemartCustomfieldId + " ]";
    }
    
}
