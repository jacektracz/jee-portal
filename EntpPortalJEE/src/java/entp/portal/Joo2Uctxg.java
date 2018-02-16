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
@Table(name = "joo2_uctxg", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Uctxg.findAll", query = "SELECT j FROM Joo2Uctxg j"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgId", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgId = :mUctxgId"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxcId", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxcId = :mUctxcId"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgKey", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgKey = :mUctxgKey"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgName", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgName = :mUctxgName"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgValue", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgValue = :mUctxgValue"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgTitle", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgTitle = :mUctxgTitle"),
    @NamedQuery(name = "Joo2Uctxg.findByMUctxgType", query = "SELECT j FROM Joo2Uctxg j WHERE j.mUctxgType = :mUctxgType")})
public class Joo2Uctxg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_uctxg_id", nullable = false)
    private Integer mUctxgId;
    @Column(name = "m_uctxc_id")
    private Integer mUctxcId;
    @Size(max = 64)
    @Column(name = "m_uctxg_key", length = 64)
    private String mUctxgKey;
    @Size(max = 64)
    @Column(name = "m_uctxg_name", length = 64)
    private String mUctxgName;
    @Size(max = 128)
    @Column(name = "m_uctxg_value", length = 128)
    private String mUctxgValue;
    @Size(max = 64)
    @Column(name = "m_uctxg_title", length = 64)
    private String mUctxgTitle;
    @Size(max = 64)
    @Column(name = "m_uctxg_type", length = 64)
    private String mUctxgType;

    public Joo2Uctxg() {
    }

    public Joo2Uctxg(Integer mUctxgId) {
        this.mUctxgId = mUctxgId;
    }

    public Integer getMUctxgId() {
        return mUctxgId;
    }

    public void setMUctxgId(Integer mUctxgId) {
        this.mUctxgId = mUctxgId;
    }

    public Integer getMUctxcId() {
        return mUctxcId;
    }

    public void setMUctxcId(Integer mUctxcId) {
        this.mUctxcId = mUctxcId;
    }

    public String getMUctxgKey() {
        return mUctxgKey;
    }

    public void setMUctxgKey(String mUctxgKey) {
        this.mUctxgKey = mUctxgKey;
    }

    public String getMUctxgName() {
        return mUctxgName;
    }

    public void setMUctxgName(String mUctxgName) {
        this.mUctxgName = mUctxgName;
    }

    public String getMUctxgValue() {
        return mUctxgValue;
    }

    public void setMUctxgValue(String mUctxgValue) {
        this.mUctxgValue = mUctxgValue;
    }

    public String getMUctxgTitle() {
        return mUctxgTitle;
    }

    public void setMUctxgTitle(String mUctxgTitle) {
        this.mUctxgTitle = mUctxgTitle;
    }

    public String getMUctxgType() {
        return mUctxgType;
    }

    public void setMUctxgType(String mUctxgType) {
        this.mUctxgType = mUctxgType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mUctxgId != null ? mUctxgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Uctxg)) {
            return false;
        }
        Joo2Uctxg other = (Joo2Uctxg) object;
        if ((this.mUctxgId == null && other.mUctxgId != null) || (this.mUctxgId != null && !this.mUctxgId.equals(other.mUctxgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Uctxg[ mUctxgId=" + mUctxgId + " ]";
    }
    
}
