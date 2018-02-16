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
@Table(name = "joo2_k2_comments", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2K2Comments.findAll", query = "SELECT j FROM Joo2K2Comments j"),
    @NamedQuery(name = "Joo2K2Comments.findById", query = "SELECT j FROM Joo2K2Comments j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2K2Comments.findByItemID", query = "SELECT j FROM Joo2K2Comments j WHERE j.itemID = :itemID"),
    @NamedQuery(name = "Joo2K2Comments.findByUserID", query = "SELECT j FROM Joo2K2Comments j WHERE j.userID = :userID"),
    @NamedQuery(name = "Joo2K2Comments.findByUserName", query = "SELECT j FROM Joo2K2Comments j WHERE j.userName = :userName"),
    @NamedQuery(name = "Joo2K2Comments.findByCommentDate", query = "SELECT j FROM Joo2K2Comments j WHERE j.commentDate = :commentDate"),
    @NamedQuery(name = "Joo2K2Comments.findByCommentEmail", query = "SELECT j FROM Joo2K2Comments j WHERE j.commentEmail = :commentEmail"),
    @NamedQuery(name = "Joo2K2Comments.findByCommentURL", query = "SELECT j FROM Joo2K2Comments j WHERE j.commentURL = :commentURL"),
    @NamedQuery(name = "Joo2K2Comments.findByPublished", query = "SELECT j FROM Joo2K2Comments j WHERE j.published = :published")})
public class Joo2K2Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "itemID", nullable = false)
    private int itemID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID", nullable = false)
    private int userID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "userName", nullable = false, length = 255)
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commentDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "commentText", nullable = false, length = 65535)
    private String commentText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "commentEmail", nullable = false, length = 255)
    private String commentEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "commentURL", nullable = false, length = 255)
    private String commentURL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private int published;

    public Joo2K2Comments() {
    }

    public Joo2K2Comments(Integer id) {
        this.id = id;
    }

    public Joo2K2Comments(Integer id, int itemID, int userID, String userName, Date commentDate, String commentText, String commentEmail, String commentURL, int published) {
        this.id = id;
        this.itemID = itemID;
        this.userID = userID;
        this.userName = userName;
        this.commentDate = commentDate;
        this.commentText = commentText;
        this.commentEmail = commentEmail;
        this.commentURL = commentURL;
        this.published = published;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentEmail() {
        return commentEmail;
    }

    public void setCommentEmail(String commentEmail) {
        this.commentEmail = commentEmail;
    }

    public String getCommentURL() {
        return commentURL;
    }

    public void setCommentURL(String commentURL) {
        this.commentURL = commentURL;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
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
        if (!(object instanceof Joo2K2Comments)) {
            return false;
        }
        Joo2K2Comments other = (Joo2K2Comments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2K2Comments[ id=" + id + " ]";
    }
    
}
