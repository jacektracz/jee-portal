/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jacek
 */
@Embeddable
public class Joo2UserUsergroupMapPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id", nullable = false)
    private int groupId;

    public Joo2UserUsergroupMapPK() {
    }

    public Joo2UserUsergroupMapPK(int userId, int groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) groupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2UserUsergroupMapPK)) {
            return false;
        }
        Joo2UserUsergroupMapPK other = (Joo2UserUsergroupMapPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.groupId != other.groupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2UserUsergroupMapPK[ userId=" + userId + ", groupId=" + groupId + " ]";
    }
    
}
