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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_content_tmp", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2ContentTmp.findAll", query = "SELECT j FROM Joo2ContentTmp j"),
    @NamedQuery(name = "Joo2ContentTmp.findById", query = "SELECT j FROM Joo2ContentTmp j WHERE j.id = :id")})
public class Joo2ContentTmp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "fulltext", nullable = false, length = 16777215)
    private String fulltext;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "introtext", nullable = false, length = 16777215)
    private String introtext;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "ep_href_main", nullable = false, length = 16777215)
    private String epHrefMain;

    public Joo2ContentTmp() {
    }

    public Joo2ContentTmp(Integer id) {
        this.id = id;
    }

    public Joo2ContentTmp(Integer id, String fulltext, String introtext, String epHrefMain) {
        this.id = id;
        this.fulltext = fulltext;
        this.introtext = introtext;
        this.epHrefMain = epHrefMain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    public String getEpHrefMain() {
        return epHrefMain;
    }

    public void setEpHrefMain(String epHrefMain) {
        this.epHrefMain = epHrefMain;
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
        if (!(object instanceof Joo2ContentTmp)) {
            return false;
        }
        Joo2ContentTmp other = (Joo2ContentTmp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ContentTmp[ id=" + id + " ]";
    }
    
}
