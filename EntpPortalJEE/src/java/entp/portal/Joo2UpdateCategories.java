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
@Table(name = "joo2_update_categories", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2UpdateCategories.findAll", query = "SELECT j FROM Joo2UpdateCategories j"),
    @NamedQuery(name = "Joo2UpdateCategories.findByCategoryid", query = "SELECT j FROM Joo2UpdateCategories j WHERE j.categoryid = :categoryid"),
    @NamedQuery(name = "Joo2UpdateCategories.findByName", query = "SELECT j FROM Joo2UpdateCategories j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2UpdateCategories.findByParent", query = "SELECT j FROM Joo2UpdateCategories j WHERE j.parent = :parent"),
    @NamedQuery(name = "Joo2UpdateCategories.findByUpdatesite", query = "SELECT j FROM Joo2UpdateCategories j WHERE j.updatesite = :updatesite")})
public class Joo2UpdateCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoryid", nullable = false)
    private Integer categoryid;
    @Size(max = 20)
    @Column(name = "name", length = 20)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Column(name = "parent")
    private Integer parent;
    @Column(name = "updatesite")
    private Integer updatesite;

    public Joo2UpdateCategories() {
    }

    public Joo2UpdateCategories(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Joo2UpdateCategories(Integer categoryid, String description) {
        this.categoryid = categoryid;
        this.description = description;
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

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getUpdatesite() {
        return updatesite;
    }

    public void setUpdatesite(Integer updatesite) {
        this.updatesite = updatesite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryid != null ? categoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UpdateCategories)) {
            return false;
        }
        Joo2UpdateCategories other = (Joo2UpdateCategories) object;
        if ((this.categoryid == null && other.categoryid != null) || (this.categoryid != null && !this.categoryid.equals(other.categoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UpdateCategories[ categoryid=" + categoryid + " ]";
    }
    
}
