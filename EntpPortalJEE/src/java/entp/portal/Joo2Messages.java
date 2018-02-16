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
@Table(name = "joo2_messages", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Messages.findAll", query = "SELECT j FROM Joo2Messages j"),
    @NamedQuery(name = "Joo2Messages.findByMessageId", query = "SELECT j FROM Joo2Messages j WHERE j.messageId = :messageId"),
    @NamedQuery(name = "Joo2Messages.findByUserIdFrom", query = "SELECT j FROM Joo2Messages j WHERE j.userIdFrom = :userIdFrom"),
    @NamedQuery(name = "Joo2Messages.findByUserIdTo", query = "SELECT j FROM Joo2Messages j WHERE j.userIdTo = :userIdTo"),
    @NamedQuery(name = "Joo2Messages.findByFolderId", query = "SELECT j FROM Joo2Messages j WHERE j.folderId = :folderId"),
    @NamedQuery(name = "Joo2Messages.findByDateTime", query = "SELECT j FROM Joo2Messages j WHERE j.dateTime = :dateTime"),
    @NamedQuery(name = "Joo2Messages.findByState", query = "SELECT j FROM Joo2Messages j WHERE j.state = :state"),
    @NamedQuery(name = "Joo2Messages.findByPriority", query = "SELECT j FROM Joo2Messages j WHERE j.priority = :priority"),
    @NamedQuery(name = "Joo2Messages.findBySubject", query = "SELECT j FROM Joo2Messages j WHERE j.subject = :subject")})
public class Joo2Messages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "message_id", nullable = false)
    private Integer messageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id_from", nullable = false)
    private int userIdFrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id_to", nullable = false)
    private int userIdTo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "folder_id", nullable = false)
    private short folderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state", nullable = false)
    private boolean state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority", nullable = false)
    private boolean priority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "subject", nullable = false, length = 255)
    private String subject;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "message", nullable = false, length = 65535)
    private String message;

    public Joo2Messages() {
    }

    public Joo2Messages(Integer messageId) {
        this.messageId = messageId;
    }

    public Joo2Messages(Integer messageId, int userIdFrom, int userIdTo, short folderId, Date dateTime, boolean state, boolean priority, String subject, String message) {
        this.messageId = messageId;
        this.userIdFrom = userIdFrom;
        this.userIdTo = userIdTo;
        this.folderId = folderId;
        this.dateTime = dateTime;
        this.state = state;
        this.priority = priority;
        this.subject = subject;
        this.message = message;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public int getUserIdFrom() {
        return userIdFrom;
    }

    public void setUserIdFrom(int userIdFrom) {
        this.userIdFrom = userIdFrom;
    }

    public int getUserIdTo() {
        return userIdTo;
    }

    public void setUserIdTo(int userIdTo) {
        this.userIdTo = userIdTo;
    }

    public short getFolderId() {
        return folderId;
    }

    public void setFolderId(short folderId) {
        this.folderId = folderId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Messages)) {
            return false;
        }
        Joo2Messages other = (Joo2Messages) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Messages[ messageId=" + messageId + " ]";
    }
    
}
