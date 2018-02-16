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
@Table(name = "joo2_virtuemart_adminmenuentries", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findAll", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findById", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByModuleId", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.moduleId = :moduleId"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByParentId", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByName", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByIconClass", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.iconClass = :iconClass"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByOrdering", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByPublished", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByView", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.view = :view"),
    @NamedQuery(name = "Joo2VirtuemartAdminmenuentries.findByTask", query = "SELECT j FROM Joo2VirtuemartAdminmenuentries j WHERE j.task = :task")})
public class Joo2VirtuemartAdminmenuentries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "module_id", nullable = false)
    private int moduleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id", nullable = false)
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "link", nullable = false, length = 65535)
    private String link;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "depends", nullable = false, length = 65535)
    private String depends;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "icon_class", nullable = false, length = 255)
    private String iconClass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "tooltip", nullable = false, length = 65535)
    private String tooltip;
    @Size(max = 255)
    @Column(name = "view", length = 255)
    private String view;
    @Size(max = 255)
    @Column(name = "task", length = 255)
    private String task;

    public Joo2VirtuemartAdminmenuentries() {
    }

    public Joo2VirtuemartAdminmenuentries(Integer id) {
        this.id = id;
    }

    public Joo2VirtuemartAdminmenuentries(Integer id, int moduleId, int parentId, String name, String link, String depends, String iconClass, int ordering, boolean published, String tooltip) {
        this.id = id;
        this.moduleId = moduleId;
        this.parentId = parentId;
        this.name = name;
        this.link = link;
        this.depends = depends;
        this.iconClass = iconClass;
        this.ordering = ordering;
        this.published = published;
        this.tooltip = tooltip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDepends() {
        return depends;
    }

    public void setDepends(String depends) {
        this.depends = depends;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
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
        if (!(object instanceof Joo2VirtuemartAdminmenuentries)) {
            return false;
        }
        Joo2VirtuemartAdminmenuentries other = (Joo2VirtuemartAdminmenuentries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartAdminmenuentries[ id=" + id + " ]";
    }
    
}
