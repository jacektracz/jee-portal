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
@Table(name = "joo2_virtuemart_vendor_medias", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_vendor_id", "virtuemart_media_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartVendorMedias.findAll", query = "SELECT j FROM Joo2VirtuemartVendorMedias j"),
    @NamedQuery(name = "Joo2VirtuemartVendorMedias.findById", query = "SELECT j FROM Joo2VirtuemartVendorMedias j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartVendorMedias.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartVendorMedias j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartVendorMedias.findByVirtuemartMediaId", query = "SELECT j FROM Joo2VirtuemartVendorMedias j WHERE j.virtuemartMediaId = :virtuemartMediaId"),
    @NamedQuery(name = "Joo2VirtuemartVendorMedias.findByOrdering", query = "SELECT j FROM Joo2VirtuemartVendorMedias j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartVendorMedias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_media_id", nullable = false)
    private int virtuemartMediaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2VirtuemartVendorMedias() {
    }

    public Joo2VirtuemartVendorMedias(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartVendorMedias(Long id, int virtuemartVendorId, int virtuemartMediaId, int ordering) {
        this.id = id;
        this.virtuemartVendorId = virtuemartVendorId;
        this.virtuemartMediaId = virtuemartMediaId;
        this.ordering = ordering;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
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
        if (!(object instanceof Joo2VirtuemartVendorMedias)) {
            return false;
        }
        Joo2VirtuemartVendorMedias other = (Joo2VirtuemartVendorMedias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartVendorMedias[ id=" + id + " ]";
    }
    
}
