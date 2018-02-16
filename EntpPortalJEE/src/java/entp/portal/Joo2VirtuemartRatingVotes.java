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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_rating_votes", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_product_id", "created_by"}),
    @UniqueConstraint(columnNames = {"virtuemart_rating_vote_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findAll", query = "SELECT j FROM Joo2VirtuemartRatingVotes j"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByVirtuemartRatingVoteId", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.virtuemartRatingVoteId = :virtuemartRatingVoteId"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByVote", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.vote = :vote"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByLastip", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.lastip = :lastip"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartRatingVotes.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartRatingVotes j WHERE j.modifiedBy = :modifiedBy")})
public class Joo2VirtuemartRatingVotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_rating_vote_id", nullable = false)
    private Long virtuemartRatingVoteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vote", nullable = false)
    private int vote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lastip", nullable = false, length = 50)
    private String lastip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by", nullable = false)
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by", nullable = false)
    private int modifiedBy;

    public Joo2VirtuemartRatingVotes() {
    }

    public Joo2VirtuemartRatingVotes(Long virtuemartRatingVoteId) {
        this.virtuemartRatingVoteId = virtuemartRatingVoteId;
    }

    public Joo2VirtuemartRatingVotes(Long virtuemartRatingVoteId, int virtuemartProductId, int vote, String lastip, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy) {
        this.virtuemartRatingVoteId = virtuemartRatingVoteId;
        this.virtuemartProductId = virtuemartProductId;
        this.vote = vote;
        this.lastip = lastip;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public Long getVirtuemartRatingVoteId() {
        return virtuemartRatingVoteId;
    }

    public void setVirtuemartRatingVoteId(Long virtuemartRatingVoteId) {
        this.virtuemartRatingVoteId = virtuemartRatingVoteId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartRatingVoteId != null ? virtuemartRatingVoteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartRatingVotes)) {
            return false;
        }
        Joo2VirtuemartRatingVotes other = (Joo2VirtuemartRatingVotes) object;
        if ((this.virtuemartRatingVoteId == null && other.virtuemartRatingVoteId != null) || (this.virtuemartRatingVoteId != null && !this.virtuemartRatingVoteId.equals(other.virtuemartRatingVoteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartRatingVotes[ virtuemartRatingVoteId=" + virtuemartRatingVoteId + " ]";
    }
    
}
