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
@Table(name = "joo2_kunena_version", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaVersion.findAll", query = "SELECT j FROM Joo2KunenaVersion j"),
    @NamedQuery(name = "Joo2KunenaVersion.findById", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaVersion.findByVersion", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.version = :version"),
    @NamedQuery(name = "Joo2KunenaVersion.findByVersiondate", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.versiondate = :versiondate"),
    @NamedQuery(name = "Joo2KunenaVersion.findByInstalldate", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.installdate = :installdate"),
    @NamedQuery(name = "Joo2KunenaVersion.findByBuild", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.build = :build"),
    @NamedQuery(name = "Joo2KunenaVersion.findByVersionname", query = "SELECT j FROM Joo2KunenaVersion j WHERE j.versionname = :versionname")})
public class Joo2KunenaVersion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "version", nullable = false, length = 20)
    private String version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "versiondate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date versiondate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "installdate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date installdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "build", nullable = false, length = 20)
    private String build;
    @Size(max = 40)
    @Column(name = "versionname", length = 40)
    private String versionname;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "state", nullable = false, length = 65535)
    private String state;

    public Joo2KunenaVersion() {
    }

    public Joo2KunenaVersion(Integer id) {
        this.id = id;
    }

    public Joo2KunenaVersion(Integer id, String version, Date versiondate, Date installdate, String build, String state) {
        this.id = id;
        this.version = version;
        this.versiondate = versiondate;
        this.installdate = installdate;
        this.build = build;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getVersiondate() {
        return versiondate;
    }

    public void setVersiondate(Date versiondate) {
        this.versiondate = versiondate;
    }

    public Date getInstalldate() {
        return installdate;
    }

    public void setInstalldate(Date installdate) {
        this.installdate = installdate;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        if (!(object instanceof Joo2KunenaVersion)) {
            return false;
        }
        Joo2KunenaVersion other = (Joo2KunenaVersion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaVersion[ id=" + id + " ]";
    }
    
}
