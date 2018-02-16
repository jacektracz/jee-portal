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
@Table(name = "joo2_virtuemart_vmuser_shoppergroups", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_user_id", "virtuemart_shoppergroup_id"}),
    @UniqueConstraint(columnNames = {"id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartVmuserShoppergroups.findAll", query = "SELECT j FROM Joo2VirtuemartVmuserShoppergroups j"),
    @NamedQuery(name = "Joo2VirtuemartVmuserShoppergroups.findById", query = "SELECT j FROM Joo2VirtuemartVmuserShoppergroups j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartVmuserShoppergroups.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartVmuserShoppergroups j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartVmuserShoppergroups.findByVirtuemartShoppergroupId", query = "SELECT j FROM Joo2VirtuemartVmuserShoppergroups j WHERE j.virtuemartShoppergroupId = :virtuemartShoppergroupId")})
public class Joo2VirtuemartVmuserShoppergroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private int virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_shoppergroup_id", nullable = false)
    private int virtuemartShoppergroupId;

    public Joo2VirtuemartVmuserShoppergroups() {
    }

    public Joo2VirtuemartVmuserShoppergroups(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartVmuserShoppergroups(Long id, int virtuemartUserId, int virtuemartShoppergroupId) {
        this.id = id;
        this.virtuemartUserId = virtuemartUserId;
        this.virtuemartShoppergroupId = virtuemartShoppergroupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(int virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
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
        if (!(object instanceof Joo2VirtuemartVmuserShoppergroups)) {
            return false;
        }
        Joo2VirtuemartVmuserShoppergroups other = (Joo2VirtuemartVmuserShoppergroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartVmuserShoppergroups[ id=" + id + " ]";
    }
    
}
