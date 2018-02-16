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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_groups", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaGroups.findAll", query = "SELECT j FROM Joo2KunenaGroups j"),
    @NamedQuery(name = "Joo2KunenaGroups.findById", query = "SELECT j FROM Joo2KunenaGroups j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaGroups.findByTitle", query = "SELECT j FROM Joo2KunenaGroups j WHERE j.title = :title")})
public class Joo2KunenaGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 255)
    @Column(name = "title", length = 255)
    private String title;

    public Joo2KunenaGroups() {
    }

    public Joo2KunenaGroups(Integer id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaGroups)) {
            return false;
        }
        Joo2KunenaGroups other = (Joo2KunenaGroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaGroups[ id=" + id + " ]";
    }
    
}
