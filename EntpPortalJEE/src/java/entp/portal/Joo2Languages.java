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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_languages", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"sef"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Languages.findAll", query = "SELECT j FROM Joo2Languages j"),
    @NamedQuery(name = "Joo2Languages.findByLangId", query = "SELECT j FROM Joo2Languages j WHERE j.langId = :langId"),
    @NamedQuery(name = "Joo2Languages.findByLangCode", query = "SELECT j FROM Joo2Languages j WHERE j.langCode = :langCode"),
    @NamedQuery(name = "Joo2Languages.findByTitle", query = "SELECT j FROM Joo2Languages j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2Languages.findByTitleNative", query = "SELECT j FROM Joo2Languages j WHERE j.titleNative = :titleNative"),
    @NamedQuery(name = "Joo2Languages.findBySef", query = "SELECT j FROM Joo2Languages j WHERE j.sef = :sef"),
    @NamedQuery(name = "Joo2Languages.findByImage", query = "SELECT j FROM Joo2Languages j WHERE j.image = :image"),
    @NamedQuery(name = "Joo2Languages.findByDescription", query = "SELECT j FROM Joo2Languages j WHERE j.description = :description"),
    @NamedQuery(name = "Joo2Languages.findBySitename", query = "SELECT j FROM Joo2Languages j WHERE j.sitename = :sitename"),
    @NamedQuery(name = "Joo2Languages.findByPublished", query = "SELECT j FROM Joo2Languages j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2Languages.findByOrdering", query = "SELECT j FROM Joo2Languages j WHERE j.ordering = :ordering")})
public class Joo2Languages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lang_id", nullable = false)
    private Integer langId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "lang_code", nullable = false, length = 7)
    private String langCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "title_native", nullable = false, length = 50)
    private String titleNative;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "sef", nullable = false, length = 50)
    private String sef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "image", nullable = false, length = 50)
    private String image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "description", nullable = false, length = 512)
    private String description;
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
    @Column(name = "metadesc", nullable = false, length = 65535)
    private String metadesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(name = "sitename", nullable = false, length = 1024)
    private String sitename;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private int published;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;

    public Joo2Languages() {
    }

    public Joo2Languages(Integer langId) {
        this.langId = langId;
    }

    public Joo2Languages(Integer langId, String langCode, String title, String titleNative, String sef, String image, String description, String metakey, String metadesc, String sitename, int published, int ordering) {
        this.langId = langId;
        this.langCode = langCode;
        this.title = title;
        this.titleNative = titleNative;
        this.sef = sef;
        this.image = image;
        this.description = description;
        this.metakey = metakey;
        this.metadesc = metadesc;
        this.sitename = sitename;
        this.published = published;
        this.ordering = ordering;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleNative() {
        return titleNative;
    }

    public void setTitleNative(String titleNative) {
        this.titleNative = titleNative;
    }

    public String getSef() {
        return sef;
    }

    public void setSef(String sef) {
        this.sef = sef;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (langId != null ? langId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Languages)) {
            return false;
        }
        Joo2Languages other = (Joo2Languages) object;
        if ((this.langId == null && other.langId != null) || (this.langId != null && !this.langId.equals(other.langId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Languages[ langId=" + langId + " ]";
    }
    
}
