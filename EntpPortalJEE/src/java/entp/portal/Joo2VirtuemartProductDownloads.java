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
import javax.persistence.Id;
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
@Table(name = "joo2_virtuemart_product_downloads", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findAll", query = "SELECT j FROM Joo2VirtuemartProductDownloads j"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByVirtuemartProductId", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.virtuemartProductId = :virtuemartProductId"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByVirtuemartUserId", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.virtuemartUserId = :virtuemartUserId"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByVirtuemartOrderId", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.virtuemartOrderId = :virtuemartOrderId"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByEndDate", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.endDate = :endDate"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByDownloadMax", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.downloadMax = :downloadMax"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByDownloadId", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.downloadId = :downloadId"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByFileName", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.fileName = :fileName"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByPublished", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartProductDownloads.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartProductDownloads j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartProductDownloads implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_product_id", nullable = false)
    private int virtuemartProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_user_id", nullable = false)
    private int virtuemartUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_order_id", nullable = false)
    private int virtuemartOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "download_max", nullable = false)
    private int downloadMax;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "download_id", nullable = false, length = 32)
    private String downloadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "file_name", nullable = false, length = 255)
    private String fileName;
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

    public Joo2VirtuemartProductDownloads() {
    }

    public Joo2VirtuemartProductDownloads(String downloadId) {
        this.downloadId = downloadId;
    }

    public Joo2VirtuemartProductDownloads(String downloadId, int virtuemartProductId, int virtuemartUserId, int virtuemartOrderId, Date endDate, int downloadMax, String fileName, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.downloadId = downloadId;
        this.virtuemartProductId = virtuemartProductId;
        this.virtuemartUserId = virtuemartUserId;
        this.virtuemartOrderId = virtuemartOrderId;
        this.endDate = endDate;
        this.downloadMax = downloadMax;
        this.fileName = fileName;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public int getVirtuemartProductId() {
        return virtuemartProductId;
    }

    public void setVirtuemartProductId(int virtuemartProductId) {
        this.virtuemartProductId = virtuemartProductId;
    }

    public int getVirtuemartUserId() {
        return virtuemartUserId;
    }

    public void setVirtuemartUserId(int virtuemartUserId) {
        this.virtuemartUserId = virtuemartUserId;
    }

    public int getVirtuemartOrderId() {
        return virtuemartOrderId;
    }

    public void setVirtuemartOrderId(int virtuemartOrderId) {
        this.virtuemartOrderId = virtuemartOrderId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDownloadMax() {
        return downloadMax;
    }

    public void setDownloadMax(int downloadMax) {
        this.downloadMax = downloadMax;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        hash += (downloadId != null ? downloadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartProductDownloads)) {
            return false;
        }
        Joo2VirtuemartProductDownloads other = (Joo2VirtuemartProductDownloads) object;
        if ((this.downloadId == null && other.downloadId != null) || (this.downloadId != null && !this.downloadId.equals(other.downloadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartProductDownloads[ downloadId=" + downloadId + " ]";
    }
    
}
