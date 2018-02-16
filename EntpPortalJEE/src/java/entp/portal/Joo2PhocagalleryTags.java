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
@Table(name = "joo2_phocagallery_tags", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryTags.findAll", query = "SELECT j FROM Joo2PhocagalleryTags j"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findById", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByTitle", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByAlias", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByLinkCat", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.linkCat = :linkCat"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByLinkExt", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.linkExt = :linkExt"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByPublished", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByCheckedOut", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByCheckedOutTime", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByOrdering", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2PhocagalleryTags.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryTags j WHERE j.language = :language")})
public class Joo2PhocagalleryTags implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "link_cat", nullable = false)
    private int linkCat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "link_ext", nullable = false, length = 255)
    private String linkExt;
    @Lob
    @Size(max = 65535)
    @Column(name = "description", length = 65535)
    private String description;
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

    public Joo2PhocagalleryTags() {
    }

    public Joo2PhocagalleryTags(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryTags(Integer id, String title, String alias, int linkCat, String linkExt, boolean published, int checkedOut, Date checkedOutTime, int ordering, String language) {
        this.id = id;
        this.title = title;
        this.alias = alias;
        this.linkCat = linkCat;
        this.linkExt = linkExt;
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

    public int getLinkCat() {
        return linkCat;
    }

    public void setLinkCat(int linkCat) {
        this.linkCat = linkCat;
    }

    public String getLinkExt() {
        return linkExt;
    }

    public void setLinkExt(String linkExt) {
        this.linkExt = linkExt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Joo2PhocagalleryTags)) {
            return false;
        }
        Joo2PhocagalleryTags other = (Joo2PhocagalleryTags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryTags[ id=" + id + " ]";
    }
    
}
