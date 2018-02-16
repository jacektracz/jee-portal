/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_associations", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Associations.findAll", query = "SELECT j FROM Joo2Associations j"),
    @NamedQuery(name = "Joo2Associations.findById", query = "SELECT j FROM Joo2Associations j WHERE j.joo2AssociationsPK.id = :id"),
    @NamedQuery(name = "Joo2Associations.findByContext", query = "SELECT j FROM Joo2Associations j WHERE j.joo2AssociationsPK.context = :context"),
    @NamedQuery(name = "Joo2Associations.findByKey", query = "SELECT j FROM Joo2Associations j WHERE j.key = :key")})
public class Joo2Associations implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2AssociationsPK joo2AssociationsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "key", nullable = false, length = 32)
    private String key;

    public Joo2Associations() {
    }

    public Joo2Associations(Joo2AssociationsPK joo2AssociationsPK) {
        this.joo2AssociationsPK = joo2AssociationsPK;
    }

    public Joo2Associations(Joo2AssociationsPK joo2AssociationsPK, String key) {
        this.joo2AssociationsPK = joo2AssociationsPK;
        this.key = key;
    }

    public Joo2Associations(String id, String context) {
        this.joo2AssociationsPK = new Joo2AssociationsPK(id, context);
    }

    public Joo2AssociationsPK getJoo2AssociationsPK() {
        return joo2AssociationsPK;
    }

    public void setJoo2AssociationsPK(Joo2AssociationsPK joo2AssociationsPK) {
        this.joo2AssociationsPK = joo2AssociationsPK;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2AssociationsPK != null ? joo2AssociationsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Associations)) {
            return false;
        }
        Joo2Associations other = (Joo2Associations) object;
        if ((this.joo2AssociationsPK == null && other.joo2AssociationsPK != null) || (this.joo2AssociationsPK != null && !this.joo2AssociationsPK.equals(other.joo2AssociationsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Associations[ joo2AssociationsPK=" + joo2AssociationsPK + " ]";
    }
    
}
