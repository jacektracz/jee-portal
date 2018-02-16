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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_menu", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"client_id", "parent_id", "alias"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Menu.findAll", query = "SELECT j FROM Joo2Menu j"),
    @NamedQuery(name = "Joo2Menu.findById", query = "SELECT j FROM Joo2Menu j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Menu.findByMenutype", query = "SELECT j FROM Joo2Menu j WHERE j.menutype = :menutype"),
    @NamedQuery(name = "Joo2Menu.findByTitle", query = "SELECT j FROM Joo2Menu j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Menu.findByAlias", query = "SELECT j FROM Joo2Menu j WHERE j.alias = :alias"),
    @NamedQuery(name = "Joo2Menu.findByNote", query = "SELECT j FROM Joo2Menu j WHERE j.note = :note"),
    @NamedQuery(name = "Joo2Menu.findByPath", query = "SELECT j FROM Joo2Menu j WHERE j.path = :path"),
    @NamedQuery(name = "Joo2Menu.findByLink", query = "SELECT j FROM Joo2Menu j WHERE j.link = :link"),
    @NamedQuery(name = "Joo2Menu.findByType", query = "SELECT j FROM Joo2Menu j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2Menu.findByPublished", query = "SELECT j FROM Joo2Menu j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Menu.findByParentId", query = "SELECT j FROM Joo2Menu j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2Menu.findByLevel", query = "SELECT j FROM Joo2Menu j WHERE j.level = :level"),
    @NamedQuery(name = "Joo2Menu.findByComponentId", query = "SELECT j FROM Joo2Menu j WHERE j.componentId = :componentId"),
    @NamedQuery(name = "Joo2Menu.findByOrdering", query = "SELECT j FROM Joo2Menu j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2Menu.findByCheckedOut", query = "SELECT j FROM Joo2Menu j WHERE j.checkedOut = :checkedOut"),
    @NamedQuery(name = "Joo2Menu.findByCheckedOutTime", query = "SELECT j FROM Joo2Menu j WHERE j.checkedOutTime = :checkedOutTime"),
    @NamedQuery(name = "Joo2Menu.findByBrowserNav", query = "SELECT j FROM Joo2Menu j WHERE j.browserNav = :browserNav"),
    @NamedQuery(name = "Joo2Menu.findByAccess", query = "SELECT j FROM Joo2Menu j WHERE j.access = :access"),
    @NamedQuery(name = "Joo2Menu.findByImg", query = "SELECT j FROM Joo2Menu j WHERE j.img = :img"),
    @NamedQuery(name = "Joo2Menu.findByTemplateStyleId", query = "SELECT j FROM Joo2Menu j WHERE j.templateStyleId = :templateStyleId"),
    @NamedQuery(name = "Joo2Menu.findByLft", query = "SELECT j FROM Joo2Menu j WHERE j.lft = :lft"),
    @NamedQuery(name = "Joo2Menu.findByRgt", query = "SELECT j FROM Joo2Menu j WHERE j.rgt = :rgt"),
    @NamedQuery(name = "Joo2Menu.findByHome", query = "SELECT j FROM Joo2Menu j WHERE j.home = :home"),
    @NamedQuery(name = "Joo2Menu.findByLanguage", query = "SELECT j FROM Joo2Menu j WHERE j.language = :language"),
    @NamedQuery(name = "Joo2Menu.findByClientId", query = "SELECT j FROM Joo2Menu j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2Menu.findByEpCatid", query = "SELECT j FROM Joo2Menu j WHERE j.epCatid = :epCatid"),
    @NamedQuery(name = "Joo2Menu.findByEpCopyFrom", query = "SELECT j FROM Joo2Menu j WHERE j.epCopyFrom = :epCopyFrom"),
    @NamedQuery(name = "Joo2Menu.findByEpRefresh", query = "SELECT j FROM Joo2Menu j WHERE j.epRefresh = :epRefresh"),
    @NamedQuery(name = "Joo2Menu.findByEpOrdering", query = "SELECT j FROM Joo2Menu j WHERE j.epOrdering = :epOrdering"),
    @NamedQuery(name = "Joo2Menu.findByEptLft", query = "SELECT j FROM Joo2Menu j WHERE j.eptLft = :eptLft"),
    @NamedQuery(name = "Joo2Menu.findByEptRgt", query = "SELECT j FROM Joo2Menu j WHERE j.eptRgt = :eptRgt"),
    @NamedQuery(name = "Joo2Menu.findByEptCount", query = "SELECT j FROM Joo2Menu j WHERE j.eptCount = :eptCount"),
    @NamedQuery(name = "Joo2Menu.findByEpRgt", query = "SELECT j FROM Joo2Menu j WHERE j.epRgt = :epRgt"),
    @NamedQuery(name = "Joo2Menu.findByEpCount", query = "SELECT j FROM Joo2Menu j WHERE j.epCount = :epCount"),
    @NamedQuery(name = "Joo2Menu.findByEpLft", query = "SELECT j FROM Joo2Menu j WHERE j.epLft = :epLft"),
    @NamedQuery(name = "Joo2Menu.findByEpLftBck", query = "SELECT j FROM Joo2Menu j WHERE j.epLftBck = :epLftBck"),
    @NamedQuery(name = "Joo2Menu.findByEpRgtBck", query = "SELECT j FROM Joo2Menu j WHERE j.epRgtBck = :epRgtBck")})
