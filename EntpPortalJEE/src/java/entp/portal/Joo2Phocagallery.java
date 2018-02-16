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
@Table(name = "joo2_phocagallery", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Phocagallery.findAll", query = "SELECT j FROM Joo2Phocagallery j"),
    @NamedQuery(name = "Joo2Phocagallery.findById", query = "SELECT j FROM Joo2Phocagallery j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Phocagallery.findByCatid", query = "SELECT j FROM Joo2Phocagallery j WHERE j.catid = :catid"),
    @NamedQuery(name = "Joo2Phocagallery.findBySid", query = "SELECT j FROM Joo2Phocagallery j WHERE j.sid = :sid"),
    @NamedQuery(name = "Joo2Phocagallery.findByTitle", query = "SELECT j FROM Joo2Phocagallery j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Phocagallery.findByAlias", query = "SELECT j FROM Joo2Phocagallery j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Phocagallery.findByFilename", query = "SELECT j FROM Joo2Phocagallery j WHERE j.filename = :filename"),
    @NamedQuery(name = "Joo2Phocagallery.findByDate", query = "SELECT j FROM Joo2Phocagallery j WHERE j.date = :date"),
    @NamedQuery(name = "Joo2Phocagallery.findByHits", query = "SELECT j FROM Joo2Phocagallery j WHERE j.hits = :hits"),
    @NamedQuery(name = "Joo2Phocagallery.findByLatitude", query = "SELECT j FROM Joo2Phocagallery j WHERE j.latitude = :latitude"),
    @NamedQuery(name = "Joo2Phocagallery.findByLongitude", query = "SELECT j FROM Joo2Phocagallery j WHERE j.longitude = :longitude"),
    @NamedQuery(name = "Joo2Phocagallery.findByZoom", query = "SELECT j FROM Joo2Phocagallery j WHERE j.zoom = :zoom"),
    @NamedQuery(name = "Joo2Phocagallery.findByGeotitle", query = "SELECT j FROM Joo2Phocagallery j WHERE j.geotitle = :geotitle"),
    @NamedQuery(name = "Joo2Phocagallery.findByUserid", query = "SELECT j FROM Joo2Phocagallery j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2Phocagallery.findByVmproductid", query = "SELECT j FROM Joo2Phocagallery j WHERE j.vmproductid = :vmproductid"),
    @NamedQuery(name = "Joo2Phocagallery.findByImgorigsize", query = "SELECT j FROM Joo2Phocagallery j WHERE j.imgorigsize = :imgorigsize"),
    @NamedQuery(name = "Joo2Phocagallery.findByPublished", query = "SELECT j FROM Joo2Phocagallery j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Phocagallery.findByApproved", query = "SELECT j FROM Joo2Phocagallery j WHERE j.approved = :approved"),
    @NamedQuery(name = "Joo2Phocagallery.findByCheckedOut", query = "SELECT j FROM Joo2Phocagallery j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Phocagallery.findByCheckedOutTime", query = "SELECT j FROM Joo2Phocagallery j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Phocagallery.findByOrdering", query = "SELECT j FROM Joo2Phocagallery j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Phocagallery.findByExtid", query = "SELECT j FROM Joo2Phocagallery j WHERE j.extid = :extid"),
    @NamedQuery(name = "Joo2Phocagallery.findByExttype", query = "SELECT j FROM Joo2Phocagallery j WHERE j.exttype = :exttype"),
    @NamedQuery(name = "Joo2Phocagallery.findByExtl", query = "SELECT j FROM Joo2Phocagallery j WHERE j.extl = :extl"),
    @NamedQuery(name = "Joo2Phocagallery.findByExtm", query = "SELECT j FROM Joo2Phocagallery j WHERE j.extm = :extm"),
    @NamedQuery(name = "Joo2Phocagallery.findByExts", query = "SELECT j FROM Joo2Phocagallery j WHERE j.exts = :exts"),
    @NamedQuery(name = "Joo2Phocagallery.findByExto", query = "SELECT j FROM Joo2Phocagallery j WHERE j.exto = :exto"),
    @NamedQuery(name = "Joo2Phocagallery.findByExtw", query = "SELECT j FROM Joo2Phocagallery j WHERE j.extw = :extw"),
    @NamedQuery(name = "Joo2Phocagallery.findByExth", query = "SELECT j FROM Joo2Phocagallery j WHERE j.exth = :exth"),
    @NamedQuery(name = "Joo2Phocagallery.findByLanguage", query = "SELECT j FROM Joo2Phocagallery j WHERE j.language = :language")})
