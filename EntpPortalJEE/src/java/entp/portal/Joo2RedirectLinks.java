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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_redirect_links", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"old_url"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2RedirectLinks.findAll", query = "SELECT j FROM Joo2RedirectLinks j"),
    @NamedQuery(name = "Joo2RedirectLinks.findById", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2RedirectLinks.findByOldUrl", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.oldUrl = :oldUrl"),
    @NamedQuery(name = "Joo2RedirectLinks.findByNewUrl", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.newUrl = :newUrl"),
    @NamedQuery(name = "Joo2RedirectLinks.findByReferer", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.referer = :referer"),
    @NamedQuery(name = "Joo2RedirectLinks.findByComment", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.comment = :comment"),
    @NamedQuery(name = "Joo2RedirectLinks.findByPublished", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2RedirectLinks.findByCreatedDate", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.createdDate = :createdDate"),
    @NamedQuery(name = "Joo2RedirectLinks.findByModifiedDate", query = "SELECT j FROM Joo2RedirectLinks j WHERE j.modifiedDate = :modifiedDate")})
public class Joo2RedirectLinks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 255)
    @Column(name = "old_url", length = 255)
    private String oldUrl;
    @Size(max = 255)
    @Column(name = "new_url", length = 255)
    private String newUrl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "referer", nullable = false, length = 150)
    private String referer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "comment", nullable = false, length = 255)
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Joo2RedirectLinks() {
    }

    public Joo2RedirectLinks(Integer id) {
        this.id = id;
    }

    public Joo2RedirectLinks(Integer id, String referer, String comment, short published, Date createdDate, Date modifiedDate) {
        this.id = id;
        this.referer = referer;
        this.comment = comment;
        this.published = published;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldUrl() {
        return oldUrl;
    }

    public void setOldUrl(String oldUrl) {
        this.oldUrl = oldUrl;
    }

    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
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
        if (!(object instanceof Joo2RedirectLinks)) {
            return false;
        }
        Joo2RedirectLinks other = (Joo2RedirectLinks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2RedirectLinks[ id=" + id + " ]";
    }
    
}
