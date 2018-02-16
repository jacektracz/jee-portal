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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_images", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ep_image_small_path", "ep_source_class"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Images.findAll", query = "SELECT j FROM Joo2Images j"),
    @NamedQuery(name = "Joo2Images.findByEpImageId", query = "SELECT j FROM Joo2Images j WHERE j.epImageId = :epImageId"),
    @NamedQuery(name = "Joo2Images.findByEpImageSmallPath", query = "SELECT j FROM Joo2Images j WHERE j.epImageSmallPath = :epImageSmallPath"),
    @NamedQuery(name = "Joo2Images.findByEpImageBigPath", query = "SELECT j FROM Joo2Images j WHERE j.epImageBigPath = :epImageBigPath"),
    @NamedQuery(name = "Joo2Images.findByEpSourceClass", query = "SELECT j FROM Joo2Images j WHERE j.epSourceClass = :epSourceClass"),
    @NamedQuery(name = "Joo2Images.findByEpSizeSmall", query = "SELECT j FROM Joo2Images j WHERE j.epSizeSmall = :epSizeSmall"),
    @NamedQuery(name = "Joo2Images.findByEpSizeBigl", query = "SELECT j FROM Joo2Images j WHERE j.epSizeBigl = :epSizeBigl"),
    @NamedQuery(name = "Joo2Images.findByEpSizeBig", query = "SELECT j FROM Joo2Images j WHERE j.epSizeBig = :epSizeBig"),
    @NamedQuery(name = "Joo2Images.findByEpSizeSmallDb", query = "SELECT j FROM Joo2Images j WHERE j.epSizeSmallDb = :epSizeSmallDb"),
    @NamedQuery(name = "Joo2Images.findByEpSizeBigDb", query = "SELECT j FROM Joo2Images j WHERE j.epSizeBigDb = :epSizeBigDb"),
    @NamedQuery(name = "Joo2Images.findByEpSizeType", query = "SELECT j FROM Joo2Images j WHERE j.epSizeType = :epSizeType"),
    @NamedQuery(name = "Joo2Images.findByEpBigSizeType", query = "SELECT j FROM Joo2Images j WHERE j.epBigSizeType = :epBigSizeType"),
    @NamedQuery(name = "Joo2Images.findByEpSmallSizeType", query = "SELECT j FROM Joo2Images j WHERE j.epSmallSizeType = :epSmallSizeType"),
    @NamedQuery(name = "Joo2Images.findByEpBigWidth", query = "SELECT j FROM Joo2Images j WHERE j.epBigWidth = :epBigWidth"),
    @NamedQuery(name = "Joo2Images.findByEpBigHeight", query = "SELECT j FROM Joo2Images j WHERE j.epBigHeight = :epBigHeight"),
    @NamedQuery(name = "Joo2Images.findByEpSmallWidth", query = "SELECT j FROM Joo2Images j WHERE j.epSmallWidth = :epSmallWidth"),
    @NamedQuery(name = "Joo2Images.findByEpSmallHeight", query = "SELECT j FROM Joo2Images j WHERE j.epSmallHeight = :epSmallHeight")})
