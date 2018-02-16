/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_banner_clients", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2BannerClients.findAll", query = "SELECT j FROM Joo2BannerClients j"),
    @NamedQuery(name = "Joo2BannerClients.findById", query = "SELECT j FROM Joo2BannerClients j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2BannerClients.findByName", query = "SELECT j FROM Joo2BannerClients j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2BannerClients.findByContact", query = "SELECT j FROM Joo2BannerClients j WHERE j.contact = :contact"),
    @NamedQuery(name = "Joo2BannerClients.findByEmail", query = "SELECT j FROM Joo2BannerClients j WHERE j.email = :email"),
    @NamedQuery(name = "Joo2BannerClients.findByState", query = "SELECT j FROM Joo2BannerClients j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2BannerClients.findByCheckedOut", query = "SELECT j FROM Joo2BannerClients j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2BannerClients.findByCheckedOutTime", query = "SELECT j FROM Joo2BannerClients j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2BannerClients.findByOwnPrefix", query = "SELECT j FROM Joo2BannerClients j WHERE j.ownPrefix = :ownPrefix"),
    @NamedQuery(name = "Joo2BannerClients.findByMetakeyPrefix", query = "SELECT j FROM Joo2BannerClients j WHERE j.metakeyPrefix = :metakeyPrefix"),
    @NamedQuery(name = "Joo2BannerClients.findByPurchaseType", query = "SELECT j FROM Joo2BannerClients j WHERE j.purchaseType = :purchaseType"),
    @NamedQuery(name = "Joo2BannerClients.findByTrackClicks", query = "SELECT j FROM Joo2BannerClients j WHERE j.trackClicks = :trackClicks"),
    @NamedQuery(name = "Joo2BannerClients.findByTrackImpressions", query = "SELECT j FROM Joo2BannerClients j WHERE j.trackImpressions = :trackImpressions")})
public class Joo2BannerClients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "contact", nullable = false, length = 255)
    private String contact;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "extrainfo", nullable = false, length = 65535)
    private String extrainfo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state", nullable = false)
    private short state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out", nullable = false)
    private int checkedOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checked_out_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "own_prefix", nullable = false)
    private short ownPrefix;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "metakey_prefix", nullable = false, length = 255)
    private String metakeyPrefix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "purchase_type", nullable = false)
    private short purchaseType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "track_clicks", nullable = false)
    private short trackClicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "track_impressions", nullable = false)
    private short trackImpressions;

    public Joo2BannerClients() {
    }

    public Joo2BannerClients(Integer id) {
        this.id = id;
    }

    public Joo2BannerClients(Integer id, String name, String contact, String email, String extrainfo, short state, int checkedOut, Date checkedOutTime, String metakey, short ownPrefix, String metakeyPrefix, short purchaseType, short trackClicks, short trackImpressions) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.extrainfo = extrainfo;
        this.state = state;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.metakey = metakey;
        this.ownPrefix = ownPrefix;
        this.metakeyPrefix = metakeyPrefix;
        this.purchaseType = purchaseType;
        this.trackClicks = trackClicks;
        this.trackImpressions = trackImpressions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public short getOwnPrefix() {
        return ownPrefix;
    }

    public void setOwnPrefix(short ownPrefix) {
        this.ownPrefix = ownPrefix;
    }

    public String getMetakeyPrefix() {
        return metakeyPrefix;
    }

    public void setMetakeyPrefix(String metakeyPrefix) {
        this.metakeyPrefix = metakeyPrefix;
    }

    public short getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(short purchaseType) {
        this.purchaseType = purchaseType;
    }

    public short getTrackClicks() {
        return trackClicks;
    }

    public void setTrackClicks(short trackClicks) {
        this.trackClicks = trackClicks;
    }

    public short getTrackImpressions() {
        return trackImpressions;
    }

    public void setTrackImpressions(short trackImpressions) {
        this.trackImpressions = trackImpressions;
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
        if (!(object instanceof Joo2BannerClients)) {
            return false;
        }
        Joo2BannerClients other = (Joo2BannerClients) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2BannerClients[ id=" + id + " ]";
    }
    
}
