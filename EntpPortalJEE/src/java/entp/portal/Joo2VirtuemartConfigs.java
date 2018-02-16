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
@Table(name = "joo2_virtuemart_configs", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2VirtuemartConfigs.findAll", query = "SELECT j FROM Joo2VirtuemartConfigs j"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByVirtuemartConfigId", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.virtuemartConfigId = :virtuemartConfigId"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByCreatedOn", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.createdOn = :createdOn"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByCreatedBy", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.createdBy = :createdBy"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByModifiedOn", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByModifiedBy", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByLockedOn", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.lockedOn = :lockedOn"),
    @NamedQuery(name = "Joo2VirtuemartConfigs.findByLockedBy", query = "SELECT j FROM Joo2VirtuemartConfigs j WHERE j.lockedBy = :lockedBy")})
public class Joo2VirtuemartConfigs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "virtuemart_config_id", nullable = false)
    private Integer virtuemartConfigId;
    @Lob
    @Size(max = 65535)
    @Column(name = "config", length = 65535)
    private String config;
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

    public Joo2VirtuemartConfigs() {
    }

    public Joo2VirtuemartConfigs(Integer virtuemartConfigId) {
        this.virtuemartConfigId = virtuemartConfigId;
    }

    public Joo2VirtuemartConfigs(Integer virtuemartConfigId, Date createdOn, int createdBy, Date modifiedOn, int modifiedBy, Date lockedOn, int lockedBy) {
        this.virtuemartConfigId = virtuemartConfigId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.lockedOn = lockedOn;
        this.lockedBy = lockedBy;
    }

    public Integer getVirtuemartConfigId() {
        return virtuemartConfigId;
    }

    public void setVirtuemartConfigId(Integer virtuemartConfigId) {
        this.virtuemartConfigId = virtuemartConfigId;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
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
        hash += (virtuemartConfigId != null ? virtuemartConfigId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2VirtuemartConfigs)) {
            return false;
        }
        Joo2VirtuemartConfigs other = (Joo2VirtuemartConfigs) object;
        if ((this.virtuemartConfigId == null && other.virtuemartConfigId != null) || (this.virtuemartConfigId != null && !this.virtuemartConfigId.equals(other.virtuemartConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2VirtuemartConfigs[ virtuemartConfigId=" + virtuemartConfigId + " ]";
    }
    
}
