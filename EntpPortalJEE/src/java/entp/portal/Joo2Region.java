/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_region", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Region.findAll", query = "SELECT j FROM Joo2Region j"),
    @NamedQuery(name = "Joo2Region.findByMRegionId", query = "SELECT j FROM Joo2Region j WHERE j.mRegionId = :mRegionId"),
    @NamedQuery(name = "Joo2Region.findByMParentId", query = "SELECT j FROM Joo2Region j WHERE j.mParentId = :mParentId"),
    @NamedQuery(name = "Joo2Region.findByMLayerId", query = "SELECT j FROM Joo2Region j WHERE j.mLayerId = :mLayerId"),
    @NamedQuery(name = "Joo2Region.findByMShortName", query = "SELECT j FROM Joo2Region j WHERE j.mShortName = :mShortName"),
    @NamedQuery(name = "Joo2Region.findByMTitle", query = "SELECT j FROM Joo2Region j WHERE j.mTitle = :mTitle"),
    @NamedQuery(name = "Joo2Region.findByMCollapsible", query = "SELECT j FROM Joo2Region j WHERE j.mCollapsible = :mCollapsible"),
    @NamedQuery(name = "Joo2Region.findByMOpenContent", query = "SELECT j FROM Joo2Region j WHERE j.mOpenContent = :mOpenContent"),
    @NamedQuery(name = "Joo2Region.findByMRegionType", query = "SELECT j FROM Joo2Region j WHERE j.mRegionType = :mRegionType"),
    @NamedQuery(name = "Joo2Region.findByMRegionPosition", query = "SELECT j FROM Joo2Region j WHERE j.mRegionPosition = :mRegionPosition"),
    @NamedQuery(name = "Joo2Region.findByMRegionOrdering", query = "SELECT j FROM Joo2Region j WHERE j.mRegionOrdering = :mRegionOrdering"),
    @NamedQuery(name = "Joo2Region.findByMRegionName", query = "SELECT j FROM Joo2Region j WHERE j.mRegionName = :mRegionName"),
    @NamedQuery(name = "Joo2Region.findByMRegionTitle", query = "SELECT j FROM Joo2Region j WHERE j.mRegionTitle = :mRegionTitle"),
    @NamedQuery(name = "Joo2Region.findByRegionDisplay", query = "SELECT j FROM Joo2Region j WHERE j.regionDisplay = :regionDisplay"),
    @NamedQuery(name = "Joo2Region.findByMRegionDisplay", query = "SELECT j FROM Joo2Region j WHERE j.mRegionDisplay = :mRegionDisplay")})
public class Joo2Region implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_region_id", nullable = false)
    private Integer mRegionId;
    @Column(name = "m_parent_id")
    private Integer mParentId;
    @Column(name = "m_layer_id")
    private Integer mLayerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "m_short_name", nullable = false, length = 50)
    private String mShortName;
    @Size(max = 50)
    @Column(name = "m_title", length = 50)
    private String mTitle;
    @Size(max = 16)
    @Column(name = "m_collapsible", length = 16)
    private String mCollapsible;
    @Size(max = 16)
    @Column(name = "m_open_content", length = 16)
    private String mOpenContent;
    @Size(max = 50)
    @Column(name = "m_region_type", length = 50)
    private String mRegionType;
    @Size(max = 64)
    @Column(name = "m_region_position", length = 64)
    private String mRegionPosition;
    @Column(name = "m_region_ordering")
    private Integer mRegionOrdering;
    @Size(max = 128)
    @Column(name = "m_region_name", length = 128)
    private String mRegionName;
    @Size(max = 256)
    @Column(name = "m_region_title", length = 256)
    private String mRegionTitle;
    @Column(name = "region_display")
    private Integer regionDisplay;
    @Column(name = "m_region_display")
    private Integer mRegionDisplay;

    public Joo2Region() {
    }

    public Joo2Region(Integer mRegionId) {
        this.mRegionId = mRegionId;
    }

    public Joo2Region(Integer mRegionId, String mShortName) {
        this.mRegionId = mRegionId;
        this.mShortName = mShortName;
    }

    public Integer getMRegionId() {
        return mRegionId;
    }

    public void setMRegionId(Integer mRegionId) {
        this.mRegionId = mRegionId;
    }

    public Integer getMParentId() {
        return mParentId;
    }

    public void setMParentId(Integer mParentId) {
        this.mParentId = mParentId;
    }

    public Integer getMLayerId() {
        return mLayerId;
    }

    public void setMLayerId(Integer mLayerId) {
        this.mLayerId = mLayerId;
    }

    public String getMShortName() {
        return mShortName;
    }

    public void setMShortName(String mShortName) {
        this.mShortName = mShortName;
    }

    public String getMTitle() {
        return mTitle;
    }

    public void setMTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getMCollapsible() {
        return mCollapsible;
    }

    public void setMCollapsible(String mCollapsible) {
        this.mCollapsible = mCollapsible;
    }

    public String getMOpenContent() {
        return mOpenContent;
    }

    public void setMOpenContent(String mOpenContent) {
        this.mOpenContent = mOpenContent;
    }

    public String getMRegionType() {
        return mRegionType;
    }

    public void setMRegionType(String mRegionType) {
        this.mRegionType = mRegionType;
    }

    public String getMRegionPosition() {
        return mRegionPosition;
    }

    public void setMRegionPosition(String mRegionPosition) {
        this.mRegionPosition = mRegionPosition;
    }

    public Integer getMRegionOrdering() {
        return mRegionOrdering;
    }

    public void setMRegionOrdering(Integer mRegionOrdering) {
        this.mRegionOrdering = mRegionOrdering;
    }

    public String getMRegionName() {
        return mRegionName;
    }

    public void setMRegionName(String mRegionName) {
        this.mRegionName = mRegionName;
    }

    public String getMRegionTitle() {
        return mRegionTitle;
    }

    public void setMRegionTitle(String mRegionTitle) {
        this.mRegionTitle = mRegionTitle;
    }

    public Integer getRegionDisplay() {
        return regionDisplay;
    }

    public void setRegionDisplay(Integer regionDisplay) {
        this.regionDisplay = regionDisplay;
    }

    public Integer getMRegionDisplay() {
        return mRegionDisplay;
    }

    public void setMRegionDisplay(Integer mRegionDisplay) {
        this.mRegionDisplay = mRegionDisplay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mRegionId != null ? mRegionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Region)) {
            return false;
        }
        Joo2Region other = (Joo2Region) object;
        if ((this.mRegionId == null && other.mRegionId != null) || (this.mRegionId != null && !this.mRegionId.equals(other.mRegionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Region[ mRegionId=" + mRegionId + " ]";
    }
    
}
