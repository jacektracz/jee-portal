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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_polls_options", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaPollsOptions.findAll", query = "SELECT j FROM Joo2KunenaPollsOptions j"),
    @NamedQuery(name = "Joo2KunenaPollsOptions.findById", query = "SELECT j FROM Joo2KunenaPollsOptions j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaPollsOptions.findByPollid", query = "SELECT j FROM Joo2KunenaPollsOptions j WHERE j.pollid = :pollid"),
    @NamedQuery(name = "Joo2KunenaPollsOptions.findByText", query = "SELECT j FROM Joo2KunenaPollsOptions j WHERE j.text = :text"),
    @NamedQuery(name = "Joo2KunenaPollsOptions.findByVotes", query = "SELECT j FROM Joo2KunenaPollsOptions j WHERE j.votes = :votes")})
public class Joo2KunenaPollsOptions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "pollid")
    private Integer pollid;
    @Size(max = 100)
    @Column(name = "text", length = 100)
    private String text;
    @Column(name = "votes")
    private Integer votes;

    public Joo2KunenaPollsOptions() {
    }

    public Joo2KunenaPollsOptions(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPollid() {
        return pollid;
    }

    public void setPollid(Integer pollid) {
        this.pollid = pollid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
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
        if (!(object instanceof Joo2KunenaPollsOptions)) {
            return false;
        }
        Joo2KunenaPollsOptions other = (Joo2KunenaPollsOptions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaPollsOptions[ id=" + id + " ]";
    }
    
}
