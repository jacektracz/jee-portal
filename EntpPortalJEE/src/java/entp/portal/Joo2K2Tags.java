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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_k2_tags", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Tags.findAll", query = "SELECT j FROM Joo2K2Tags j"),
    @NamedQuery(name = "Joo2K2Tags.findById", query = "SELECT j FROM Joo2K2Tags j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Tags.findByName", query = "SELECT j FROM Joo2K2Tags j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2K2Tags.findByPublished", query = "SELECT j FROM Joo2K2Tags j WHERE j.published = :published")})
public class Joo2K2Tags implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;

    public Joo2K2Tags() {
    }

    public Joo2K2Tags(Integer id) {
        this.id = id;
    }

    public Joo2K2Tags(Integer id, String name, short published) {
        this.id = id;
        this.name = name;
        this.published = published;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
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
        if (!(object instanceof Joo2K2Tags)) {
            return false;
        }
        Joo2K2Tags other = (Joo2K2Tags) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Tags[ id=" + id + " ]";
    }
    
}
