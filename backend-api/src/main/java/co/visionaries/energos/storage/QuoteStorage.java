package co.visionaries.energos.storage;

import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.repositories.QuoteRepository;
import org.springframework.stereotype.Service;

@Service
public class QuoteStorage {
    private QuoteRepository quoteRepo;

    public QuoteStorage(QuoteRepository quoteRepo) {
        this.quoteRepo = quoteRepo;
    }

    public Quote retrieveQuoteById(long quoteId) {
        return quoteRepo.findById(quoteId).get();
    }

    public Quote saveQuote(Quote quote) {
        return quoteRepo.save(quote);
    }

    public void deleteQuote(long quoteId) {
        quoteRepo.deleteById(quoteId);
    }
}
