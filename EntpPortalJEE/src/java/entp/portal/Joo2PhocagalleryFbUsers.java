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
@Table(name = "joo2_phocagallery_fb_users", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findAll", query = "SELECT j FROM Joo2PhocagalleryFbUsers j"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findById", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByAppid", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.appid = :appid"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByAppsid", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.appsid = :appsid"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByUid", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.uid = :uid"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByName", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByLink", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.link = :link"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findBySecret", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.secret = :secret"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByBaseDomain", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.baseDomain = :baseDomain"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByExpires", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.expires = :expires"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByFanpageid", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.fanpageid = :fanpageid"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByPublished", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryFbUsers.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryFbUsers j WHERE j.language = :language")})
public class Joo2PhocagalleryFbUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "appid", nullable = false, length = 255)
    private String appid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "appsid", nullable = false, length = 255)
    private String appsid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "uid", nullable = false, length = 255)
    private String uid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "link", nullable = false, length = 255)
    private String link;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "secret", nullable = false, length = 255)
    private String secret;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "base_domain", nullable = false, length = 255)
    private String baseDomain;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "expires", nullable = false, length = 100)
    private String expires;
    @Lob
    @Size(max = 65535)
    @Column(name = "session_key", length = 65535)
    private String sessionKey;
    @Lob
    @Size(max = 65535)
    @Column(name = "access_token", length = 65535)
    private String accessToken;
    @Lob
    @Size(max = 65535)
    @Column(name = "sig", length = 65535)
    private String sig;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "fanpageid", nullable = false, length = 255)
    private String fanpageid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments", length = 65535)
    private String comments;
    @Lob
    @Size(max = 65535)
    @Column(name = "params", length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2PhocagalleryFbUsers() {
    }

    public Joo2PhocagalleryFbUsers(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryFbUsers(Integer id, String appid, String appsid, String uid, String name, String link, String secret, String baseDomain, String expires, String fanpageid, boolean published, int checkedOut, Date checkedOutTime, int ordering, String language) {
        this.id = id;
        this.appid = appid;
        this.appsid = appsid;
        this.uid = uid;
        this.name = name;
        this.link = link;
        this.secret = secret;
        this.baseDomain = baseDomain;
        this.expires = expires;
        this.fanpageid = fanpageid;
        this.published = published;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsid() {
        return appsid;
    }

    public void setAppsid(String appsid) {
        this.appsid = appsid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getBaseDomain() {
        return baseDomain;
    }

    public void setBaseDomain(String baseDomain) {
        this.baseDomain = baseDomain;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getFanpageid() {
        return fanpageid;
    }

    public void setFanpageid(String fanpageid) {
        this.fanpageid = fanpageid;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        if (!(object instanceof Joo2PhocagalleryFbUsers)) {
            return false;
        }
        Joo2PhocagalleryFbUsers other = (Joo2PhocagalleryFbUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryFbUsers[ id=" + id + " ]";
    }
    
}
