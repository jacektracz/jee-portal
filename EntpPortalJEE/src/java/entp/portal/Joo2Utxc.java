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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_utxc", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Utxc.findAll", query = "SELECT j FROM Joo2Utxc j"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcId", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcId = :mUctxcId"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcCookie", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcCookie = :mUctxcCookie"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcName", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcName = :mUctxcName"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcTitle", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcTitle = :mUctxcTitle"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcTheme", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcTheme = :mUctxcTheme"),
    @NamedQuery(name = "Joo2Utxc.findByMUctxcGenericData", query = "SELECT j FROM Joo2Utxc j WHERE j.mUctxcGenericData = :mUctxcGenericData")})
public class Joo2Utxc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_uctxc_id", nullable = false)
    private Integer mUctxcId;
    @Size(max = 64)
    @Column(name = "m_uctxc_cookie", length = 64)
    private String mUctxcCookie;
    @Size(max = 64)
    @Column(name = "m_uctxc_name", length = 64)
    private String mUctxcName;
    @Size(max = 64)
    @Column(name = "m_uctxc_title", length = 64)
    private String mUctxcTitle;
    @Size(max = 64)
    @Column(name = "m_uctxc_theme", length = 64)
    private String mUctxcTheme;
    @Size(max = 64)
    @Column(name = "m_uctxc_generic_data", length = 64)
    private String mUctxcGenericData;

    public Joo2Utxc() {
    }

    public Joo2Utxc(Integer mUctxcId) {
        this.mUctxcId = mUctxcId;
    }

    public Integer getMUctxcId() {
        return mUctxcId;
    }

    public void setMUctxcId(Integer mUctxcId) {
        this.mUctxcId = mUctxcId;
    }

    public String getMUctxcCookie() {
        return mUctxcCookie;
    }

    public void setMUctxcCookie(String mUctxcCookie) {
        this.mUctxcCookie = mUctxcCookie;
    }

    public String getMUctxcName() {
        return mUctxcName;
    }

    public void setMUctxcName(String mUctxcName) {
        this.mUctxcName = mUctxcName;
    }

    public String getMUctxcTitle() {
        return mUctxcTitle;
    }

    public void setMUctxcTitle(String mUctxcTitle) {
        this.mUctxcTitle = mUctxcTitle;
    }

    public String getMUctxcTheme() {
        return mUctxcTheme;
    }

    public void setMUctxcTheme(String mUctxcTheme) {
        this.mUctxcTheme = mUctxcTheme;
    }

    public String getMUctxcGenericData() {
        return mUctxcGenericData;
    }

    public void setMUctxcGenericData(String mUctxcGenericData) {
        this.mUctxcGenericData = mUctxcGenericData;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mUctxcId != null ? mUctxcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Utxc)) {
            return false;
        }
        Joo2Utxc other = (Joo2Utxc) object;
        if ((this.mUctxcId == null && other.mUctxcId != null) || (this.mUctxcId != null && !this.mUctxcId.equals(other.mUctxcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Utxc[ mUctxcId=" + mUctxcId + " ]";
    }
    
}
