package co.visionaries.energos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Image {
    @Id
    @GeneratedValue
    private long id;
    private String imageName;
    private int imageHeight;
    private int imageWidth;
    private String imageLink;
    private boolean imageHasBorder;
    private int imageBorderRadius;
    private int imageRotate;
    private boolean imageIsFlipped;
    @ManyToOne
    private VisionBoard visionBoard;

    public Image(long id, String imageName, int imageHeight, int imageWidth, String imageLink, boolean imageHasBorder, int imageBorderRadius, int imageRotate, boolean imageIsFlipped, VisionBoard visionBoard) {
        this.id = id;
        this.imageName = imageName;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageLink = imageLink;
        this.imageHasBorder = imageHasBorder;
        this.imageBorderRadius = imageBorderRadius;
        this.imageRotate = imageRotate;
        this.imageIsFlipped = imageIsFlipped;
        this.visionBoard = visionBoard;
    }

    protected Image() {
    }

    public long getId() {
        return id;
    }

    public String getImageName() {
        return imageName;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public String getImageLink() {
        return imageLink;
    }

    public boolean isImageHasBorder() {
        return imageHasBorder;
    }

    public int getImageBorderRadius() {
        return imageBorderRadius;
    }

    public int getImageRotate() {
        return imageRotate;
    }

    public boolean isImageIsFlipped() {
        return imageIsFlipped;
    }

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public void setImageHasBorder(boolean imageHasBorder) {
        this.imageHasBorder = imageHasBorder;
    }

    public void setImageBorderRadius(int imageBorderRadius) {
        this.imageBorderRadius = imageBorderRadius;
    }

    public void setImageRotate(int imageRotate) {
        this.imageRotate = imageRotate;
    }

    public void setImageIsFlipped(boolean imageIsFlipped) {
        this.imageIsFlipped = imageIsFlipped;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}
