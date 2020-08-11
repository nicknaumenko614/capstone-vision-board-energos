package co.visionaries.energos.storage;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.repositories.ImageRepository;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;

@Service
public class ImageStorage {

    private ImageRepository imageRepo;

    public ImageStorage(ImageRepository imageRepo) {
        this.imageRepo = imageRepo;
    }

    public Collection<Image> getAllImages (){
        return (Collection <Image>) imageRepo.findAll();
    }

    public Image retrieveImageById(long imageId) {
        return imageRepo.findById(imageId).get();
    }

    public Image saveImage(Image image) {
        return imageRepo.save(image);
    }

    public void deleteImage(long imageId) {
        imageRepo.deleteById(imageId);
    }

    public Image retrieveImageByHtmlId(String imageHtmlId) {
        Image retrievedImage;
        Optional<Image> imageOptional = imageRepo.findByHtmlId(imageHtmlId);
        retrievedImage=imageOptional.get();
        return retrievedImage;


}

    }
