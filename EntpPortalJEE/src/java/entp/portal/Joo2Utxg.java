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
@Table(name = "joo2_utxg", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Utxg.findAll", query = "SELECT j FROM Joo2Utxg j"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgId", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgId = :mUctxgId"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxId", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxId = :mUctxId"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgKey", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgKey = :mUctxgKey"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgName", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgName = :mUctxgName"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgValue", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgValue = :mUctxgValue"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgTitle", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgTitle = :mUctxgTitle"),
    @NamedQuery(name = "Joo2Utxg.findByMUctxgType", query = "SELECT j FROM Joo2Utxg j WHERE j.mUctxgType = :mUctxgType")})
public class Joo2Utxg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_uctxg_id", nullable = false)
    private Integer mUctxgId;
    @Column(name = "m_uctx_id")
    private Integer mUctxId;
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

    public Joo2Utxg() {
    }

    public Joo2Utxg(Integer mUctxgId) {
        this.mUctxgId = mUctxgId;
    }

    public Integer getMUctxgId() {
        return mUctxgId;
    }

    public void setMUctxgId(Integer mUctxgId) {
        this.mUctxgId = mUctxgId;
    }

    public Integer getMUctxId() {
        return mUctxId;
    }

    public void setMUctxId(Integer mUctxId) {
        this.mUctxId = mUctxId;
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
        if (!(object instanceof Joo2Utxg)) {
            return false;
        }
        Joo2Utxg other = (Joo2Utxg) object;
        if ((this.mUctxgId == null && other.mUctxgId != null) || (this.mUctxgId != null && !this.mUctxgId.equals(other.mUctxgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Utxg[ mUctxgId=" + mUctxgId + " ]";
    }
    
}
