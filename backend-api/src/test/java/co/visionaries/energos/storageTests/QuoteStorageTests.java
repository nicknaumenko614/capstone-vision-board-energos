package co.visionaries.energos.storageTests;

import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.QuoteRepository;
import co.visionaries.energos.storage.QuoteStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class QuoteStorageTests {
    private QuoteRepository quoteRepo;
    private QuoteStorage underTest;
    private VisionBoard visionBoard1;

    @BeforeEach
    void setUp() {
        quoteRepo = mock(QuoteRepository.class);
        underTest = new QuoteStorage(quoteRepo);
    }

    @Test
    public void shouldBeAbleToSaveNewQuote() {
        Quote testQuote = new Quote("testQuote", false, "www.link.com", true, "20", 15, false, "block2", visionBoard1);
        underTest.saveQuote(testQuote);
        verify(quoteRepo).save(testQuote);
    }
}
