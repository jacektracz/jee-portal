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
@Table(name = "joo2_usergroups", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"parent_id", "title"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Usergroups.findAll", query = "SELECT j FROM Joo2Usergroups j"),
    @NamedQuery(name = "Joo2Usergroups.findById", query = "SELECT j FROM Joo2Usergroups j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Usergroups.findByParentId", query = "SELECT j FROM Joo2Usergroups j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2Usergroups.findByLft", query = "SELECT j FROM Joo2Usergroups j WHERE j.lft = :lft"),
    @NamedQuery(name = "Joo2Usergroups.findByRgt", query = "SELECT j FROM Joo2Usergroups j WHERE j.rgt = :rgt"),
    @NamedQuery(name = "Joo2Usergroups.findByTitle", query = "SELECT j FROM Joo2Usergroups j WHERE j.title = :title")})
public class Joo2Usergroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id", nullable = false)
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lft", nullable = false)
    private int lft;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rgt", nullable = false)
    private int rgt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    public Joo2Usergroups() {
    }

    public Joo2Usergroups(Integer id) {
        this.id = id;
    }

    public Joo2Usergroups(Integer id, int parentId, int lft, int rgt, String title) {
        this.id = id;
        this.parentId = parentId;
        this.lft = lft;
        this.rgt = rgt;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
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
        if (!(object instanceof Joo2Usergroups)) {
            return false;
        }
        Joo2Usergroups other = (Joo2Usergroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Usergroups[ id=" + id + " ]";
    }
    
}
