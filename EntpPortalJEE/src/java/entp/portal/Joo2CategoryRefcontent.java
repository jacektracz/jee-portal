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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_category_refcontent", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2CategoryRefcontent.findAll", query = "SELECT j FROM Joo2CategoryRefcontent j"),
    @NamedQuery(name = "Joo2CategoryRefcontent.findById", query = "SELECT j FROM Joo2CategoryRefcontent j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2CategoryRefcontent.findByCatid", query = "SELECT j FROM Joo2CategoryRefcontent j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2CategoryRefcontent.findByContentid", query = "SELECT j FROM Joo2CategoryRefcontent j WHERE j.contentid = :contentid")})
public class Joo2CategoryRefcontent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "catid")
    private Integer catid;
    @Column(name = "contentid")
    private Integer contentid;

    public Joo2CategoryRefcontent() {
    }

    public Joo2CategoryRefcontent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
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
        if (!(object instanceof Joo2CategoryRefcontent)) {
            return false;
        }
        Joo2CategoryRefcontent other = (Joo2CategoryRefcontent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2CategoryRefcontent[ id=" + id + " ]";
    }
    
}
