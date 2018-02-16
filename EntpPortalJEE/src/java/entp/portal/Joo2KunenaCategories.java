/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_categories", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaCategories.findAll", query = "SELECT j FROM Joo2KunenaCategories j"),
    @NamedQuery(name = "Joo2KunenaCategories.findById", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaCategories.findByParent", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.parent = :parent"),
    @NamedQuery(name = "Joo2KunenaCategories.findByName", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2KunenaCategories.findByCatEmoticon", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.catEmoticon = :catEmoticon"),
    @NamedQuery(name = "Joo2KunenaCategories.findByLocked", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.locked = :locked"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAlertAdmin", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.alertAdmin = :alertAdmin"),
    @NamedQuery(name = "Joo2KunenaCategories.findByModerated", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.moderated = :moderated"),
    @NamedQuery(name = "Joo2KunenaCategories.findByModerators", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.moderators = :moderators"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAccesstype", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.accesstype = :accesstype"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAccess", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2KunenaCategories.findByPubAccess", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.pubAccess = :pubAccess"),
    @NamedQuery(name = "Joo2KunenaCategories.findByPubRecurse", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.pubRecurse = :pubRecurse"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAdminAccess", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.adminAccess = :adminAccess"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAdminRecurse", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.adminRecurse = :adminRecurse"),
    @NamedQuery(name = "Joo2KunenaCategories.findByOrdering", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2KunenaCategories.findByFuture2", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.future2 = :future2"),
    @NamedQuery(name = "Joo2KunenaCategories.findByPublished", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2KunenaCategories.findByCheckedOut", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2KunenaCategories.findByCheckedOutTime", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2KunenaCategories.findByReview", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.review = :review"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAllowAnonymous", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.allowAnonymous = :allowAnonymous"),
    @NamedQuery(name = "Joo2KunenaCategories.findByPostAnonymous", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.postAnonymous = :postAnonymous"),
    @NamedQuery(name = "Joo2KunenaCategories.findByHits", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2KunenaCategories.findByClassSfx", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.classSfx = :classSfx"),
    @NamedQuery(name = "Joo2KunenaCategories.findByAllowPolls", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.allowPolls = :allowPolls"),
    @NamedQuery(name = "Joo2KunenaCategories.findByIdLastMsg", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.idLastMsg = :idLastMsg"),
    @NamedQuery(name = "Joo2KunenaCategories.findByNumTopics", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.numTopics = :numTopics"),
    @NamedQuery(name = "Joo2KunenaCategories.findByNumPosts", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.numPosts = :numPosts"),
    @NamedQuery(name = "Joo2KunenaCategories.findByTimeLastMsg", query = "SELECT j FROM Joo2KunenaCategories j WHERE j.timeLastMsg = :timeLastMsg")})
public class Joo2KunenaCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "parent")
    private Integer parent;
    @Size(max = 255)
    @Column(name = "name", length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_emoticon", nullable = false)
    private short catEmoticon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked", nullable = false)
    private short locked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alert_admin", nullable = false)
    private short alertAdmin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moderated", nullable = false)
    private short moderated;
    @Size(max = 15)
    @Column(name = "moderators", length = 15)
    private String moderators;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "accesstype", nullable = false, length = 20)
    private String accesstype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access", nullable = false)
    private int access;
    @Column(name = "pub_access")
    private Short pubAccess;
    @Column(name = "pub_recurse")
    private Short pubRecurse;
    @Column(name = "admin_access")
    private Short adminAccess;
    @Column(name = "admin_recurse")
    private Short adminRecurse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private short ordering;
    @Column(name = "future2")
    private Integer future2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private short checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "review", nullable = false)
    private short review;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allow_anonymous", nullable = false)
    private short allowAnonymous;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_anonymous", nullable = false)
    private short postAnonymous;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "headerdesc", nullable = false, length = 65535)
    private String headerdesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "class_sfx", nullable = false, length = 20)
    private String classSfx;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allow_polls", nullable = false)
    private short allowPolls;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_last_msg", nullable = false)
    private int idLastMsg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numTopics", nullable = false)
    private int numTopics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numPosts", nullable = false)
    private int numPosts;
    @Column(name = "time_last_msg")
    private Integer timeLastMsg;

    public Joo2KunenaCategories() {
    }

    public Joo2KunenaCategories(Integer id) {
        this.id = id;
    }

    public Joo2KunenaCategories(Integer id, short catEmoticon, short locked, short alertAdmin, short moderated, String accesstype, int access, short ordering, short published, short checkedOut, Date checkedOutTime, short review, short allowAnonymous, short postAnonymous, int hits, String description, String headerdesc, String classSfx, short allowPolls, int idLastMsg, int numTopics, int numPosts) {
        this.id = id;
        this.catEmoticon = catEmoticon;
        this.locked = locked;
        this.alertAdmin = alertAdmin;
        this.moderated = moderated;
        this.accesstype = accesstype;
        this.access = access;
        this.ordering = ordering;
        this.published = published;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.review = review;
        this.allowAnonymous = allowAnonymous;
        this.postAnonymous = postAnonymous;
        this.hits = hits;
        this.description = description;
        this.headerdesc = headerdesc;
        this.classSfx = classSfx;
        this.allowPolls = allowPolls;
        this.idLastMsg = idLastMsg;
        this.numTopics = numTopics;
        this.numPosts = numPosts;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCatEmoticon() {
        return catEmoticon;
    }

    public void setCatEmoticon(short catEmoticon) {
        this.catEmoticon = catEmoticon;
    }

    public short getLocked() {
        return locked;
    }

    public void setLocked(short locked) {
        this.locked = locked;
    }

    public short getAlertAdmin() {
        return alertAdmin;
    }

    public void setAlertAdmin(short alertAdmin) {
        this.alertAdmin = alertAdmin;
    }

    public short getModerated() {
        return moderated;
    }

    public void setModerated(short moderated) {
        this.moderated = moderated;
    }

    public String getModerators() {
        return moderators;
    }

    public void setModerators(String moderators) {
        this.moderators = moderators;
    }

    public String getAccesstype() {
        return accesstype;
    }

    public void setAccesstype(String accesstype) {
        this.accesstype = accesstype;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public Short getPubAccess() {
        return pubAccess;
    }

    public void setPubAccess(Short pubAccess) {
        this.pubAccess = pubAccess;
    }

    public Short getPubRecurse() {
        return pubRecurse;
    }

    public void setPubRecurse(Short pubRecurse) {
        this.pubRecurse = pubRecurse;
    }

    public Short getAdminAccess() {
        return adminAccess;
    }

    public void setAdminAccess(Short adminAccess) {
        this.adminAccess = adminAccess;
    }

    public Short getAdminRecurse() {
        return adminRecurse;
    }

    public void setAdminRecurse(Short adminRecurse) {
        this.adminRecurse = adminRecurse;
    }

    public short getOrdering() {
        return ordering;
    }

    public void setOrdering(short ordering) {
        this.ordering = ordering;
    }

    public Integer getFuture2() {
        return future2;
    }

    public void setFuture2(Integer future2) {
        this.future2 = future2;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public short getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(short checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public short getReview() {
        return review;
    }

    public void setReview(short review) {
        this.review = review;
    }

    public short getAllowAnonymous() {
        return allowAnonymous;
    }

    public void setAllowAnonymous(short allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
    }

    public short getPostAnonymous() {
        return postAnonymous;
    }

    public void setPostAnonymous(short postAnonymous) {
        this.postAnonymous = postAnonymous;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeaderdesc() {
        return headerdesc;
    }

    public void setHeaderdesc(String headerdesc) {
        this.headerdesc = headerdesc;
    }

    public String getClassSfx() {
        return classSfx;
    }

    public void setClassSfx(String classSfx) {
        this.classSfx = classSfx;
    }

    public short getAllowPolls() {
        return allowPolls;
    }

    public void setAllowPolls(short allowPolls) {
        this.allowPolls = allowPolls;
    }

    public int getIdLastMsg() {
        return idLastMsg;
    }

    public void setIdLastMsg(int idLastMsg) {
        this.idLastMsg = idLastMsg;
    }

    public int getNumTopics() {
        return numTopics;
    }

    public void setNumTopics(int numTopics) {
        this.numTopics = numTopics;
    }

    public int getNumPosts() {
        return numPosts;
    }

    public void setNumPosts(int numPosts) {
        this.numPosts = numPosts;
    }

    public Integer getTimeLastMsg() {
        return timeLastMsg;
    }

    public void setTimeLastMsg(Integer timeLastMsg) {
        this.timeLastMsg = timeLastMsg;
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
        if (!(object instanceof Joo2KunenaCategories)) {
            return false;
        }
        Joo2KunenaCategories other = (Joo2KunenaCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaCategories[ id=" + id + " ]";
    }
    
}
