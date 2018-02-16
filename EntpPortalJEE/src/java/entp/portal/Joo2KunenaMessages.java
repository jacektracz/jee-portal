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
@Table(name = "joo2_kunena_messages", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaMessages.findAll", query = "SELECT j FROM Joo2KunenaMessages j"),
    @NamedQuery(name = "Joo2KunenaMessages.findById", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaMessages.findByParent", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.parent = :parent"),
    @NamedQuery(name = "Joo2KunenaMessages.findByThread", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.thread = :thread"),
    @NamedQuery(name = "Joo2KunenaMessages.findByCatid", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2KunenaMessages.findByName", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2KunenaMessages.findByUserid", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaMessages.findByEmail", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.email = :email"),
    @NamedQuery(name = "Joo2KunenaMessages.findBySubject", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.subject = :subject"),
    @NamedQuery(name = "Joo2KunenaMessages.findByTime", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.time = :time"),
    @NamedQuery(name = "Joo2KunenaMessages.findByIp", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.ip = :ip"),
    @NamedQuery(name = "Joo2KunenaMessages.findByTopicEmoticon", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.topicEmoticon = :topicEmoticon"),
    @NamedQuery(name = "Joo2KunenaMessages.findByLocked", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.locked = :locked"),
    @NamedQuery(name = "Joo2KunenaMessages.findByHold", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.hold = :hold"),
    @NamedQuery(name = "Joo2KunenaMessages.findByOrdering", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2KunenaMessages.findByHits", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2KunenaMessages.findByMoved", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.moved = :moved"),
    @NamedQuery(name = "Joo2KunenaMessages.findByModifiedBy", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2KunenaMessages.findByModifiedTime", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.modifiedTime = :modifiedTime"),
    @NamedQuery(name = "Joo2KunenaMessages.findByModifiedReason", query = "SELECT j FROM Joo2KunenaMessages j WHERE j.modifiedReason = :modifiedReason")})
public class Joo2KunenaMessages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "parent")
    private Integer parent;
    @Column(name = "thread")
    private Integer thread;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Size(max = 255)
    @Column(name = "name", length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private int userid;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email", length = 255)
    private String email;
    @Size(max = 255)
    @Column(name = "subject", length = 255)
    private String subject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time", nullable = false)
    private int time;
    @Size(max = 15)
    @Column(name = "ip", length = 15)
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "topic_emoticon", nullable = false)
    private int topicEmoticon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked", nullable = false)
    private short locked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hold", nullable = false)
    private short hold;
    @Column(name = "ordering")
    private Integer ordering;
    @Column(name = "hits")
    private Integer hits;
    @Column(name = "moved")
    private Short moved;
    @Column(name = "modified_by")
    private Integer modifiedBy;
    @Column(name = "modified_time")
    private Integer modifiedTime;
    @Size(max = 255)
    @Column(name = "modified_reason", length = 255)
    private String modifiedReason;

    public Joo2KunenaMessages() {
    }

    public Joo2KunenaMessages(Integer id) {
        this.id = id;
    }

    public Joo2KunenaMessages(Integer id, int catid, int userid, int time, int topicEmoticon, short locked, short hold) {
        this.id = id;
        this.catid = catid;
        this.userid = userid;
        this.time = time;
        this.topicEmoticon = topicEmoticon;
        this.locked = locked;
        this.hold = hold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getThread() {
        return thread;
    }

    public void setThread(Integer thread) {
        this.thread = thread;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTopicEmoticon() {
        return topicEmoticon;
    }

    public void setTopicEmoticon(int topicEmoticon) {
        this.topicEmoticon = topicEmoticon;
    }

    public short getLocked() {
        return locked;
    }

    public void setLocked(short locked) {
        this.locked = locked;
    }

    public short getHold() {
        return hold;
    }

    public void setHold(short hold) {
        this.hold = hold;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Short getMoved() {
        return moved;
    }

    public void setMoved(Short moved) {
        this.moved = moved;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Integer modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedReason() {
        return modifiedReason;
    }

    public void setModifiedReason(String modifiedReason) {
        this.modifiedReason = modifiedReason;
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
        if (!(object instanceof Joo2KunenaMessages)) {
            return false;
        }
        Joo2KunenaMessages other = (Joo2KunenaMessages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaMessages[ id=" + id + " ]";
    }
    
}
