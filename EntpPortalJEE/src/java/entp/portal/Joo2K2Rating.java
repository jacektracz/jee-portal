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
@Table(name = "joo2_k2_rating", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Rating.findAll", query = "SELECT j FROM Joo2K2Rating j"),
    @NamedQuery(name = "Joo2K2Rating.findByItemID", query = "SELECT j FROM Joo2K2Rating j WHERE j.itemID = :itemID"),
    @NamedQuery(name = "Joo2K2Rating.findByRatingSum", query = "SELECT j FROM Joo2K2Rating j WHERE j.ratingSum = :ratingSum"),
    @NamedQuery(name = "Joo2K2Rating.findByRatingCount", query = "SELECT j FROM Joo2K2Rating j WHERE j.ratingCount = :ratingCount"),
    @NamedQuery(name = "Joo2K2Rating.findByLastip", query = "SELECT j FROM Joo2K2Rating j WHERE j.lastip = :lastip")})
public class Joo2K2Rating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "itemID", nullable = false)
    private Integer itemID;
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

    public Joo2K2Rating() {
    }

    public Joo2K2Rating(Integer itemID) {
        this.itemID = itemID;
    }

    public Joo2K2Rating(Integer itemID, int ratingSum, int ratingCount, String lastip) {
        this.itemID = itemID;
        this.ratingSum = ratingSum;
        this.ratingCount = ratingCount;
        this.lastip = lastip;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
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
        hash += (itemID != null ? itemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2K2Rating)) {
            return false;
        }
        Joo2K2Rating other = (Joo2K2Rating) object;
        if ((this.itemID == null && other.itemID != null) || (this.itemID != null && !this.itemID.equals(other.itemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Rating[ itemID=" + itemID + " ]";
    }
    
}
