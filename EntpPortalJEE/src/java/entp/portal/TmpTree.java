/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tmp_tree", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TmpTree.findAll", query = "SELECT t FROM TmpTree t"),
    @NamedQuery(name = "TmpTree.findById", query = "SELECT t FROM TmpTree t WHERE t.id = :id"),
    @NamedQuery(name = "TmpTree.findByParentId", query = "SELECT t FROM TmpTree t WHERE t.parentId = :parentId"),
    @NamedQuery(name = "TmpTree.findByLft", query = "SELECT t FROM TmpTree t WHERE t.lft = :lft"),
    @NamedQuery(name = "TmpTree.findByRgt", query = "SELECT t FROM TmpTree t WHERE t.rgt = :rgt")})
public class TmpTree implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "id", nullable = false, length = 36)
    private String id;
    @Size(max = 36)
    @Column(name = "parent_id", length = 36)
    private String parentId;
    @Column(name = "lft")
    private Integer lft;
    @Column(name = "rgt")
    private Integer rgt;

    public TmpTree() {
    }

    public TmpTree(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
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
        if (!(object instanceof TmpTree)) {
            return false;
        }
        TmpTree other = (TmpTree) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.TmpTree[ id=" + id + " ]";
    }
    
}
