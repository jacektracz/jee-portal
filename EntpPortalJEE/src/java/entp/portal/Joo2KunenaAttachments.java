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
@Table(name = "joo2_kunena_attachments", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaAttachments.findAll", query = "SELECT j FROM Joo2KunenaAttachments j"),
    @NamedQuery(name = "Joo2KunenaAttachments.findById", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByMesid", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.mesid = :mesid"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByUserid", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByHash", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.hash = :hash"),
    @NamedQuery(name = "Joo2KunenaAttachments.findBySize", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.size = :size"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByFolder", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.folder = :folder"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByFiletype", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.filetype = :filetype"),
    @NamedQuery(name = "Joo2KunenaAttachments.findByFilename", query = "SELECT j FROM Joo2KunenaAttachments j WHERE j.filename = :filename")})
public class Joo2KunenaAttachments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mesid", nullable = false)
    private int mesid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private int userid;
    @Size(max = 32)
    @Column(name = "hash", length = 32)
    private String hash;
    @Column(name = "size")
    private Integer size;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "folder", nullable = false, length = 255)
    private String folder;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "filetype", nullable = false, length = 20)
    private String filetype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "filename", nullable = false, length = 255)
    private String filename;

    public Joo2KunenaAttachments() {
    }

    public Joo2KunenaAttachments(Integer id) {
        this.id = id;
    }

    public Joo2KunenaAttachments(Integer id, int mesid, int userid, String folder, String filetype, String filename) {
        this.id = id;
        this.mesid = mesid;
        this.userid = userid;
        this.folder = folder;
        this.filetype = filetype;
        this.filename = filename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMesid() {
        return mesid;
    }

    public void setMesid(int mesid) {
        this.mesid = mesid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
        if (!(object instanceof Joo2KunenaAttachments)) {
            return false;
        }
        Joo2KunenaAttachments other = (Joo2KunenaAttachments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaAttachments[ id=" + id + " ]";
    }
    
}
