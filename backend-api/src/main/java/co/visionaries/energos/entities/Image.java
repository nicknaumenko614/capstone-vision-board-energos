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
    private String imageParentElement;
    @ManyToOne
    private VisionBoard visionBoard;



    protected Image() {
    }

    public Image(long id, String imageName, int imageHeight, int imageWidth, String imageLink, boolean imageHasBorder, int imageBorderRadius, int imageRotate, boolean imageIsFlipped, String imageParentElement, VisionBoard visionBoard) {
        this.id = id;
        this.imageName = imageName;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageLink = imageLink;
        this.imageHasBorder = imageHasBorder;
        this.imageBorderRadius = imageBorderRadius;
        this.imageRotate = imageRotate;
        this.imageIsFlipped = imageIsFlipped;
        this.imageParentElement = imageParentElement;
        this.visionBoard = visionBoard;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public boolean isImageHasBorder() {
        return imageHasBorder;
    }

    public void setImageHasBorder(boolean imageHasBorder) {
        this.imageHasBorder = imageHasBorder;
    }

    public int getImageBorderRadius() {
        return imageBorderRadius;
    }

    public void setImageBorderRadius(int imageBorderRadius) {
        this.imageBorderRadius = imageBorderRadius;
    }

    public int getImageRotate() {
        return imageRotate;
    }

    public void setImageRotate(int imageRotate) {
        this.imageRotate = imageRotate;
    }

    public boolean isImageIsFlipped() {
        return imageIsFlipped;
    }

    public void setImageIsFlipped(boolean imageIsFlipped) {
        this.imageIsFlipped = imageIsFlipped;
    }

    public String getImageParentElement() {
        return imageParentElement;
    }

    public void setImageParentElement(String imageParentElement) {
        this.imageParentElement = imageParentElement;
    }

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}
