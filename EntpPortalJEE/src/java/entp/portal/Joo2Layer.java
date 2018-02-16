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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jacek
 */
@Entity
@Table(name = "joo2_layer", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2Layer.findAll", query = "SELECT j FROM Joo2Layer j"),
    @NamedQuery(name = "Joo2Layer.findByLayerId", query = "SELECT j FROM Joo2Layer j WHERE j.layerId = :layerId"),
    @NamedQuery(name = "Joo2Layer.findByParentId", query = "SELECT j FROM Joo2Layer j WHERE j.parentId = :parentId"),
    @NamedQuery(name = "Joo2Layer.findByShortName", query = "SELECT j FROM Joo2Layer j WHERE j.shortName = :shortName"),
    @NamedQuery(name = "Joo2Layer.findByLayerType", query = "SELECT j FROM Joo2Layer j WHERE j.layerType = :layerType")})
public class Joo2Layer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layer_id", nullable = false)
    private Integer layerId;
    @Column(name = "parent_id")
    private Integer parentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "short_name", nullable = false, length = 50)
    private String shortName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "layer_type", nullable = false, length = 50)
    private String layerType;

    public Joo2Layer() {
    }

    public Joo2Layer(Integer layerId) {
        this.layerId = layerId;
    }

    public Joo2Layer(Integer layerId, String shortName, String layerType) {
        this.layerId = layerId;
        this.shortName = shortName;
        this.layerType = layerType;
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLayerType() {
        return layerType;
    }

    public void setLayerType(String layerType) {
        this.layerType = layerType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (layerId != null ? layerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2Layer)) {
            return false;
        }
        Joo2Layer other = (Joo2Layer) object;
        if ((this.layerId == null && other.layerId != null) || (this.layerId != null && !this.layerId.equals(other.layerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2Layer[ layerId=" + layerId + " ]";
    }
    
}
