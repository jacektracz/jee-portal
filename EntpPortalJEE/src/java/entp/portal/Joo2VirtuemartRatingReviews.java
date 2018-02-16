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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_rating_reviews", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_product_id", "created_by"}),
    @UniqueConstraint(columnNames = {"virtuemart_rating_review_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findAll", query = "SELECT j FROM Joo2VirtuemartRatingReviews j"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByVirtuemartRatingReviewId", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.virtuemartRatingReviewId = :virtuemartRatingReviewId"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByReviewOk", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.reviewOk = :reviewOk"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByReviewRates", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.reviewRates = :reviewRates"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByReviewRatingcount", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.reviewRatingcount = :reviewRatingcount"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByReviewRating", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.reviewRating = :reviewRating"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByLastip", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.lastip = :lastip"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByPublished", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartRatingReviews.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartRatingReviews j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartRatingReviews implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_rating_review_id", nullable = false)
    private Long virtuemartRatingReviewId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "comment", nullable = false, length = 65535)
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "review_ok", nullable = false)
    private int reviewOk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "review_rates", nullable = false)
    private int reviewRates;
    @Basic(optional = false)
    @NotNull
    @Column(name = "review_ratingcount", nullable = false)
    private int reviewRatingcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "review_rating", nullable = false)
    private float reviewRating;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lastip", nullable = false, length = 50)
    private String lastip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockedOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_by", nullable = false)
    private int lockedBy;

    public Joo2VirtuemartRatingReviews() {
    }

    public Joo2VirtuemartRatingReviews(Long virtuemartRatingReviewId) {
        this.virtuemartRatingReviewId = virtuemartRatingReviewId;
    }

    public Joo2VirtuemartRatingReviews(Long virtuemartRatingReviewId, int virtuemartProductId, String comment, int reviewOk, int reviewRates, int reviewRatingcount, float reviewRating, String lastip, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartRatingReviewId = virtuemartRatingReviewId;
        this.virtuemartProductId = virtuemartProductId;
        this.comment = comment;
        this.reviewOk = reviewOk;
        this.reviewRates = reviewRates;
        this.reviewRatingcount = reviewRatingcount;
        this.reviewRating = reviewRating;
        this.lastip = lastip;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartRatingReviewId() {
        return virtuemartRatingReviewId;
    }

    public void setVirtuemartRatingReviewId(Long virtuemartRatingReviewId) {
        this.virtuemartRatingReviewId = virtuemartRatingReviewId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getReviewOk() {
        return reviewOk;
    }

    public void setReviewOk(int reviewOk) {
        this.reviewOk = reviewOk;
    }

    public int getReviewRates() {
        return reviewRates;
    }

    public void setReviewRates(int reviewRates) {
        this.reviewRates = reviewRates;
    }

    public int getReviewRatingcount() {
        return reviewRatingcount;
    }

    public void setReviewRatingcount(int reviewRatingcount) {
        this.reviewRatingcount = reviewRatingcount;
    }

    public float getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(float reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
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

    public Date getLockedOn() {
        return lockedOn;
    }

    public void setLockedOn(Date lockedOn) {
        this.lockedOn = lockedOn;
    }

    public int getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(int lockedBy) {
        this.lockedBy = lockedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartRatingReviewId != null ? virtuemartRatingReviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartRatingReviews)) {
            return false;
        }
        Joo2VirtuemartRatingReviews other = (Joo2VirtuemartRatingReviews) object;
        if ((this.virtuemartRatingReviewId == null && other.virtuemartRatingReviewId != null) || (this.virtuemartRatingReviewId != null && !this.virtuemartRatingReviewId.equals(other.virtuemartRatingReviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartRatingReviews[ virtuemartRatingReviewId=" + virtuemartRatingReviewId + " ]";
    }
    
}
