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
@Table(name = "joo2_reglayer", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Reglayer.findAll", query = "SELECT j FROM Joo2Reglayer j"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayerid", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayerid = :mRegLayerid"),
    @NamedQuery(name = "Joo2Reglayer.findByMParentId", query = "SELECT j FROM Joo2Reglayer j WHERE j.mParentId = :mParentId"),
    @NamedQuery(name = "Joo2Reglayer.findByMLayerId", query = "SELECT j FROM Joo2Reglayer j WHERE j.mLayerId = :mLayerId"),
    @NamedQuery(name = "Joo2Reglayer.findByMShortName", query = "SELECT j FROM Joo2Reglayer j WHERE j.mShortName = :mShortName"),
    @NamedQuery(name = "Joo2Reglayer.findByMTitle", query = "SELECT j FROM Joo2Reglayer j WHERE j.mTitle = :mTitle"),
    @NamedQuery(name = "Joo2Reglayer.findByMCollapsible", query = "SELECT j FROM Joo2Reglayer j WHERE j.mCollapsible = :mCollapsible"),
    @NamedQuery(name = "Joo2Reglayer.findByMOpenContent", query = "SELECT j FROM Joo2Reglayer j WHERE j.mOpenContent = :mOpenContent"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayertype", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayertype = :mRegLayertype"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayerposition", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayerposition = :mRegLayerposition"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayerordering", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayerordering = :mRegLayerordering"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayername", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayername = :mRegLayername"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayertitle", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayertitle = :mRegLayertitle"),
    @NamedQuery(name = "Joo2Reglayer.findByRegLayerdisplay", query = "SELECT j FROM Joo2Reglayer j WHERE j.regLayerdisplay = :regLayerdisplay"),
    @NamedQuery(name = "Joo2Reglayer.findByMRegLayerdisplay", query = "SELECT j FROM Joo2Reglayer j WHERE j.mRegLayerdisplay = :mRegLayerdisplay"),
    @NamedQuery(name = "Joo2Reglayer.findByMThemeTeam", query = "SELECT j FROM Joo2Reglayer j WHERE j.mThemeTeam = :mThemeTeam"),
    @NamedQuery(name = "Joo2Reglayer.findByMThemeEpt", query = "SELECT j FROM Joo2Reglayer j WHERE j.mThemeEpt = :mThemeEpt"),
    @NamedQuery(name = "Joo2Reglayer.findByMReglayerThemesPath", query = "SELECT j FROM Joo2Reglayer j WHERE j.mReglayerThemesPath = :mReglayerThemesPath"),
    @NamedQuery(name = "Joo2Reglayer.findByMReglayerThemeDefault", query = "SELECT j FROM Joo2Reglayer j WHERE j.mReglayerThemeDefault = :mReglayerThemeDefault"),
    @NamedQuery(name = "Joo2Reglayer.findByMReglayerThemeLast", query = "SELECT j FROM Joo2Reglayer j WHERE j.mReglayerThemeLast = :mReglayerThemeLast"),
    @NamedQuery(name = "Joo2Reglayer.findByMReglayerLeadTheme", query = "SELECT j FROM Joo2Reglayer j WHERE j.mReglayerLeadTheme = :mReglayerLeadTheme"),
    @NamedQuery(name = "Joo2Reglayer.findByMReglayerThreeTabTheme", query = "SELECT j FROM Joo2Reglayer j WHERE j.mReglayerThreeTabTheme = :mReglayerThreeTabTheme")})
