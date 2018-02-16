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
@Table(name = "joo2_ucparam", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Ucparam.findAll", query = "SELECT j FROM Joo2Ucparam j"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamId", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamId = :mUcparamId"),
    @NamedQuery(name = "Joo2Ucparam.findByMUctxcId", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUctxcId = :mUctxcId"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamKey", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamKey = :mUcparamKey"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamName", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamName = :mUcparamName"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamValue", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamValue = :mUcparamValue"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamValue0", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamValue0 = :mUcparamValue0"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamValue1", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamValue1 = :mUcparamValue1"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamValue2", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamValue2 = :mUcparamValue2"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamValue3", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamValue3 = :mUcparamValue3"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamTitle", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamTitle = :mUcparamTitle"),
    @NamedQuery(name = "Joo2Ucparam.findByMUcparamType", query = "SELECT j FROM Joo2Ucparam j WHERE j.mUcparamType = :mUcparamType")})
public class Joo2Ucparam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_ucparam_id", nullable = false)
    private Integer mUcparamId;
    @Column(name = "m_uctxc_id")
    private Integer mUctxcId;
    @Size(max = 64)
    @Column(name = "m_ucparam_key", length = 64)
    private String mUcparamKey;
    @Size(max = 64)
    @Column(name = "m_ucparam_name", length = 64)
    private String mUcparamName;
    @Size(max = 128)
    @Column(name = "m_ucparam_value", length = 128)
    private String mUcparamValue;
    @Size(max = 128)
    @Column(name = "m_ucparam_value_0", length = 128)
    private String mUcparamValue0;
    @Size(max = 128)
    @Column(name = "m_ucparam_value_1", length = 128)
    private String mUcparamValue1;
    @Size(max = 128)
    @Column(name = "m_ucparam_value_2", length = 128)
    private String mUcparamValue2;
    @Size(max = 128)
    @Column(name = "m_ucparam_value_3", length = 128)
    private String mUcparamValue3;
    @Size(max = 64)
    @Column(name = "m_ucparam_title", length = 64)
    private String mUcparamTitle;
    @Size(max = 64)
    @Column(name = "m_ucparam_type", length = 64)
    private String mUcparamType;

    public Joo2Ucparam() {
    }

    public Joo2Ucparam(Integer mUcparamId) {
        this.mUcparamId = mUcparamId;
    }

    public Integer getMUcparamId() {
        return mUcparamId;
    }

    public void setMUcparamId(Integer mUcparamId) {
        this.mUcparamId = mUcparamId;
    }

    public Integer getMUctxcId() {
        return mUctxcId;
    }

    public void setMUctxcId(Integer mUctxcId) {
        this.mUctxcId = mUctxcId;
    }

    public String getMUcparamKey() {
        return mUcparamKey;
    }

    public void setMUcparamKey(String mUcparamKey) {
        this.mUcparamKey = mUcparamKey;
    }

    public String getMUcparamName() {
        return mUcparamName;
    }

    public void setMUcparamName(String mUcparamName) {
        this.mUcparamName = mUcparamName;
    }

    public String getMUcparamValue() {
        return mUcparamValue;
    }

    public void setMUcparamValue(String mUcparamValue) {
        this.mUcparamValue = mUcparamValue;
    }

    public String getMUcparamValue0() {
        return mUcparamValue0;
    }

    public void setMUcparamValue0(String mUcparamValue0) {
        this.mUcparamValue0 = mUcparamValue0;
    }

    public String getMUcparamValue1() {
        return mUcparamValue1;
    }

    public void setMUcparamValue1(String mUcparamValue1) {
        this.mUcparamValue1 = mUcparamValue1;
    }

    public String getMUcparamValue2() {
        return mUcparamValue2;
    }

    public void setMUcparamValue2(String mUcparamValue2) {
        this.mUcparamValue2 = mUcparamValue2;
    }

    public String getMUcparamValue3() {
        return mUcparamValue3;
    }

    public void setMUcparamValue3(String mUcparamValue3) {
        this.mUcparamValue3 = mUcparamValue3;
    }

    public String getMUcparamTitle() {
        return mUcparamTitle;
    }

    public void setMUcparamTitle(String mUcparamTitle) {
        this.mUcparamTitle = mUcparamTitle;
    }

    public String getMUcparamType() {
        return mUcparamType;
    }

    public void setMUcparamType(String mUcparamType) {
        this.mUcparamType = mUcparamType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mUcparamId != null ? mUcparamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Ucparam)) {
            return false;
        }
        Joo2Ucparam other = (Joo2Ucparam) object;
        if ((this.mUcparamId == null && other.mUcparamId != null) || (this.mUcparamId != null && !this.mUcparamId.equals(other.mUcparamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Ucparam[ mUcparamId=" + mUcparamId + " ]";
    }
    
}
