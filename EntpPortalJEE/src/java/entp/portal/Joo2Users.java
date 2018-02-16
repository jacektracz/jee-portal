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
import javax.persistence.Lob;
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
@Table(name = "joo2_users", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Users.findAll", query = "SELECT j FROM Joo2Users j"),
    @NamedQuery(name = "Joo2Users.findById", query = "SELECT j FROM Joo2Users j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2Users.findByName", query = "SELECT j FROM Joo2Users j WHERE j.name = :name"),
    @NamedQuery(name = "Joo2Users.findByUsername", query = "SELECT j FROM Joo2Users j WHERE j.username = :username"),
    @NamedQuery(name = "Joo2Users.findByEmail", query = "SELECT j FROM Joo2Users j WHERE j.email = :email"),
    @NamedQuery(name = "Joo2Users.findByPassword", query = "SELECT j FROM Joo2Users j WHERE j.password = :password"),
    @NamedQuery(name = "Joo2Users.findByUsertype", query = "SELECT j FROM Joo2Users j WHERE j.usertype = :usertype"),
    @NamedQuery(name = "Joo2Users.findByBlock", query = "SELECT j FROM Joo2Users j WHERE j.block = :block"),
    @NamedQuery(name = "Joo2Users.findBySendEmail", query = "SELECT j FROM Joo2Users j WHERE j.sendEmail = :sendEmail"),
    @NamedQuery(name = "Joo2Users.findByRegisterDate", query = "SELECT j FROM Joo2Users j WHERE j.registerDate = :registerDate"),
    @NamedQuery(name = "Joo2Users.findByLastvisitDate", query = "SELECT j FROM Joo2Users j WHERE j.lastvisitDate = :lastvisitDate"),
    @NamedQuery(name = "Joo2Users.findByActivation", query = "SELECT j FROM Joo2Users j WHERE j.activation = :activation")})
public class Joo2Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "username", nullable = false, length = 150)
    private String username;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "usertype", nullable = false, length = 25)
    private String usertype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "block", nullable = false)
    private short block;
    @Column(name = "sendEmail")
    private Short sendEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registerDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lastvisitDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastvisitDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "activation", nullable = false, length = 100)
    private String activation;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "params", nullable = false, length = 65535)
    private String params;

    public Joo2Users() {
    }

    public Joo2Users(Integer id) {
        this.id = id;
    }

    public Joo2Users(Integer id, String name, String username, String email, String password, String usertype, short block, Date registerDate, Date lastvisitDate, String activation, String params) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
        this.block = block;
        this.registerDate = registerDate;
        this.lastvisitDate = lastvisitDate;
        this.activation = activation;
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public short getBlock() {
        return block;
    }

    public void setBlock(short block) {
        this.block = block;
    }

    public Short getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Short sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastvisitDate() {
        return lastvisitDate;
    }

    public void setLastvisitDate(Date lastvisitDate) {
        this.lastvisitDate = lastvisitDate;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        if (!(object instanceof Joo2Users)) {
            return false;
        }
        Joo2Users other = (Joo2Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Users[ id=" + id + " ]";
    }
    
}
