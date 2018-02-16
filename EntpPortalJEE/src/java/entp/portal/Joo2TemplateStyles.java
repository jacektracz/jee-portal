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
@Table(name = "joo2_template_styles", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2TemplateStyles.findAll", query = "SELECT j FROM Joo2TemplateStyles j"),
    @NamedQuery(name = "Joo2TemplateStyles.findById", query = "SELECT j FROM Joo2TemplateStyles j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2TemplateStyles.findByTemplate", query = "SELECT j FROM Joo2TemplateStyles j WHERE j.template = :template"),
    @NamedQuery(name = "Joo2TemplateStyles.findByClientId", query = "SELECT j FROM Joo2TemplateStyles j WHERE j.clientId = :clientId"),
    @NamedQuery(name = "Joo2TemplateStyles.findByHome", query = "SELECT j FROM Joo2TemplateStyles j WHERE j.home = :home"),
    @NamedQuery(name = "Joo2TemplateStyles.findByTitle", query = "SELECT j FROM Joo2TemplateStyles j WHERE j.title = :title")})
public class Joo2TemplateStyles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "template", nullable = false, length = 50)
    private String template;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id", nullable = false)
    private boolean clientId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "home", nullable = false, length = 7)
    private String home;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;

    public Joo2TemplateStyles() {
    }

    public Joo2TemplateStyles(Integer id) {
        this.id = id;
    }

    public Joo2TemplateStyles(Integer id, String template, boolean clientId, String home, String title, String params) {
        this.id = id;
        this.template = template;
        this.clientId = clientId;
        this.home = home;
        this.title = title;
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public boolean getClientId() {
        return clientId;
    }

    public void setClientId(boolean clientId) {
        this.clientId = clientId;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        if (!(object instanceof Joo2TemplateStyles)) {
            return false;
        }
        Joo2TemplateStyles other = (Joo2TemplateStyles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2TemplateStyles[ id=" + id + " ]";
    }
    
}
