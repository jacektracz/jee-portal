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
@Table(name = "joo2_phocagallery_votes_statistics", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findAll", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j"),
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findById", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findByCatid", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findByCount", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j WHERE j.count = :count"),
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findByAverage", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j WHERE j.average = :average"),
    @NamedQuery(name = "Joo2PhocagalleryVotesStatistics.findByLanguage", query = "SELECT j FROM Joo2PhocagalleryVotesStatistics j WHERE j.language = :language")})
public class Joo2PhocagalleryVotesStatistics implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count", nullable = false)
    private int count;
    @Basic(optional = false)
    @NotNull
    @Column(name = "average", nullable = false)
    private float average;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2PhocagalleryVotesStatistics() {
    }

    public Joo2PhocagalleryVotesStatistics(Integer id) {
        this.id = id;
    }

    public Joo2PhocagalleryVotesStatistics(Integer id, int catid, int count, float average, String language) {
        this.id = id;
        this.catid = catid;
        this.count = count;
        this.average = average;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
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
        if (!(object instanceof Joo2PhocagalleryVotesStatistics)) {
            return false;
        }
        Joo2PhocagalleryVotesStatistics other = (Joo2PhocagalleryVotesStatistics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2PhocagalleryVotesStatistics[ id=" + id + " ]";
    }
    
}
