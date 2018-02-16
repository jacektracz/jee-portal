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
@Table(name = "joo2_virtuemart_paymentmethod_creditcards", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_paymentmethod_id", "virtuemart_creditcard_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartPaymentmethodCreditcards.findAll", query = "SELECT j FROM Joo2VirtuemartPaymentmethodCreditcards j"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethodCreditcards.findById", query = "SELECT j FROM Joo2VirtuemartPaymentmethodCreditcards j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethodCreditcards.findByVirtuemartPaymentmethodId", query = "SELECT j FROM Joo2VirtuemartPaymentmethodCreditcards j WHERE j.virtuemartPaymentmethodId = :virtuemartPaymentmethodId"),
    @NamedQuery(name = "Joo2VirtuemartPaymentmethodCreditcards.findByVirtuemartCreditcardId", query = "SELECT j FROM Joo2VirtuemartPaymentmethodCreditcards j WHERE j.virtuemartCreditcardId = :virtuemartCreditcardId")})
public class Joo2VirtuemartPaymentmethodCreditcards implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_paymentmethod_id", nullable = false)
    private int virtuemartPaymentmethodId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_creditcard_id", nullable = false)
    private int virtuemartCreditcardId;

    public Joo2VirtuemartPaymentmethodCreditcards() {
    }

    public Joo2VirtuemartPaymentmethodCreditcards(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartPaymentmethodCreditcards(Long id, int virtuemartPaymentmethodId, int virtuemartCreditcardId) {
        this.id = id;
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
        this.virtuemartCreditcardId = virtuemartCreditcardId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVirtuemartPaymentmethodId() {
        return virtuemartPaymentmethodId;
    }

    public void setVirtuemartPaymentmethodId(int virtuemartPaymentmethodId) {
        this.virtuemartPaymentmethodId = virtuemartPaymentmethodId;
    }

    public int getVirtuemartCreditcardId() {
        return virtuemartCreditcardId;
    }

    public void setVirtuemartCreditcardId(int virtuemartCreditcardId) {
        this.virtuemartCreditcardId = virtuemartCreditcardId;
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
        if (!(object instanceof Joo2VirtuemartPaymentmethodCreditcards)) {
            return false;
        }
        Joo2VirtuemartPaymentmethodCreditcards other = (Joo2VirtuemartPaymentmethodCreditcards) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartPaymentmethodCreditcards[ id=" + id + " ]";
    }
    
}
