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
@Table(name = "joo2_virtuemart_calc_countries", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"}),
    @UniqueConstraint(columnNames = {"virtuemart_calc_id", "virtuemart_country_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartCalcCountries.findAll", query = "SELECT j FROM Joo2VirtuemartCalcCountries j"),
    @NamedQuery(name = "Joo2VirtuemartCalcCountries.findById", query = "SELECT j FROM Joo2VirtuemartCalcCountries j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartCalcCountries.findByVirtuemartCalcId", query = "SELECT j FROM Joo2VirtuemartCalcCountries j WHERE j.virtuemartCalcId = :virtuemartCalcId"),
    @NamedQuery(name = "Joo2VirtuemartCalcCountries.findByVirtuemartCountryId", query = "SELECT j FROM Joo2VirtuemartCalcCountries j WHERE j.virtuemartCountryId = :virtuemartCountryId")})
public class Joo2VirtuemartCalcCountries implements Serializable {
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
    @Column(name = "virtuemart_country_id", nullable = false)
    private int virtuemartCountryId;

    public Joo2VirtuemartCalcCountries() {
    }

    public Joo2VirtuemartCalcCountries(Long id) {
        this.id = id;
    }

    public Joo2VirtuemartCalcCountries(Long id, int virtuemartCalcId, int virtuemartCountryId) {
        this.id = id;
        this.virtuemartCalcId = virtuemartCalcId;
        this.virtuemartCountryId = virtuemartCountryId;
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

    public int getVirtuemartCountryId() {
        return virtuemartCountryId;
    }

    public void setVirtuemartCountryId(int virtuemartCountryId) {
        this.virtuemartCountryId = virtuemartCountryId;
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
        if (!(object instanceof Joo2VirtuemartCalcCountries)) {
            return false;
        }
        Joo2VirtuemartCalcCountries other = (Joo2VirtuemartCalcCountries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartCalcCountries[ id=" + id + " ]";
    }
    
}
