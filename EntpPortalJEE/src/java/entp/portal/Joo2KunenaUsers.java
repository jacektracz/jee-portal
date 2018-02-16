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
@Table(name = "joo2_kunena_users", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaUsers.findAll", query = "SELECT j FROM Joo2KunenaUsers j"),
    @NamedQuery(name = "Joo2KunenaUsers.findByUserid", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.userid = :userid"),
    @NamedQuery(name = "Joo2KunenaUsers.findByView", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.view = :view"),
    @NamedQuery(name = "Joo2KunenaUsers.findByModerator", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.moderator = :moderator"),
    @NamedQuery(name = "Joo2KunenaUsers.findByBanned", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.banned = :banned"),
    @NamedQuery(name = "Joo2KunenaUsers.findByOrdering", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.ordering = :ordering"),
    @NamedQuery(name = "Joo2KunenaUsers.findByPosts", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.posts = :posts"),
    @NamedQuery(name = "Joo2KunenaUsers.findByAvatar", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.avatar = :avatar"),
    @NamedQuery(name = "Joo2KunenaUsers.findByKarma", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.karma = :karma"),
    @NamedQuery(name = "Joo2KunenaUsers.findByKarmaTime", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.karmaTime = :karmaTime"),
    @NamedQuery(name = "Joo2KunenaUsers.findByGroupId", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.groupId = :groupId"),
    @NamedQuery(name = "Joo2KunenaUsers.findByUhits", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.uhits = :uhits"),
    @NamedQuery(name = "Joo2KunenaUsers.findByPersonalText", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.personalText = :personalText"),
    @NamedQuery(name = "Joo2KunenaUsers.findByGender", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.gender = :gender"),
    @NamedQuery(name = "Joo2KunenaUsers.findByBirthdate", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.birthdate = :birthdate"),
    @NamedQuery(name = "Joo2KunenaUsers.findByLocation", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.location = :location"),
    @NamedQuery(name = "Joo2KunenaUsers.findByIcq", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.icq = :icq"),
    @NamedQuery(name = "Joo2KunenaUsers.findByAim", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.aim = :aim"),
    @NamedQuery(name = "Joo2KunenaUsers.findByYim", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.yim = :yim"),
    @NamedQuery(name = "Joo2KunenaUsers.findByMsn", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.msn = :msn"),
    @NamedQuery(name = "Joo2KunenaUsers.findBySkype", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.skype = :skype"),
    @NamedQuery(name = "Joo2KunenaUsers.findByTwitter", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.twitter = :twitter"),
    @NamedQuery(name = "Joo2KunenaUsers.findByFacebook", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.facebook = :facebook"),
    @NamedQuery(name = "Joo2KunenaUsers.findByGtalk", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.gtalk = :gtalk"),
    @NamedQuery(name = "Joo2KunenaUsers.findByMyspace", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.myspace = :myspace"),
    @NamedQuery(name = "Joo2KunenaUsers.findByLinkedin", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.linkedin = :linkedin"),
    @NamedQuery(name = "Joo2KunenaUsers.findByDelicious", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.delicious = :delicious"),
    @NamedQuery(name = "Joo2KunenaUsers.findByFriendfeed", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.friendfeed = :friendfeed"),
    @NamedQuery(name = "Joo2KunenaUsers.findByDigg", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.digg = :digg"),
    @NamedQuery(name = "Joo2KunenaUsers.findByBlogspot", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.blogspot = :blogspot"),
    @NamedQuery(name = "Joo2KunenaUsers.findByFlickr", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.flickr = :flickr"),
    @NamedQuery(name = "Joo2KunenaUsers.findByBebo", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.bebo = :bebo"),
    @NamedQuery(name = "Joo2KunenaUsers.findByWebsitename", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.websitename = :websitename"),
    @NamedQuery(name = "Joo2KunenaUsers.findByWebsiteurl", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.websiteurl = :websiteurl"),
    @NamedQuery(name = "Joo2KunenaUsers.findByRank", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.rank = :rank"),
    @NamedQuery(name = "Joo2KunenaUsers.findByHideEmail", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.hideEmail = :hideEmail"),
    @NamedQuery(name = "Joo2KunenaUsers.findByShowOnline", query = "SELECT j FROM Joo2KunenaUsers j WHERE j.showOnline = :showOnline")})
public class Joo2KunenaUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "userid", nullable = false)
    private Integer userid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "view", nullable = false, length = 8)
    private String view;
    @Lob
    @Size(max = 65535)
    @Column(name = "signature", length = 65535)
    private String signature;
    @Column(name = "moderator")
    private Integer moderator;
    @Column(name = "banned")
    @Temporal(TemporalType.TIMESTAMP)
    private Date banned;
    @Column(name = "ordering")
    private Integer ordering;
    @Column(name = "posts")
    private Integer posts;
    @Size(max = 255)
    @Column(name = "avatar", length = 255)
    private String avatar;
    @Column(name = "karma")
    private Integer karma;
    @Column(name = "karma_time")
    private Integer karmaTime;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "uhits")
    private Integer uhits;
    @Size(max = 255)
    @Column(name = "personalText", length = 255)
    private String personalText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gender", nullable = false)
    private short gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "birthdate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Size(max = 50)
    @Column(name = "location", length = 50)
    private String location;
    @Size(max = 50)
    @Column(name = "ICQ", length = 50)
    private String icq;
    @Size(max = 50)
    @Column(name = "AIM", length = 50)
    private String aim;
    @Size(max = 50)
    @Column(name = "YIM", length = 50)
    private String yim;
    @Size(max = 50)
    @Column(name = "MSN", length = 50)
    private String msn;
    @Size(max = 50)
    @Column(name = "SKYPE", length = 50)
    private String skype;
    @Size(max = 50)
    @Column(name = "TWITTER", length = 50)
    private String twitter;
    @Size(max = 50)
    @Column(name = "FACEBOOK", length = 50)
    private String facebook;
    @Size(max = 50)
    @Column(name = "GTALK", length = 50)
    private String gtalk;
    @Size(max = 50)
    @Column(name = "MYSPACE", length = 50)
    private String myspace;
    @Size(max = 50)
    @Column(name = "LINKEDIN", length = 50)
    private String linkedin;
    @Size(max = 50)
    @Column(name = "DELICIOUS", length = 50)
    private String delicious;
    @Size(max = 50)
    @Column(name = "FRIENDFEED", length = 50)
    private String friendfeed;
    @Size(max = 50)
    @Column(name = "DIGG", length = 50)
    private String digg;
    @Size(max = 50)
    @Column(name = "BLOGSPOT", length = 50)
    private String blogspot;
    @Size(max = 50)
    @Column(name = "FLICKR", length = 50)
    private String flickr;
    @Size(max = 50)
    @Column(name = "BEBO", length = 50)
    private String bebo;
    @Size(max = 50)
    @Column(name = "websitename", length = 50)
    private String websitename;
    @Size(max = 50)
    @Column(name = "websiteurl", length = 50)
    private String websiteurl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rank", nullable = false)
    private short rank;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hideEmail", nullable = false)
    private boolean hideEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "showOnline", nullable = false)
    private boolean showOnline;

    public Joo2KunenaUsers() {
    }

    public Joo2KunenaUsers(Integer userid) {
        this.userid = userid;
    }

    public Joo2KunenaUsers(Integer userid, String view, short gender, Date birthdate, short rank, boolean hideEmail, boolean showOnline) {
        this.userid = userid;
        this.view = view;
        this.gender = gender;
        this.birthdate = birthdate;
        this.rank = rank;
        this.hideEmail = hideEmail;
        this.showOnline = showOnline;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getModerator() {
        return moderator;
    }

    public void setModerator(Integer moderator) {
        this.moderator = moderator;
    }

    public Date getBanned() {
        return banned;
    }

    public void setBanned(Date banned) {
        this.banned = banned;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getKarma() {
        return karma;
    }

    public void setKarma(Integer karma) {
        this.karma = karma;
    }

    public Integer getKarmaTime() {
        return karmaTime;
    }

    public void setKarmaTime(Integer karmaTime) {
        this.karmaTime = karmaTime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUhits() {
        return uhits;
    }

    public void setUhits(Integer uhits) {
        this.uhits = uhits;
    }

    public String getPersonalText() {
        return personalText;
    }

    public void setPersonalText(String personalText) {
        this.personalText = personalText;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getYim() {
        return yim;
    }

    public void setYim(String yim) {
        this.yim = yim;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGtalk() {
        return gtalk;
    }

    public void setGtalk(String gtalk) {
        this.gtalk = gtalk;
    }

    public String getMyspace() {
        return myspace;
    }

    public void setMyspace(String myspace) {
        this.myspace = myspace;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getDelicious() {
        return delicious;
    }

    public void setDelicious(String delicious) {
        this.delicious = delicious;
    }

    public String getFriendfeed() {
        return friendfeed;
    }

    public void setFriendfeed(String friendfeed) {
        this.friendfeed = friendfeed;
    }

    public String getDigg() {
        return digg;
    }

    public void setDigg(String digg) {
        this.digg = digg;
    }

    public String getBlogspot() {
        return blogspot;
    }

    public void setBlogspot(String blogspot) {
        this.blogspot = blogspot;
    }

    public String getFlickr() {
        return flickr;
    }

    public void setFlickr(String flickr) {
        this.flickr = flickr;
    }

    public String getBebo() {
        return bebo;
    }

    public void setBebo(String bebo) {
        this.bebo = bebo;
    }

    public String getWebsitename() {
        return websitename;
    }

    public void setWebsitename(String websitename) {
        this.websitename = websitename;
    }

    public String getWebsiteurl() {
        return websiteurl;
    }

    public void setWebsiteurl(String websiteurl) {
        this.websiteurl = websiteurl;
    }

    public short getRank() {
        return rank;
    }

    public void setRank(short rank) {
        this.rank = rank;
    }

    public boolean getHideEmail() {
        return hideEmail;
    }

    public void setHideEmail(boolean hideEmail) {
        this.hideEmail = hideEmail;
    }

    public boolean getShowOnline() {
        return showOnline;
    }

    public void setShowOnline(boolean showOnline) {
        this.showOnline = showOnline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joo2KunenaUsers)) {
            return false;
        }
        Joo2KunenaUsers other = (Joo2KunenaUsers) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaUsers[ userid=" + userid + " ]";
    }
    
}
