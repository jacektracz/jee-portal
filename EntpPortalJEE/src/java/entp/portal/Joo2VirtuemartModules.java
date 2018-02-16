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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_modules", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"module_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartModules.findAll", query = "SELECT j FROM Joo2VirtuemartModules j"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByModuleId", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.moduleId = :moduleId"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByModuleName", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.moduleName = :moduleName"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByModulePerms", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.modulePerms = :modulePerms"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByPublished", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByIsAdmin", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.isAdmin = :isAdmin"),
    @NamedQuery(name = "Joo2VirtuemartModules.findByOrdering", query = "SELECT j FROM Joo2VirtuemartModules j WHERE j.ordering = :ordering")})
public class Joo2VirtuemartModules implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "module_id", nullable = false)
    private Long moduleId;
    @Size(max = 255)
    @Column(name = "module_name", length = 255)
    private String moduleName;
    @Lob
    @Size(max = 65535)
    @Column(name = "module_description", length = 65535)
    private String moduleDescription;
    @Size(max = 255)
    @Column(name = "module_perms", length = 255)
    private String modulePerms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "is_admin", nullable = false, length = 2)
    private String isAdmin;
    @Column(name = "ordering")
    private Integer ordering;

    public Joo2VirtuemartModules() {
    }

    public Joo2VirtuemartModules(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Joo2VirtuemartModules(Long moduleId, boolean published, String isAdmin) {
        this.moduleId = moduleId;
        this.published = published;
        this.isAdmin = isAdmin;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    public String getModulePerms() {
        return modulePerms;
    }

    public void setModulePerms(String modulePerms) {
        this.modulePerms = modulePerms;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartModules)) {
            return false;
        }
        Joo2VirtuemartModules other = (Joo2VirtuemartModules) object;
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartModules[ moduleId=" + moduleId + " ]";
    }
    
}
