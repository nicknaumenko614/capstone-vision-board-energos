package co.visionaries.energos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Text {
    @Id
    @GeneratedValue
    private long id;
    private String textHtmlId;
    private String textContent;
    private String fontSize;
    private Boolean hasFontShadow;
    private String fontShadowColor;
    private String fontColor;
    private String fontFamily;
    private Boolean isFontBold;
    private Boolean isFontItalicized;
    private Boolean isFontUnderlined;
    private String textParentElement;
    @ManyToOne
    private VisionBoard visionBoard;

    protected Text() {
    }

    public Text(String textHtmlId, String textContent, String fontSize, Boolean hasFontShadow, String fontShadowColor, String fontColor, String fontFamily, Boolean isFontBold, Boolean isFontItalicized, Boolean isFontUnderlined, String textParentElement, VisionBoard visionBoard) {
        this.textHtmlId = textHtmlId;
        this.textContent = textContent;
        this.fontSize = fontSize;
        this.hasFontShadow = hasFontShadow;
        this.fontShadowColor = fontShadowColor;
        this.fontColor = fontColor;
        this.fontFamily = fontFamily;
        this.isFontBold = isFontBold;
        this.isFontItalicized = isFontItalicized;
        this.isFontUnderlined = isFontUnderlined;
        this.textParentElement = textParentElement;
        this.visionBoard = visionBoard;

    }

    public long getId() {
        return id;
    }

    public String getTextHtmlId() {
        return textHtmlId;
    }

    public void setTextHtmlId(String textHtmlId) {
        this.textHtmlId = textHtmlId;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public Boolean getHasFontShadow() {
        return hasFontShadow;
    }

    public void setHasFontShadow(Boolean hasFontShadow) {
        this.hasFontShadow = hasFontShadow;
    }

    public String getFontShadowColor() {
        return fontShadowColor;
    }

    public void setFontShadowColor(String fontShadowColor) {
        this.fontShadowColor = fontShadowColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Boolean getFontBold() {
        return isFontBold;
    }

    public void setFontBold(Boolean fontBold) {
        isFontBold = fontBold;
    }

    public Boolean getFontItalicized() {
        return isFontItalicized;
    }

    public void setFontItalicized(Boolean fontItalicized) {
        isFontItalicized = fontItalicized;
    }

    public Boolean getFontUnderlined() {
        return isFontUnderlined;
    }

    public void setFontUnderlined(Boolean fontUnderlined) {
        isFontUnderlined = fontUnderlined;
    }

    public String getTextParentElement() {
        return textParentElement;
    }

    public void setTextParentElement(String textParentElement) {
        this.textParentElement = textParentElement;
    }

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}