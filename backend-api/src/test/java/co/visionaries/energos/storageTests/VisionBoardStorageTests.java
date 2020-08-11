package co.visionaries.energos.storageTests;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.entities.Text;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.VisionBoardRepository;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.configuration.IMockitoConfiguration;

import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VisionBoardStorageTests {
    private VisionBoardRepository visionBoardRepo;
    private VisionBoardStorage underTest;
    private Collection<Image> images;
    private Collection<Quote> quotes;
    private Collection<Text> texts;

    @BeforeEach
    void setUp() {
        visionBoardRepo = mock(VisionBoardRepository.class);
        underTest = new VisionBoardStorage(visionBoardRepo);
    }

    @Test
    public void shouldBeAbleToSaveNewVisionBoard() {
        VisionBoard testVisionBoard = new VisionBoard("boardName", false, true, "10px", "0%",
                "2px", "#393E41", "solid", "", "#F9FCFF", 0);
        underTest.saveVisionBoard(testVisionBoard);
        verify(visionBoardRepo).save(testVisionBoard);
    }
}
