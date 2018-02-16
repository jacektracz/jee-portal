/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
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
@Table(name = "joo2_user_usergroup_map", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2UserUsergroupMap.findAll", query = "SELECT j FROM Joo2UserUsergroupMap j"),
    @NamedQuery(name = "Joo2UserUsergroupMap.findByUserId", query = "SELECT j FROM Joo2UserUsergroupMap j WHERE j.joo2UserUsergroupMapPK.userId = :userId"),
    @NamedQuery(name = "Joo2UserUsergroupMap.findByGroupId", query = "SELECT j FROM Joo2UserUsergroupMap j WHERE j.joo2UserUsergroupMapPK.groupId = :groupId")})
public class Joo2UserUsergroupMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2UserUsergroupMapPK joo2UserUsergroupMapPK;

    public Joo2UserUsergroupMap() {
    }

    public Joo2UserUsergroupMap(Joo2UserUsergroupMapPK joo2UserUsergroupMapPK) {
        this.joo2UserUsergroupMapPK = joo2UserUsergroupMapPK;
    }

    public Joo2UserUsergroupMap(int userId, int groupId) {
        this.joo2UserUsergroupMapPK = new Joo2UserUsergroupMapPK(userId, groupId);
    }

    public Joo2UserUsergroupMapPK getJoo2UserUsergroupMapPK() {
        return joo2UserUsergroupMapPK;
    }

    public void setJoo2UserUsergroupMapPK(Joo2UserUsergroupMapPK joo2UserUsergroupMapPK) {
        this.joo2UserUsergroupMapPK = joo2UserUsergroupMapPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2UserUsergroupMapPK != null ? joo2UserUsergroupMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UserUsergroupMap)) {
            return false;
        }
        Joo2UserUsergroupMap other = (Joo2UserUsergroupMap) object;
        if ((this.joo2UserUsergroupMapPK == null && other.joo2UserUsergroupMapPK != null) || (this.joo2UserUsergroupMapPK != null && !this.joo2UserUsergroupMapPK.equals(other.joo2UserUsergroupMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UserUsergroupMap[ joo2UserUsergroupMapPK=" + joo2UserUsergroupMapPK + " ]";
    }
    
}
