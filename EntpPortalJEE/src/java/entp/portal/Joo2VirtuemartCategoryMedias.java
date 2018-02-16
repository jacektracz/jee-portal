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
@Table(name = "joo2_virtuemart_category_medias", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_category_id", "virtuemart_media_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCategoryMedias.findAll", query = "SELECT j FROM Joo2VirtuemartCategoryMedias j"),
    @NamedQuery(name = "Joo2VirtuemartCategoryMedias.findById", query = "SELECT j FROM Joo2VirtuemartCategoryMedias j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartCategoryMedias.findByVirtuemartCategoryId", query = "SELECT j FROM Joo2VirtuemartCategoryMedias j WHERE j.virtuemartCategoryId = :virtuemartCategoryId"),
    @NamedQuery(name = "Joo2VirtuemartCategoryMedias.findByVirtuemartMediaId", query = "SELECT j FROM Joo2VirtuemartCategoryMedias j WHERE j.virtuemartMediaId = :virtuemartMediaId"),
    @NamedQuery(name = "Joo2VirtuemartCategoryMedias.findByOrdering", query = "SELECT j FROM Joo2VirtuemartCategoryMedias j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartCategoryMedias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_category_id", nullable = false)
    private int virtuemartCategoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_media_id", nullable = false)
    private int virtuemartMediaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2VirtuemartCategoryMedias() {
    }

    public Joo2VirtuemartCategoryMedias(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartCategoryMedias(Long id, int virtuemartCategoryId, int virtuemartMediaId, int ordering) {
        this.id = id;
        this.virtuemartCategoryId = virtuemartCategoryId;
        this.virtuemartMediaId = virtuemartMediaId;
        this.ordering = ordering;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartCategoryId() {
        return virtuemartCategoryId;
    }

    public void setVirtuemartCategoryId(int virtuemartCategoryId) {
        this.virtuemartCategoryId = virtuemartCategoryId;
    }

    public int getVirtuemartMediaId() {
        return virtuemartMediaId;
    }

    public void setVirtuemartMediaId(int virtuemartMediaId) {
        this.virtuemartMediaId = virtuemartMediaId;
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
        if (!(object instanceof Joo2VirtuemartCategoryMedias)) {
            return false;
        }
        Joo2VirtuemartCategoryMedias other = (Joo2VirtuemartCategoryMedias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCategoryMedias[ id=" + id + " ]";
    }
    
}
