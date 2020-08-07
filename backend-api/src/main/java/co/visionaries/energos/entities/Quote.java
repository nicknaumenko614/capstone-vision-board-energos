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
    private String quoteHtmlId;
    private boolean quoteIsZoomed;
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

    public Quote(String quoteHtmlId, boolean quoteIsZoomed, String quoteLink, boolean quoteHasBorder, String quoteBorderRadius, int quoteRotate, boolean quoteIsFlipped, String quoteParentElement, VisionBoard visionBoard) {
        this.quoteHtmlId = quoteHtmlId;
        this.quoteIsZoomed = quoteIsZoomed;
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

    public String getQuoteHtmlId() {
        return quoteHtmlId;
    }

    public void setQuoteHtmlId(String quoteHtmlId) {
        this.quoteHtmlId = quoteHtmlId;
    }

    public boolean isQuoteIsZoomed() {
        return quoteIsZoomed;
    }

    public void setQuoteIsZoomed(boolean quoteIsZoomed) {
        this.quoteIsZoomed = quoteIsZoomed;
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
