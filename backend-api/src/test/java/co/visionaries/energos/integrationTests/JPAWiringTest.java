package co.visionaries.energos.integrationTests;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.ImageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private ImageRepository imageRepo;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void flippedFlagComesOutOfDbTheWayItWentIn(){

        VisionBoard visionBoard = null;
        Image testImage = imageRepo.save(new Image("Image1", false, "www.imagelink.com", false, "25px", 180, false, "block1", visionBoard));
        testImage.setImageIsFlipped(true);
        imageRepo.save(testImage);
        entityManager.flush();
        entityManager.clear();
        Image retrievedImage = imageRepo.findById(testImage.getId()).get();
        assertTrue(retrievedImage.isImageIsFlipped());
    }
}
