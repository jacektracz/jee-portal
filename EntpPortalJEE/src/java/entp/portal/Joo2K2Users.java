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
@Table(name = "joo2_k2_users", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Users.findAll", query = "SELECT j FROM Joo2K2Users j"),
    @NamedQuery(name = "Joo2K2Users.findById", query = "SELECT j FROM Joo2K2Users j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Users.findByUserID", query = "SELECT j FROM Joo2K2Users j WHERE j.userID = :userID"),
    @NamedQuery(name = "Joo2K2Users.findByUserName", query = "SELECT j FROM Joo2K2Users j WHERE j.userName = :userName"),
    @NamedQuery(name = "Joo2K2Users.findByGender", query = "SELECT j FROM Joo2K2Users j WHERE j.gender = :gender"),
    @NamedQuery(name = "Joo2K2Users.findByImage", query = "SELECT j FROM Joo2K2Users j WHERE j.image = :image"),
    @NamedQuery(name = "Joo2K2Users.findByUrl", query = "SELECT j FROM Joo2K2Users j WHERE j.url = :url"),
    @NamedQuery(name = "Joo2K2Users.findByGroup", query = "SELECT j FROM Joo2K2Users j WHERE j.group = :group")})
public class Joo2K2Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID", nullable = false)
    private int userID;
    @Size(max = 255)
    @Column(name = "userName", length = 255)
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "gender", nullable = false, length = 2)
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description", nullable = false, length = 65535)
    private String description;
    @Size(max = 255)
    @Column(name = "image", length = 255)
    private String image;
    @Size(max = 255)
    @Column(name = "url", length = 255)
    private String url;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group", nullable = false)
    private int group;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "plugins", nullable = false, length = 65535)
    private String plugins;

    public Joo2K2Users() {
    }

    public Joo2K2Users(Integer id) {
        this.id = id;
    }

    public Joo2K2Users(Integer id, int userID, String gender, String description, int group, String plugins) {
        this.id = id;
        this.userID = userID;
        this.gender = gender;
        this.description = description;
        this.group = group;
        this.plugins = plugins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPlugins() {
        return plugins;
    }

    public void setPlugins(String plugins) {
        this.plugins = plugins;
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
        if (!(object instanceof Joo2K2Users)) {
            return false;
        }
        Joo2K2Users other = (Joo2K2Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Users[ id=" + id + " ]";
    }
    
}
