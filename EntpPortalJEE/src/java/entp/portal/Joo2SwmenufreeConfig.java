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
@Table(name = "joo2_swmenufree_config", catalog = "lakida_03", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joo2SwmenufreeConfig.findAll", query = "SELECT j FROM Joo2SwmenufreeConfig j"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findById", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.id = :id"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainTop", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainTop = :mainTop"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainLeft", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainLeft = :mainLeft"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainHeight", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainHeight = :mainHeight"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubBorderOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subBorderOver = :subBorderOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainWidth", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainWidth = :mainWidth"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubWidth", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subWidth = :subWidth"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainBack", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainBack = :mainBack"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainOver = :mainOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubBack", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subBack = :subBack"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subOver = :subOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubBorder", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subBorder = :subBorder"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainFontSize", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainFontSize = :mainFontSize"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubFontSize", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subFontSize = :subFontSize"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainBorderOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainBorderOver = :mainBorderOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubFontColor", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subFontColor = :subFontColor"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainBorder", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainBorder = :mainBorder"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainFontColor", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainFontColor = :mainFontColor"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubFontColorOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subFontColorOver = :subFontColorOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainFontColorOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainFontColorOver = :mainFontColorOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainAlign", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainAlign = :mainAlign"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubAlign", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subAlign = :subAlign"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubHeight", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subHeight = :subHeight"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByPosition", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.position = :position"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByOrientation", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.orientation = :orientation"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByFontFamily", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.fontFamily = :fontFamily"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByFontWeight", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.fontWeight = :fontWeight"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByFontWeightOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.fontWeightOver = :fontWeightOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByLevel2SubTop", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.level2SubTop = :level2SubTop"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByLevel2SubLeft", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.level2SubLeft = :level2SubLeft"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByLevel1SubTop", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.level1SubTop = :level1SubTop"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByLevel1SubLeft", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.level1SubLeft = :level1SubLeft"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainBackImage", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainBackImage = :mainBackImage"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainBackImageOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainBackImageOver = :mainBackImageOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubBackImage", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subBackImage = :subBackImage"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubBackImageOver", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subBackImageOver = :subBackImageOver"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySpecialA", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.specialA = :specialA"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByMainPadding", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.mainPadding = :mainPadding"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubPadding", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subPadding = :subPadding"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySpecialB", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.specialB = :specialB"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubFontFamily", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subFontFamily = :subFontFamily"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByActiveBackground", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.activeBackground = :activeBackground"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByActiveFont", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.activeFont = :activeFont"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByTopMargin", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.topMargin = :topMargin"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByTopWrap", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.topWrap = :topWrap"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubWrap", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subWrap = :subWrap"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByTopFontExtra", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.topFontExtra = :topFontExtra"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findBySubFontExtra", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.subFontExtra = :subFontExtra"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByCompletePadding", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.completePadding = :completePadding"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByCompleteBackground", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.completeBackground = :completeBackground"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByCompleteBackgroundImage", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.completeBackgroundImage = :completeBackgroundImage"),
    @NamedQuery(name = "Joo2SwmenufreeConfig.findByActiveBackgroundImage", query = "SELECT j FROM Joo2SwmenufreeConfig j WHERE j.activeBackgroundImage = :activeBackgroundImage")})
