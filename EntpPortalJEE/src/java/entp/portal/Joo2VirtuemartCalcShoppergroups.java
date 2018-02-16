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
@Table(name = "joo2_virtuemart_calc_shoppergroups", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_calc_id", "virtuemart_shoppergroup_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCalcShoppergroups.findAll", query = "SELECT j FROM Joo2VirtuemartCalcShoppergroups j"),
    @NamedQuery(name = "Joo2VirtuemartCalcShoppergroups.findById", query = "SELECT j FROM Joo2VirtuemartCalcShoppergroups j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartCalcShoppergroups.findByVirtuemartCalcId", query = "SELECT j FROM Joo2VirtuemartCalcShoppergroups j WHERE j.virtuemartCalcId = :virtuemartCalcId"),
    @NamedQuery(name = "Joo2VirtuemartCalcShoppergroups.findByVirtuemartShoppergroupId", query = "SELECT j FROM Joo2VirtuemartCalcShoppergroups j WHERE j.virtuemartShoppergroupId = :virtuemartShoppergroupId")})
public class Joo2VirtuemartCalcShoppergroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_calc_id", nullable = false)
    private int virtuemartCalcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_shoppergroup_id", nullable = false)
    private int virtuemartShoppergroupId;

    public Joo2VirtuemartCalcShoppergroups() {
    }

    public Joo2VirtuemartCalcShoppergroups(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartCalcShoppergroups(Long id, int virtuemartCalcId, int virtuemartShoppergroupId) {
        this.id = id;
        this.virtuemartCalcId = virtuemartCalcId;
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartCalcId() {
        return virtuemartCalcId;
    }

    public void setVirtuemartCalcId(int virtuemartCalcId) {
        this.virtuemartCalcId = virtuemartCalcId;
    }

    public int getVirtuemartShoppergroupId() {
        return virtuemartShoppergroupId;
    }

    public void setVirtuemartShoppergroupId(int virtuemartShoppergroupId) {
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
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
        if (!(object instanceof Joo2VirtuemartCalcShoppergroups)) {
            return false;
        }
        Joo2VirtuemartCalcShoppergroups other = (Joo2VirtuemartCalcShoppergroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCalcShoppergroups[ id=" + id + " ]";
    }
    
}
