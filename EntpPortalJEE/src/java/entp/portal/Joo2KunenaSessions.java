/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "joo2_kunena_sessions", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaSessions.findAll", query = "SELECT j FROM Joo2KunenaSessions j"),
    @NamedQuery(name = "Joo2KunenaSessions.findByUserid", query = "SELECT j FROM Joo2KunenaSessions j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaSessions.findByLasttime", query = "SELECT j FROM Joo2KunenaSessions j WHERE j.lasttime = :lasttime"),
    @NamedQuery(name = "Joo2KunenaSessions.findByCurrvisit", query = "SELECT j FROM Joo2KunenaSessions j WHERE j.currvisit = :currvisit")})
public class Joo2KunenaSessions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private Integer userid;
    @Lob
    @Size(max = 65535)
    @Column(name = "allowed", length = 65535)
    private String allowed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lasttime", nullable = false)
    private int lasttime;
    @Lob
    @Size(max = 65535)
    @Column(name = "readtopics", length = 65535)
    private String readtopics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currvisit", nullable = false)
    private int currvisit;

    public Joo2KunenaSessions() {
    }

    public Joo2KunenaSessions(Integer userid) {
        this.userid = userid;
    }

    public Joo2KunenaSessions(Integer userid, int lasttime, int currvisit) {
        this.userid = userid;
        this.lasttime = lasttime;
        this.currvisit = currvisit;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAllowed() {
        return allowed;
    }

    public void setAllowed(String allowed) {
        this.allowed = allowed;
    }

    public int getLasttime() {
        return lasttime;
    }

    public void setLasttime(int lasttime) {
        this.lasttime = lasttime;
    }

    public String getReadtopics() {
        return readtopics;
    }

    public void setReadtopics(String readtopics) {
        this.readtopics = readtopics;
    }

    public int getCurrvisit() {
        return currvisit;
    }

    public void setCurrvisit(int currvisit) {
        this.currvisit = currvisit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaSessions)) {
            return false;
        }
        Joo2KunenaSessions other = (Joo2KunenaSessions) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaSessions[ userid=" + userid + " ]";
    }
    
}
