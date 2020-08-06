package co.visionaries.energos.repositoryTests;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.entities.Text;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.VisionBoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class VisionBoardRepositoryTests {

    @Autowired
    private VisionBoardRepository visionBoardRepo;

    @Autowired
    private TestEntityManager entityManager;

    private Collection<Text> texts;
    private Collection<Quote> quotes;
    private Collection<Image> images;

    @Test
    public void saveShouldBeAbleToUpdateVisionBoardAttributes() {
        VisionBoard testVisionBoard = new VisionBoard(false, false, "20", "15", "10", "#2222", "solid", "www.image.com", "#0000", "template1", texts, quotes, images);
        visionBoardRepo.save(testVisionBoard);
        String newGridSpacing = "50";
        testVisionBoard.setGridSpacing(newGridSpacing);
        visionBoardRepo.save(testVisionBoard);
        entityManager.flush();
        entityManager.clear();

        VisionBoard retrievedVisionBoard = visionBoardRepo.findById(testVisionBoard.getId()).get();
        assertThat(retrievedVisionBoard.getGridSpacing()).isEqualTo(newGridSpacing);
    }
}
