/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "joo2_kunena_messages_text", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaMessagesText.findAll", query = "SELECT j FROM Joo2KunenaMessagesText j"),
    @NamedQuery(name = "Joo2KunenaMessagesText.findByMesid", query = "SELECT j FROM Joo2KunenaMessagesText j WHERE j.mesid = :mesid")})
public class Joo2KunenaMessagesText implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mesid", nullable = false)
    private Integer mesid;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "message", nullable = false, length = 65535)
    private String message;

    public Joo2KunenaMessagesText() {
    }

    public Joo2KunenaMessagesText(Integer mesid) {
        this.mesid = mesid;
    }

    public Joo2KunenaMessagesText(Integer mesid, String message) {
        this.mesid = mesid;
        this.message = message;
    }

    public Integer getMesid() {
        return mesid;
    }

    public void setMesid(Integer mesid) {
        this.mesid = mesid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesid != null ? mesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaMessagesText)) {
            return false;
        }
        Joo2KunenaMessagesText other = (Joo2KunenaMessagesText) object;
        if ((this.mesid == null && other.mesid != null) || (this.mesid != null && !this.mesid.equals(other.mesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaMessagesText[ mesid=" + mesid + " ]";
    }
    
}
