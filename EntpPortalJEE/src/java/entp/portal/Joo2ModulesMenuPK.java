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
public class Joo2ModulesMenuPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "moduleid", nullable = false)
    private int moduleid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "menuid", nullable = false)
    private int menuid;

    public Joo2ModulesMenuPK() {
    }

    public Joo2ModulesMenuPK(int moduleid, int menuid) {
        this.moduleid = moduleid;
        this.menuid = menuid;
    }

    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) moduleid;
        hash += (int) menuid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2ModulesMenuPK)) {
            return false;
        }
        Joo2ModulesMenuPK other = (Joo2ModulesMenuPK) object;
        if (this.moduleid != other.moduleid) {
            return false;
        }
        if (this.menuid != other.menuid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ModulesMenuPK[ moduleid=" + moduleid + ", menuid=" + menuid + " ]";
    }
    
}
