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
@Table(name = "joo2_session", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Session.findAll", query = "SELECT j FROM Joo2Session j"),
    @NamedQuery(name = "Joo2Session.findBySessionId", query = "SELECT j FROM Joo2Session j WHERE j.sessionId = :sessionId"),
    @NamedQuery(name = "Joo2Session.findByClientId", query = "SELECT j FROM Joo2Session j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2Session.findByGuest", query = "SELECT j FROM Joo2Session j WHERE j.guest = :guest"),
    @NamedQuery(name = "Joo2Session.findByTime", query = "SELECT j FROM Joo2Session j WHERE j.time = :time"),
    @NamedQuery(name = "Joo2Session.findByUserid", query = "SELECT j FROM Joo2Session j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2Session.findByUsername", query = "SELECT j FROM Joo2Session j WHERE j.username = :username"),
    @NamedQuery(name = "Joo2Session.findByUsertype", query = "SELECT j FROM Joo2Session j WHERE j.usertype = :usertype")})
public class Joo2Session implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "session_id", nullable = false, length = 200)
    private String sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id", nullable = false)
    private short clientId;
    @Column(name = "guest")
    private Short guest;
    @Size(max = 14)
    @Column(name = "time", length = 14)
    private String time;
    @Lob
    @Size(max = 16777215)
    @Column(name = "data", length = 16777215)
    private String data;
    @Column(name = "userid")
    private Integer userid;
    @Size(max = 150)
    @Column(name = "username", length = 150)
    private String username;
    @Size(max = 50)
    @Column(name = "usertype", length = 50)
    private String usertype;

    public Joo2Session() {
    }

    public Joo2Session(String sessionId) {
        this.sessionId = sessionId;
    }

    public Joo2Session(String sessionId, short clientId) {
        this.sessionId = sessionId;
        this.clientId = clientId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public short getClientId() {
        return clientId;
    }

    public void setClientId(short clientId) {
        this.clientId = clientId;
    }

    public Short getGuest() {
        return guest;
    }

    public void setGuest(Short guest) {
        this.guest = guest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Session)) {
            return false;
        }
        Joo2Session other = (Joo2Session) object;
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Session[ sessionId=" + sessionId + " ]";
    }
    
}
