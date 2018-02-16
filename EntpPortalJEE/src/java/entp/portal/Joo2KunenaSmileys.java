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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_kunena_smileys", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaSmileys.findAll", query = "SELECT j FROM Joo2KunenaSmileys j"),
    @NamedQuery(name = "Joo2KunenaSmileys.findById", query = "SELECT j FROM Joo2KunenaSmileys j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaSmileys.findByCode", query = "SELECT j FROM Joo2KunenaSmileys j WHERE j.code = :code"),
    @NamedQuery(name = "Joo2KunenaSmileys.findByLocation", query = "SELECT j FROM Joo2KunenaSmileys j WHERE j.location = :location"),
    @NamedQuery(name = "Joo2KunenaSmileys.findByGreylocation", query = "SELECT j FROM Joo2KunenaSmileys j WHERE j.greylocation = :greylocation"),
    @NamedQuery(name = "Joo2KunenaSmileys.findByEmoticonbar", query = "SELECT j FROM Joo2KunenaSmileys j WHERE j.emoticonbar = :emoticonbar")})
public class Joo2KunenaSmileys implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "code", nullable = false, length = 12)
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "location", nullable = false, length = 50)
    private String location;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "greylocation", nullable = false, length = 60)
    private String greylocation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emoticonbar", nullable = false)
    private short emoticonbar;

    public Joo2KunenaSmileys() {
    }

    public Joo2KunenaSmileys(Integer id) {
        this.id = id;
    }

    public Joo2KunenaSmileys(Integer id, String code, String location, String greylocation, short emoticonbar) {
        this.id = id;
        this.code = code;
        this.location = location;
        this.greylocation = greylocation;
        this.emoticonbar = emoticonbar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGreylocation() {
        return greylocation;
    }

    public void setGreylocation(String greylocation) {
        this.greylocation = greylocation;
    }

    public short getEmoticonbar() {
        return emoticonbar;
    }

    public void setEmoticonbar(short emoticonbar) {
        this.emoticonbar = emoticonbar;
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
        if (!(object instanceof Joo2KunenaSmileys)) {
            return false;
        }
        Joo2KunenaSmileys other = (Joo2KunenaSmileys) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaSmileys[ id=" + id + " ]";
    }
    
}
