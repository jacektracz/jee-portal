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
@Table(name = "joo2_virtuemart_product_relations", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_product_id", "related_products"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartProductRelations.findAll", query = "SELECT j FROM Joo2VirtuemartProductRelations j"),
    @NamedQuery(name = "Joo2VirtuemartProductRelations.findById", query = "SELECT j FROM Joo2VirtuemartProductRelations j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartProductRelations.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartProductRelations j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartProductRelations.findByRelatedProducts", query = "SELECT j FROM Joo2VirtuemartProductRelations j WHERE j.relatedProducts = :relatedProducts")})
public class Joo2VirtuemartProductRelations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Column(name = "related_products")
    private Integer relatedProducts;

    public Joo2VirtuemartProductRelations() {
    }

    public Joo2VirtuemartProductRelations(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartProductRelations(Long id, int virtuemartProductId) {
        this.id = id;
        this.virtuemartProductId = virtuemartProductId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public Integer getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(Integer relatedProducts) {
        this.relatedProducts = relatedProducts;
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
        if (!(object instanceof Joo2VirtuemartProductRelations)) {
            return false;
        }
        Joo2VirtuemartProductRelations other = (Joo2VirtuemartProductRelations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartProductRelations[ id=" + id + " ]";
    }
    
}
