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
@Table(name = "joo2_modules_menu", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2ModulesMenu.findAll", query = "SELECT j FROM Joo2ModulesMenu j"),
    @NamedQuery(name = "Joo2ModulesMenu.findByModuleid", query = "SELECT j FROM Joo2ModulesMenu j WHERE j.joo2ModulesMenuPK.moduleid = :moduleid"),
    @NamedQuery(name = "Joo2ModulesMenu.findByMenuid", query = "SELECT j FROM Joo2ModulesMenu j WHERE j.joo2ModulesMenuPK.menuid = :menuid")})
public class Joo2ModulesMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Joo2ModulesMenuPK joo2ModulesMenuPK;

    public Joo2ModulesMenu() {
    }

    public Joo2ModulesMenu(Joo2ModulesMenuPK joo2ModulesMenuPK) {
        this.joo2ModulesMenuPK = joo2ModulesMenuPK;
    }

    public Joo2ModulesMenu(int moduleid, int menuid) {
        this.joo2ModulesMenuPK = new Joo2ModulesMenuPK(moduleid, menuid);
    }

    public Joo2ModulesMenuPK getJoo2ModulesMenuPK() {
        return joo2ModulesMenuPK;
    }

    public void setJoo2ModulesMenuPK(Joo2ModulesMenuPK joo2ModulesMenuPK) {
        this.joo2ModulesMenuPK = joo2ModulesMenuPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (joo2ModulesMenuPK != null ? joo2ModulesMenuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2ModulesMenu)) {
            return false;
        }
        Joo2ModulesMenu other = (Joo2ModulesMenu) object;
        if ((this.joo2ModulesMenuPK == null && other.joo2ModulesMenuPK != null) || (this.joo2ModulesMenuPK != null && !this.joo2ModulesMenuPK.equals(other.joo2ModulesMenuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2ModulesMenu[ joo2ModulesMenuPK=" + joo2ModulesMenuPK + " ]";
    }
    
}