public class Joo2Reglayer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_RegLayer_id", nullable = false)
    private Integer mRegLayerid;
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
    @Column(name = "m_RegLayer_type", length = 50)
    private String mRegLayertype;
    @Size(max = 64)
    @Column(name = "m_RegLayer_position", length = 64)
    private String mRegLayerposition;
    @Column(name = "m_RegLayer_ordering")
    private Integer mRegLayerordering;
    @Size(max = 128)
    @Column(name = "m_RegLayer_name", length = 128)
    private String mRegLayername;
    @Size(max = 256)
    @Column(name = "m_RegLayer_title", length = 256)
    private String mRegLayertitle;
    @Column(name = "RegLayer_display")
    private Integer regLayerdisplay;
    @Column(name = "m_RegLayer_display")
    private Integer mRegLayerdisplay;
    @Size(max = 64)
    @Column(name = "m_theme_team", length = 64)
    private String mThemeTeam;
    @Size(max = 64)
    @Column(name = "m_theme_ept", length = 64)
    private String mThemeEpt;
    @Size(max = 128)
    @Column(name = "m_reglayer_themes_path", length = 128)
    private String mReglayerThemesPath;
    @Size(max = 64)
    @Column(name = "m_reglayer_theme_default", length = 64)
    private String mReglayerThemeDefault;
    @Size(max = 64)
    @Column(name = "m_reglayer_theme_last", length = 64)
    private String mReglayerThemeLast;
    @Size(max = 64)
    @Column(name = "m_reglayer_lead_theme", length = 64)
    private String mReglayerLeadTheme;
    @Size(max = 64)
    @Column(name = "m_reglayer_three_tab_theme", length = 64)
    private String mReglayerThreeTabTheme;

    public Joo2Reglayer() {
    }

    public Joo2Reglayer(Integer mRegLayerid) {
        this.mRegLayerid = mRegLayerid;
    }

    public Joo2Reglayer(Integer mRegLayerid, String mShortName) {
        this.mRegLayerid = mRegLayerid;
        this.mShortName = mShortName;
    }

    public Integer getMRegLayerid() {
        return mRegLayerid;
    }

    public void setMRegLayerid(Integer mRegLayerid) {
        this.mRegLayerid = mRegLayerid;
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

    public String getMRegLayertype() {
        return mRegLayertype;
    }

    public void setMRegLayertype(String mRegLayertype) {
        this.mRegLayertype = mRegLayertype;
    }

    public String getMRegLayerposition() {
        return mRegLayerposition;
    }

    public void setMRegLayerposition(String mRegLayerposition) {
        this.mRegLayerposition = mRegLayerposition;
    }

    public Integer getMRegLayerordering() {
        return mRegLayerordering;
    }

    public void setMRegLayerordering(Integer mRegLayerordering) {
        this.mRegLayerordering = mRegLayerordering;
    }

    public String getMRegLayername() {
        return mRegLayername;
    }

    public void setMRegLayername(String mRegLayername) {
        this.mRegLayername = mRegLayername;
    }

    public String getMRegLayertitle() {
        return mRegLayertitle;
    }

    public void setMRegLayertitle(String mRegLayertitle) {
        this.mRegLayertitle = mRegLayertitle;
    }

    public Integer getRegLayerdisplay() {
        return regLayerdisplay;
    }

    public void setRegLayerdisplay(Integer regLayerdisplay) {
        this.regLayerdisplay = regLayerdisplay;
    }

    public Integer getMRegLayerdisplay() {
        return mRegLayerdisplay;
    }

    public void setMRegLayerdisplay(Integer mRegLayerdisplay) {
        this.mRegLayerdisplay = mRegLayerdisplay;
    }

    public String getMThemeTeam() {
        return mThemeTeam;
    }

    public void setMThemeTeam(String mThemeTeam) {
        this.mThemeTeam = mThemeTeam;
    }

    public String getMThemeEpt() {
        return mThemeEpt;
    }

    public void setMThemeEpt(String mThemeEpt) {
        this.mThemeEpt = mThemeEpt;
    }

    public String getMReglayerThemesPath() {
        return mReglayerThemesPath;
    }

    public void setMReglayerThemesPath(String mReglayerThemesPath) {
        this.mReglayerThemesPath = mReglayerThemesPath;
    }

    public String getMReglayerThemeDefault() {
        return mReglayerThemeDefault;
    }

    public void setMReglayerThemeDefault(String mReglayerThemeDefault) {
        this.mReglayerThemeDefault = mReglayerThemeDefault;
    }

    public String getMReglayerThemeLast() {
        return mReglayerThemeLast;
    }

    public void setMReglayerThemeLast(String mReglayerThemeLast) {
        this.mReglayerThemeLast = mReglayerThemeLast;
    }

    public String getMReglayerLeadTheme() {
        return mReglayerLeadTheme;
    }

    public void setMReglayerLeadTheme(String mReglayerLeadTheme) {
        this.mReglayerLeadTheme = mReglayerLeadTheme;
    }

    public String getMReglayerThreeTabTheme() {
        return mReglayerThreeTabTheme;
    }

    public void setMReglayerThreeTabTheme(String mReglayerThreeTabTheme) {
        this.mReglayerThreeTabTheme = mReglayerThreeTabTheme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mRegLayerid != null ? mRegLayerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Reglayer)) {
            return false;
        }
        Joo2Reglayer other = (Joo2Reglayer) object;
        if ((this.mRegLayerid == null && other.mRegLayerid != null) || (this.mRegLayerid != null && !this.mRegLayerid.equals(other.mRegLayerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Reglayer[ mRegLayerid=" + mRegLayerid + " ]";
    }
    
}
