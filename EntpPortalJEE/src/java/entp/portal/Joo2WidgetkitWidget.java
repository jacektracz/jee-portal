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
@Table(name = "joo2_widgetkit_widget", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2WidgetkitWidget.findAll", query = "SELECT j FROM Joo2WidgetkitWidget j"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findById", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findByType", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.type = :type"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findByStyle", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.style = :style"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findByName", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findByCreated", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.created = :created"),
    @NamedQuery(name = "Joo2WidgetkitWidget.findByModified", query = "SELECT j FROM Joo2WidgetkitWidget j WHERE j.modified = :modified")})
public class Joo2WidgetkitWidget implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type", nullable = false, length = 255)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "style", nullable = false, length = 255)
    private String style;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "content", nullable = false, length = 2147483647)
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    public Joo2WidgetkitWidget() {
    }

    public Joo2WidgetkitWidget(Integer id) {
        this.id = id;
    }

    public Joo2WidgetkitWidget(Integer id, String type, String style, String name, String content, Date created, Date modified) {
        this.id = id;
        this.type = type;
        this.style = style;
        this.name = name;
        this.content = content;
        this.created = created;
        this.modified = modified;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
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
        if (!(object instanceof Joo2WidgetkitWidget)) {
            return false;
        }
        Joo2WidgetkitWidget other = (Joo2WidgetkitWidget) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2WidgetkitWidget[ id=" + id + " ]";
    }
    
}
