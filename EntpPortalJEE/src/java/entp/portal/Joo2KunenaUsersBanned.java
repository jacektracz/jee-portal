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
@Table(name = "joo2_kunena_users_banned", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaUsersBanned.findAll", query = "SELECT j FROM Joo2KunenaUsersBanned j"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findById", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByUserid", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByIp", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.ip = :ip"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByBlocked", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.blocked = :blocked"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByExpiration", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.expiration = :expiration"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByCreatedBy", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByCreatedTime", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.createdTime = :createdTime"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByModifiedBy", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2KunenaUsersBanned.findByModifiedTime", query = "SELECT j FROM Joo2KunenaUsersBanned j WHERE j.modifiedTime = :modifiedTime")})
public class Joo2KunenaUsersBanned implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "userid")
    private Integer userid;
    @Size(max = 128)
    @Column(name = "ip", length = 128)
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blocked", nullable = false)
    private short blocked;
    @Column(name = "expiration")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by", nullable = false)
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Lob
    @Size(max = 65535)
    @Column(name = "reason_private", length = 65535)
    private String reasonPrivate;
    @Lob
    @Size(max = 65535)
    @Column(name = "reason_public", length = 65535)
    private String reasonPublic;
    @Column(name = "modified_by")
    private Integer modifiedBy;
    @Column(name = "modified_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments", length = 65535)
    private String comments;
    @Lob
    @Size(max = 65535)
    @Column(name = "params", length = 65535)
    private String params;

    public Joo2KunenaUsersBanned() {
    }

    public Joo2KunenaUsersBanned(Integer id) {
        this.id = id;
    }

    public Joo2KunenaUsersBanned(Integer id, short blocked, int createdBy, Date createdTime) {
        this.id = id;
        this.blocked = blocked;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public short getBlocked() {
        return blocked;
    }

    public void setBlocked(short blocked) {
        this.blocked = blocked;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getReasonPrivate() {
        return reasonPrivate;
    }

    public void setReasonPrivate(String reasonPrivate) {
        this.reasonPrivate = reasonPrivate;
    }

    public String getReasonPublic() {
        return reasonPublic;
    }

    public void setReasonPublic(String reasonPublic) {
        this.reasonPublic = reasonPublic;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaUsersBanned)) {
            return false;
        }
        Joo2KunenaUsersBanned other = (Joo2KunenaUsersBanned) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaUsersBanned[ id=" + id + " ]";
    }
    
}
