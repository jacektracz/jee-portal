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
@Table(name = "joo2_viewlevels", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"title"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Viewlevels.findAll", query = "SELECT j FROM Joo2Viewlevels j"),
    @NamedQuery(name = "Joo2Viewlevels.findById", query = "SELECT j FROM Joo2Viewlevels j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Viewlevels.findByTitle", query = "SELECT j FROM Joo2Viewlevels j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Viewlevels.findByOrdering", query = "SELECT j FROM Joo2Viewlevels j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Viewlevels.findByRules", query = "SELECT j FROM Joo2Viewlevels j WHERE j.rules = :rules")})
public class Joo2Viewlevels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5120)
    @Column(name = "rules", nullable = false, length = 5120)
    private String rules;

    public Joo2Viewlevels() {
    }

    public Joo2Viewlevels(Integer id) {
        this.id = id;
    }

    public Joo2Viewlevels(Integer id, String title, int ordering, String rules) {
        this.id = id;
        this.title = title;
        this.ordering = ordering;
        this.rules = rules;
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

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
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
        if (!(object instanceof Joo2Viewlevels)) {
            return false;
        }
        Joo2Viewlevels other = (Joo2Viewlevels) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Viewlevels[ id=" + id + " ]";
    }
    
}
