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
@Table(name = "joo2_updates", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Updates.findAll", query = "SELECT j FROM Joo2Updates j"),
    @NamedQuery(name = "Joo2Updates.findByUpdateId", query = "SELECT j FROM Joo2Updates j WHERE j.updateId = :updateId"),
    @NamedQuery(name = "Joo2Updates.findByUpdateSiteId", query = "SELECT j FROM Joo2Updates j WHERE j.updateSiteId = :updateSiteId"),
    @NamedQuery(name = "Joo2Updates.findByExtensionId", query = "SELECT j FROM Joo2Updates j WHERE j.extensionId = :extensionId"),
    @NamedQuery(name = "Joo2Updates.findByCategoryid", query = "SELECT j FROM Joo2Updates j WHERE j.categoryid = :categoryid"),
    @NamedQuery(name = "Joo2Updates.findByName", query = "SELECT j FROM Joo2Updates j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Updates.findByElement", query = "SELECT j FROM Joo2Updates j WHERE j.element = :element"),
    @NamedQuery(name = "Joo2Updates.findByType", query = "SELECT j FROM Joo2Updates j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2Updates.findByFolder", query = "SELECT j FROM Joo2Updates j WHERE j.folder = :folder"),
    @NamedQuery(name = "Joo2Updates.findByClientId", query = "SELECT j FROM Joo2Updates j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2Updates.findByVersion", query = "SELECT j FROM Joo2Updates j WHERE j.version = :version")})
public class Joo2Updates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "update_id", nullable = false)
    private Integer updateId;
    @Column(name = "update_site_id")
    private Integer updateSiteId;
    @Column(name = "extension_id")
    private Integer extensionId;
    @Column(name = "categoryid")
    private Integer categoryid;
    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Size(max = 100)
    @Column(name = "element", length = 100)
    private String element;
    @Size(max = 20)
    @Column(name = "type", length = 20)
    private String type;
    @Size(max = 20)
    @Column(name = "folder", length = 20)
    private String folder;
    @Column(name = "client_id")
    private Short clientId;
    @Size(max = 10)
    @Column(name = "version", length = 10)
    private String version;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "data", nullable = false, length = 65535)
    private String data;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "detailsurl", nullable = false, length = 65535)
    private String detailsurl;

    public Joo2Updates() {
    }

    public Joo2Updates(Integer updateId) {
        this.updateId = updateId;
    }

    public Joo2Updates(Integer updateId, String description, String data, String detailsurl) {
        this.updateId = updateId;
        this.description = description;
        this.data = data;
        this.detailsurl = detailsurl;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(Integer updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public Integer getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(Integer extensionId) {
        this.extensionId = extensionId;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Short getClientId() {
        return clientId;
    }

    public void setClientId(Short clientId) {
        this.clientId = clientId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDetailsurl() {
        return detailsurl;
    }

    public void setDetailsurl(String detailsurl) {
        this.detailsurl = detailsurl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (updateId != null ? updateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Updates)) {
            return false;
        }
        Joo2Updates other = (Joo2Updates) object;
        if ((this.updateId == null && other.updateId != null) || (this.updateId != null && !this.updateId.equals(other.updateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Updates[ updateId=" + updateId + " ]";
    }
    
}
