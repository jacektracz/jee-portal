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
@Table(name = "joo2_phocagallery_comments", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryComments.findAll", query = "SELECT j FROM Joo2PhocagalleryComments j"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findById", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByCatid", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByUserid", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByDate", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.date = :date"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByTitle", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByAlias", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByPublished", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryComments.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryComments j WHERE j.language = :language")})
public class Joo2PhocagalleryComments implements Serializable {
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
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Lob
    @Size(max = 65535)
    @Column(name = "comment", length = 65535)
    private String comment;
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

    public Joo2PhocagalleryComments() {
    }

    public Joo2PhocagalleryComments(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryComments(Integer id, int catid, int userid, Date date, String title, String alias, boolean published, int checkedOut, Date checkedOutTime, int ordering, String language) {
        this.id = id;
        this.catid = catid;
        this.userid = userid;
        this.date = date;
        this.title = title;
        this.alias = alias;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        if (!(object instanceof Joo2PhocagalleryComments)) {
            return false;
        }
        Joo2PhocagalleryComments other = (Joo2PhocagalleryComments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryComments[ id=" + id + " ]";
    }
    
}
