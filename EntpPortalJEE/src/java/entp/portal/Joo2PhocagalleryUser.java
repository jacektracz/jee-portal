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
@Table(name = "joo2_phocagallery_user", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryUser.findAll", query = "SELECT j FROM Joo2PhocagalleryUser j"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findById", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByUserid", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByAvatar", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.avatar = :avatar"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByPublished", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByApproved", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.approved = :approved"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryUser.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryUser j WHERE j.language = :language")})
public class Joo2PhocagalleryUser implements Serializable {
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
    @Size(min = 1, max = 40)
    @Column(name = "avatar", nullable = false, length = 40)
    private String avatar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approved", nullable = false)
    private boolean approved;
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
    @Column(name = "params", length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2PhocagalleryUser() {
    }

    public Joo2PhocagalleryUser(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryUser(Integer id, int userid, String avatar, boolean published, boolean approved, int checkedOut, Date checkedOutTime, int ordering, String language) {
        this.id = id;
        this.userid = userid;
        this.avatar = avatar;
        this.published = published;
        this.approved = approved;
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
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
        if (!(object instanceof Joo2PhocagalleryUser)) {
            return false;
        }
        Joo2PhocagalleryUser other = (Joo2PhocagalleryUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryUser[ id=" + id + " ]";
    }
    
}
