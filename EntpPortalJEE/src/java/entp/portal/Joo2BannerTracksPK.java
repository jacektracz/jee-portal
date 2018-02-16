/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jacek
 */
@Embeddable
public class Joo2BannerTracksPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "track_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date trackDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "track_type", nullable = false)
    private int trackType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "banner_id", nullable = false)
    private int bannerId;

    public Joo2BannerTracksPK() {
    }

    public Joo2BannerTracksPK(Date trackDate, int trackType, int bannerId) {
        this.trackDate = trackDate;
        this.trackType = trackType;
        this.bannerId = bannerId;
    }

    public Date getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(Date trackDate) {
        this.trackDate = trackDate;
    }

    public int getTrackType() {
        return trackType;
    }

    public void setTrackType(int trackType) {
        this.trackType = trackType;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackDate != null ? trackDate.hashCode() : 0);
        hash += (int) trackType;
        hash += (int) bannerId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2BannerTracksPK)) {
            return false;
        }
        Joo2BannerTracksPK other = (Joo2BannerTracksPK) object;
        if ((this.trackDate == null && other.trackDate != null) || (this.trackDate != null && !this.trackDate.equals(other.trackDate))) {
            return false;
        }
        if (this.trackType != other.trackType) {
            return false;
        }
        if (this.bannerId != other.bannerId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2BannerTracksPK[ trackDate=" + trackDate + ", trackType=" + trackType + ", bannerId=" + bannerId + " ]";
    }
    
}
