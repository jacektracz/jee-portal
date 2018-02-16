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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_content_rating", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2ContentRating.findAll", query = "SELECT j FROM Joo2ContentRating j"),
    @NamedQuery(name = "Joo2ContentRating.findByContentId", query = "SELECT j FROM Joo2ContentRating j WHERE j.contentId = :contentId"),
    @NamedQuery(name = "Joo2ContentRating.findByRatingSum", query = "SELECT j FROM Joo2ContentRating j WHERE j.ratingSum = :ratingSum"),
    @NamedQuery(name = "Joo2ContentRating.findByRatingCount", query = "SELECT j FROM Joo2ContentRating j WHERE j.ratingCount = :ratingCount"),
    @NamedQuery(name = "Joo2ContentRating.findByLastip", query = "SELECT j FROM Joo2ContentRating j WHERE j.lastip = :lastip")})
public class Joo2ContentRating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "content_id", nullable = false)
    private Integer contentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating_sum", nullable = false)
    private int ratingSum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating_count", nullable = false)
    private int ratingCount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lastip", nullable = false, length = 50)
    private String lastip;

    public Joo2ContentRating() {
    }

    public Joo2ContentRating(Integer contentId) {
        this.contentId = contentId;
    }

    public Joo2ContentRating(Integer contentId, int ratingSum, int ratingCount, String lastip) {
        this.contentId = contentId;
        this.ratingSum = ratingSum;
        this.ratingCount = ratingCount;
        this.lastip = lastip;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public int getRatingSum() {
        return ratingSum;
    }

    public void setRatingSum(int ratingSum) {
        this.ratingSum = ratingSum;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
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
        if (!(object instanceof Joo2ContentRating)) {
            return false;
        }
        Joo2ContentRating other = (Joo2ContentRating) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ContentRating[ contentId=" + contentId + " ]";
    }
    
}
