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
@Table(name = "joo2_k2_categories", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Categories.findAll", query = "SELECT j FROM Joo2K2Categories j"),
    @NamedQuery(name = "Joo2K2Categories.findById", query = "SELECT j FROM Joo2K2Categories j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Categories.findByName", query = "SELECT j FROM Joo2K2Categories j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2K2Categories.findByAlias", query = "SELECT j FROM Joo2K2Categories j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2K2Categories.findByParent", query = "SELECT j FROM Joo2K2Categories j WHERE j.parent = :parent"),
    @NamedQuery(name = "Joo2K2Categories.findByExtraFieldsGroup", query = "SELECT j FROM Joo2K2Categories j WHERE j.extraFieldsGroup = :extraFieldsGroup"),
    @NamedQuery(name = "Joo2K2Categories.findByPublished", query = "SELECT j FROM Joo2K2Categories j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2K2Categories.findByAccess", query = "SELECT j FROM Joo2K2Categories j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2K2Categories.findByOrdering", query = "SELECT j FROM Joo2K2Categories j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2K2Categories.findByImage", query = "SELECT j FROM Joo2K2Categories j WHERE j.image = :image"),
    @NamedQuery(name = "Joo2K2Categories.findByTrash", query = "SELECT j FROM Joo2K2Categories j WHERE j.trash = :trash"),
    @NamedQuery(name = "Joo2K2Categories.findByLanguage", query = "SELECT j FROM Joo2K2Categories j WHERE j.language = :language")})
public class Joo2K2Categories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Column(name = "parent")
    private Integer parent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "extraFieldsGroup", nullable = false)
    private int extraFieldsGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access", nullable = false)
    private int access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image", nullable = false, length = 255)
    private String image;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trash", nullable = false)
    private short trash;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "plugins", nullable = false, length = 65535)
    private String plugins;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2K2Categories() {
    }

    public Joo2K2Categories(Integer id) {
        this.id = id;
    }

    public Joo2K2Categories(Integer id, String name, String alias, String description, int extraFieldsGroup, short published, int access, int ordering, String image, String params, short trash, String plugins, String language) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.description = description;
        this.extraFieldsGroup = extraFieldsGroup;
        this.published = published;
        this.access = access;
        this.ordering = ordering;
        this.image = image;
        this.params = params;
        this.trash = trash;
        this.plugins = plugins;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public int getExtraFieldsGroup() {
        return extraFieldsGroup;
    }

    public void setExtraFieldsGroup(int extraFieldsGroup) {
        this.extraFieldsGroup = extraFieldsGroup;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public short getTrash() {
        return trash;
    }

    public void setTrash(short trash) {
        this.trash = trash;
    }

    public String getPlugins() {
        return plugins;
    }

    public void setPlugins(String plugins) {
        this.plugins = plugins;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        if (!(object instanceof Joo2K2Categories)) {
            return false;
        }
        Joo2K2Categories other = (Joo2K2Categories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Categories[ id=" + id + " ]";
    }
    
}
