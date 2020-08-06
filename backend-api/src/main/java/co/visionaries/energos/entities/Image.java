package co.visionaries.energos.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Image {
    @Id
    @GeneratedValue
    private long id;
    private String imageName;
    private boolean imageIsZoomed;
    private String imageLink;
    private boolean imageHasBorder = false;
    private String imageBorderRadius;
    private int imageRotate;
    private boolean imageIsFlipped = false;
    private String imageParentElement;

    @ManyToOne
    private VisionBoard visionBoard;



    protected Image() {
    }

    public Image(String imageName, boolean imageIsZoomed, String imageLink, boolean imageHasBorder, String imageBorderRadius, int imageRotate, boolean imageIsFlipped, String imageParentElement) {
        this.imageName = imageName;
        this.imageIsZoomed = imageIsZoomed;
        this.imageLink = imageLink;
        this.imageHasBorder = imageHasBorder;
        this.imageBorderRadius = imageBorderRadius;
        this.imageRotate = imageRotate;
        this.imageIsFlipped = imageIsFlipped;
        this.imageParentElement = imageParentElement;

    }

    public long getId() {
        return id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isImageIsZoomed() {
        return imageIsZoomed;
    }

    public void setImageIsZoomed(boolean imageIsZoomed) {
        this.imageIsZoomed = imageIsZoomed;
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

    public String getImageBorderRadius() {
        return imageBorderRadius;
    }

    public void setImageBorderRadius(String imageBorderRadius) {
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
