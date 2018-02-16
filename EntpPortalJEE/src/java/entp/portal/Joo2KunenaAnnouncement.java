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
@Table(name = "joo2_kunena_announcement", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaAnnouncement.findAll", query = "SELECT j FROM Joo2KunenaAnnouncement j"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findById", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findByTitle", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findByCreated", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findByPublished", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findByOrdering", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2KunenaAnnouncement.findByShowdate", query = "SELECT j FROM Joo2KunenaAnnouncement j WHERE j.showdate = :showdate")})
public class Joo2KunenaAnnouncement implements Serializable {
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "sdescription", nullable = false, length = 65535)
    private String sdescription;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private short ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "showdate", nullable = false)
    private boolean showdate;

    public Joo2KunenaAnnouncement() {
    }

    public Joo2KunenaAnnouncement(Integer id) {
        this.id = id;
    }

    public Joo2KunenaAnnouncement(Integer id, String title, String sdescription, String description, Date created, boolean published, short ordering, boolean showdate) {
        this.id = id;
        this.title = title;
        this.sdescription = sdescription;
        this.description = description;
        this.created = created;
        this.published = published;
        this.ordering = ordering;
        this.showdate = showdate;
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

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public short getOrdering() {
        return ordering;
    }

    public void setOrdering(short ordering) {
        this.ordering = ordering;
    }

    public boolean getShowdate() {
        return showdate;
    }

    public void setShowdate(boolean showdate) {
        this.showdate = showdate;
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
        if (!(object instanceof Joo2KunenaAnnouncement)) {
            return false;
        }
        Joo2KunenaAnnouncement other = (Joo2KunenaAnnouncement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaAnnouncement[ id=" + id + " ]";
    }
    
}
