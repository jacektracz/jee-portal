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
@Table(name = "joo2_phocagallery_votes", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryVotes.findAll", query = "SELECT j FROM Joo2PhocagalleryVotes j"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findById", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByCatid", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByUserid", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByDate", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.date = :date"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByRating", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.rating = :rating"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByPublished", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryVotes.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryVotes j WHERE j.language = :language")})
public class Joo2PhocagalleryVotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private int userid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating", nullable = false)
    private boolean rating;
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
    @Column(name = "params", length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2PhocagalleryVotes() {
    }

    public Joo2PhocagalleryVotes(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryVotes(Integer id, int catid, int userid, Date date, boolean rating, boolean published, int checkedOut, Date checkedOutTime, int ordering, String language) {
        this.id = id;
        this.catid = catid;
        this.userid = userid;
        this.date = date;
        this.rating = rating;
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

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getRating() {
        return rating;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
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
        if (!(object instanceof Joo2PhocagalleryVotes)) {
            return false;
        }
        Joo2PhocagalleryVotes other = (Joo2PhocagalleryVotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryVotes[ id=" + id + " ]";
    }
    
}
