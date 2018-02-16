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
@Table(name = "joo2_k2_extra_fields", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2ExtraFields.findAll", query = "SELECT j FROM Joo2K2ExtraFields j"),
    @NamedQuery(name = "Joo2K2ExtraFields.findById", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2ExtraFields.findByName", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2K2ExtraFields.findByType", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2K2ExtraFields.findByGroup", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.group = :group"),
    @NamedQuery(name = "Joo2K2ExtraFields.findByPublished", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2K2ExtraFields.findByOrdering", query = "SELECT j FROM Joo2K2ExtraFields j WHERE j.ordering = :ordering")})
public class Joo2K2ExtraFields implements Serializable {
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "value", nullable = false, length = 65535)
    private String value;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type", nullable = false, length = 255)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group", nullable = false)
    private int group;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2K2ExtraFields() {
    }

    public Joo2K2ExtraFields(Integer id) {
        this.id = id;
    }

    public Joo2K2ExtraFields(Integer id, String name, String value, String type, int group, short published, int ordering) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.type = type;
        this.group = group;
        this.published = published;
        this.ordering = ordering;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        if (!(object instanceof Joo2K2ExtraFields)) {
            return false;
        }
        Joo2K2ExtraFields other = (Joo2K2ExtraFields) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2ExtraFields[ id=" + id + " ]";
    }
    
}
