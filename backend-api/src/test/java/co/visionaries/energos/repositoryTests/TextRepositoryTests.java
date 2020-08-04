package co.visionaries.energos.repositoryTests;

import co.visionaries.energos.entities.Text;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.TextRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TextRepositoryTests {

    @Autowired
    private TextRepository textRepo;

    @Autowired
    private TestEntityManager entityManager;

    private VisionBoard visionBoard1;

    @Test
    public void saveShouldBeAbleToUpdateTextAttributes(){
        Text testText = new Text("this is sample text", 12,true,"#0000", "#1111", "Times", true, true, false, "grid1", visionBoard1);
        textRepo.save(testText);
        Boolean newHasFontShadow = false;
        testText.setHasFontShadow(newHasFontShadow);
        textRepo.save(testText);
        entityManager.flush();
        entityManager.clear();

        Text retrievedText = textRepo.findById(testText.getId()).get();
        assertThat(retrievedText.getHasFontShadow()).isFalse();

    }
}
