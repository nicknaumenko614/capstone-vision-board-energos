package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.storage.QuoteStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class QuoteController {
    QuoteStorage quoteStorage;
    VisionBoardStorage visionBoardStorage;

    public QuoteController(QuoteStorage quoteStorage, VisionBoardStorage visionBoardStorage){
        this.quoteStorage = quoteStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping("/api/quotes")
    public Collection<Quote> getAllQuotes(){return quoteStorage.getAllQuotes();}

    @GetMapping("/api/quotes/{quoteId}")
    public Quote getQuoteById(@PathVariable long quoteId){ return quoteStorage.retrieveQuoteById(quoteId);}


}
