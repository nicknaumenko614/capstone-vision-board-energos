package co.visionaries.energos.repositoryTests;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.ImageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ImageRepositoryTests {

    @Autowired
    private ImageRepository imageRepo;
    @Autowired
    private TestEntityManager entityManager;

    private VisionBoard visionBoard1;

    @Test
    public void saveShouldBeAbleToUpdateImageAttributes() {

        Image testImage = new Image("testImage", "100", "150", "www.link.com", true, "25", 0, false, "grid1", visionBoard1);
        imageRepo.save(testImage);
        String newImageHeight = "500";
        testImage.setImageHeight(newImageHeight);
        imageRepo.save(testImage);
        entityManager.flush();
        entityManager.clear();

        Image retrievedImage = imageRepo.findById(testImage.getId()).get();
        assertThat(retrievedImage.getImageHeight()).isEqualTo(newImageHeight);
    }
}
