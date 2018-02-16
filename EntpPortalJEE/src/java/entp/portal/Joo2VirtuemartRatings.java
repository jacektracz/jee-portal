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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_virtuemart_ratings", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_rating_id"}),
    @UniqueConstraint(columnNames = {"virtuemart_product_id", "virtuemart_rating_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartRatings.findAll", query = "SELECT j FROM Joo2VirtuemartRatings j"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByVirtuemartRatingId", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.virtuemartRatingId = :virtuemartRatingId"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByRates", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.rates = :rates"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByRatingcount", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.ratingcount = :ratingcount"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByRating", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.rating = :rating"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByPublished", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartRatings.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartRatings j WHERE j.modifiedBy = :modifiedBy")})
public class Joo2VirtuemartRatings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_rating_id", nullable = false)
    private Long virtuemartRatingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rates", nullable = false)
    private int rates;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ratingcount", nullable = false)
    private int ratingcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating", nullable = false)
    private float rating;
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

    public Joo2VirtuemartRatings() {
    }

    public Joo2VirtuemartRatings(Long virtuemartRatingId) {
        this.virtuemartRatingId = virtuemartRatingId;
    }

    public Joo2VirtuemartRatings(Long virtuemartRatingId, int virtuemartProductId, int rates, int ratingcount, float rating, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy) {
        this.virtuemartRatingId = virtuemartRatingId;
        this.virtuemartProductId = virtuemartProductId;
        this.rates = rates;
        this.ratingcount = ratingcount;
        this.rating = rating;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
    }

    public Long getVirtuemartRatingId() {
        return virtuemartRatingId;
    }

    public void setVirtuemartRatingId(Long virtuemartRatingId) {
        this.virtuemartRatingId = virtuemartRatingId;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public int getRatingcount() {
        return ratingcount;
    }

    public void setRatingcount(int ratingcount) {
        this.ratingcount = ratingcount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtuemartRatingId != null ? virtuemartRatingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartRatings)) {
            return false;
        }
        Joo2VirtuemartRatings other = (Joo2VirtuemartRatings) object;
        if ((this.virtuemartRatingId == null && other.virtuemartRatingId != null) || (this.virtuemartRatingId != null && !this.virtuemartRatingId.equals(other.virtuemartRatingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartRatings[ virtuemartRatingId=" + virtuemartRatingId + " ]";
    }
    
}
