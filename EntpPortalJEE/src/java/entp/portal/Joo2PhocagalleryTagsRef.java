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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_phocagallery_tags_ref", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"imgid", "tagid"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryTagsRef.findAll", query = "SELECT j FROM Joo2PhocagalleryTagsRef j"),
    @NamedQuery(name = "Joo2PhocagalleryTagsRef.findById", query = "SELECT j FROM Joo2PhocagalleryTagsRef j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryTagsRef.findByImgid", query = "SELECT j FROM Joo2PhocagalleryTagsRef j WHERE j.imgid = :imgid"),
    @NamedQuery(name = "Joo2PhocagalleryTagsRef.findByTagid", query = "SELECT j FROM Joo2PhocagalleryTagsRef j WHERE j.tagid = :tagid")})
public class Joo2PhocagalleryTagsRef implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "imgid", nullable = false)
    private int imgid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tagid", nullable = false)
    private int tagid;

    public Joo2PhocagalleryTagsRef() {
    }

    public Joo2PhocagalleryTagsRef(Long id) {
        this.id = id;
    }

    public Joo2PhocagalleryTagsRef(Long id, int imgid, int tagid) {
        this.id = id;
        this.imgid = imgid;
        this.tagid = tagid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
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
        if (!(object instanceof Joo2PhocagalleryTagsRef)) {
            return false;
        }
        Joo2PhocagalleryTagsRef other = (Joo2PhocagalleryTagsRef) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryTagsRef[ id=" + id + " ]";
    }
    
}
