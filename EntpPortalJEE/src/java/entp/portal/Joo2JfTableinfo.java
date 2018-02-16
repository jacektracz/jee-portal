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
@Table(name = "joo2_jf_tableinfo", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2JfTableinfo.findAll", query = "SELECT j FROM Joo2JfTableinfo j"),
    @NamedQuery(name = "Joo2JfTableinfo.findById", query = "SELECT j FROM Joo2JfTableinfo j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2JfTableinfo.findByJoomlatablename", query = "SELECT j FROM Joo2JfTableinfo j WHERE j.joomlatablename = :joomlatablename"),
    @NamedQuery(name = "Joo2JfTableinfo.findByTablepkID", query = "SELECT j FROM Joo2JfTableinfo j WHERE j.tablepkID = :tablepkID")})
public class Joo2JfTableinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "joomlatablename", nullable = false, length = 100)
    private String joomlatablename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tablepkID", nullable = false, length = 100)
    private String tablepkID;

    public Joo2JfTableinfo() {
    }

    public Joo2JfTableinfo(Integer id) {
        this.id = id;
    }

    public Joo2JfTableinfo(Integer id, String joomlatablename, String tablepkID) {
        this.id = id;
        this.joomlatablename = joomlatablename;
        this.tablepkID = tablepkID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJoomlatablename() {
        return joomlatablename;
    }

    public void setJoomlatablename(String joomlatablename) {
        this.joomlatablename = joomlatablename;
    }

    public String getTablepkID() {
        return tablepkID;
    }

    public void setTablepkID(String tablepkID) {
        this.tablepkID = tablepkID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2JfTableinfo)) {
            return false;
        }
        Joo2JfTableinfo other = (Joo2JfTableinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2JfTableinfo[ id=" + id + " ]";
    }
    
}
