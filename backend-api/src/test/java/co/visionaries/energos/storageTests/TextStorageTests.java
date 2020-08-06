package co.visionaries.energos.storageTests;

import co.visionaries.energos.entities.Text;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.TextRepository;
import co.visionaries.energos.storage.TextStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TextStorageTests {
    private TextRepository textRepo;
    private TextStorage underTest;
    private VisionBoard visionBoard1;

    @BeforeEach
    void setUp() {
        textRepo = mock(TextRepository.class);
        underTest = new TextStorage(textRepo);
    }

    @Test
    public void shouldBeAbleToSaveNewText() {
        Text testText = new Text("Sample Text", "12", true, "#00000", "#34ffre", "Times", false, false, false, "block2", visionBoard1);
        underTest.saveText(testText);
        verify(textRepo).save(testText);
    }
}
