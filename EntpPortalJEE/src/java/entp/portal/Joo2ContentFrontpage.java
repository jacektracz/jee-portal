/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "joo2_content_frontpage", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2ContentFrontpage.findAll", query = "SELECT j FROM Joo2ContentFrontpage j"),
    @NamedQuery(name = "Joo2ContentFrontpage.findByContentId", query = "SELECT j FROM Joo2ContentFrontpage j WHERE j.contentId = :contentId"),
    @NamedQuery(name = "Joo2ContentFrontpage.findByOrdering", query = "SELECT j FROM Joo2ContentFrontpage j WHERE j.ordering = :ordering")})
public class Joo2ContentFrontpage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "content_id", nullable = false)
    private Integer contentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2ContentFrontpage() {
    }

    public Joo2ContentFrontpage(Integer contentId) {
        this.contentId = contentId;
    }

    public Joo2ContentFrontpage(Integer contentId, int ordering) {
        this.contentId = contentId;
        this.ordering = ordering;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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
        hash += (contentId != null ? contentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2ContentFrontpage)) {
            return false;
        }
        Joo2ContentFrontpage other = (Joo2ContentFrontpage) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ContentFrontpage[ contentId=" + contentId + " ]";
    }
    
}
