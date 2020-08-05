package co.visionaries.energos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Quote {
    @Id
    @GeneratedValue
    private long id;
    private String quoteName;
    private String quoteHeight;
    private String quoteWidth;
    private String quoteLink;
    private boolean quoteHasBorder;
    private String quoteBorderRadius;
    private int quoteRotate;
    private boolean quoteIsFlipped;
    private String quoteParentElement;

    @ManyToOne
    private VisionBoard visionBoard;

    protected Quote() {
    }

    public Quote(String quoteName, String quoteHeight, String quoteWidth, String quoteLink, boolean quoteHasBorder, String quoteBorderRadius, int quoteRotate, boolean quoteIsFlipped, String quoteParentElement, VisionBoard visionBoard) {
        this.quoteName = quoteName;
        this.quoteHeight = quoteHeight;
        this.quoteWidth = quoteWidth;
        this.quoteLink = quoteLink;
        this.quoteHasBorder = quoteHasBorder;
        this.quoteBorderRadius = quoteBorderRadius;
        this.quoteRotate = quoteRotate;
        this.quoteIsFlipped = quoteIsFlipped;
        this.quoteParentElement = quoteParentElement;
        this.visionBoard = visionBoard;
    }

    public long getId() {
        return id;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getQuoteHeight() {
        return quoteHeight;
    }

    public void setQuoteHeight(String quoteHeight) {
        this.quoteHeight = quoteHeight;
    }

    public String getQuoteWidth() {
        return quoteWidth;
    }

    public void setQuoteWidth(String quoteWidth) {
        this.quoteWidth = quoteWidth;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }

    public boolean isQuoteHasBorder() {
        return quoteHasBorder;
    }

    public void setQuoteHasBorder(boolean quoteHasBorder) {
        this.quoteHasBorder = quoteHasBorder;
    }

    public String getQuoteBorderRadius() {
        return quoteBorderRadius;
    }

    public void setQuoteBorderRadius(String quoteBorderRadius) {
        this.quoteBorderRadius = quoteBorderRadius;
    }

    public int getQuoteRotate() {
        return quoteRotate;
    }

    public void setQuoteRotate(int quoteRotate) {
        this.quoteRotate = quoteRotate;
    }

    public boolean isQuoteIsFlipped() {
        return quoteIsFlipped;
    }

    public void setQuoteIsFlipped(boolean quoteIsFlipped) {
        this.quoteIsFlipped = quoteIsFlipped;
    }

    public String getQuoteParentElement() {
        return quoteParentElement;
    }

    public void setQuoteParentElement(String quoteParentElement) {
        this.quoteParentElement = quoteParentElement;
    }

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}
