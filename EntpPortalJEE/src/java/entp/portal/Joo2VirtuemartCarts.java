/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_carts", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCarts.findAll", query = "SELECT j FROM Joo2VirtuemartCarts j"),
    @NamedQuery(name = "Joo2VirtuemartCarts.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartCarts j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartCarts.findByLastUpdated", query = "SELECT j FROM Joo2VirtuemartCarts j WHERE j.lastUpdated = :lastUpdated")})
public class Joo2VirtuemartCarts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private Integer virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "cart_content", nullable = false, length = 65535)
    private String cartContent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_updated", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;

    public Joo2VirtuemartCarts() {
    }

    public Joo2VirtuemartCarts(Integer virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public Joo2VirtuemartCarts(Integer virtuemartUserId, String cartContent, Date lastUpdated) {
        this.virtuemartUserId = virtuemartUserId;
        this.cartContent = cartContent;
        this.lastUpdated = lastUpdated;
    }

    public Integer getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(Integer virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public String getCartContent() {
        return cartContent;
    }

    public void setCartContent(String cartContent) {
        this.cartContent = cartContent;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartUserId != null ? virtuemartUserId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartCarts)) {
            return false;
        }
        Joo2VirtuemartCarts other = (Joo2VirtuemartCarts) object;
        if ((this.virtuemartUserId == null && other.virtuemartUserId != null) || (this.virtuemartUserId != null && !this.virtuemartUserId.equals(other.virtuemartUserId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCarts[ virtuemartUserId=" + virtuemartUserId + " ]";
    }
    
}
