/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "joo2_banner_tracks", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2BannerTracks.findAll", query = "SELECT j FROM Joo2BannerTracks j"),
    @NamedQuery(name = "Joo2BannerTracks.findByTrackDate", query = "SELECT j FROM Joo2BannerTracks j WHERE j.joo2BannerTracksPK.trackDate = :trackDate"),
    @NamedQuery(name = "Joo2BannerTracks.findByTrackType", query = "SELECT j FROM Joo2BannerTracks j WHERE j.joo2BannerTracksPK.trackType = :trackType"),
    @NamedQuery(name = "Joo2BannerTracks.findByBannerId", query = "SELECT j FROM Joo2BannerTracks j WHERE j.joo2BannerTracksPK.bannerId = :bannerId"),
    @NamedQuery(name = "Joo2BannerTracks.findByCount", query = "SELECT j FROM Joo2BannerTracks j WHERE j.count = :count")})
public class Joo2BannerTracks implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2BannerTracksPK joo2BannerTracksPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count", nullable = false)
    private int count;

    public Joo2BannerTracks() {
    }

    public Joo2BannerTracks(Joo2BannerTracksPK joo2BannerTracksPK) {
        this.joo2BannerTracksPK = joo2BannerTracksPK;
    }

    public Joo2BannerTracks(Joo2BannerTracksPK joo2BannerTracksPK, int count) {
        this.joo2BannerTracksPK = joo2BannerTracksPK;
        this.count = count;
    }

    public Joo2BannerTracks(Date trackDate, int trackType, int bannerId) {
        this.joo2BannerTracksPK = new Joo2BannerTracksPK(trackDate, trackType, bannerId);
    }

    public Joo2BannerTracksPK getJoo2BannerTracksPK() {
        return joo2BannerTracksPK;
    }

    public void setJoo2BannerTracksPK(Joo2BannerTracksPK joo2BannerTracksPK) {
        this.joo2BannerTracksPK = joo2BannerTracksPK;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2BannerTracksPK != null ? joo2BannerTracksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2BannerTracks)) {
            return false;
        }
        Joo2BannerTracks other = (Joo2BannerTracks) object;
        if ((this.joo2BannerTracksPK == null && other.joo2BannerTracksPK != null) || (this.joo2BannerTracksPK != null && !this.joo2BannerTracksPK.equals(other.joo2BannerTracksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2BannerTracks[ joo2BannerTracksPK=" + joo2BannerTracksPK + " ]";
    }
    
}
