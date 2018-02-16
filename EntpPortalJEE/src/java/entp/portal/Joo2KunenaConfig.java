/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "joo2_kunena_config", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2KunenaConfig.findAll", query = "SELECT j FROM Joo2KunenaConfig j"),
    @NamedQuery(name = "Joo2KunenaConfig.findById", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2KunenaConfig.findByBoardOffline", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.boardOffline = :boardOffline"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEnablerss", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.enablerss = :enablerss"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEnablepdf", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.enablepdf = :enablepdf"),
    @NamedQuery(name = "Joo2KunenaConfig.findByThreadsPerPage", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.threadsPerPage = :threadsPerPage"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMessagesPerPage", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.messagesPerPage = :messagesPerPage"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMessagesPerPageSearch", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.messagesPerPageSearch = :messagesPerPageSearch"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowhistory", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showhistory = :showhistory"),
    @NamedQuery(name = "Joo2KunenaConfig.findByHistorylimit", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.historylimit = :historylimit"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShownew", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.shownew = :shownew"),
    @NamedQuery(name = "Joo2KunenaConfig.findByJmambot", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.jmambot = :jmambot"),
    @NamedQuery(name = "Joo2KunenaConfig.findByDisemoticons", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.disemoticons = :disemoticons"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowannouncement", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showannouncement = :showannouncement"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAvataroncat", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.avataroncat = :avataroncat"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowchildcaticon", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showchildcaticon = :showchildcaticon"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRtewidth", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rtewidth = :rtewidth"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRteheight", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rteheight = :rteheight"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEnableforumjump", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.enableforumjump = :enableforumjump"),
    @NamedQuery(name = "Joo2KunenaConfig.findByReportmsg", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.reportmsg = :reportmsg"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUsername", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.username = :username"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAskemail", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.askemail = :askemail"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowemail", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showemail = :showemail"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowuserstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showuserstats = :showuserstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowkarma", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showkarma = :showkarma"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUseredit", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.useredit = :useredit"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUseredittime", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.useredittime = :useredittime"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUseredittimegrace", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.useredittimegrace = :useredittimegrace"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEditmarkup", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.editmarkup = :editmarkup"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowsubscriptions", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowsubscriptions = :allowsubscriptions"),
    @NamedQuery(name = "Joo2KunenaConfig.findBySubscriptionschecked", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.subscriptionschecked = :subscriptionschecked"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowfavorites", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowfavorites = :allowfavorites"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMaxsubject", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.maxsubject = :maxsubject"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMaxsig", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.maxsig = :maxsig"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRegonly", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.regonly = :regonly"),
    @NamedQuery(name = "Joo2KunenaConfig.findByChangename", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.changename = :changename"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPubwrite", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pubwrite = :pubwrite"),
    @NamedQuery(name = "Joo2KunenaConfig.findByFloodprotection", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.floodprotection = :floodprotection"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMailmod", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.mailmod = :mailmod"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMailadmin", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.mailadmin = :mailadmin"),
    @NamedQuery(name = "Joo2KunenaConfig.findByCaptcha", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.captcha = :captcha"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMailfull", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.mailfull = :mailfull"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowavatar", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowavatar = :allowavatar"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowavatarupload", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowavatarupload = :allowavatarupload"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowavatargallery", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowavatargallery = :allowavatargallery"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAvatarquality", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.avatarquality = :avatarquality"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAvatarsize", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.avatarsize = :avatarsize"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowimageupload", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowimageupload = :allowimageupload"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowimageregupload", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowimageregupload = :allowimageregupload"),
    @NamedQuery(name = "Joo2KunenaConfig.findByImageheight", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.imageheight = :imageheight"),
    @NamedQuery(name = "Joo2KunenaConfig.findByImagewidth", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.imagewidth = :imagewidth"),
    @NamedQuery(name = "Joo2KunenaConfig.findByImagesize", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.imagesize = :imagesize"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowfileupload", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowfileupload = :allowfileupload"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAllowfileregupload", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.allowfileregupload = :allowfileregupload"),
    @NamedQuery(name = "Joo2KunenaConfig.findByFilesize", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.filesize = :filesize"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowranking", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showranking = :showranking"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRankimages", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rankimages = :rankimages"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistRows", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistRows = :userlistRows"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistOnline", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistOnline = :userlistOnline"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistAvatar", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistAvatar = :userlistAvatar"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistName", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistName = :userlistName"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistUsername", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistUsername = :userlistUsername"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistPosts", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistPosts = :userlistPosts"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistKarma", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistKarma = :userlistKarma"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistEmail", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistEmail = :userlistEmail"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistUsertype", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistUsertype = :userlistUsertype"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistJoindate", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistJoindate = :userlistJoindate"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistLastvisitdate", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistLastvisitdate = :userlistLastvisitdate"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistUserhits", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistUserhits = :userlistUserhits"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showstats = :showstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowwhoisonline", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showwhoisonline = :showwhoisonline"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowgenstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showgenstats = :showgenstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowpopuserstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showpopuserstats = :showpopuserstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPopusercount", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.popusercount = :popusercount"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowpopsubjectstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showpopsubjectstats = :showpopsubjectstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPopsubjectcount", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.popsubjectcount = :popsubjectcount"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUsernamechange", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.usernamechange = :usernamechange"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRulesInfb", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rulesInfb = :rulesInfb"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRulesCid", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rulesCid = :rulesCid"),
    @NamedQuery(name = "Joo2KunenaConfig.findByHelpInfb", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.helpInfb = :helpInfb"),
    @NamedQuery(name = "Joo2KunenaConfig.findByHelpCid", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.helpCid = :helpCid"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowspoilertag", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showspoilertag = :showspoilertag"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowvideotag", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showvideotag = :showvideotag"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowebaytag", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showebaytag = :showebaytag"),
    @NamedQuery(name = "Joo2KunenaConfig.findByTrimlongurls", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.trimlongurls = :trimlongurls"),
    @NamedQuery(name = "Joo2KunenaConfig.findByTrimlongurlsfront", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.trimlongurlsfront = :trimlongurlsfront"),
    @NamedQuery(name = "Joo2KunenaConfig.findByTrimlongurlsback", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.trimlongurlsback = :trimlongurlsback"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAutoembedyoutube", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.autoembedyoutube = :autoembedyoutube"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAutoembedebay", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.autoembedebay = :autoembedebay"),
    @NamedQuery(name = "Joo2KunenaConfig.findByFbsessiontimeout", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.fbsessiontimeout = :fbsessiontimeout"),
    @NamedQuery(name = "Joo2KunenaConfig.findByHighlightcode", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.highlightcode = :highlightcode"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRssLimit", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rssLimit = :rssLimit"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRssAllowHtml", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rssAllowHtml = :rssAllowHtml"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRssAuthorInTitle", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rssAuthorInTitle = :rssAuthorInTitle"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRssOldTitles", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rssOldTitles = :rssOldTitles"),
    @NamedQuery(name = "Joo2KunenaConfig.findByRssCache", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.rssCache = :rssCache"),
    @NamedQuery(name = "Joo2KunenaConfig.findByAlphauserpointsnumchars", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.alphauserpointsnumchars = :alphauserpointsnumchars"),
    @NamedQuery(name = "Joo2KunenaConfig.findBySef", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.sef = :sef"),
    @NamedQuery(name = "Joo2KunenaConfig.findBySefcats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.sefcats = :sefcats"),
    @NamedQuery(name = "Joo2KunenaConfig.findBySefutf8", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.sefutf8 = :sefutf8"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowimgforguest", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showimgforguest = :showimgforguest"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowfileforguest", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showfileforguest = :showfileforguest"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPollnboptions", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pollnboptions = :pollnboptions"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPollallowvoteone", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pollallowvoteone = :pollallowvoteone"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPollenabled", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pollenabled = :pollenabled"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPoppollscount", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.poppollscount = :poppollscount"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowpoppollstats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showpoppollstats = :showpoppollstats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPollnbvotesbyuser", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pollnbvotesbyuser = :pollnbvotesbyuser"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPollresultsuserslist", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pollresultsuserslist = :pollresultsuserslist"),
    @NamedQuery(name = "Joo2KunenaConfig.findByMaxpersotext", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.maxpersotext = :maxpersotext"),
    @NamedQuery(name = "Joo2KunenaConfig.findByHideIp", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.hideIp = :hideIp"),
    @NamedQuery(name = "Joo2KunenaConfig.findByJsActstrIntegration", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.jsActstrIntegration = :jsActstrIntegration"),
    @NamedQuery(name = "Joo2KunenaConfig.findByCheckmimetypes", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.checkmimetypes = :checkmimetypes"),
    @NamedQuery(name = "Joo2KunenaConfig.findByImagequality", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.imagequality = :imagequality"),
    @NamedQuery(name = "Joo2KunenaConfig.findByThumbheight", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.thumbheight = :thumbheight"),
    @NamedQuery(name = "Joo2KunenaConfig.findByThumbwidth", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.thumbwidth = :thumbwidth"),
    @NamedQuery(name = "Joo2KunenaConfig.findByBoxghostmessage", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.boxghostmessage = :boxghostmessage"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserdeletetmessage", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userdeletetmessage = :userdeletetmessage"),
    @NamedQuery(name = "Joo2KunenaConfig.findByLatestcategoryIn", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.latestcategoryIn = :latestcategoryIn"),
    @NamedQuery(name = "Joo2KunenaConfig.findByTopicicons", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.topicicons = :topicicons"),
    @NamedQuery(name = "Joo2KunenaConfig.findByOnlineusers", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.onlineusers = :onlineusers"),
    @NamedQuery(name = "Joo2KunenaConfig.findByDebug", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.debug = :debug"),
    @NamedQuery(name = "Joo2KunenaConfig.findByCatsautosubscribed", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.catsautosubscribed = :catsautosubscribed"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowbannedreason", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showbannedreason = :showbannedreason"),
    @NamedQuery(name = "Joo2KunenaConfig.findByVersionCheck", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.versionCheck = :versionCheck"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowthankyou", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showthankyou = :showthankyou"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowpopthankyoustats", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showpopthankyoustats = :showpopthankyoustats"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPopthankscount", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.popthankscount = :popthankscount"),
    @NamedQuery(name = "Joo2KunenaConfig.findByModSeeDeleted", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.modSeeDeleted = :modSeeDeleted"),
    @NamedQuery(name = "Joo2KunenaConfig.findByListcatShowModerators", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.listcatShowModerators = :listcatShowModerators"),
    @NamedQuery(name = "Joo2KunenaConfig.findByLightbox", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.lightbox = :lightbox"),
    @NamedQuery(name = "Joo2KunenaConfig.findByActivityLimit", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.activityLimit = :activityLimit"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowListTime", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showListTime = :showListTime"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowSessionType", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showSessionType = :showSessionType"),
    @NamedQuery(name = "Joo2KunenaConfig.findByShowSessionStarttime", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.showSessionStarttime = :showSessionStarttime"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistAllowed", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistAllowed = :userlistAllowed"),
    @NamedQuery(name = "Joo2KunenaConfig.findByUserlistCountUsers", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.userlistCountUsers = :userlistCountUsers"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEnableThreadedLayouts", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.enableThreadedLayouts = :enableThreadedLayouts"),
    @NamedQuery(name = "Joo2KunenaConfig.findByPubprofile", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.pubprofile = :pubprofile"),
    @NamedQuery(name = "Joo2KunenaConfig.findByThankyouMax", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.thankyouMax = :thankyouMax"),
    @NamedQuery(name = "Joo2KunenaConfig.findByEmailRecipientCount", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.emailRecipientCount = :emailRecipientCount"),
    @NamedQuery(name = "Joo2KunenaConfig.findByCaptchaPostLimit", query = "SELECT j FROM Joo2KunenaConfig j WHERE j.captchaPostLimit = :captchaPostLimit")})
public class Joo2KunenaConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "board_title", length = 65535)
    private String boardTitle;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Lob
    @Size(max = 65535)
    @Column(name = "email", length = 65535)
    private String email;
    @Column(name = "board_offline")
    private Integer boardOffline;
    @Lob
    @Size(max = 65535)
    @Column(name = "board_ofset", length = 65535)
    private String boardOfset;
    @Lob
    @Size(max = 65535)
    @Column(name = "offline_message", length = 65535)
    private String offlineMessage;
    @Column(name = "enablerss")
    private Integer enablerss;
    @Column(name = "enablepdf")
    private Integer enablepdf;
    @Column(name = "threads_per_page")
    private Integer threadsPerPage;
    @Column(name = "messages_per_page")
    private Integer messagesPerPage;
    @Column(name = "messages_per_page_search")
    private Integer messagesPerPageSearch;
    @Column(name = "showhistory")
    private Integer showhistory;
    @Column(name = "historylimit")
    private Integer historylimit;
    @Column(name = "shownew")
    private Integer shownew;
    @Column(name = "jmambot")
    private Integer jmambot;
    @Column(name = "disemoticons")
    private Integer disemoticons;
    @Lob
    @Size(max = 65535)
    @Column(name = "template", length = 65535)
    private String template;
    @Column(name = "showannouncement")
    private Integer showannouncement;
    @Column(name = "avataroncat")
    private Integer avataroncat;
    @Lob
    @Size(max = 65535)
    @Column(name = "catimagepath", length = 65535)
    private String catimagepath;
    @Column(name = "showchildcaticon")
    private Integer showchildcaticon;
    @Lob
    @Size(max = 65535)
    @Column(name = "annmodid", length = 65535)
    private String annmodid;
    @Column(name = "rtewidth")
    private Integer rtewidth;
    @Column(name = "rteheight")
    private Integer rteheight;
    @Column(name = "enableforumjump")
    private Integer enableforumjump;
    @Column(name = "reportmsg")
    private Integer reportmsg;
    @Column(name = "username")
    private Integer username;
    @Column(name = "askemail")
    private Integer askemail;
    @Column(name = "showemail")
    private Integer showemail;
    @Column(name = "showuserstats")
    private Integer showuserstats;
    @Column(name = "showkarma")
    private Integer showkarma;
    @Column(name = "useredit")
    private Integer useredit;
    @Column(name = "useredittime")
    private Integer useredittime;
    @Column(name = "useredittimegrace")
    private Integer useredittimegrace;
    @Column(name = "editmarkup")
    private Integer editmarkup;
    @Column(name = "allowsubscriptions")
    private Integer allowsubscriptions;
    @Column(name = "subscriptionschecked")
    private Integer subscriptionschecked;
    @Column(name = "allowfavorites")
    private Integer allowfavorites;
    @Column(name = "maxsubject")
    private Integer maxsubject;
    @Column(name = "maxsig")
    private Integer maxsig;
    @Column(name = "regonly")
    private Integer regonly;
    @Column(name = "changename")
    private Integer changename;
    @Column(name = "pubwrite")
    private Integer pubwrite;
    @Column(name = "floodprotection")
    private Integer floodprotection;
    @Column(name = "mailmod")
    private Integer mailmod;
    @Column(name = "mailadmin")
    private Integer mailadmin;
    @Column(name = "captcha")
    private Integer captcha;
    @Column(name = "mailfull")
    private Integer mailfull;
    @Column(name = "allowavatar")
    private Integer allowavatar;
    @Column(name = "allowavatarupload")
    private Integer allowavatarupload;
    @Column(name = "allowavatargallery")
    private Integer allowavatargallery;
    @Column(name = "avatarquality")
    private Integer avatarquality;
    @Column(name = "avatarsize")
    private Integer avatarsize;
    @Column(name = "allowimageupload")
    private Integer allowimageupload;
    @Column(name = "allowimageregupload")
    private Integer allowimageregupload;
    @Column(name = "imageheight")
    private Integer imageheight;
    @Column(name = "imagewidth")
    private Integer imagewidth;
    @Column(name = "imagesize")
    private Integer imagesize;
    @Column(name = "allowfileupload")
    private Integer allowfileupload;
    @Column(name = "allowfileregupload")
    private Integer allowfileregupload;
    @Lob
    @Size(max = 65535)
    @Column(name = "filetypes", length = 65535)
    private String filetypes;
    @Column(name = "filesize")
    private Integer filesize;
    @Column(name = "showranking")
    private Integer showranking;
    @Column(name = "rankimages")
    private Integer rankimages;
    @Lob
    @Size(max = 65535)
    @Column(name = "avatar_src", length = 65535)
    private String avatarSrc;
    @Lob
    @Size(max = 65535)
    @Column(name = "fb_profile", length = 65535)
    private String fbProfile;
    @Lob
    @Size(max = 65535)
    @Column(name = "pm_component", length = 65535)
    private String pmComponent;
    @Column(name = "userlist_rows")
    private Integer userlistRows;
    @Column(name = "userlist_online")
    private Integer userlistOnline;
    @Column(name = "userlist_avatar")
    private Integer userlistAvatar;
    @Column(name = "userlist_name")
    private Integer userlistName;
    @Column(name = "userlist_username")
    private Integer userlistUsername;
    @Column(name = "userlist_posts")
    private Integer userlistPosts;
    @Column(name = "userlist_karma")
    private Integer userlistKarma;
    @Column(name = "userlist_email")
    private Integer userlistEmail;
    @Column(name = "userlist_usertype")
    private Integer userlistUsertype;
    @Column(name = "userlist_joindate")
    private Integer userlistJoindate;
    @Column(name = "userlist_lastvisitdate")
    private Integer userlistLastvisitdate;
    @Column(name = "userlist_userhits")
    private Integer userlistUserhits;
    @Lob
    @Size(max = 65535)
    @Column(name = "latestcategory", length = 65535)
    private String latestcategory;
    @Column(name = "showstats")
    private Integer showstats;
    @Column(name = "showwhoisonline")
    private Integer showwhoisonline;
    @Column(name = "showgenstats")
    private Integer showgenstats;
    @Column(name = "showpopuserstats")
    private Integer showpopuserstats;
    @Column(name = "popusercount")
    private Integer popusercount;
    @Column(name = "showpopsubjectstats")
    private Integer showpopsubjectstats;
    @Column(name = "popsubjectcount")
    private Integer popsubjectcount;
    @Column(name = "usernamechange")
    private Integer usernamechange;
    @Column(name = "rules_infb")
    private Integer rulesInfb;
    @Column(name = "rules_cid")
    private Integer rulesCid;
    @Column(name = "help_infb")
    private Integer helpInfb;
    @Column(name = "help_cid")
    private Integer helpCid;
    @Column(name = "showspoilertag")
    private Integer showspoilertag;
    @Column(name = "showvideotag")
    private Integer showvideotag;
    @Column(name = "showebaytag")
    private Integer showebaytag;
    @Column(name = "trimlongurls")
    private Integer trimlongurls;
    @Column(name = "trimlongurlsfront")
    private Integer trimlongurlsfront;
    @Column(name = "trimlongurlsback")
    private Integer trimlongurlsback;
    @Column(name = "autoembedyoutube")
    private Integer autoembedyoutube;
    @Column(name = "autoembedebay")
    private Integer autoembedebay;
    @Lob
    @Size(max = 65535)
    @Column(name = "ebaylanguagecode", length = 65535)
    private String ebaylanguagecode;
    @Column(name = "fbsessiontimeout")
    private Integer fbsessiontimeout;
    @Column(name = "highlightcode")
    private Integer highlightcode;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_type", length = 65535)
    private String rssType;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_timelimit", length = 65535)
    private String rssTimelimit;
    @Column(name = "rss_limit")
    private Integer rssLimit;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_included_categories", length = 65535)
    private String rssIncludedCategories;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_excluded_categories", length = 65535)
    private String rssExcludedCategories;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_specification", length = 65535)
    private String rssSpecification;
    @Column(name = "rss_allow_html")
    private Integer rssAllowHtml;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_author_format", length = 65535)
    private String rssAuthorFormat;
    @Column(name = "rss_author_in_title")
    private Integer rssAuthorInTitle;
    @Lob
    @Size(max = 65535)
    @Column(name = "rss_word_count", length = 65535)
    private String rssWordCount;
    @Column(name = "rss_old_titles")
    private Integer rssOldTitles;
    @Column(name = "rss_cache")
    private Integer rssCache;
    @Lob
    @Size(max = 65535)
    @Column(name = "fbdefaultpage", length = 65535)
    private String fbdefaultpage;
    @Lob
    @Size(max = 65535)
    @Column(name = "default_sort", length = 65535)
    private String defaultSort;
    @Column(name = "alphauserpointsnumchars")
    private Integer alphauserpointsnumchars;
    @Column(name = "sef")
    private Integer sef;
    @Column(name = "sefcats")
    private Integer sefcats;
    @Column(name = "sefutf8")
    private Integer sefutf8;
    @Column(name = "showimgforguest")
    private Integer showimgforguest;
    @Column(name = "showfileforguest")
    private Integer showfileforguest;
    @Column(name = "pollnboptions")
    private Integer pollnboptions;
    @Column(name = "pollallowvoteone")
    private Integer pollallowvoteone;
    @Column(name = "pollenabled")
    private Integer pollenabled;
    @Column(name = "poppollscount")
    private Integer poppollscount;
    @Column(name = "showpoppollstats")
    private Integer showpoppollstats;
    @Lob
    @Size(max = 65535)
    @Column(name = "polltimebtvotes", length = 65535)
    private String polltimebtvotes;
    @Column(name = "pollnbvotesbyuser")
    private Integer pollnbvotesbyuser;
    @Column(name = "pollresultsuserslist")
    private Integer pollresultsuserslist;
    @Column(name = "maxpersotext")
    private Integer maxpersotext;
    @Lob
    @Size(max = 65535)
    @Column(name = "ordering_system", length = 65535)
    private String orderingSystem;
    @Lob
    @Size(max = 65535)
    @Column(name = "post_dateformat", length = 65535)
    private String postDateformat;
    @Lob
    @Size(max = 65535)
    @Column(name = "post_dateformat_hover", length = 65535)
    private String postDateformatHover;
    @Column(name = "hide_ip")
    private Integer hideIp;
    @Column(name = "js_actstr_integration")
    private Integer jsActstrIntegration;
    @Lob
    @Size(max = 65535)
    @Column(name = "imagetypes", length = 65535)
    private String imagetypes;
    @Column(name = "checkmimetypes")
    private Integer checkmimetypes;
    @Lob
    @Size(max = 65535)
    @Column(name = "imagemimetypes", length = 65535)
    private String imagemimetypes;
    @Column(name = "imagequality")
    private Integer imagequality;
    @Column(name = "thumbheight")
    private Integer thumbheight;
    @Column(name = "thumbwidth")
    private Integer thumbwidth;
    @Lob
    @Size(max = 65535)
    @Column(name = "hideuserprofileinfo", length = 65535)
    private String hideuserprofileinfo;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_access", length = 65535)
    private String integrationAccess;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_login", length = 65535)
    private String integrationLogin;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_avatar", length = 65535)
    private String integrationAvatar;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_profile", length = 65535)
    private String integrationProfile;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_private", length = 65535)
    private String integrationPrivate;
    @Lob
    @Size(max = 65535)
    @Column(name = "integration_activity", length = 65535)
    private String integrationActivity;
    @Column(name = "boxghostmessage")
    private Integer boxghostmessage;
    @Column(name = "userdeletetmessage")
    private Integer userdeletetmessage;
    @Column(name = "latestcategory_in")
    private Integer latestcategoryIn;
    @Column(name = "topicicons")
    private Integer topicicons;
    @Column(name = "onlineusers")
    private Integer onlineusers;
    @Column(name = "debug")
    private Integer debug;
    @Column(name = "catsautosubscribed")
    private Integer catsautosubscribed;
    @Column(name = "showbannedreason")
    private Integer showbannedreason;
    @Column(name = "version_check")
    private Integer versionCheck;
    @Column(name = "showthankyou")
    private Integer showthankyou;
    @Column(name = "showpopthankyoustats")
    private Integer showpopthankyoustats;
    @Column(name = "popthankscount")
    private Integer popthankscount;
    @Column(name = "mod_see_deleted")
    private Integer modSeeDeleted;
    @Lob
    @Size(max = 65535)
    @Column(name = "bbcode_img_secure", length = 65535)
    private String bbcodeImgSecure;
    @Column(name = "listcat_show_moderators")
    private Integer listcatShowModerators;
    @Column(name = "lightbox")
    private Integer lightbox;
    @Column(name = "activity_limit")
    private Integer activityLimit;
    @Column(name = "show_list_time")
    private Integer showListTime;
    @Column(name = "show_session_type")
    private Integer showSessionType;
    @Column(name = "show_session_starttime")
    private Integer showSessionStarttime;
    @Column(name = "userlist_allowed")
    private Integer userlistAllowed;
    @Column(name = "userlist_count_users")
    private Integer userlistCountUsers;
    @Column(name = "enable_threaded_layouts")
    private Integer enableThreadedLayouts;
    @Lob
    @Size(max = 65535)
    @Column(name = "category_subscriptions", length = 65535)
    private String categorySubscriptions;
    @Lob
    @Size(max = 65535)
    @Column(name = "topic_subscriptions", length = 65535)
    private String topicSubscriptions;
    @Column(name = "pubprofile")
    private Integer pubprofile;
    @Column(name = "thankyou_max")
    private Integer thankyouMax;
    @Column(name = "email_recipient_count")
    private Integer emailRecipientCount;
    @Lob
    @Size(max = 65535)
    @Column(name = "email_recipient_privacy", length = 65535)
    private String emailRecipientPrivacy;
    @Lob
    @Size(max = 65535)
    @Column(name = "email_visible_address", length = 65535)
    private String emailVisibleAddress;
    @Column(name = "captcha_post_limit")
    private Integer captchaPostLimit;
    @Lob
    @Size(max = 65535)
    @Column(name = "recaptcha_publickey", length = 65535)
    private String recaptchaPublickey;
    @Lob
    @Size(max = 65535)
    @Column(name = "recaptcha_privatekey", length = 65535)
    private String recaptchaPrivatekey;
    @Lob
    @Size(max = 65535)
    @Column(name = "recaptcha_theme", length = 65535)
    private String recaptchaTheme;

    public Joo2KunenaConfig() {
    }

    public Joo2KunenaConfig(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBoardOffline() {
        return boardOffline;
    }

    public void setBoardOffline(Integer boardOffline) {
        this.boardOffline = boardOffline;
    }

    public String getBoardOfset() {
        return boardOfset;
    }

    public void setBoardOfset(String boardOfset) {
        this.boardOfset = boardOfset;
    }

    public String getOfflineMessage() {
        return offlineMessage;
    }

    public void setOfflineMessage(String offlineMessage) {
        this.offlineMessage = offlineMessage;
    }

    public Integer getEnablerss() {
        return enablerss;
    }

    public void setEnablerss(Integer enablerss) {
        this.enablerss = enablerss;
    }

    public Integer getEnablepdf() {
        return enablepdf;
    }

    public void setEnablepdf(Integer enablepdf) {
        this.enablepdf = enablepdf;
    }

    public Integer getThreadsPerPage() {
        return threadsPerPage;
    }

    public void setThreadsPerPage(Integer threadsPerPage) {
        this.threadsPerPage = threadsPerPage;
    }

    public Integer getMessagesPerPage() {
        return messagesPerPage;
    }

    public void setMessagesPerPage(Integer messagesPerPage) {
        this.messagesPerPage = messagesPerPage;
    }

    public Integer getMessagesPerPageSearch() {
        return messagesPerPageSearch;
    }

    public void setMessagesPerPageSearch(Integer messagesPerPageSearch) {
        this.messagesPerPageSearch = messagesPerPageSearch;
    }

    public Integer getShowhistory() {
        return showhistory;
    }

    public void setShowhistory(Integer showhistory) {
        this.showhistory = showhistory;
    }

    public Integer getHistorylimit() {
        return historylimit;
    }

    public void setHistorylimit(Integer historylimit) {
        this.historylimit = historylimit;
    }

    public Integer getShownew() {
        return shownew;
    }

    public void setShownew(Integer shownew) {
        this.shownew = shownew;
    }

    public Integer getJmambot() {
        return jmambot;
    }

    public void setJmambot(Integer jmambot) {
        this.jmambot = jmambot;
    }

    public Integer getDisemoticons() {
        return disemoticons;
    }

    public void setDisemoticons(Integer disemoticons) {
        this.disemoticons = disemoticons;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Integer getShowannouncement() {
        return showannouncement;
    }

    public void setShowannouncement(Integer showannouncement) {
        this.showannouncement = showannouncement;
    }

    public Integer getAvataroncat() {
        return avataroncat;
    }

    public void setAvataroncat(Integer avataroncat) {
        this.avataroncat = avataroncat;
    }

    public String getCatimagepath() {
        return catimagepath;
    }

    public void setCatimagepath(String catimagepath) {
        this.catimagepath = catimagepath;
    }

    public Integer getShowchildcaticon() {
        return showchildcaticon;
    }

    public void setShowchildcaticon(Integer showchildcaticon) {
        this.showchildcaticon = showchildcaticon;
    }

    public String getAnnmodid() {
        return annmodid;
    }

    public void setAnnmodid(String annmodid) {
        this.annmodid = annmodid;
    }

    public Integer getRtewidth() {
        return rtewidth;
    }

    public void setRtewidth(Integer rtewidth) {
        this.rtewidth = rtewidth;
    }

    public Integer getRteheight() {
        return rteheight;
    }

    public void setRteheight(Integer rteheight) {
        this.rteheight = rteheight;
    }

    public Integer getEnableforumjump() {
        return enableforumjump;
    }

    public void setEnableforumjump(Integer enableforumjump) {
        this.enableforumjump = enableforumjump;
    }

    public Integer getReportmsg() {
        return reportmsg;
    }

    public void setReportmsg(Integer reportmsg) {
        this.reportmsg = reportmsg;
    }

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public Integer getAskemail() {
        return askemail;
    }

    public void setAskemail(Integer askemail) {
        this.askemail = askemail;
    }

    public Integer getShowemail() {
        return showemail;
    }

    public void setShowemail(Integer showemail) {
        this.showemail = showemail;
    }

    public Integer getShowuserstats() {
        return showuserstats;
    }

    public void setShowuserstats(Integer showuserstats) {
        this.showuserstats = showuserstats;
    }

    public Integer getShowkarma() {
        return showkarma;
    }

    public void setShowkarma(Integer showkarma) {
        this.showkarma = showkarma;
    }

    public Integer getUseredit() {
        return useredit;
    }

    public void setUseredit(Integer useredit) {
        this.useredit = useredit;
    }

    public Integer getUseredittime() {
        return useredittime;
    }

    public void setUseredittime(Integer useredittime) {
        this.useredittime = useredittime;
    }

    public Integer getUseredittimegrace() {
        return useredittimegrace;
    }

    public void setUseredittimegrace(Integer useredittimegrace) {
        this.useredittimegrace = useredittimegrace;
    }

    public Integer getEditmarkup() {
        return editmarkup;
    }

    public void setEditmarkup(Integer editmarkup) {
        this.editmarkup = editmarkup;
    }

    public Integer getAllowsubscriptions() {
        return allowsubscriptions;
    }

    public void setAllowsubscriptions(Integer allowsubscriptions) {
        this.allowsubscriptions = allowsubscriptions;
    }

    public Integer getSubscriptionschecked() {
        return subscriptionschecked;
    }

    public void setSubscriptionschecked(Integer subscriptionschecked) {
        this.subscriptionschecked = subscriptionschecked;
    }

    public Integer getAllowfavorites() {
        return allowfavorites;
    }

    public void setAllowfavorites(Integer allowfavorites) {
        this.allowfavorites = allowfavorites;
    }

    public Integer getMaxsubject() {
        return maxsubject;
    }

    public void setMaxsubject(Integer maxsubject) {
        this.maxsubject = maxsubject;
    }

    public Integer getMaxsig() {
        return maxsig;
    }

    public void setMaxsig(Integer maxsig) {
        this.maxsig = maxsig;
    }

    public Integer getRegonly() {
        return regonly;
    }

    public void setRegonly(Integer regonly) {
        this.regonly = regonly;
    }

    public Integer getChangename() {
        return changename;
    }

    public void setChangename(Integer changename) {
        this.changename = changename;
    }

    public Integer getPubwrite() {
        return pubwrite;
    }

    public void setPubwrite(Integer pubwrite) {
        this.pubwrite = pubwrite;
    }

    public Integer getFloodprotection() {
        return floodprotection;
    }

    public void setFloodprotection(Integer floodprotection) {
        this.floodprotection = floodprotection;
    }

    public Integer getMailmod() {
        return mailmod;
    }

    public void setMailmod(Integer mailmod) {
        this.mailmod = mailmod;
    }

    public Integer getMailadmin() {
        return mailadmin;
    }

    public void setMailadmin(Integer mailadmin) {
        this.mailadmin = mailadmin;
    }

    public Integer getCaptcha() {
        return captcha;
    }

    public void setCaptcha(Integer captcha) {
        this.captcha = captcha;
    }

    public Integer getMailfull() {
        return mailfull;
    }

    public void setMailfull(Integer mailfull) {
        this.mailfull = mailfull;
    }

    public Integer getAllowavatar() {
        return allowavatar;
    }

    public void setAllowavatar(Integer allowavatar) {
        this.allowavatar = allowavatar;
    }

    public Integer getAllowavatarupload() {
        return allowavatarupload;
    }

    public void setAllowavatarupload(Integer allowavatarupload) {
        this.allowavatarupload = allowavatarupload;
    }

    public Integer getAllowavatargallery() {
        return allowavatargallery;
    }

    public void setAllowavatargallery(Integer allowavatargallery) {
        this.allowavatargallery = allowavatargallery;
    }

    public Integer getAvatarquality() {
        return avatarquality;
    }

    public void setAvatarquality(Integer avatarquality) {
        this.avatarquality = avatarquality;
    }

    public Integer getAvatarsize() {
        return avatarsize;
    }

    public void setAvatarsize(Integer avatarsize) {
        this.avatarsize = avatarsize;
    }

    public Integer getAllowimageupload() {
        return allowimageupload;
    }

    public void setAllowimageupload(Integer allowimageupload) {
        this.allowimageupload = allowimageupload;
    }

    public Integer getAllowimageregupload() {
        return allowimageregupload;
    }

    public void setAllowimageregupload(Integer allowimageregupload) {
        this.allowimageregupload = allowimageregupload;
    }

    public Integer getImageheight() {
        return imageheight;
    }

    public void setImageheight(Integer imageheight) {
        this.imageheight = imageheight;
    }

    public Integer getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(Integer imagewidth) {
        this.imagewidth = imagewidth;
    }

    public Integer getImagesize() {
        return imagesize;
    }

    public void setImagesize(Integer imagesize) {
        this.imagesize = imagesize;
    }

    public Integer getAllowfileupload() {
        return allowfileupload;
    }

    public void setAllowfileupload(Integer allowfileupload) {
        this.allowfileupload = allowfileupload;
    }

    public Integer getAllowfileregupload() {
        return allowfileregupload;
    }

    public void setAllowfileregupload(Integer allowfileregupload) {
        this.allowfileregupload = allowfileregupload;
    }

    public String getFiletypes() {
        return filetypes;
    }

    public void setFiletypes(String filetypes) {
        this.filetypes = filetypes;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getShowranking() {
        return showranking;
    }

    public void setShowranking(Integer showranking) {
        this.showranking = showranking;
    }

    public Integer getRankimages() {
        return rankimages;
    }

    public void setRankimages(Integer rankimages) {
        this.rankimages = rankimages;
    }

    public String getAvatarSrc() {
        return avatarSrc;
    }

    public void setAvatarSrc(String avatarSrc) {
        this.avatarSrc = avatarSrc;
    }

    public String getFbProfile() {
        return fbProfile;
    }

    public void setFbProfile(String fbProfile) {
        this.fbProfile = fbProfile;
    }

    public String getPmComponent() {
        return pmComponent;
    }

    public void setPmComponent(String pmComponent) {
        this.pmComponent = pmComponent;
    }

    public Integer getUserlistRows() {
        return userlistRows;
    }

    public void setUserlistRows(Integer userlistRows) {
        this.userlistRows = userlistRows;
    }

    public Integer getUserlistOnline() {
        return userlistOnline;
    }

    public void setUserlistOnline(Integer userlistOnline) {
        this.userlistOnline = userlistOnline;
    }

    public Integer getUserlistAvatar() {
        return userlistAvatar;
    }

    public void setUserlistAvatar(Integer userlistAvatar) {
        this.userlistAvatar = userlistAvatar;
    }

    public Integer getUserlistName() {
        return userlistName;
    }

    public void setUserlistName(Integer userlistName) {
        this.userlistName = userlistName;
    }

    public Integer getUserlistUsername() {
        return userlistUsername;
    }

    public void setUserlistUsername(Integer userlistUsername) {
        this.userlistUsername = userlistUsername;
    }

    public Integer getUserlistPosts() {
        return userlistPosts;
    }

    public void setUserlistPosts(Integer userlistPosts) {
        this.userlistPosts = userlistPosts;
    }

    public Integer getUserlistKarma() {
        return userlistKarma;
    }

    public void setUserlistKarma(Integer userlistKarma) {
        this.userlistKarma = userlistKarma;
    }

    public Integer getUserlistEmail() {
        return userlistEmail;
    }

    public void setUserlistEmail(Integer userlistEmail) {
        this.userlistEmail = userlistEmail;
    }

    public Integer getUserlistUsertype() {
        return userlistUsertype;
    }

    public void setUserlistUsertype(Integer userlistUsertype) {
        this.userlistUsertype = userlistUsertype;
    }

    public Integer getUserlistJoindate() {
        return userlistJoindate;
    }

    public void setUserlistJoindate(Integer userlistJoindate) {
        this.userlistJoindate = userlistJoindate;
    }

    public Integer getUserlistLastvisitdate() {
        return userlistLastvisitdate;
    }

    public void setUserlistLastvisitdate(Integer userlistLastvisitdate) {
        this.userlistLastvisitdate = userlistLastvisitdate;
    }

    public Integer getUserlistUserhits() {
        return userlistUserhits;
    }

    public void setUserlistUserhits(Integer userlistUserhits) {
        this.userlistUserhits = userlistUserhits;
    }

    public String getLatestcategory() {
        return latestcategory;
    }

    public void setLatestcategory(String latestcategory) {
        this.latestcategory = latestcategory;
    }

    public Integer getShowstats() {
        return showstats;
    }

    public void setShowstats(Integer showstats) {
        this.showstats = showstats;
    }

    public Integer getShowwhoisonline() {
        return showwhoisonline;
    }

    public void setShowwhoisonline(Integer showwhoisonline) {
        this.showwhoisonline = showwhoisonline;
    }

    public Integer getShowgenstats() {
        return showgenstats;
    }

    public void setShowgenstats(Integer showgenstats) {
        this.showgenstats = showgenstats;
    }

    public Integer getShowpopuserstats() {
        return showpopuserstats;
    }

    public void setShowpopuserstats(Integer showpopuserstats) {
        this.showpopuserstats = showpopuserstats;
    }

    public Integer getPopusercount() {
        return popusercount;
    }

    public void setPopusercount(Integer popusercount) {
        this.popusercount = popusercount;
    }

    public Integer getShowpopsubjectstats() {
        return showpopsubjectstats;
    }

    public void setShowpopsubjectstats(Integer showpopsubjectstats) {
        this.showpopsubjectstats = showpopsubjectstats;
    }

    public Integer getPopsubjectcount() {
        return popsubjectcount;
    }

    public void setPopsubjectcount(Integer popsubjectcount) {
        this.popsubjectcount = popsubjectcount;
    }

    public Integer getUsernamechange() {
        return usernamechange;
    }

    public void setUsernamechange(Integer usernamechange) {
        this.usernamechange = usernamechange;
    }

    public Integer getRulesInfb() {
        return rulesInfb;
    }

    public void setRulesInfb(Integer rulesInfb) {
        this.rulesInfb = rulesInfb;
    }

    public Integer getRulesCid() {
        return rulesCid;
    }

    public void setRulesCid(Integer rulesCid) {
        this.rulesCid = rulesCid;
    }

    public Integer getHelpInfb() {
        return helpInfb;
    }

    public void setHelpInfb(Integer helpInfb) {
        this.helpInfb = helpInfb;
    }

    public Integer getHelpCid() {
        return helpCid;
    }

    public void setHelpCid(Integer helpCid) {
        this.helpCid = helpCid;
    }

    public Integer getShowspoilertag() {
        return showspoilertag;
    }

    public void setShowspoilertag(Integer showspoilertag) {
        this.showspoilertag = showspoilertag;
    }

    public Integer getShowvideotag() {
        return showvideotag;
    }

    public void setShowvideotag(Integer showvideotag) {
        this.showvideotag = showvideotag;
    }

    public Integer getShowebaytag() {
        return showebaytag;
    }

    public void setShowebaytag(Integer showebaytag) {
        this.showebaytag = showebaytag;
    }

    public Integer getTrimlongurls() {
        return trimlongurls;
    }

    public void setTrimlongurls(Integer trimlongurls) {
        this.trimlongurls = trimlongurls;
    }

    public Integer getTrimlongurlsfront() {
        return trimlongurlsfront;
    }

    public void setTrimlongurlsfront(Integer trimlongurlsfront) {
        this.trimlongurlsfront = trimlongurlsfront;
    }

    public Integer getTrimlongurlsback() {
        return trimlongurlsback;
    }

    public void setTrimlongurlsback(Integer trimlongurlsback) {
        this.trimlongurlsback = trimlongurlsback;
    }

    public Integer getAutoembedyoutube() {
        return autoembedyoutube;
    }

    public void setAutoembedyoutube(Integer autoembedyoutube) {
        this.autoembedyoutube = autoembedyoutube;
    }

    public Integer getAutoembedebay() {
        return autoembedebay;
    }

    public void setAutoembedebay(Integer autoembedebay) {
        this.autoembedebay = autoembedebay;
    }

    public String getEbaylanguagecode() {
        return ebaylanguagecode;
    }

    public void setEbaylanguagecode(String ebaylanguagecode) {
        this.ebaylanguagecode = ebaylanguagecode;
    }

    public Integer getFbsessiontimeout() {
        return fbsessiontimeout;
    }

    public void setFbsessiontimeout(Integer fbsessiontimeout) {
        this.fbsessiontimeout = fbsessiontimeout;
    }

    public Integer getHighlightcode() {
        return highlightcode;
    }

    public void setHighlightcode(Integer highlightcode) {
        this.highlightcode = highlightcode;
    }

    public String getRssType() {
        return rssType;
    }

    public void setRssType(String rssType) {
        this.rssType = rssType;
    }

    public String getRssTimelimit() {
        return rssTimelimit;
    }

    public void setRssTimelimit(String rssTimelimit) {
        this.rssTimelimit = rssTimelimit;
    }

    public Integer getRssLimit() {
        return rssLimit;
    }

    public void setRssLimit(Integer rssLimit) {
        this.rssLimit = rssLimit;
    }

    public String getRssIncludedCategories() {
        return rssIncludedCategories;
    }

    public void setRssIncludedCategories(String rssIncludedCategories) {
        this.rssIncludedCategories = rssIncludedCategories;
    }

    public String getRssExcludedCategories() {
        return rssExcludedCategories;
    }

    public void setRssExcludedCategories(String rssExcludedCategories) {
        this.rssExcludedCategories = rssExcludedCategories;
    }

    public String getRssSpecification() {
        return rssSpecification;
    }

    public void setRssSpecification(String rssSpecification) {
        this.rssSpecification = rssSpecification;
    }

    public Integer getRssAllowHtml() {
        return rssAllowHtml;
    }

    public void setRssAllowHtml(Integer rssAllowHtml) {
        this.rssAllowHtml = rssAllowHtml;
    }

    public String getRssAuthorFormat() {
        return rssAuthorFormat;
    }

    public void setRssAuthorFormat(String rssAuthorFormat) {
        this.rssAuthorFormat = rssAuthorFormat;
    }

    public Integer getRssAuthorInTitle() {
        return rssAuthorInTitle;
    }

    public void setRssAuthorInTitle(Integer rssAuthorInTitle) {
        this.rssAuthorInTitle = rssAuthorInTitle;
    }

    public String getRssWordCount() {
        return rssWordCount;
    }

    public void setRssWordCount(String rssWordCount) {
        this.rssWordCount = rssWordCount;
    }

    public Integer getRssOldTitles() {
        return rssOldTitles;
    }

    public void setRssOldTitles(Integer rssOldTitles) {
        this.rssOldTitles = rssOldTitles;
    }

    public Integer getRssCache() {
        return rssCache;
    }

    public void setRssCache(Integer rssCache) {
        this.rssCache = rssCache;
    }

    public String getFbdefaultpage() {
        return fbdefaultpage;
    }

    public void setFbdefaultpage(String fbdefaultpage) {
        this.fbdefaultpage = fbdefaultpage;
    }

    public String getDefaultSort() {
        return defaultSort;
    }

    public void setDefaultSort(String defaultSort) {
        this.defaultSort = defaultSort;
    }

    public Integer getAlphauserpointsnumchars() {
        return alphauserpointsnumchars;
    }

    public void setAlphauserpointsnumchars(Integer alphauserpointsnumchars) {
        this.alphauserpointsnumchars = alphauserpointsnumchars;
    }

    public Integer getSef() {
        return sef;
    }

    public void setSef(Integer sef) {
        this.sef = sef;
    }

    public Integer getSefcats() {
        return sefcats;
    }

    public void setSefcats(Integer sefcats) {
        this.sefcats = sefcats;
    }

    public Integer getSefutf8() {
        return sefutf8;
    }

    public void setSefutf8(Integer sefutf8) {
        this.sefutf8 = sefutf8;
    }

    public Integer getShowimgforguest() {
        return showimgforguest;
    }

    public void setShowimgforguest(Integer showimgforguest) {
        this.showimgforguest = showimgforguest;
    }

    public Integer getShowfileforguest() {
        return showfileforguest;
    }

    public void setShowfileforguest(Integer showfileforguest) {
        this.showfileforguest = showfileforguest;
    }

    public Integer getPollnboptions() {
        return pollnboptions;
    }

    public void setPollnboptions(Integer pollnboptions) {
        this.pollnboptions = pollnboptions;
    }

    public Integer getPollallowvoteone() {
        return pollallowvoteone;
    }

    public void setPollallowvoteone(Integer pollallowvoteone) {
        this.pollallowvoteone = pollallowvoteone;
    }

    public Integer getPollenabled() {
        return pollenabled;
    }

    public void setPollenabled(Integer pollenabled) {
        this.pollenabled = pollenabled;
    }

    public Integer getPoppollscount() {
        return poppollscount;
    }

    public void setPoppollscount(Integer poppollscount) {
        this.poppollscount = poppollscount;
    }

    public Integer getShowpoppollstats() {
        return showpoppollstats;
    }

    public void setShowpoppollstats(Integer showpoppollstats) {
        this.showpoppollstats = showpoppollstats;
    }

    public String getPolltimebtvotes() {
        return polltimebtvotes;
    }

    public void setPolltimebtvotes(String polltimebtvotes) {
        this.polltimebtvotes = polltimebtvotes;
    }

    public Integer getPollnbvotesbyuser() {
        return pollnbvotesbyuser;
    }

    public void setPollnbvotesbyuser(Integer pollnbvotesbyuser) {
        this.pollnbvotesbyuser = pollnbvotesbyuser;
    }

    public Integer getPollresultsuserslist() {
        return pollresultsuserslist;
    }

    public void setPollresultsuserslist(Integer pollresultsuserslist) {
        this.pollresultsuserslist = pollresultsuserslist;
    }

    public Integer getMaxpersotext() {
        return maxpersotext;
    }

    public void setMaxpersotext(Integer maxpersotext) {
        this.maxpersotext = maxpersotext;
    }

    public String getOrderingSystem() {
        return orderingSystem;
    }

    public void setOrderingSystem(String orderingSystem) {
        this.orderingSystem = orderingSystem;
    }

    public String getPostDateformat() {
        return postDateformat;
    }

    public void setPostDateformat(String postDateformat) {
        this.postDateformat = postDateformat;
    }

    public String getPostDateformatHover() {
        return postDateformatHover;
    }

    public void setPostDateformatHover(String postDateformatHover) {
        this.postDateformatHover = postDateformatHover;
    }

    public Integer getHideIp() {
        return hideIp;
    }

    public void setHideIp(Integer hideIp) {
        this.hideIp = hideIp;
    }

    public Integer getJsActstrIntegration() {
        return jsActstrIntegration;
    }

    public void setJsActstrIntegration(Integer jsActstrIntegration) {
        this.jsActstrIntegration = jsActstrIntegration;
    }

    public String getImagetypes() {
        return imagetypes;
    }

    public void setImagetypes(String imagetypes) {
        this.imagetypes = imagetypes;
    }

    public Integer getCheckmimetypes() {
        return checkmimetypes;
    }

    public void setCheckmimetypes(Integer checkmimetypes) {
        this.checkmimetypes = checkmimetypes;
    }

    public String getImagemimetypes() {
        return imagemimetypes;
    }

    public void setImagemimetypes(String imagemimetypes) {
        this.imagemimetypes = imagemimetypes;
    }

    public Integer getImagequality() {
        return imagequality;
    }

    public void setImagequality(Integer imagequality) {
        this.imagequality = imagequality;
    }

    public Integer getThumbheight() {
        return thumbheight;
    }

    public void setThumbheight(Integer thumbheight) {
        this.thumbheight = thumbheight;
    }

    public Integer getThumbwidth() {
        return thumbwidth;
    }

    public void setThumbwidth(Integer thumbwidth) {
        this.thumbwidth = thumbwidth;
    }

    public String getHideuserprofileinfo() {
        return hideuserprofileinfo;
    }

    public void setHideuserprofileinfo(String hideuserprofileinfo) {
        this.hideuserprofileinfo = hideuserprofileinfo;
    }

    public String getIntegrationAccess() {
        return integrationAccess;
    }

    public void setIntegrationAccess(String integrationAccess) {
        this.integrationAccess = integrationAccess;
    }

    public String getIntegrationLogin() {
        return integrationLogin;
    }

    public void setIntegrationLogin(String integrationLogin) {
        this.integrationLogin = integrationLogin;
    }

    public String getIntegrationAvatar() {
        return integrationAvatar;
    }

    public void setIntegrationAvatar(String integrationAvatar) {
        this.integrationAvatar = integrationAvatar;
    }

    public String getIntegrationProfile() {
        return integrationProfile;
    }

    public void setIntegrationProfile(String integrationProfile) {
        this.integrationProfile = integrationProfile;
    }

    public String getIntegrationPrivate() {
        return integrationPrivate;
    }

    public void setIntegrationPrivate(String integrationPrivate) {
        this.integrationPrivate = integrationPrivate;
    }

    public String getIntegrationActivity() {
        return integrationActivity;
    }

    public void setIntegrationActivity(String integrationActivity) {
        this.integrationActivity = integrationActivity;
    }

    public Integer getBoxghostmessage() {
        return boxghostmessage;
    }

    public void setBoxghostmessage(Integer boxghostmessage) {
        this.boxghostmessage = boxghostmessage;
    }

    public Integer getUserdeletetmessage() {
        return userdeletetmessage;
    }

    public void setUserdeletetmessage(Integer userdeletetmessage) {
        this.userdeletetmessage = userdeletetmessage;
    }

    public Integer getLatestcategoryIn() {
        return latestcategoryIn;
    }

    public void setLatestcategoryIn(Integer latestcategoryIn) {
        this.latestcategoryIn = latestcategoryIn;
    }

    public Integer getTopicicons() {
        return topicicons;
    }

    public void setTopicicons(Integer topicicons) {
        this.topicicons = topicicons;
    }

    public Integer getOnlineusers() {
        return onlineusers;
    }

    public void setOnlineusers(Integer onlineusers) {
        this.onlineusers = onlineusers;
    }

    public Integer getDebug() {
        return debug;
    }

    public void setDebug(Integer debug) {
        this.debug = debug;
    }

    public Integer getCatsautosubscribed() {
        return catsautosubscribed;
    }

    public void setCatsautosubscribed(Integer catsautosubscribed) {
        this.catsautosubscribed = catsautosubscribed;
    }

    public Integer getShowbannedreason() {
        return showbannedreason;
    }

    public void setShowbannedreason(Integer showbannedreason) {
        this.showbannedreason = showbannedreason;
    }

    public Integer getVersionCheck() {
        return versionCheck;
    }

    public void setVersionCheck(Integer versionCheck) {
        this.versionCheck = versionCheck;
    }

    public Integer getShowthankyou() {
        return showthankyou;
    }

    public void setShowthankyou(Integer showthankyou) {
        this.showthankyou = showthankyou;
    }

    public Integer getShowpopthankyoustats() {
        return showpopthankyoustats;
    }

    public void setShowpopthankyoustats(Integer showpopthankyoustats) {
        this.showpopthankyoustats = showpopthankyoustats;
    }

    public Integer getPopthankscount() {
        return popthankscount;
    }

    public void setPopthankscount(Integer popthankscount) {
        this.popthankscount = popthankscount;
    }

    public Integer getModSeeDeleted() {
        return modSeeDeleted;
    }

    public void setModSeeDeleted(Integer modSeeDeleted) {
        this.modSeeDeleted = modSeeDeleted;
    }

    public String getBbcodeImgSecure() {
        return bbcodeImgSecure;
    }

    public void setBbcodeImgSecure(String bbcodeImgSecure) {
        this.bbcodeImgSecure = bbcodeImgSecure;
    }

    public Integer getListcatShowModerators() {
        return listcatShowModerators;
    }

    public void setListcatShowModerators(Integer listcatShowModerators) {
        this.listcatShowModerators = listcatShowModerators;
    }

    public Integer getLightbox() {
        return lightbox;
    }

    public void setLightbox(Integer lightbox) {
        this.lightbox = lightbox;
    }

    public Integer getActivityLimit() {
        return activityLimit;
    }

    public void setActivityLimit(Integer activityLimit) {
        this.activityLimit = activityLimit;
    }

    public Integer getShowListTime() {
        return showListTime;
    }

    public void setShowListTime(Integer showListTime) {
        this.showListTime = showListTime;
    }

    public Integer getShowSessionType() {
        return showSessionType;
    }

    public void setShowSessionType(Integer showSessionType) {
        this.showSessionType = showSessionType;
    }

    public Integer getShowSessionStarttime() {
        return showSessionStarttime;
    }

    public void setShowSessionStarttime(Integer showSessionStarttime) {
        this.showSessionStarttime = showSessionStarttime;
    }

    public Integer getUserlistAllowed() {
        return userlistAllowed;
    }

    public void setUserlistAllowed(Integer userlistAllowed) {
        this.userlistAllowed = userlistAllowed;
    }

    public Integer getUserlistCountUsers() {
        return userlistCountUsers;
    }

    public void setUserlistCountUsers(Integer userlistCountUsers) {
        this.userlistCountUsers = userlistCountUsers;
    }

    public Integer getEnableThreadedLayouts() {
        return enableThreadedLayouts;
    }

    public void setEnableThreadedLayouts(Integer enableThreadedLayouts) {
        this.enableThreadedLayouts = enableThreadedLayouts;
    }

    public String getCategorySubscriptions() {
        return categorySubscriptions;
    }

    public void setCategorySubscriptions(String categorySubscriptions) {
        this.categorySubscriptions = categorySubscriptions;
    }

    public String getTopicSubscriptions() {
        return topicSubscriptions;
    }

    public void setTopicSubscriptions(String topicSubscriptions) {
        this.topicSubscriptions = topicSubscriptions;
    }

    public Integer getPubprofile() {
        return pubprofile;
    }

    public void setPubprofile(Integer pubprofile) {
        this.pubprofile = pubprofile;
    }

    public Integer getThankyouMax() {
        return thankyouMax;
    }

    public void setThankyouMax(Integer thankyouMax) {
        this.thankyouMax = thankyouMax;
    }

    public Integer getEmailRecipientCount() {
        return emailRecipientCount;
    }

    public void setEmailRecipientCount(Integer emailRecipientCount) {
        this.emailRecipientCount = emailRecipientCount;
    }

    public String getEmailRecipientPrivacy() {
        return emailRecipientPrivacy;
    }

    public void setEmailRecipientPrivacy(String emailRecipientPrivacy) {
        this.emailRecipientPrivacy = emailRecipientPrivacy;
    }

    public String getEmailVisibleAddress() {
        return emailVisibleAddress;
    }

    public void setEmailVisibleAddress(String emailVisibleAddress) {
        this.emailVisibleAddress = emailVisibleAddress;
    }

    public Integer getCaptchaPostLimit() {
        return captchaPostLimit;
    }

    public void setCaptchaPostLimit(Integer captchaPostLimit) {
        this.captchaPostLimit = captchaPostLimit;
    }

    public String getRecaptchaPublickey() {
        return recaptchaPublickey;
    }

    public void setRecaptchaPublickey(String recaptchaPublickey) {
        this.recaptchaPublickey = recaptchaPublickey;
    }

    public String getRecaptchaPrivatekey() {
        return recaptchaPrivatekey;
    }

    public void setRecaptchaPrivatekey(String recaptchaPrivatekey) {
        this.recaptchaPrivatekey = recaptchaPrivatekey;
    }

    public String getRecaptchaTheme() {
        return recaptchaTheme;
    }

    public void setRecaptchaTheme(String recaptchaTheme) {
        this.recaptchaTheme = recaptchaTheme;
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
        if (!(object instanceof Joo2KunenaConfig)) {
            return false;
        }
        Joo2KunenaConfig other = (Joo2KunenaConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2KunenaConfig[ id=" + id + " ]";
    }
    
}