public class Joo2Phocagallery implements Serializable {
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
    @Column(name = "sid", nullable = false)
    private int sid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "title", nullable = false, length = 250)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "filename", nullable = false, length = 250)
    private String filename;
    @Lob
    @Size(max = 65535)
    @Column(name = "description", length = 65535)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits", nullable = false)
    private int hits;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "latitude", nullable = false, length = 20)
    private String latitude;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "longitude", nullable = false, length = 20)
    private String longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zoom", nullable = false)
    private int zoom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "geotitle", nullable = false, length = 255)
    private String geotitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private int userid;
    @Lob
    @Size(max = 65535)
    @Column(name = "videocode", length = 65535)
    private String videocode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vmproductid", nullable = false)
    private int vmproductid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "imgorigsize", nullable = false)
    private int imgorigsize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approved", nullable = false)
    private boolean approved;
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
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Lob
    @Size(max = 65535)
    @Column(name = "params", length = 65535)
    private String params;
    @Lob
    @Size(max = 65535)
    @Column(name = "metakey", length = 65535)
    private String metakey;
    @Lob
    @Size(max = 65535)
    @Column(name = "metadesc", length = 65535)
    private String metadesc;
    @Lob
    @Size(max = 65535)
    @Column(name = "metadata", length = 65535)
    private String metadata;
    @Lob
    @Size(max = 65535)
    @Column(name = "extlink1", length = 65535)
    private String extlink1;
    @Lob
    @Size(max = 65535)
    @Column(name = "extlink2", length = 65535)
    private String extlink2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extid", nullable = false, length = 255)
    private String extid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exttype", nullable = false)
    private boolean exttype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extl", nullable = false, length = 255)
    private String extl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extm", nullable = false, length = 255)
    private String extm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "exts", nullable = false, length = 255)
    private String exts;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "exto", nullable = false, length = 255)
    private String exto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "extw", nullable = false, length = 255)
    private String extw;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "exth", nullable = false, length = 255)
    private String exth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;

    public Joo2Phocagallery() {
    }

    public Joo2Phocagallery(Integer id) {
        this.id = id;
    }

    public Joo2Phocagallery(Integer id, int catid, int sid, String title, String alias, String filename, Date date, int hits, String latitude, String longitude, int zoom, String geotitle, int userid, int vmproductid, int imgorigsize, boolean published, boolean approved, int checkedOut, Date checkedOutTime, int ordering, String extid, boolean exttype, String extl, String extm, String exts, String exto, String extw, String exth, String language) {
        this.id = id;
        this.catid = catid;
        this.sid = sid;
        this.title = title;
        this.alias = alias;
        this.filename = filename;
        this.date = date;
        this.hits = hits;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
        this.geotitle = geotitle;
        this.userid = userid;
        this.vmproductid = vmproductid;
        this.imgorigsize = imgorigsize;
        this.published = published;
        this.approved = approved;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.ordering = ordering;
        this.extid = extid;
        this.exttype = exttype;
        this.extl = extl;
        this.extm = extm;
        this.exts = exts;
        this.exto = exto;
        this.extw = extw;
        this.exth = exth;
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

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public String getGeotitle() {
        return geotitle;
    }

    public void setGeotitle(String geotitle) {
        this.geotitle = geotitle;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getVideocode() {
        return videocode;
    }

    public void setVideocode(String videocode) {
        this.videocode = videocode;
    }

    public int getVmproductid() {
        return vmproductid;
    }

    public void setVmproductid(int vmproductid) {
        this.vmproductid = vmproductid;
    }

    public int getImgorigsize() {
        return imgorigsize;
    }

    public void setImgorigsize(int imgorigsize) {
        this.imgorigsize = imgorigsize;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
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

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getExtlink1() {
        return extlink1;
    }

    public void setExtlink1(String extlink1) {
        this.extlink1 = extlink1;
    }

    public String getExtlink2() {
        return extlink2;
    }

    public void setExtlink2(String extlink2) {
        this.extlink2 = extlink2;
    }

    public String getExtid() {
        return extid;
    }

    public void setExtid(String extid) {
        this.extid = extid;
    }

    public boolean getExttype() {
        return exttype;
    }

    public void setExttype(boolean exttype) {
        this.exttype = exttype;
    }

    public String getExtl() {
        return extl;
    }

    public void setExtl(String extl) {
        this.extl = extl;
    }

    public String getExtm() {
        return extm;
    }

    public void setExtm(String extm) {
        this.extm = extm;
    }

    public String getExts() {
        return exts;
    }

    public void setExts(String exts) {
        this.exts = exts;
    }

    public String getExto() {
        return exto;
    }

    public void setExto(String exto) {
        this.exto = exto;
    }

    public String getExtw() {
        return extw;
    }

    public void setExtw(String extw) {
        this.extw = extw;
    }

    public String getExth() {
        return exth;
    }

    public void setExth(String exth) {
        this.exth = exth;
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
        if (!(object instanceof Joo2Phocagallery)) {
            return false;
        }
        Joo2Phocagallery other = (Joo2Phocagallery) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Phocagallery[ id=" + id + " ]";
    }
    
}