public class Joo2SwmenufreeConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "main_top")
    private Short mainTop;
    @Column(name = "main_left")
    private Short mainLeft;
    @Column(name = "main_height")
    private Short mainHeight;
    @Size(max = 30)
    @Column(name = "sub_border_over", length = 30)
    private String subBorderOver;
    @Column(name = "main_width")
    private Short mainWidth;
    @Column(name = "sub_width")
    private Short subWidth;
    @Size(max = 7)
    @Column(name = "main_back", length = 7)
    private String mainBack;
    @Size(max = 7)
    @Column(name = "main_over", length = 7)
    private String mainOver;
    @Size(max = 7)
    @Column(name = "sub_back", length = 7)
    private String subBack;
    @Size(max = 7)
    @Column(name = "sub_over", length = 7)
    private String subOver;
    @Size(max = 30)
    @Column(name = "sub_border", length = 30)
    private String subBorder;
    @Column(name = "main_font_size")
    private Short mainFontSize;
    @Column(name = "sub_font_size")
    private Short subFontSize;
    @Size(max = 30)
    @Column(name = "main_border_over", length = 30)
    private String mainBorderOver;
    @Size(max = 7)
    @Column(name = "sub_font_color", length = 7)
    private String subFontColor;
    @Size(max = 30)
    @Column(name = "main_border", length = 30)
    private String mainBorder;
    @Size(max = 7)
    @Column(name = "main_font_color", length = 7)
    private String mainFontColor;
    @Size(max = 7)
    @Column(name = "sub_font_color_over", length = 7)
    private String subFontColorOver;
    @Size(max = 7)
    @Column(name = "main_font_color_over", length = 7)
    private String mainFontColorOver;
    @Size(max = 8)
    @Column(name = "main_align", length = 8)
    private String mainAlign;
    @Size(max = 8)
    @Column(name = "sub_align", length = 8)
    private String subAlign;
    @Column(name = "sub_height")
    private Short subHeight;
    @Size(max = 10)
    @Column(name = "position", length = 10)
    private String position;
    @Size(max = 20)
    @Column(name = "orientation", length = 20)
    private String orientation;
    @Size(max = 50)
    @Column(name = "font_family", length = 50)
    private String fontFamily;
    @Size(max = 10)
    @Column(name = "font_weight", length = 10)
    private String fontWeight;
    @Size(max = 10)
    @Column(name = "font_weight_over", length = 10)
    private String fontWeightOver;
    @Column(name = "level2_sub_top")
    private Integer level2SubTop;
    @Column(name = "level2_sub_left")
    private Integer level2SubLeft;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level1_sub_top", nullable = false)
    private int level1SubTop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level1_sub_left", nullable = false)
    private int level1SubLeft;
    @Size(max = 100)
    @Column(name = "main_back_image", length = 100)
    private String mainBackImage;
    @Size(max = 100)
    @Column(name = "main_back_image_over", length = 100)
    private String mainBackImageOver;
    @Size(max = 100)
    @Column(name = "sub_back_image", length = 100)
    private String subBackImage;
    @Size(max = 100)
    @Column(name = "sub_back_image_over", length = 100)
    private String subBackImageOver;
    @Size(max = 50)
    @Column(name = "specialA", length = 50)
    private String specialA;
    @Size(max = 40)
    @Column(name = "main_padding", length = 40)
    private String mainPadding;
    @Size(max = 40)
    @Column(name = "sub_padding", length = 40)
    private String subPadding;
    @Size(max = 100)
    @Column(name = "specialB", length = 100)
    private String specialB;
    @Size(max = 50)
    @Column(name = "sub_font_family", length = 50)
    private String subFontFamily;
    @Lob
    @Size(max = 16777215)
    @Column(name = "extra", length = 16777215)
    private String extra;
    @Lob
    @Size(max = 65535)
    @Column(name = "top_ttf", length = 65535)
    private String topTtf;
    @Lob
    @Size(max = 65535)
    @Column(name = "sub_ttf", length = 65535)
    private String subTtf;
    @Size(max = 10)
    @Column(name = "active_background", length = 10)
    private String activeBackground;
    @Size(max = 10)
    @Column(name = "active_font", length = 10)
    private String activeFont;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "top_margin", nullable = false, length = 40)
    private String topMargin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "top_wrap", nullable = false, length = 30)
    private String topWrap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "sub_wrap", nullable = false, length = 30)
    private String subWrap;
    @Lob
    @Size(max = 65535)
    @Column(name = "corners", length = 65535)
    private String corners;
    @Size(max = 40)
    @Column(name = "top_font_extra", length = 40)
    private String topFontExtra;
    @Size(max = 40)
    @Column(name = "sub_font_extra", length = 40)
    private String subFontExtra;
    @Size(max = 24)
    @Column(name = "complete_padding", length = 24)
    private String completePadding;
    @Size(max = 24)
    @Column(name = "complete_background", length = 24)
    private String completeBackground;
    @Size(max = 256)
    @Column(name = "complete_background_image", length = 256)
    private String completeBackgroundImage;
    @Size(max = 256)
    @Column(name = "active_background_image", length = 256)
    private String activeBackgroundImage;
    @Lob
    @Size(max = 65535)
    @Column(name = "sub_indicator", length = 65535)
    private String subIndicator;

    public Joo2SwmenufreeConfig() {
    }

    public Joo2SwmenufreeConfig(Integer id) {
        this.id = id;
    }

    public Joo2SwmenufreeConfig(Integer id, int level1SubTop, int level1SubLeft, String topMargin, String topWrap, String subWrap) {
        this.id = id;
        this.level1SubTop = level1SubTop;
        this.level1SubLeft = level1SubLeft;
        this.topMargin = topMargin;
        this.topWrap = topWrap;
        this.subWrap = subWrap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getMainTop() {
        return mainTop;
    }

    public void setMainTop(Short mainTop) {
        this.mainTop = mainTop;
    }

    public Short getMainLeft() {
        return mainLeft;
    }

    public void setMainLeft(Short mainLeft) {
        this.mainLeft = mainLeft;
    }

    public Short getMainHeight() {
        return mainHeight;
    }

    public void setMainHeight(Short mainHeight) {
        this.mainHeight = mainHeight;
    }

    public String getSubBorderOver() {
        return subBorderOver;
    }

    public void setSubBorderOver(String subBorderOver) {
        this.subBorderOver = subBorderOver;
    }

    public Short getMainWidth() {
        return mainWidth;
    }

    public void setMainWidth(Short mainWidth) {
        this.mainWidth = mainWidth;
    }

    public Short getSubWidth() {
        return subWidth;
    }

    public void setSubWidth(Short subWidth) {
        this.subWidth = subWidth;
    }

    public String getMainBack() {
        return mainBack;
    }

    public void setMainBack(String mainBack) {
        this.mainBack = mainBack;
    }

    public String getMainOver() {
        return mainOver;
    }

    public void setMainOver(String mainOver) {
        this.mainOver = mainOver;
    }

    public String getSubBack() {
        return subBack;
    }

    public void setSubBack(String subBack) {
        this.subBack = subBack;
    }

    public String getSubOver() {
        return subOver;
    }

    public void setSubOver(String subOver) {
        this.subOver = subOver;
    }

    public String getSubBorder() {
        return subBorder;
    }

    public void setSubBorder(String subBorder) {
        this.subBorder = subBorder;
    }

    public Short getMainFontSize() {
        return mainFontSize;
    }

    public void setMainFontSize(Short mainFontSize) {
        this.mainFontSize = mainFontSize;
    }

    public Short getSubFontSize() {
        return subFontSize;
    }

    public void setSubFontSize(Short subFontSize) {
        this.subFontSize = subFontSize;
    }

    public String getMainBorderOver() {
        return mainBorderOver;
    }

    public void setMainBorderOver(String mainBorderOver) {
        this.mainBorderOver = mainBorderOver;
    }

    public String getSubFontColor() {
        return subFontColor;
    }

    public void setSubFontColor(String subFontColor) {
        this.subFontColor = subFontColor;
    }

    public String getMainBorder() {
        return mainBorder;
    }

    public void setMainBorder(String mainBorder) {
        this.mainBorder = mainBorder;
    }

    public String getMainFontColor() {
        return mainFontColor;
    }

    public void setMainFontColor(String mainFontColor) {
        this.mainFontColor = mainFontColor;
    }

    public String getSubFontColorOver() {
        return subFontColorOver;
    }

    public void setSubFontColorOver(String subFontColorOver) {
        this.subFontColorOver = subFontColorOver;
    }

    public String getMainFontColorOver() {
        return mainFontColorOver;
    }

    public void setMainFontColorOver(String mainFontColorOver) {
        this.mainFontColorOver = mainFontColorOver;
    }

    public String getMainAlign() {
        return mainAlign;
    }

    public void setMainAlign(String mainAlign) {
        this.mainAlign = mainAlign;
    }

    public String getSubAlign() {
        return subAlign;
    }

    public void setSubAlign(String subAlign) {
        this.subAlign = subAlign;
    }

    public Short getSubHeight() {
        return subHeight;
    }

    public void setSubHeight(Short subHeight) {
        this.subHeight = subHeight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontWeightOver() {
        return fontWeightOver;
    }

    public void setFontWeightOver(String fontWeightOver) {
        this.fontWeightOver = fontWeightOver;
    }

    public Integer getLevel2SubTop() {
        return level2SubTop;
    }

    public void setLevel2SubTop(Integer level2SubTop) {
        this.level2SubTop = level2SubTop;
    }

    public Integer getLevel2SubLeft() {
        return level2SubLeft;
    }

    public void setLevel2SubLeft(Integer level2SubLeft) {
        this.level2SubLeft = level2SubLeft;
    }

    public int getLevel1SubTop() {
        return level1SubTop;
    }

    public void setLevel1SubTop(int level1SubTop) {
        this.level1SubTop = level1SubTop;
    }

    public int getLevel1SubLeft() {
        return level1SubLeft;
    }

    public void setLevel1SubLeft(int level1SubLeft) {
        this.level1SubLeft = level1SubLeft;
    }

    public String getMainBackImage() {
        return mainBackImage;
    }

    public void setMainBackImage(String mainBackImage) {
        this.mainBackImage = mainBackImage;
    }

    public String getMainBackImageOver() {
        return mainBackImageOver;
    }

    public void setMainBackImageOver(String mainBackImageOver) {
        this.mainBackImageOver = mainBackImageOver;
    }

    public String getSubBackImage() {
        return subBackImage;
    }

    public void setSubBackImage(String subBackImage) {
        this.subBackImage = subBackImage;
    }

    public String getSubBackImageOver() {
        return subBackImageOver;
    }

    public void setSubBackImageOver(String subBackImageOver) {
        this.subBackImageOver = subBackImageOver;
    }

    public String getSpecialA() {
        return specialA;
    }

    public void setSpecialA(String specialA) {
        this.specialA = specialA;
    }

    public String getMainPadding() {
        return mainPadding;
    }

    public void setMainPadding(String mainPadding) {
        this.mainPadding = mainPadding;
    }

    public String getSubPadding() {
        return subPadding;
    }

    public void setSubPadding(String subPadding) {
        this.subPadding = subPadding;
    }

    public String getSpecialB() {
        return specialB;
    }

    public void setSpecialB(String specialB) {
        this.specialB = specialB;
    }

    public String getSubFontFamily() {
        return subFontFamily;
    }

    public void setSubFontFamily(String subFontFamily) {
        this.subFontFamily = subFontFamily;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getTopTtf() {
        return topTtf;
    }

    public void setTopTtf(String topTtf) {
        this.topTtf = topTtf;
    }

    public String getSubTtf() {
        return subTtf;
    }

    public void setSubTtf(String subTtf) {
        this.subTtf = subTtf;
    }

    public String getActiveBackground() {
        return activeBackground;
    }

    public void setActiveBackground(String activeBackground) {
        this.activeBackground = activeBackground;
    }

    public String getActiveFont() {
        return activeFont;
    }

    public void setActiveFont(String activeFont) {
        this.activeFont = activeFont;
    }

    public String getTopMargin() {
        return topMargin;
    }

    public void setTopMargin(String topMargin) {
        this.topMargin = topMargin;
    }

    public String getTopWrap() {
        return topWrap;
    }

    public void setTopWrap(String topWrap) {
        this.topWrap = topWrap;
    }

    public String getSubWrap() {
        return subWrap;
    }

    public void setSubWrap(String subWrap) {
        this.subWrap = subWrap;
    }

    public String getCorners() {
        return corners;
    }

    public void setCorners(String corners) {
        this.corners = corners;
    }

    public String getTopFontExtra() {
        return topFontExtra;
    }

    public void setTopFontExtra(String topFontExtra) {
        this.topFontExtra = topFontExtra;
    }

    public String getSubFontExtra() {
        return subFontExtra;
    }

    public void setSubFontExtra(String subFontExtra) {
        this.subFontExtra = subFontExtra;
    }

    public String getCompletePadding() {
        return completePadding;
    }

    public void setCompletePadding(String completePadding) {
        this.completePadding = completePadding;
    }

    public String getCompleteBackground() {
        return completeBackground;
    }

    public void setCompleteBackground(String completeBackground) {
        this.completeBackground = completeBackground;
    }

    public String getCompleteBackgroundImage() {
        return completeBackgroundImage;
    }

    public void setCompleteBackgroundImage(String completeBackgroundImage) {
        this.completeBackgroundImage = completeBackgroundImage;
    }

    public String getActiveBackgroundImage() {
        return activeBackgroundImage;
    }

    public void setActiveBackgroundImage(String activeBackgroundImage) {
        this.activeBackgroundImage = activeBackgroundImage;
    }

    public String getSubIndicator() {
        return subIndicator;
    }

    public void setSubIndicator(String subIndicator) {
        this.subIndicator = subIndicator;
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
        if (!(object instanceof Joo2SwmenufreeConfig)) {
            return false;
        }
        Joo2SwmenufreeConfig other = (Joo2SwmenufreeConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entp.portal.Joo2SwmenufreeConfig[ id=" + id + " ]";
    }
    
}
