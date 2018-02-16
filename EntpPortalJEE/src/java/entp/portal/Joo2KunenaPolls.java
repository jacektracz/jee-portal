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
@Table(name = "joo2_kunena_polls", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaPolls.findAll", query = "SELECT j FROM Joo2KunenaPolls j"),
    @NamedQuery(name = "Joo2KunenaPolls.findById", query = "SELECT j FROM Joo2KunenaPolls j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaPolls.findByTitle", query = "SELECT j FROM Joo2KunenaPolls j WHERE j.title = :title"),
    @NamedQuery(name = "Joo2KunenaPolls.findByThreadid", query = "SELECT j FROM Joo2KunenaPolls j WHERE j.threadid = :threadid"),
    @NamedQuery(name = "Joo2KunenaPolls.findByPolltimetolive", query = "SELECT j FROM Joo2KunenaPolls j WHERE j.polltimetolive = :polltimetolive")})
public class Joo2KunenaPolls implements Serializable {
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
    @Column(name = "threadid", nullable = false)
    private int threadid;
    @Column(name = "polltimetolive")
    @Temporal(TemporalType.TIMESTAMP)
    private Date polltimetolive;

    public Joo2KunenaPolls() {
    }

    public Joo2KunenaPolls(Integer id) {
        this.id = id;
    }

    public Joo2KunenaPolls(Integer id, String title, int threadid) {
        this.id = id;
        this.title = title;
        this.threadid = threadid;
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

    public int getThreadid() {
        return threadid;
    }

    public void setThreadid(int threadid) {
        this.threadid = threadid;
    }

    public Date getPolltimetolive() {
        return polltimetolive;
    }

    public void setPolltimetolive(Date polltimetolive) {
        this.polltimetolive = polltimetolive;
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
        if (!(object instanceof Joo2KunenaPolls)) {
            return false;
        }
        Joo2KunenaPolls other = (Joo2KunenaPolls) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaPolls[ id=" + id + " ]";
    }
    
}
