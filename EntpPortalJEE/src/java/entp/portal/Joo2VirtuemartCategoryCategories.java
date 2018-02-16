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
@Table(name = "joo2_virtuemart_category_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"category_parent_id", "category_child_id"}),
    @UniqueConstraint(columnNames = {"id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCategoryCategories.findAll", query = "SELECT j FROM Joo2VirtuemartCategoryCategories j"),
    @NamedQuery(name = "Joo2VirtuemartCategoryCategories.findById", query = "SELECT j FROM Joo2VirtuemartCategoryCategories j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartCategoryCategories.findByCategoryParentId", query = "SELECT j FROM Joo2VirtuemartCategoryCategories j WHERE j.categoryParentId = :categoryParentId"),
    @NamedQuery(name = "Joo2VirtuemartCategoryCategories.findByCategoryChildId", query = "SELECT j FROM Joo2VirtuemartCategoryCategories j WHERE j.categoryChildId = :categoryChildId"),
    @NamedQuery(name = "Joo2VirtuemartCategoryCategories.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCategoryCategories j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartCategoryCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_parent_id", nullable = false)
    private int categoryParentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_child_id", nullable = false)
    private int categoryChildId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2VirtuemartCategoryCategories() {
    }

    public Joo2VirtuemartCategoryCategories(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartCategoryCategories(Long id, int categoryParentId, int categoryChildId, int ordering) {
        this.id = id;
        this.categoryParentId = categoryParentId;
        this.categoryChildId = categoryChildId;
        this.ordering = ordering;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(int categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public int getCategoryChildId() {
        return categoryChildId;
    }

    public void setCategoryChildId(int categoryChildId) {
        this.categoryChildId = categoryChildId;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        if (!(object instanceof Joo2VirtuemartCategoryCategories)) {
            return false;
        }
        Joo2VirtuemartCategoryCategories other = (Joo2VirtuemartCategoryCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCategoryCategories[ id=" + id + " ]";
    }
    
}
