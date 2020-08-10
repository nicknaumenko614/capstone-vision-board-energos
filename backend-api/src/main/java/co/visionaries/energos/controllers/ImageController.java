package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.ImageStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class
ImageController {
    ImageStorage imageStorage;
    VisionBoardStorage visionBoardStorage;

    public ImageController(ImageStorage imageStorage, VisionBoardStorage visionBoardStorage) {
        this.imageStorage = imageStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping("/api/images/visionboard/{visionBoardId}")
    public Collection<Image> getAllImages(@PathVariable long visionBoardId) {
        return visionBoardStorage.retrieveVisionBoardbyId(visionBoardId).getImages();
    }

    @GetMapping("/api/images/{imageId}")
    public Image getImageById(@PathVariable long imageId) {
        return imageStorage.retrieveImageById(imageId);
    }

    @DeleteMapping("/api/images/{imageId}/delete")
    public void deleteImage(@PathVariable long imageId) {
        imageStorage.deleteImage(imageId);
    }

    @PostMapping("/api/visionboards/{visionBoardId}/addimage")
    public void addImageToVisionBoard(@PathVariable long visionBoardId, @RequestBody Image image) {
        VisionBoard visionBoard = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        image.setVisionBoard(visionBoard);
        imageStorage.saveImage(image);
    }

    @PatchMapping("/api/images/{imageId}/updateImageZoom")
    public Image updateImage (@PathVariable long imageId, @RequestBody Image image) {
        Image imageToUpdate = imageStorage.retrieveImageById(imageId);
        imageToUpdate.setImageIsZoomed(image.isImageIsZoomed());
        imageStorage.saveImage(imageToUpdate);
        return imageToUpdate;
    }


}


//        imageToUpdate.setImageHasBorder(image.isImageHasBorder());
//        imageToUpdate.setImageBorderRadius(image.getImageBorderRadius());
//        imageToUpdate.setImageRotate(image.getImageRotate());
//        imageToUpdate.setImageIsFlipped(image.isImageIsFlipped());
//        imageToUpdate.setImageParentElement(image.getImageParentElement());