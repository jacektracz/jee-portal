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
@Table(name = "joo2_virtuemart_manufacturer_medias", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_manufacturer_id", "virtuemart_media_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartManufacturerMedias.findAll", query = "SELECT j FROM Joo2VirtuemartManufacturerMedias j"),
    @NamedQuery(name = "Joo2VirtuemartManufacturerMedias.findById", query = "SELECT j FROM Joo2VirtuemartManufacturerMedias j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartManufacturerMedias.findByVirtuemartManufacturerId", query = "SELECT j FROM Joo2VirtuemartManufacturerMedias j WHERE j.virtuemartManufacturerId = :virtuemartManufacturerId"),
    @NamedQuery(name = "Joo2VirtuemartManufacturerMedias.findByVirtuemartMediaId", query = "SELECT j FROM Joo2VirtuemartManufacturerMedias j WHERE j.virtuemartMediaId = :virtuemartMediaId"),
    @NamedQuery(name = "Joo2VirtuemartManufacturerMedias.findByOrdering", query = "SELECT j FROM Joo2VirtuemartManufacturerMedias j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartManufacturerMedias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_manufacturer_id", nullable = false)
    private int virtuemartManufacturerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_media_id", nullable = false)
    private int virtuemartMediaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2VirtuemartManufacturerMedias() {
    }

    public Joo2VirtuemartManufacturerMedias(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartManufacturerMedias(Long id, int virtuemartManufacturerId, int virtuemartMediaId, int ordering) {
        this.id = id;
        this.virtuemartManufacturerId = virtuemartManufacturerId;
        this.virtuemartMediaId = virtuemartMediaId;
        this.ordering = ordering;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartManufacturerId() {
        return virtuemartManufacturerId;
    }

    public void setVirtuemartManufacturerId(int virtuemartManufacturerId) {
        this.virtuemartManufacturerId = virtuemartManufacturerId;
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
        if (!(object instanceof Joo2VirtuemartManufacturerMedias)) {
            return false;
        }
        Joo2VirtuemartManufacturerMedias other = (Joo2VirtuemartManufacturerMedias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartManufacturerMedias[ id=" + id + " ]";
    }
    
}
