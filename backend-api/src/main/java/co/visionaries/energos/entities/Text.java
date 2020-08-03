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
    private String textContent;
    private int fontSize;
    private String fontFamily;
    private Boolean isFontBold;
    private Boolean isFontItalicized;
    private Boolean isFontUnderlined;
    @ManyToOne
    private VisionBoard visionBoard;

    protected Text() {
    }

    public Text(long id, String textContent, int fontSize, String fontFamily, Boolean isFontBold, Boolean isFontItalicized, Boolean isFontUnderlined, VisionBoard visionBoard) {
        this.id = id;
        this.textContent = textContent;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.isFontBold = isFontBold;
        this.isFontItalicized = isFontItalicized;
        this.isFontUnderlined = isFontUnderlined;
        this.visionBoard = visionBoard;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
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

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}
