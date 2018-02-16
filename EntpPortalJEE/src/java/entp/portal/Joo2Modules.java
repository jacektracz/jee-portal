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
@Table(name = "joo2_modules", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Modules.findAll", query = "SELECT j FROM Joo2Modules j"),
    @NamedQuery(name = "Joo2Modules.findById", query = "SELECT j FROM Joo2Modules j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Modules.findByTitle", query = "SELECT j FROM Joo2Modules j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Modules.findByNote", query = "SELECT j FROM Joo2Modules j WHERE j.note = :note"),
    @NamedQuery(name = "Joo2Modules.findByOrdering", query = "SELECT j FROM Joo2Modules j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Modules.findByPosition", query = "SELECT j FROM Joo2Modules j WHERE j.position = :position"),
    @NamedQuery(name = "Joo2Modules.findByCheckedOut", query = "SELECT j FROM Joo2Modules j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Modules.findByCheckedOutTime", query = "SELECT j FROM Joo2Modules j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Modules.findByPublishUp", query = "SELECT j FROM Joo2Modules j WHERE j.publishUp = :publishUp"),
    @NamedQuery(name = "Joo2Modules.findByPublishDown", query = "SELECT j FROM Joo2Modules j WHERE j.publishDown = :publishDown"),
    @NamedQuery(name = "Joo2Modules.findByPublished", query = "SELECT j FROM Joo2Modules j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Modules.findByModule", query = "SELECT j FROM Joo2Modules j WHERE j.module = :module"),
    @NamedQuery(name = "Joo2Modules.findByAccess", query = "SELECT j FROM Joo2Modules j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Modules.findByShowtitle", query = "SELECT j FROM Joo2Modules j WHERE j.showtitle = :showtitle"),
    @NamedQuery(name = "Joo2Modules.findByClientId", query = "SELECT j FROM Joo2Modules j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2Modules.findByLanguage", query = "SELECT j FROM Joo2Modules j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Modules.findByEpRootCatId", query = "SELECT j FROM Joo2Modules j WHERE j.epRootCatId = :epRootCatId"),
    @NamedQuery(name = "Joo2Modules.findByEpRootMenuId", query = "SELECT j FROM Joo2Modules j WHERE j.epRootMenuId = :epRootMenuId")})
public class Joo2Modules implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "note", nullable = false, length = 255)
    private String note;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "content", nullable = false, length = 65535)
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
    @Size(max = 50)
    @Column(name = "position", length = 50)
    private String position;
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
    @Column(name = "published", nullable = false)
    private boolean published;
    @Size(max = 50)
    @Column(name = "module", length = 50)
    private String module;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Column(name = "showtitle", nullable = false)
    private short showtitle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id", nullable = false)
    private short clientId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Column(name = "ep_root_cat_id")
    private Integer epRootCatId;
    @Column(name = "ep_root_menu_id")
    private Integer epRootMenuId;

    public Joo2Modules() {
    }

    public Joo2Modules(Integer id) {
        this.id = id;
    }

    public Joo2Modules(Integer id, String title, String note, String content, int ordering, int checkedOut, Date checkedOutTime, Date publishUp, Date publishDown, boolean published, short showtitle, String params, short clientId, String language) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.content = content;
        this.ordering = ordering;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.publishUp = publishUp;
        this.publishDown = publishDown;
        this.published = published;
        this.showtitle = showtitle;
        this.params = params;
        this.clientId = clientId;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public short getShowtitle() {
        return showtitle;
    }

    public void setShowtitle(short showtitle) {
        this.showtitle = showtitle;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public short getClientId() {
        return clientId;
    }

    public void setClientId(short clientId) {
        this.clientId = clientId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getEpRootCatId() {
        return epRootCatId;
    }

    public void setEpRootCatId(Integer epRootCatId) {
        this.epRootCatId = epRootCatId;
    }

    public Integer getEpRootMenuId() {
        return epRootMenuId;
    }

    public void setEpRootMenuId(Integer epRootMenuId) {
        this.epRootMenuId = epRootMenuId;
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
        if (!(object instanceof Joo2Modules)) {
            return false;
        }
        Joo2Modules other = (Joo2Modules) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Modules[ id=" + id + " ]";
    }
    
}
