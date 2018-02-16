/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jacek
 */
@Embeddable
public class Joo2UpdateSitesExtensionsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_site_id", nullable = false)
    private int updateSiteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extension_id", nullable = false)
    private int extensionId;

    public Joo2UpdateSitesExtensionsPK() {
    }

    public Joo2UpdateSitesExtensionsPK(int updateSiteId, int extensionId) {
        this.updateSiteId = updateSiteId;
        this.extensionId = extensionId;
    }

    public int getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(int updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) updateSiteId;
        hash += (int) extensionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UpdateSitesExtensionsPK)) {
            return false;
        }
        Joo2UpdateSitesExtensionsPK other = (Joo2UpdateSitesExtensionsPK) object;
        if (this.updateSiteId != other.updateSiteId) {
            return false;
        }
        if (this.extensionId != other.extensionId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UpdateSitesExtensionsPK[ updateSiteId=" + updateSiteId + ", extensionId=" + extensionId + " ]";
    }
    
}
