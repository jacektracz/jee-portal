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
@Table(name = "joo2_update_sites_extensions", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2UpdateSitesExtensions.findAll", query = "SELECT j FROM Joo2UpdateSitesExtensions j"),
    @NamedQuery(name = "Joo2UpdateSitesExtensions.findByUpdateSiteId", query = "SELECT j FROM Joo2UpdateSitesExtensions j WHERE j.joo2UpdateSitesExtensionsPK.updateSiteId = :updateSiteId"),
    @NamedQuery(name = "Joo2UpdateSitesExtensions.findByExtensionId", query = "SELECT j FROM Joo2UpdateSitesExtensions j WHERE j.joo2UpdateSitesExtensionsPK.extensionId = :extensionId")})
public class Joo2UpdateSitesExtensions implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2UpdateSitesExtensionsPK joo2UpdateSitesExtensionsPK;

    public Joo2UpdateSitesExtensions() {
    }

    public Joo2UpdateSitesExtensions(Joo2UpdateSitesExtensionsPK joo2UpdateSitesExtensionsPK) {
        this.joo2UpdateSitesExtensionsPK = joo2UpdateSitesExtensionsPK;
    }

    public Joo2UpdateSitesExtensions(int updateSiteId, int extensionId) {
        this.joo2UpdateSitesExtensionsPK = new Joo2UpdateSitesExtensionsPK(updateSiteId, extensionId);
    }

    public Joo2UpdateSitesExtensionsPK getJoo2UpdateSitesExtensionsPK() {
        return joo2UpdateSitesExtensionsPK;
    }

    public void setJoo2UpdateSitesExtensionsPK(Joo2UpdateSitesExtensionsPK joo2UpdateSitesExtensionsPK) {
        this.joo2UpdateSitesExtensionsPK = joo2UpdateSitesExtensionsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2UpdateSitesExtensionsPK != null ? joo2UpdateSitesExtensionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UpdateSitesExtensions)) {
            return false;
        }
        Joo2UpdateSitesExtensions other = (Joo2UpdateSitesExtensions) object;
        if ((this.joo2UpdateSitesExtensionsPK == null && other.joo2UpdateSitesExtensionsPK != null) || (this.joo2UpdateSitesExtensionsPK != null && !this.joo2UpdateSitesExtensionsPK.equals(other.joo2UpdateSitesExtensionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UpdateSitesExtensions[ joo2UpdateSitesExtensionsPK=" + joo2UpdateSitesExtensionsPK + " ]";
    }
    
}
