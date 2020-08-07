package co.visionaries.energos.repositoryTests;

import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.QuoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class QuoteRepositoryTests {

    @Autowired
    private QuoteRepository quoteRepo;

    @Autowired
    private TestEntityManager entityManager;

    private VisionBoard visionBoard1;

    @Test
    public void saveShouldBeAbleToUpdateQuoteAttributes() {
        Quote testQuote = new Quote("testQuote", false, "www.quote.com", true, "25", 50, true, "block1", visionBoard1);
        quoteRepo.save(testQuote);
        String newQuoteName = "newTestQuote";
        testQuote.setQuoteHtmlId(newQuoteName);
        quoteRepo.save(testQuote);
        entityManager.flush();
        entityManager.clear();

        Quote retrievedQuote = quoteRepo.findById(testQuote.getId()).get();
        assertThat(retrievedQuote.getQuoteHtmlId()).isEqualTo(newQuoteName);
    }
}