public class Joo2Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "menutype", nullable = false, length = 24)
    private String menutype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alias", nullable = false, length = 255)
    private String alias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "note", nullable = false, length = 255)
    private String note;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "path", nullable = false, length = 1024)
    private String path;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "link", nullable = false, length = 1024)
    private String link;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "type", nullable = false, length = 16)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private short published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id", nullable = false)
    private int parentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level", nullable = false)
    private int level;
    @Basic(optional = false)
    @NotNull
    @Column(name = "component_id", nullable = false)
    private int componentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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
    @Column(name = "browserNav", nullable = false)
    private short browserNav;
    @Column(name = "access")
    private Integer access;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "img", nullable = false, length = 255)
    private String img;
    @Basic(optional = false)
    @NotNull
    @Column(name = "template_style_id", nullable = false)
    private int templateStyleId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lft", nullable = false)
    private int lft;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rgt", nullable = false)
    private int rgt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "home", nullable = false)
    private short home;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "language", nullable = false, length = 7)
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id", nullable = false)
    private short clientId;
    @Column(name = "ep_catid")
    private Integer epCatid;
    @Column(name = "ep_copy_from")
    private Integer epCopyFrom;
    @Size(max = 32)
    @Column(name = "ep_refresh", length = 32)
    private String epRefresh;
    @Column(name = "ep_ordering")
    private Integer epOrdering;
    @Size(max = 32)
    @Column(name = "ept_lft", length = 32)
    private String eptLft;
    @Size(max = 32)
    @Column(name = "ept_rgt", length = 32)
    private String eptRgt;
    @Size(max = 32)
    @Column(name = "ept_count", length = 32)
    private String eptCount;
    @Size(max = 32)
    @Column(name = "ep_rgt", length = 32)
    private String epRgt;
    @Size(max = 32)
    @Column(name = "ep_count", length = 32)
    private String epCount;
    @Column(name = "ep_lft")
    private Integer epLft;
    @Column(name = "ep_lft_bck")
    private Integer epLftBck;
    @Column(name = "ep_rgt_bck")
    private Integer epRgtBck;

    public Joo2Menu() {
    }

    public Joo2Menu(Integer id) {
        this.id = id;
    }

    public Joo2Menu(Integer id, String menutype, String title, String alias, String note, String path, String link, String type, short published, int parentId, int level, int componentId, int ordering, int checkedOut, Date checkedOutTime, short browserNav, String img, int templateStyleId, String params, int lft, int rgt, short home, String language, short clientId) {
        this.id = id;
        this.menutype = menutype;
        this.title = title;
        this.alias = alias;
        this.note = note;
        this.path = path;
        this.link = link;
        this.type = type;
        this.published = published;
        this.parentId = parentId;
        this.level = level;
        this.componentId = componentId;
        this.ordering = ordering;
        this.checkedOut = checkedOut;
        this.checkedOutTime = checkedOutTime;
        this.browserNav = browserNav;
        this.img = img;
        this.templateStyleId = templateStyleId;
        this.params = params;
        this.lft = lft;
        this.rgt = rgt;
        this.home = home;
        this.language = language;
        this.clientId = clientId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getPublished() {
        return published;
    }

    public void setPublished(short published) {
        this.published = published;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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

    public short getBrowserNav() {
        return browserNav;
    }

    public void setBrowserNav(short browserNav) {
        this.browserNav = browserNav;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getTemplateStyleId() {
        return templateStyleId;
    }

    public void setTemplateStyleId(int templateStyleId) {
        this.templateStyleId = templateStyleId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
    }

    public short getHome() {
        return home;
    }

    public void setHome(short home) {
        this.home = home;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public short getClientId() {
        return clientId;
    }

    public void setClientId(short clientId) {
        this.clientId = clientId;
    }

    public Integer getEpCatid() {
        return epCatid;
    }

    public void setEpCatid(Integer epCatid) {
        this.epCatid = epCatid;
    }

    public Integer getEpCopyFrom() {
        return epCopyFrom;
    }

    public void setEpCopyFrom(Integer epCopyFrom) {
        this.epCopyFrom = epCopyFrom;
    }

    public String getEpRefresh() {
        return epRefresh;
    }

    public void setEpRefresh(String epRefresh) {
        this.epRefresh = epRefresh;
    }

    public Integer getEpOrdering() {
        return epOrdering;
    }

    public void setEpOrdering(Integer epOrdering) {
        this.epOrdering = epOrdering;
    }

    public String getEptLft() {
        return eptLft;
    }

    public void setEptLft(String eptLft) {
        this.eptLft = eptLft;
    }

    public String getEptRgt() {
        return eptRgt;
    }

    public void setEptRgt(String eptRgt) {
        this.eptRgt = eptRgt;
    }

    public String getEptCount() {
        return eptCount;
    }

    public void setEptCount(String eptCount) {
        this.eptCount = eptCount;
    }

    public String getEpRgt() {
        return epRgt;
    }

    public void setEpRgt(String epRgt) {
        this.epRgt = epRgt;
    }

    public String getEpCount() {
        return epCount;
    }

    public void setEpCount(String epCount) {
        this.epCount = epCount;
    }

    public Integer getEpLft() {
        return epLft;
    }

    public void setEpLft(Integer epLft) {
        this.epLft = epLft;
    }

    public Integer getEpLftBck() {
        return epLftBck;
    }

    public void setEpLftBck(Integer epLftBck) {
        this.epLftBck = epLftBck;
    }

    public Integer getEpRgtBck() {
        return epRgtBck;
    }

    public void setEpRgtBck(Integer epRgtBck) {
        this.epRgtBck = epRgtBck;
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
        if (!(object instanceof Joo2Menu)) {
            return false;
        }
        Joo2Menu other = (Joo2Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Menu[ id=" + id + " ]";
    }
    
}
