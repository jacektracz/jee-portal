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
@Table(name = "joo2_k2_attachments", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Attachments.findAll", query = "SELECT j FROM Joo2K2Attachments j"),
    @NamedQuery(name = "Joo2K2Attachments.findById", query = "SELECT j FROM Joo2K2Attachments j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Attachments.findByItemID", query = "SELECT j FROM Joo2K2Attachments j WHERE j.itemID = :itemID"),
    @NamedQuery(name = "Joo2K2Attachments.findByFilename", query = "SELECT j FROM Joo2K2Attachments j WHERE j.filename = :filename"),
    @NamedQuery(name = "Joo2K2Attachments.findByTitle", query = "SELECT j FROM Joo2K2Attachments j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2K2Attachments.findByHits", query = "SELECT j FROM Joo2K2Attachments j WHERE j.hits = :hits")})
public class Joo2K2Attachments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itemID", nullable = false)
    private int itemID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "filename", nullable = false, length = 255)
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "titleAttribute", nullable = false, length = 65535)
    private String titleAttribute;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;

    public Joo2K2Attachments() {
    }

    public Joo2K2Attachments(Integer id) {
        this.id = id;
    }

    public Joo2K2Attachments(Integer id, int itemID, String filename, String title, String titleAttribute, int hits) {
        this.id = id;
        this.itemID = itemID;
        this.filename = filename;
        this.title = title;
        this.titleAttribute = titleAttribute;
        this.hits = hits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleAttribute() {
        return titleAttribute;
    }

    public void setTitleAttribute(String titleAttribute) {
        this.titleAttribute = titleAttribute;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
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
        if (!(object instanceof Joo2K2Attachments)) {
            return false;
        }
        Joo2K2Attachments other = (Joo2K2Attachments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Attachments[ id=" + id + " ]";
    }
    
}
