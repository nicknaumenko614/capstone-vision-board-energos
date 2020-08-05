package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.ImageStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ImageController {
    ImageStorage imageStorage;
    VisionBoardStorage visionBoardStorage;

    public ImageController(ImageStorage imageStorage, VisionBoardStorage visionBoardStorage) {
        this.imageStorage = imageStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping()
    public Collection<Image> getAllImages(){
        return imageStorage.getAllImages();
    }

    @GetMapping()
    public Image getImageById(@PathVariable long imageId){
      return imageStorage.retrieveImageById(imageId);
    }

    @DeleteMapping()
    public void deleteImage(@PathVariable long imageId){
        imageStorage.deleteImage(imageId);
    }
}
