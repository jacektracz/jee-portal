/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_moderation", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaModeration.findAll", query = "SELECT j FROM Joo2KunenaModeration j"),
    @NamedQuery(name = "Joo2KunenaModeration.findByCatid", query = "SELECT j FROM Joo2KunenaModeration j WHERE j.joo2KunenaModerationPK.catid = :catid"),
    @NamedQuery(name = "Joo2KunenaModeration.findByUserid", query = "SELECT j FROM Joo2KunenaModeration j WHERE j.joo2KunenaModerationPK.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaModeration.findByFuture1", query = "SELECT j FROM Joo2KunenaModeration j WHERE j.future1 = :future1"),
    @NamedQuery(name = "Joo2KunenaModeration.findByFuture2", query = "SELECT j FROM Joo2KunenaModeration j WHERE j.future2 = :future2")})
public class Joo2KunenaModeration implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2KunenaModerationPK joo2KunenaModerationPK;
    @Column(name = "future1")
    private Short future1;
    @Column(name = "future2")
    private Integer future2;

    public Joo2KunenaModeration() {
    }

    public Joo2KunenaModeration(Joo2KunenaModerationPK joo2KunenaModerationPK) {
        this.joo2KunenaModerationPK = joo2KunenaModerationPK;
    }

    public Joo2KunenaModeration(int catid, int userid) {
        this.joo2KunenaModerationPK = new Joo2KunenaModerationPK(catid, userid);
    }

    public Joo2KunenaModerationPK getJoo2KunenaModerationPK() {
        return joo2KunenaModerationPK;
    }

    public void setJoo2KunenaModerationPK(Joo2KunenaModerationPK joo2KunenaModerationPK) {
        this.joo2KunenaModerationPK = joo2KunenaModerationPK;
    }

    public Short getFuture1() {
        return future1;
    }

    public void setFuture1(Short future1) {
        this.future1 = future1;
    }

    public Integer getFuture2() {
        return future2;
    }

    public void setFuture2(Integer future2) {
        this.future2 = future2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2KunenaModerationPK != null ? joo2KunenaModerationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaModeration)) {
            return false;
        }
        Joo2KunenaModeration other = (Joo2KunenaModeration) object;
        if ((this.joo2KunenaModerationPK == null && other.joo2KunenaModerationPK != null) || (this.joo2KunenaModerationPK != null && !this.joo2KunenaModerationPK.equals(other.joo2KunenaModerationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaModeration[ joo2KunenaModerationPK=" + joo2KunenaModerationPK + " ]";
    }
    
}
