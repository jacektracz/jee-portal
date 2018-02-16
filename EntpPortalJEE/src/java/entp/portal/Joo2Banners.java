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
@Table(name = "joo2_banners", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Banners.findAll", query = "SELECT j FROM Joo2Banners j"),
    @NamedQuery(name = "Joo2Banners.findById", query = "SELECT j FROM Joo2Banners j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Banners.findByCid", query = "SELECT j FROM Joo2Banners j WHERE j.cid = :cid"),
    @NamedQuery(name = "Joo2Banners.findByType", query = "SELECT j FROM Joo2Banners j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2Banners.findByName", query = "SELECT j FROM Joo2Banners j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Banners.findByAlias", query = "SELECT j FROM Joo2Banners j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Banners.findByImptotal", query = "SELECT j FROM Joo2Banners j WHERE j.imptotal = :imptotal"),
    @NamedQuery(name = "Joo2Banners.findByImpmade", query = "SELECT j FROM Joo2Banners j WHERE j.impmade = :impmade"),
    @NamedQuery(name = "Joo2Banners.findByClicks", query = "SELECT j FROM Joo2Banners j WHERE j.clicks = :clicks"),
    @NamedQuery(name = "Joo2Banners.findByClickurl", query = "SELECT j FROM Joo2Banners j WHERE j.clickurl = :clickurl"),
    @NamedQuery(name = "Joo2Banners.findByState", query = "SELECT j FROM Joo2Banners j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2Banners.findByCatid", query = "SELECT j FROM Joo2Banners j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2Banners.findByCustombannercode", query = "SELECT j FROM Joo2Banners j WHERE j.custombannercode = :custombannercode"),
    @NamedQuery(name = "Joo2Banners.findBySticky", query = "SELECT j FROM Joo2Banners j WHERE j.sticky = :sticky"),
    @NamedQuery(name = "Joo2Banners.findByOrdering", query = "SELECT j FROM Joo2Banners j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Banners.findByOwnPrefix", query = "SELECT j FROM Joo2Banners j WHERE j.ownPrefix = :ownPrefix"),
    @NamedQuery(name = "Joo2Banners.findByMetakeyPrefix", query = "SELECT j FROM Joo2Banners j WHERE j.metakeyPrefix = :metakeyPrefix"),
    @NamedQuery(name = "Joo2Banners.findByPurchaseType", query = "SELECT j FROM Joo2Banners j WHERE j.purchaseType = :purchaseType"),
    @NamedQuery(name = "Joo2Banners.findByTrackClicks", query = "SELECT j FROM Joo2Banners j WHERE j.trackClicks = :trackClicks"),
    @NamedQuery(name = "Joo2Banners.findByTrackImpressions", query = "SELECT j FROM Joo2Banners j WHERE j.trackImpressions = :trackImpressions"),
    @NamedQuery(name = "Joo2Banners.findByCheckedOut", query = "SELECT j FROM Joo2Banners j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Banners.findByCheckedOutTime", query = "SELECT j FROM Joo2Banners j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Banners.findByPublishUp", query = "SELECT j FROM Joo2Banners j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2Banners.findByPublishDown", query = "SELECT j FROM Joo2Banners j WHERE j.publishDown = :publishDown"),
    @NamedQuery(name = "Joo2Banners.findByReset", query = "SELECT j FROM Joo2Banners j WHERE j.reset = :reset"),
    @NamedQuery(name = "Joo2Banners.findByCreated", query = "SELECT j FROM Joo2Banners j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2Banners.findByLanguage", query = "SELECT j FROM Joo2Banners j WHERE j.language = :language")})
public class Joo2Banners implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cid", nullable = false)
    private int cid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type", nullable = false)
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "imptotal", nullable = false)
    private int imptotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "impmade", nullable = false)
    private int impmade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clicks", nullable = false)
    private int clicks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "clickurl", nullable = false, length = 200)
    private String clickurl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state", nullable = false)
    private short state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catid", nullable = false)
    private int catid;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2048)
    @Column(name = "custombannercode", nullable = false, length = 2048)
    private String custombannercode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sticky", nullable = false)
    private boolean sticky;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "metakey", nullable = false, length = 65535)
    private String metakey;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Column(name = "own_prefix", nullable = false)
    private boolean ownPrefix;
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
    @Column(name = "publish_up", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publish_down", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDown;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reset", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date reset;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2Banners() {
    }

    public Joo2Banners(Integer id) {
        this.id = id;
    }

    public Joo2Banners(Integer id, int cid, int type, String name, String alias, int imptotal, int impmade, int clicks, String clickurl, short state, int catid, String description, String custombannercode, boolean sticky, int ordering, String metakey, String params, boolean ownPrefix, String metakeyPrefix, short purchaseType, short trackClicks, short trackImpressions, int checkedOut, Date checkedOutTime, Date publishUp, Date publishDown, Date reset, Date created, String language) {
        this.id = id;
        this.cid = cid;
        this.type = type;
        this.name = name;
        this.alias = alias;
        this.imptotal = imptotal;
        this.impmade = impmade;
        this.clicks = clicks;
        this.clickurl = clickurl;
        this.state = state;
        this.catid = catid;
        this.description = description;
        this.custombannercode = custombannercode;
        this.sticky = sticky;
        this.ordering = ordering;
        this.metakey = metakey;
        this.params = params;
        this.ownPrefix = ownPrefix;
        this.metakeyPrefix = metakeyPrefix;
        this.purchaseType = purchaseType;
        this.trackClicks = trackClicks;
        this.trackImpressions = trackImpressions;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.reset = reset;
        this.created = created;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getImptotal() {
        return imptotal;
    }

    public void setImptotal(int imptotal) {
        this.imptotal = imptotal;
    }

    public int getImpmade() {
        return impmade;
    }

    public void setImpmade(int impmade) {
        this.impmade = impmade;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public String getClickurl() {
        return clickurl;
    }

    public void setClickurl(String clickurl) {
        this.clickurl = clickurl;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustombannercode() {
        return custombannercode;
    }

    public void setCustombannercode(String custombannercode) {
        this.custombannercode = custombannercode;
    }

    public boolean getSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public boolean getOwnPrefix() {
        return ownPrefix;
    }

    public void setOwnPrefix(boolean ownPrefix) {
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

    public Date getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Date publishUp) {
        this.publishUp = publishUp;
    }

    public Date getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Date publishDown) {
        this.publishDown = publishDown;
    }

    public Date getReset() {
        return reset;
    }

    public void setReset(Date reset) {
        this.reset = reset;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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
        if (!(object instanceof Joo2Banners)) {
            return false;
        }
        Joo2Banners other = (Joo2Banners) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Banners[ id=" + id + " ]";
    }
    
}
