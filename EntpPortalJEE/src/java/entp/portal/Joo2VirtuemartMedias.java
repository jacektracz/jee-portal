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
@Table(name = "joo2_virtuemart_medias", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartMedias.findAll", query = "SELECT j FROM Joo2VirtuemartMedias j"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByVirtuemartMediaId", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.virtuemartMediaId = :virtuemartMediaId"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByVirtuemartVendorId", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.virtuemartVendorId = :virtuemartVendorId"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileTitle", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileTitle = :fileTitle"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileDescription", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileDescription = :fileDescription"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileMeta", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileMeta = :fileMeta"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileMimetype", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileMimetype = :fileMimetype"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileType", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileType = :fileType"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileUrlThumb", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileUrlThumb = :fileUrlThumb"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileIsProductImage", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileIsProductImage = :fileIsProductImage"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileIsDownloadable", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileIsDownloadable = :fileIsDownloadable"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByFileisforSale", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.fileisforSale = :fileisforSale"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByOrdering", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByShared", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.shared = :shared"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByPublished", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.published = :published"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartMedias.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartMedias j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartMedias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_media_id", nullable = false)
    private Integer virtuemartMediaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_vendor_id", nullable = false)
    private int virtuemartVendorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 126)
    @Column(name = "file_title", nullable = false, length = 126)
    private String fileTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "file_description", nullable = false, length = 254)
    private String fileDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "file_meta", nullable = false, length = 254)
    private String fileMeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "file_mimetype", nullable = false, length = 64)
    private String fileMimetype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "file_type", nullable = false, length = 32)
    private String fileType;
    @Lob
    @Size(max = 65535)
    @Column(name = "file_url", length = 65535)
    private String fileUrl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "file_url_thumb", nullable = false, length = 254)
    private String fileUrlThumb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_is_product_image", nullable = false)
    private boolean fileIsProductImage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_is_downloadable", nullable = false)
    private boolean fileIsDownloadable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "file_is_forSale", nullable = false)
    private boolean fileisforSale;
    @Lob
    @Size(max = 65535)
    @Column(name = "file_params", length = 65535)
    private String fileParams;
    @Column(name = "ordering")
    private Integer ordering;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared", nullable = false)
    private boolean shared;
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

    public Joo2VirtuemartMedias() {
    }

    public Joo2VirtuemartMedias(Integer virtuemartMediaId) {
        this.virtuemartMediaId = virtuemartMediaId;
    }

    public Joo2VirtuemartMedias(Integer virtuemartMediaId, int virtuemartVendorId, String fileTitle, String fileDescription, String fileMeta, String fileMimetype, String fileType, String fileUrlThumb, boolean fileIsProductImage, boolean fileIsDownloadable, boolean fileisforSale, boolean shared, boolean published, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartMediaId = virtuemartMediaId;
        this.virtuemartVendorId = virtuemartVendorId;
        this.fileTitle = fileTitle;
        this.fileDescription = fileDescription;
        this.fileMeta = fileMeta;
        this.fileMimetype = fileMimetype;
        this.fileType = fileType;
        this.fileUrlThumb = fileUrlThumb;
        this.fileIsProductImage = fileIsProductImage;
        this.fileIsDownloadable = fileIsDownloadable;
        this.fileisforSale = fileisforSale;
        this.shared = shared;
        this.published = published;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Integer getVirtuemartMediaId() {
        return virtuemartMediaId;
    }

    public void setVirtuemartMediaId(Integer virtuemartMediaId) {
        this.virtuemartMediaId = virtuemartMediaId;
    }

    public int getVirtuemartVendorId() {
        return virtuemartVendorId;
    }

    public void setVirtuemartVendorId(int virtuemartVendorId) {
        this.virtuemartVendorId = virtuemartVendorId;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public String getFileMeta() {
        return fileMeta;
    }

    public void setFileMeta(String fileMeta) {
        this.fileMeta = fileMeta;
    }

    public String getFileMimetype() {
        return fileMimetype;
    }

    public void setFileMimetype(String fileMimetype) {
        this.fileMimetype = fileMimetype;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileUrlThumb() {
        return fileUrlThumb;
    }

    public void setFileUrlThumb(String fileUrlThumb) {
        this.fileUrlThumb = fileUrlThumb;
    }

    public boolean getFileIsProductImage() {
        return fileIsProductImage;
    }

    public void setFileIsProductImage(boolean fileIsProductImage) {
        this.fileIsProductImage = fileIsProductImage;
    }

    public boolean getFileIsDownloadable() {
        return fileIsDownloadable;
    }

    public void setFileIsDownloadable(boolean fileIsDownloadable) {
        this.fileIsDownloadable = fileIsDownloadable;
    }

    public boolean getFileisforSale() {
        return fileisforSale;
    }

    public void setFileisforSale(boolean fileisforSale) {
        this.fileisforSale = fileisforSale;
    }

    public String getFileParams() {
        return fileParams;
    }

    public void setFileParams(String fileParams) {
        this.fileParams = fileParams;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public boolean getShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
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
        hash += (virtuemartMediaId != null ? virtuemartMediaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartMedias)) {
            return false;
        }
        Joo2VirtuemartMedias other = (Joo2VirtuemartMedias) object;
        if ((this.virtuemartMediaId == null && other.virtuemartMediaId != null) || (this.virtuemartMediaId != null && !this.virtuemartMediaId.equals(other.virtuemartMediaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartMedias[ virtuemartMediaId=" + virtuemartMediaId + " ]";
    }
    
}
