package co.visionaries.energos.storageTests;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.ImageRepository;
import co.visionaries.energos.storage.ImageStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ImageStorageTest {
    private ImageRepository imageRepo;
    private ImageStorage underTest;
    private VisionBoard visionBoard1;

    @BeforeEach
    void setUp() {
        imageRepo = mock(ImageRepository.class);
        underTest = new ImageStorage(imageRepo);
    }

//    @Test
//    public void shouldBeAbleToSaveNewImage() {
//        Image testImage = new Image("testImage", false, "www.link.com", true, "25", 0, false, "grid1", );
//        underTest.saveImage(testImage);
//        verify(imageRepo).save(testImage);
//    }

}
