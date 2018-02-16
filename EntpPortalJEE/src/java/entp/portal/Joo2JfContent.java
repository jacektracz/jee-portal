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
@Table(name = "joo2_jf_content", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2JfContent.findAll", query = "SELECT j FROM Joo2JfContent j"),
    @NamedQuery(name = "Joo2JfContent.findById", query = "SELECT j FROM Joo2JfContent j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2JfContent.findByLanguageId", query = "SELECT j FROM Joo2JfContent j WHERE j.languageId = :languageId"),
    @NamedQuery(name = "Joo2JfContent.findByReferenceId", query = "SELECT j FROM Joo2JfContent j WHERE j.referenceId = :referenceId"),
    @NamedQuery(name = "Joo2JfContent.findByReferenceTable", query = "SELECT j FROM Joo2JfContent j WHERE j.referenceTable = :referenceTable"),
    @NamedQuery(name = "Joo2JfContent.findByReferenceField", query = "SELECT j FROM Joo2JfContent j WHERE j.referenceField = :referenceField"),
    @NamedQuery(name = "Joo2JfContent.findByOriginalValue", query = "SELECT j FROM Joo2JfContent j WHERE j.originalValue = :originalValue"),
    @NamedQuery(name = "Joo2JfContent.findByModified", query = "SELECT j FROM Joo2JfContent j WHERE j.modified = :modified"),
    @NamedQuery(name = "Joo2JfContent.findByModifiedBy", query = "SELECT j FROM Joo2JfContent j WHERE j.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Joo2JfContent.findByPublished", query = "SELECT j FROM Joo2JfContent j WHERE j.published = :published")})
public class Joo2JfContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id", nullable = false)
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reference_id", nullable = false)
    private int referenceId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "reference_table", nullable = false, length = 100)
    private String referenceTable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "reference_field", nullable = false, length = 100)
    private String referenceField;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "value", nullable = false, length = 16777215)
    private String value;
    @Size(max = 255)
    @Column(name = "original_value", length = 255)
    private String originalValue;
    @Lob
    @Size(max = 16777215)
    @Column(name = "original_text", length = 16777215)
    private String originalText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by", nullable = false)
    private int modifiedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "published", nullable = false)
    private boolean published;

    public Joo2JfContent() {
    }

    public Joo2JfContent(Integer id) {
        this.id = id;
    }

    public Joo2JfContent(Integer id, int languageId, int referenceId, String referenceTable, String referenceField, String value, Date modified, int modifiedBy, boolean published) {
        this.id = id;
        this.languageId = languageId;
        this.referenceId = referenceId;
        this.referenceTable = referenceTable;
        this.referenceField = referenceField;
        this.value = value;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.published = published;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceTable() {
        return referenceTable;
    }

    public void setReferenceTable(String referenceTable) {
        this.referenceTable = referenceTable;
    }

    public String getReferenceField() {
        return referenceField;
    }

    public void setReferenceField(String referenceField) {
        this.referenceField = referenceField;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2JfContent)) {
            return false;
        }
        Joo2JfContent other = (Joo2JfContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2JfContent[ id=" + id + " ]";
    }
    
}
