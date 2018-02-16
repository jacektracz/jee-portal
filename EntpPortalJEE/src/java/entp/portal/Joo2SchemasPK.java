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
import javax.validation.constraints.Size;

/**
 *
 * @author jacek
 */
@Embeddable
public class Joo2SchemasPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "extension_id", nullable = false)
    private int extensionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "version_id", nullable = false, length = 20)
    private String versionId;

    public Joo2SchemasPK() {
    }

    public Joo2SchemasPK(int extensionId, String versionId) {
        this.extensionId = extensionId;
        this.versionId = versionId;
    }

    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) extensionId;
        hash += (versionId != null ? versionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2SchemasPK)) {
            return false;
        }
        Joo2SchemasPK other = (Joo2SchemasPK) object;
        if (this.extensionId != other.extensionId) {
            return false;
        }
        if ((this.versionId == null && other.versionId != null) || (this.versionId != null && !this.versionId.equals(other.versionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2SchemasPK[ extensionId=" + extensionId + ", versionId=" + versionId + " ]";
    }
    
}
