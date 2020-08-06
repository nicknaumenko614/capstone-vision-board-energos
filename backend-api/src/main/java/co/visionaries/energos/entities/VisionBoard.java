package co.visionaries.energos.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class VisionBoard {
    @Id
    @GeneratedValue
    private long id;
    private String visionBoardName;
    private boolean isThemeDark;
    private boolean hasGrid;
    private String gridSpacing;
    private String gridBorderRadius;
    private String gridBorderThickness;
    private String gridBorderColor;
    private String gridBorderStyle;
    private String backgroundImageLink;
    private String backgroundColor;
    private String gridTemplateName;

    @ManyToMany
    private Collection<Text> texts;
    @ManyToMany
    private Collection<Quote> quotes;
    @ManyToMany
    private Collection<Image> images;
    @ManyToMany
    private Collection<Background> backgrounds;

    protected VisionBoard() {
    }

    public VisionBoard(String visionBoardName, boolean isThemeDark, boolean hasGrid, String gridSpacing, String gridBorderRadius, String gridBorderThickness, String gridBorderColor, String gridBorderStyle, String backgroundImageLink, String backgroundColor, String gridTemplateName) {
        this.visionBoardName = visionBoardName;
        this.isThemeDark = isThemeDark;
        this.hasGrid = hasGrid;
        this.gridSpacing = gridSpacing;
        this.gridBorderRadius = gridBorderRadius;
        this.gridBorderThickness = gridBorderThickness;
        this.gridBorderColor = gridBorderColor;
        this.gridBorderStyle = gridBorderStyle;
        this.backgroundImageLink = backgroundImageLink;
        this.backgroundColor = backgroundColor;
        this.gridTemplateName = gridTemplateName;
    }

    public String getVisionBoardName() {
        return visionBoardName;
    }

    public void setVisionBoardName(String visionBoardName) {
        this.visionBoardName = visionBoardName;
    }

    public Collection<Background> getBackgrounds() {
        return backgrounds;
    }

    public void setBackgrounds(Collection<Background> backgrounds) {
        this.backgrounds = backgrounds;
    }

    public long getId() {
        return id;
    }

    public boolean isThemeDark() {
        return isThemeDark;
    }

    public void setThemeDark(boolean themeDark) {
        isThemeDark = themeDark;
    }

    public boolean isHasGrid() {
        return hasGrid;
    }

    public void setHasGrid(boolean hasGrid) {
        this.hasGrid = hasGrid;
    }

    public String getGridSpacing() {
        return gridSpacing;
    }

    public void setGridSpacing(String gridSpacing) {
        this.gridSpacing = gridSpacing;
    }

    public String getGridBorderRadius() {
        return gridBorderRadius;
    }

    public void setGridBorderRadius(String gridBorderRadius) {
        this.gridBorderRadius = gridBorderRadius;
    }

    public String getGridBorderThickness() {
        return gridBorderThickness;
    }

    public void setGridBorderThickness(String gridBorderThickness) {
        this.gridBorderThickness = gridBorderThickness;
    }

    public String getGridBorderColor() {
        return gridBorderColor;
    }

    public void setGridBorderColor(String gridBorderColor) {
        this.gridBorderColor = gridBorderColor;
    }

    public String getGridBorderStyle() {
        return gridBorderStyle;
    }

    public void setGridBorderStyle(String gridBorderStyle) {
        this.gridBorderStyle = gridBorderStyle;
    }

    public String getBackgroundImageLink() {
        return backgroundImageLink;
    }

    public void setBackgroundImageLink(String backgroundImageLink) {
        this.backgroundImageLink = backgroundImageLink;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getGridTemplateName() {
        return gridTemplateName;
    }

    public void setGridTemplateName(String gridTemplateName) {
        this.gridTemplateName = gridTemplateName;
    }

    public Collection<Text> getTexts() {
        return texts;
    }

    public void setTexts(Collection<Text> texts) {
        this.texts = texts;
    }

    public Collection<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(Collection<Quote> quotes) {
        this.quotes = quotes;
    }

    public Collection<Image> getImages() {
        return images;
    }

    public void setImages(Collection<Image> images) {
        this.images = images;
    }
}