public class Joo2Images implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ep_image_id", nullable = false)
    private Integer epImageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ep_image_small_path", nullable = false, length = 256)
    private String epImageSmallPath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ep_image_big_path", nullable = false, length = 256)
    private String epImageBigPath;
    @Size(max = 64)
    @Column(name = "ep_source_class", length = 64)
    private String epSourceClass;
    @Column(name = "ep_size_small")
    private Integer epSizeSmall;
    @Column(name = "ep_size_bigl")
    private Integer epSizeBigl;
    @Column(name = "ep_size_big")
    private Integer epSizeBig;
    @Column(name = "ep_size_small_db")
    private Integer epSizeSmallDb;
    @Column(name = "ep_size_big_db")
    private Integer epSizeBigDb;
    @Size(max = 32)
    @Column(name = "ep_size_type", length = 32)
    private String epSizeType;
    @Size(max = 32)
    @Column(name = "ep_big_size_type", length = 32)
    private String epBigSizeType;
    @Size(max = 32)
    @Column(name = "ep_small_size_type", length = 32)
    private String epSmallSizeType;
    @Column(name = "ep_big_width")
    private Integer epBigWidth;
    @Column(name = "ep_big_height")
    private Integer epBigHeight;
    @Column(name = "ep_small_width")
    private Integer epSmallWidth;
    @Column(name = "ep_small_height")
    private Integer epSmallHeight;

    public Joo2Images() {
    }

    public Joo2Images(Integer epImageId) {
        this.epImageId = epImageId;
    }

    public Joo2Images(Integer epImageId, String epImageSmallPath, String epImageBigPath) {
        this.epImageId = epImageId;
        this.epImageSmallPath = epImageSmallPath;
        this.epImageBigPath = epImageBigPath;
    }

    public Integer getEpImageId() {
        return epImageId;
    }

    public void setEpImageId(Integer epImageId) {
        this.epImageId = epImageId;
    }

    public String getEpImageSmallPath() {
        return epImageSmallPath;
    }

    public void setEpImageSmallPath(String epImageSmallPath) {
        this.epImageSmallPath = epImageSmallPath;
    }

    public String getEpImageBigPath() {
        return epImageBigPath;
    }

    public void setEpImageBigPath(String epImageBigPath) {
        this.epImageBigPath = epImageBigPath;
    }

    public String getEpSourceClass() {
        return epSourceClass;
    }

    public void setEpSourceClass(String epSourceClass) {
        this.epSourceClass = epSourceClass;
    }

    public Integer getEpSizeSmall() {
        return epSizeSmall;
    }

    public void setEpSizeSmall(Integer epSizeSmall) {
        this.epSizeSmall = epSizeSmall;
    }

    public Integer getEpSizeBigl() {
        return epSizeBigl;
    }

    public void setEpSizeBigl(Integer epSizeBigl) {
        this.epSizeBigl = epSizeBigl;
    }

    public Integer getEpSizeBig() {
        return epSizeBig;
    }

    public void setEpSizeBig(Integer epSizeBig) {
        this.epSizeBig = epSizeBig;
    }

    public Integer getEpSizeSmallDb() {
        return epSizeSmallDb;
    }

    public void setEpSizeSmallDb(Integer epSizeSmallDb) {
        this.epSizeSmallDb = epSizeSmallDb;
    }

    public Integer getEpSizeBigDb() {
        return epSizeBigDb;
    }

    public void setEpSizeBigDb(Integer epSizeBigDb) {
        this.epSizeBigDb = epSizeBigDb;
    }

    public String getEpSizeType() {
        return epSizeType;
    }

    public void setEpSizeType(String epSizeType) {
        this.epSizeType = epSizeType;
    }

    public String getEpBigSizeType() {
        return epBigSizeType;
    }

    public void setEpBigSizeType(String epBigSizeType) {
        this.epBigSizeType = epBigSizeType;
    }

    public String getEpSmallSizeType() {
        return epSmallSizeType;
    }

    public void setEpSmallSizeType(String epSmallSizeType) {
        this.epSmallSizeType = epSmallSizeType;
    }

    public Integer getEpBigWidth() {
        return epBigWidth;
    }

    public void setEpBigWidth(Integer epBigWidth) {
        this.epBigWidth = epBigWidth;
    }

    public Integer getEpBigHeight() {
        return epBigHeight;
    }

    public void setEpBigHeight(Integer epBigHeight) {
        this.epBigHeight = epBigHeight;
    }

    public Integer getEpSmallWidth() {
        return epSmallWidth;
    }

    public void setEpSmallWidth(Integer epSmallWidth) {
        this.epSmallWidth = epSmallWidth;
    }

    public Integer getEpSmallHeight() {
        return epSmallHeight;
    }

    public void setEpSmallHeight(Integer epSmallHeight) {
        this.epSmallHeight = epSmallHeight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (epImageId != null ? epImageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Images)) {
            return false;
        }
        Joo2Images other = (Joo2Images) object;
        if ((this.epImageId == null && other.epImageId != null) || (this.epImageId != null && !this.epImageId.equals(other.epImageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Images[ epImageId=" + epImageId + " ]";
    }
    
}
