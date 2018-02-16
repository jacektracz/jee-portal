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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_ranks", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaRanks.findAll", query = "SELECT j FROM Joo2KunenaRanks j"),
    @NamedQuery(name = "Joo2KunenaRanks.findByRankId", query = "SELECT j FROM Joo2KunenaRanks j WHERE j.rankId = :rankId"),
    @NamedQuery(name = "Joo2KunenaRanks.findByRankTitle", query = "SELECT j FROM Joo2KunenaRanks j WHERE j.rankTitle = :rankTitle"),
    @NamedQuery(name = "Joo2KunenaRanks.findByRankMin", query = "SELECT j FROM Joo2KunenaRanks j WHERE j.rankMin = :rankMin"),
    @NamedQuery(name = "Joo2KunenaRanks.findByRankSpecial", query = "SELECT j FROM Joo2KunenaRanks j WHERE j.rankSpecial = :rankSpecial"),
    @NamedQuery(name = "Joo2KunenaRanks.findByRankImage", query = "SELECT j FROM Joo2KunenaRanks j WHERE j.rankImage = :rankImage")})
public class Joo2KunenaRanks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rank_id", nullable = false)
    private Integer rankId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "rank_title", nullable = false, length = 255)
    private String rankTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rank_min", nullable = false)
    private int rankMin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rank_special", nullable = false)
    private boolean rankSpecial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "rank_image", nullable = false, length = 255)
    private String rankImage;

    public Joo2KunenaRanks() {
    }

    public Joo2KunenaRanks(Integer rankId) {
        this.rankId = rankId;
    }

    public Joo2KunenaRanks(Integer rankId, String rankTitle, int rankMin, boolean rankSpecial, String rankImage) {
        this.rankId = rankId;
        this.rankTitle = rankTitle;
        this.rankMin = rankMin;
        this.rankSpecial = rankSpecial;
        this.rankImage = rankImage;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankTitle() {
        return rankTitle;
    }

    public void setRankTitle(String rankTitle) {
        this.rankTitle = rankTitle;
    }

    public int getRankMin() {
        return rankMin;
    }

    public void setRankMin(int rankMin) {
        this.rankMin = rankMin;
    }

    public boolean getRankSpecial() {
        return rankSpecial;
    }

    public void setRankSpecial(boolean rankSpecial) {
        this.rankSpecial = rankSpecial;
    }

    public String getRankImage() {
        return rankImage;
    }

    public void setRankImage(String rankImage) {
        this.rankImage = rankImage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rankId != null ? rankId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaRanks)) {
            return false;
        }
        Joo2KunenaRanks other = (Joo2KunenaRanks) object;
        if ((this.rankId == null && other.rankId != null) || (this.rankId != null && !this.rankId.equals(other.rankId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaRanks[ rankId=" + rankId + " ]";
    }
    
}
