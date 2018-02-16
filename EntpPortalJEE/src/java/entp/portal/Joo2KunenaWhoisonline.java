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
@Table(name = "joo2_kunena_whoisonline", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaWhoisonline.findAll", query = "SELECT j FROM Joo2KunenaWhoisonline j"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findById", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByUserid", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByTime", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.time = :time"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByItem", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.item = :item"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByWhat", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.what = :what"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByFunc", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.func = :func"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByDo1", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.do1 = :do1"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByTask", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.task = :task"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByUserip", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.userip = :userip"),
    @NamedQuery(name = "Joo2KunenaWhoisonline.findByUser", query = "SELECT j FROM Joo2KunenaWhoisonline j WHERE j.user = :user")})
public class Joo2KunenaWhoisonline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private int userid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "time", nullable = false, length = 14)
    private String time;
    @Column(name = "item")
    private Integer item;
    @Size(max = 255)
    @Column(name = "what", length = 255)
    private String what;
    @Size(max = 50)
    @Column(name = "func", length = 50)
    private String func;
    @Size(max = 50)
    @Column(name = "do", length = 50)
    private String do1;
    @Size(max = 50)
    @Column(name = "task", length = 50)
    private String task;
    @Lob
    @Size(max = 65535)
    @Column(name = "link", length = 65535)
    private String link;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "userip", nullable = false, length = 20)
    private String userip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user", nullable = false)
    private short user;

    public Joo2KunenaWhoisonline() {
    }

    public Joo2KunenaWhoisonline(Integer id) {
        this.id = id;
    }

    public Joo2KunenaWhoisonline(Integer id, int userid, String time, String userip, short user) {
        this.id = id;
        this.userid = userid;
        this.time = time;
        this.userip = userip;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getDo1() {
        return do1;
    }

    public void setDo1(String do1) {
        this.do1 = do1;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public short getUser() {
        return user;
    }

    public void setUser(short user) {
        this.user = user;
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
        if (!(object instanceof Joo2KunenaWhoisonline)) {
            return false;
        }
        Joo2KunenaWhoisonline other = (Joo2KunenaWhoisonline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaWhoisonline[ id=" + id + " ]";
    }
    
}
