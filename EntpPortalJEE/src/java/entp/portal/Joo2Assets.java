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
@Table(name = "joo2_assets", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Assets.findAll", query = "SELECT j FROM Joo2Assets j"),
    @NamedQuery(name = "Joo2Assets.findById", query = "SELECT j FROM Joo2Assets j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Assets.findByParentId", query = "SELECT j FROM Joo2Assets j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2Assets.findByLft", query = "SELECT j FROM Joo2Assets j WHERE j.lft = :lft"),
    @NamedQuery(name = "Joo2Assets.findByRgt", query = "SELECT j FROM Joo2Assets j WHERE j.rgt = :rgt"),
    @NamedQuery(name = "Joo2Assets.findByLevel", query = "SELECT j FROM Joo2Assets j WHERE j.level = :level"),
    @NamedQuery(name = "Joo2Assets.findByName", query = "SELECT j FROM Joo2Assets j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Assets.findByTitle", query = "SELECT j FROM Joo2Assets j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Assets.findByRules", query = "SELECT j FROM Joo2Assets j WHERE j.rules = :rules")})
public class Joo2Assets implements Serializable {
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
    @Column(name = "level", nullable = false)
    private int level;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5120)
    @Column(name = "rules", nullable = false, length = 5120)
    private String rules;

    public Joo2Assets() {
    }

    public Joo2Assets(Integer id) {
        this.id = id;
    }

    public Joo2Assets(Integer id, int parentId, int lft, int rgt, int level, String name, String title, String rules) {
        this.id = id;
        this.parentId = parentId;
        this.lft = lft;
        this.rgt = rgt;
        this.level = level;
        this.name = name;
        this.title = title;
        this.rules = rules;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(object instanceof Joo2Assets)) {
            return false;
        }
        Joo2Assets other = (Joo2Assets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Assets[ id=" + id + " ]";
    }
    
}
