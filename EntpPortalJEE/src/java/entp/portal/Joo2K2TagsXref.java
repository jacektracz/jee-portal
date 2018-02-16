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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_k2_tags_xref", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2TagsXref.findAll", query = "SELECT j FROM Joo2K2TagsXref j"),
    @NamedQuery(name = "Joo2K2TagsXref.findById", query = "SELECT j FROM Joo2K2TagsXref j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2TagsXref.findByTagID", query = "SELECT j FROM Joo2K2TagsXref j WHERE j.tagID = :tagID"),
    @NamedQuery(name = "Joo2K2TagsXref.findByItemID", query = "SELECT j FROM Joo2K2TagsXref j WHERE j.itemID = :itemID")})
public class Joo2K2TagsXref implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tagID", nullable = false)
    private int tagID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itemID", nullable = false)
    private int itemID;

    public Joo2K2TagsXref() {
    }

    public Joo2K2TagsXref(Integer id) {
        this.id = id;
    }

    public Joo2K2TagsXref(Integer id, int tagID, int itemID) {
        this.id = id;
        this.tagID = tagID;
        this.itemID = itemID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTagID() {
        return tagID;
    }

    public void setTagID(int tagID) {
        this.tagID = tagID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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
        if (!(object instanceof Joo2K2TagsXref)) {
            return false;
        }
        Joo2K2TagsXref other = (Joo2K2TagsXref) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2TagsXref[ id=" + id + " ]";
    }
    
}
