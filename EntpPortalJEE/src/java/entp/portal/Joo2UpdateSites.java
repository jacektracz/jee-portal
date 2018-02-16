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
import javax.persistence.Lob;
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
@Table(name = "joo2_update_sites", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2UpdateSites.findAll", query = "SELECT j FROM Joo2UpdateSites j"),
    @NamedQuery(name = "Joo2UpdateSites.findByUpdateSiteId", query = "SELECT j FROM Joo2UpdateSites j WHERE j.updateSiteId = :updateSiteId"),
    @NamedQuery(name = "Joo2UpdateSites.findByName", query = "SELECT j FROM Joo2UpdateSites j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2UpdateSites.findByType", query = "SELECT j FROM Joo2UpdateSites j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2UpdateSites.findByEnabled", query = "SELECT j FROM Joo2UpdateSites j WHERE j.enabled = :enabled")})
public class Joo2UpdateSites implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "update_site_id", nullable = false)
    private Integer updateSiteId;
    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;
    @Size(max = 20)
    @Column(name = "type", length = 20)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "location", nullable = false, length = 65535)
    private String location;
    @Column(name = "enabled")
    private Integer enabled;

    public Joo2UpdateSites() {
    }

    public Joo2UpdateSites(Integer updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public Joo2UpdateSites(Integer updateSiteId, String location) {
        this.updateSiteId = updateSiteId;
        this.location = location;
    }

    public Integer getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(Integer updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (updateSiteId != null ? updateSiteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UpdateSites)) {
            return false;
        }
        Joo2UpdateSites other = (Joo2UpdateSites) object;
        if ((this.updateSiteId == null && other.updateSiteId != null) || (this.updateSiteId != null && !this.updateSiteId.equals(other.updateSiteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UpdateSites[ updateSiteId=" + updateSiteId + " ]";
    }
    
}
