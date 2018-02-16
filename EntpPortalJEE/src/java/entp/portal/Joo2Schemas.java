/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_schemas", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Schemas.findAll", query = "SELECT j FROM Joo2Schemas j"),
    @NamedQuery(name = "Joo2Schemas.findByExtensionId", query = "SELECT j FROM Joo2Schemas j WHERE j.joo2SchemasPK.extensionId = :extensionId"),
    @NamedQuery(name = "Joo2Schemas.findByVersionId", query = "SELECT j FROM Joo2Schemas j WHERE j.joo2SchemasPK.versionId = :versionId")})
public class Joo2Schemas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2SchemasPK joo2SchemasPK;

    public Joo2Schemas() {
    }

    public Joo2Schemas(Joo2SchemasPK joo2SchemasPK) {
        this.joo2SchemasPK = joo2SchemasPK;
    }

    public Joo2Schemas(int extensionId, String versionId) {
        this.joo2SchemasPK = new Joo2SchemasPK(extensionId, versionId);
    }

    public Joo2SchemasPK getJoo2SchemasPK() {
        return joo2SchemasPK;
    }

    public void setJoo2SchemasPK(Joo2SchemasPK joo2SchemasPK) {
        this.joo2SchemasPK = joo2SchemasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2SchemasPK != null ? joo2SchemasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Schemas)) {
            return false;
        }
        Joo2Schemas other = (Joo2Schemas) object;
        if ((this.joo2SchemasPK == null && other.joo2SchemasPK != null) || (this.joo2SchemasPK != null && !this.joo2SchemasPK.equals(other.joo2SchemasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Schemas[ joo2SchemasPK=" + joo2SchemasPK + " ]";
    }
    
}
