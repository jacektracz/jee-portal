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
@Table(name = "joo2_virtuemart_customs", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_custom_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCustoms.findAll", query = "SELECT j FROM Joo2VirtuemartCustoms j"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByVirtuemartCustomId", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.virtuemartCustomId = :virtuemartCustomId"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCustomParentId", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.customParentId = :customParentId"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByAdminOnly", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.adminOnly = :adminOnly"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCustomTitle", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.customTitle = :customTitle"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCustomTip", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.customTip = :customTip"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCustomValue", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.customValue = :customValue"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCustomFieldDesc", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.customFieldDesc = :customFieldDesc"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByFieldType", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.fieldType = :fieldType"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByIsList", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.isList = :isList"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByIsHidden", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.isHidden = :isHidden"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByIsCartAttribute", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.isCartAttribute = :isCartAttribute"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByPublished", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartCustoms.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartCustoms j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartCustoms implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_custom_id", nullable = false)
    private Long virtuemartCustomId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custom_parent_id", nullable = false)
    private int customParentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin_only", nullable = false)
    private boolean adminOnly;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "custom_title", nullable = false, length = 255)
    private String customTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "custom_tip", nullable = false, length = 255)
    private String customTip;
    @Size(max = 255)
    @Column(name = "custom_value", length = 255)
    private String customValue;
    @Size(max = 255)
    @Column(name = "custom_field_desc", length = 255)
    private String customFieldDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "field_type", nullable = false)
    private char fieldType;
    @Column(name = "is_list")
    private Boolean isList;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_hidden", nullable = false)
    private boolean isHidden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cart_attribute", nullable = false)
    private boolean isCartAttribute;
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

    public Joo2VirtuemartCustoms() {
    }

    public Joo2VirtuemartCustoms(Long virtuemartCustomId) {
        this.virtuemartCustomId = virtuemartCustomId;
    }

    public Joo2VirtuemartCustoms(Long virtuemartCustomId, int customParentId, boolean adminOnly, String customTitle, String customTip, char fieldType, boolean isHidden, boolean isCartAttribute, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartCustomId = virtuemartCustomId;
        this.customParentId = customParentId;
        this.adminOnly = adminOnly;
        this.customTitle = customTitle;
        this.customTip = customTip;
        this.fieldType = fieldType;
        this.isHidden = isHidden;
        this.isCartAttribute = isCartAttribute;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartCustomId() {
        return virtuemartCustomId;
    }

    public void setVirtuemartCustomId(Long virtuemartCustomId) {
        this.virtuemartCustomId = virtuemartCustomId;
    }

    public int getCustomParentId() {
        return customParentId;
    }

    public void setCustomParentId(int customParentId) {
        this.customParentId = customParentId;
    }

    public boolean getAdminOnly() {
        return adminOnly;
    }

    public void setAdminOnly(boolean adminOnly) {
        this.adminOnly = adminOnly;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public String getCustomTip() {
        return customTip;
    }

    public void setCustomTip(String customTip) {
        this.customTip = customTip;
    }

    public String getCustomValue() {
        return customValue;
    }

    public void setCustomValue(String customValue) {
        this.customValue = customValue;
    }

    public String getCustomFieldDesc() {
        return customFieldDesc;
    }

    public void setCustomFieldDesc(String customFieldDesc) {
        this.customFieldDesc = customFieldDesc;
    }

    public char getFieldType() {
        return fieldType;
    }

    public void setFieldType(char fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    public boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public boolean getIsCartAttribute() {
        return isCartAttribute;
    }

    public void setIsCartAttribute(boolean isCartAttribute) {
        this.isCartAttribute = isCartAttribute;
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
        hash += (virtuemartCustomId != null ? virtuemartCustomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCustoms)) {
            return false;
        }
        Joo2VirtuemartCustoms other = (Joo2VirtuemartCustoms) object;
        if ((this.virtuemartCustomId == null && other.virtuemartCustomId != null) || (this.virtuemartCustomId != null && !this.virtuemartCustomId.equals(other.virtuemartCustomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCustoms[ virtuemartCustomId=" + virtuemartCustomId + " ]";
    }
    
}
