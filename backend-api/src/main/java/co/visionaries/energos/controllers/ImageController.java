package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.ImageStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ImageController {
    ImageStorage imageStorage;
    VisionBoardStorage visionBoardStorage;

    public ImageController(ImageStorage imageStorage, VisionBoardStorage visionBoardStorage) {
        this.imageStorage = imageStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping("/api/images")
    public Collection<Image> getAllImages() {
        return imageStorage.getAllImages();
    }

    @GetMapping("/api/images/{imageId}")
    public Image getImageById(@PathVariable long imageId) {
        return imageStorage.retrieveImageById(imageId);
    }

    @DeleteMapping("/api/images/{imageId}/delete")
    public void deleteImage(@PathVariable long imageId) {
        imageStorage.deleteImage(imageId);
    }

    @PostMapping("/api/images/addimage")
    public void addImageToVisionBoard(@RequestBody Image image) {
//        VisionBoard visionBoard = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
//        image.setVisionBoard(visionBoard);
//        Image imageToAdd = new Image(image.getImageName(), image.getImageHeight(), image.getImageWidth(), image.getImageLink(), image.isImageHasBorder(), image.getImageBorderRadius(), image.getImageRotate()
//                , image.isImageIsFlipped(), image.getImageParentElement(), visionBoard);
        imageStorage.saveImage(image);
    }

    @PatchMapping("/api/images/updateimage")
    public Image updateImage (@RequestBody Image image) {
        Image imageToUpdate = imageStorage.retrieveImageById(image.getId());
        imageToUpdate.setImageIsZoomed(image.isImageIsZoomed());
        imageToUpdate.setImageHasBorder(image.isImageHasBorder());
        imageToUpdate.setImageBorderRadius(image.getImageBorderRadius());
        imageToUpdate.setImageRotate(image.getImageRotate());
        imageToUpdate.setImageIsFlipped(image.isImageIsFlipped());
        imageToUpdate.setImageParentElement(image.getImageParentElement());
        return imageToUpdate;
    }

}
//    @PatchMapping("/api/artists/{artistId}/album")
//    public Artist addAlbumToArtist(@PathVariable long artistId, @RequestBody Album album) {
//        Artist artist = artistStorage.retrieveById(artistId);
//        Album albumToAdd = new Album(album.getAlbumTitle(), album.getImagePath(), artist, album.getReleaseYear(), album.getRecordLabel());
//        albumStorage.save(albumToAdd);
//        return albumToAdd.getArtist();