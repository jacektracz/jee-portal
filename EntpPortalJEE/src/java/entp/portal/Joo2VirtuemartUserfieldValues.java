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
@Table(name = "joo2_virtuemart_userfield_values", catalog = "lakida_03", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"virtuemart_userfield_value_id"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findAll", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByVirtuemartUserfieldValueId", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.virtuemartUserfieldValueId = :virtuemartUserfieldValueId"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByVirtuemartUserfieldId", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.virtuemartUserfieldId = :virtuemartUserfieldId"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByFieldtitle", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.fieldtitle = :fieldtitle"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByFieldvalue", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.fieldvalue = :fieldvalue"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findBySys", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.sys = :sys"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByOrdering", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartUserfieldValues.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartUserfieldValues j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartUserfieldValues implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_userfield_value_id", nullable = false)
    private Long virtuemartUserfieldValueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtuemart_userfield_id", nullable = false)
    private int virtuemartUserfieldId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "fieldtitle", nullable = false, length = 255)
    private String fieldtitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "fieldvalue", nullable = false, length = 255)
    private String fieldvalue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sys", nullable = false)
    private short sys;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordering", nullable = false)
    private int ordering;
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

    public Joo2VirtuemartUserfieldValues() {
    }

    public Joo2VirtuemartUserfieldValues(Long virtuemartUserfieldValueId) {
        this.virtuemartUserfieldValueId = virtuemartUserfieldValueId;
    }

    public Joo2VirtuemartUserfieldValues(Long virtuemartUserfieldValueId, int virtuemartUserfieldId, String fieldtitle, String fieldvalue, short sys, int ordering, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartUserfieldValueId = virtuemartUserfieldValueId;
        this.virtuemartUserfieldId = virtuemartUserfieldId;
        this.fieldtitle = fieldtitle;
        this.fieldvalue = fieldvalue;
        this.sys = sys;
        this.ordering = ordering;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Long getVirtuemartUserfieldValueId() {
        return virtuemartUserfieldValueId;
    }

    public void setVirtuemartUserfieldValueId(Long virtuemartUserfieldValueId) {
        this.virtuemartUserfieldValueId = virtuemartUserfieldValueId;
    }

    public int getVirtuemartUserfieldId() {
        return virtuemartUserfieldId;
    }

    public void setVirtuemartUserfieldId(int virtuemartUserfieldId) {
        this.virtuemartUserfieldId = virtuemartUserfieldId;
    }

    public String getFieldtitle() {
        return fieldtitle;
    }

    public void setFieldtitle(String fieldtitle) {
        this.fieldtitle = fieldtitle;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }

    public short getSys() {
        return sys;
    }

    public void setSys(short sys) {
        this.sys = sys;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
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
        hash += (virtuemartUserfieldValueId != null ? virtuemartUserfieldValueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartUserfieldValues)) {
            return false;
        }
        Joo2VirtuemartUserfieldValues other = (Joo2VirtuemartUserfieldValues) object;
        if ((this.virtuemartUserfieldValueId == null && other.virtuemartUserfieldValueId != null) || (this.virtuemartUserfieldValueId != null && !this.virtuemartUserfieldValueId.equals(other.virtuemartUserfieldValueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartUserfieldValues[ virtuemartUserfieldValueId=" + virtuemartUserfieldValueId + " ]";
    }
    
}
