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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_migration_oldtonew_ids", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartMigrationOldtonewIds.findAll", query = "SELECT j FROM Joo2VirtuemartMigrationOldtonewIds j"),
    @NamedQuery(name = "Joo2VirtuemartMigrationOldtonewIds.findById", query = "SELECT j FROM Joo2VirtuemartMigrationOldtonewIds j WHERE j.id = :id")})
public class Joo2VirtuemartMigrationOldtonewIds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;
    @Lob
    @Column(name = "cats")
    private byte[] cats;
    @Lob
    @Column(name = "catsxref")
    private byte[] catsxref;
    @Lob
    @Column(name = "manus")
    private byte[] manus;
    @Lob
    @Column(name = "mfcats")
    private byte[] mfcats;
    @Lob
    @Column(name = "shoppergroups")
    private byte[] shoppergroups;
    @Lob
    @Column(name = "products")
    private byte[] products;
    @Lob
    @Column(name = "orderstates")
    private byte[] orderstates;
    @Lob
    @Column(name = "orders")
    private byte[] orders;

    public Joo2VirtuemartMigrationOldtonewIds() {
    }

    public Joo2VirtuemartMigrationOldtonewIds(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getCats() {
        return cats;
    }

    public void setCats(byte[] cats) {
        this.cats = cats;
    }

    public byte[] getCatsxref() {
        return catsxref;
    }

    public void setCatsxref(byte[] catsxref) {
        this.catsxref = catsxref;
    }

    public byte[] getManus() {
        return manus;
    }

    public void setManus(byte[] manus) {
        this.manus = manus;
    }

    public byte[] getMfcats() {
        return mfcats;
    }

    public void setMfcats(byte[] mfcats) {
        this.mfcats = mfcats;
    }

    public byte[] getShoppergroups() {
        return shoppergroups;
    }

    public void setShoppergroups(byte[] shoppergroups) {
        this.shoppergroups = shoppergroups;
    }

    public byte[] getProducts() {
        return products;
    }

    public void setProducts(byte[] products) {
        this.products = products;
    }

    public byte[] getOrderstates() {
        return orderstates;
    }

    public void setOrderstates(byte[] orderstates) {
        this.orderstates = orderstates;
    }

    public byte[] getOrders() {
        return orders;
    }

    public void setOrders(byte[] orders) {
        this.orders = orders;
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
        if (!(object instanceof Joo2VirtuemartMigrationOldtonewIds)) {
            return false;
        }
        Joo2VirtuemartMigrationOldtonewIds other = (Joo2VirtuemartMigrationOldtonewIds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartMigrationOldtonewIds[ id=" + id + " ]";
    }
    
}
