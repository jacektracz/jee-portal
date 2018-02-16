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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "joo2_extensions", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Extensions.findAll", query = "SELECT j FROM Joo2Extensions j"),
    @NamedQuery(name = "Joo2Extensions.findByExtensionId", query = "SELECT j FROM Joo2Extensions j WHERE j.extensionId = :extensionId"),
    @NamedQuery(name = "Joo2Extensions.findByName", query = "SELECT j FROM Joo2Extensions j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Extensions.findByType", query = "SELECT j FROM Joo2Extensions j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2Extensions.findByElement", query = "SELECT j FROM Joo2Extensions j WHERE j.element = :element"),
    @NamedQuery(name = "Joo2Extensions.findByFolder", query = "SELECT j FROM Joo2Extensions j WHERE j.folder = :folder"),
    @NamedQuery(name = "Joo2Extensions.findByClientId", query = "SELECT j FROM Joo2Extensions j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2Extensions.findByEnabled", query = "SELECT j FROM Joo2Extensions j WHERE j.enabled = :enabled"),
    @NamedQuery(name = "Joo2Extensions.findByAccess", query = "SELECT j FROM Joo2Extensions j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Extensions.findByProtected1", query = "SELECT j FROM Joo2Extensions j WHERE j.protected1 = :protected1"),
    @NamedQuery(name = "Joo2Extensions.findByCheckedOut", query = "SELECT j FROM Joo2Extensions j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Extensions.findByCheckedOutTime", query = "SELECT j FROM Joo2Extensions j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Extensions.findByOrdering", query = "SELECT j FROM Joo2Extensions j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Extensions.findByState", query = "SELECT j FROM Joo2Extensions j WHERE j.state = :state")})
public class Joo2Extensions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "extension_id", nullable = false)
    private Integer extensionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "type", nullable = false, length = 20)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "element", nullable = false, length = 100)
    private String element;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "folder", nullable = false, length = 100)
    private String folder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id", nullable = false)
    private short clientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enabled", nullable = false)
    private short enabled;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "protected", nullable = false)
    private short protected1;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "manifest_cache", nullable = false, length = 65535)
    private String manifestCache;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_data", nullable = false, length = 65535)
    private String customData;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "system_data", nullable = false, length = 65535)
    private String systemData;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Column(name = "ordering")
    private Integer ordering;
    @Column(name = "state")
    private Integer state;

    public Joo2Extensions() {
    }

    public Joo2Extensions(Integer extensionId) {
        this.extensionId = extensionId;
    }

    public Joo2Extensions(Integer extensionId, String name, String type, String element, String folder, short clientId, short enabled, short protected1, String manifestCache, String params, String customData, String systemData, int checkedOut, Date checkedOutTime) {
        this.extensionId = extensionId;
        this.name = name;
        this.type = type;
        this.element = element;
        this.folder = folder;
        this.clientId = clientId;
        this.enabled = enabled;
        this.protected1 = protected1;
        this.manifestCache = manifestCache;
        this.params = params;
        this.customData = customData;
        this.systemData = systemData;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
    }

    public Integer getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(Integer extensionId) {
        this.extensionId = extensionId;
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

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public short getClientId() {
        return clientId;
    }

    public void setClientId(short clientId) {
        this.clientId = clientId;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public short getProtected1() {
        return protected1;
    }

    public void setProtected1(short protected1) {
        this.protected1 = protected1;
    }

    public String getManifestCache() {
        return manifestCache;
    }

    public void setManifestCache(String manifestCache) {
        this.manifestCache = manifestCache;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getSystemData() {
        return systemData;
    }

    public void setSystemData(String systemData) {
        this.systemData = systemData;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extensionId != null ? extensionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Extensions)) {
            return false;
        }
        Joo2Extensions other = (Joo2Extensions) object;
        if ((this.extensionId == null && other.extensionId != null) || (this.extensionId != null && !this.extensionId.equals(other.extensionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Extensions[ extensionId=" + extensionId + " ]";
    }
    
}
