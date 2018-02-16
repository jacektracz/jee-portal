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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_menu_types", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"menutype"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2MenuTypes.findAll", query = "SELECT j FROM Joo2MenuTypes j"),
    @NamedQuery(name = "Joo2MenuTypes.findById", query = "SELECT j FROM Joo2MenuTypes j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2MenuTypes.findByMenutype", query = "SELECT j FROM Joo2MenuTypes j WHERE j.menutype = :menutype"),
    @NamedQuery(name = "Joo2MenuTypes.findByTitle", query = "SELECT j FROM Joo2MenuTypes j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2MenuTypes.findByDescription", query = "SELECT j FROM Joo2MenuTypes j WHERE j.description = :description")})
public class Joo2MenuTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "menutype", nullable = false, length = 24)
    private String menutype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 48)
    @Column(name = "title", nullable = false, length = 48)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    public Joo2MenuTypes() {
    }

    public Joo2MenuTypes(Integer id) {
        this.id = id;
    }

    public Joo2MenuTypes(Integer id, String menutype, String title, String description) {
        this.id = id;
        this.menutype = menutype;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Joo2MenuTypes)) {
            return false;
        }
        Joo2MenuTypes other = (Joo2MenuTypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2MenuTypes[ id=" + id + " ]";
    }
    
}
