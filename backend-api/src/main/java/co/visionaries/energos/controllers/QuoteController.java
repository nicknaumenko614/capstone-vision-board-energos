package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.Quote;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.QuoteStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class QuoteController {
    QuoteStorage quoteStorage;
    VisionBoardStorage visionBoardStorage;

    public QuoteController(QuoteStorage quoteStorage, VisionBoardStorage visionBoardStorage){
        this.quoteStorage = quoteStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping("/api/quotes/visionboard/{visionBoardId}")
    public Collection<Quote> getAllQuotes(@PathVariable long visionBoardId){
        return visionBoardStorage.retrieveVisionBoardbyId(visionBoardId).getQuotes();}

    @GetMapping("/api/quotes/{quoteId}")
    public Quote getQuoteById(@PathVariable long quoteId) { return quoteStorage.retrieveQuoteById(quoteId);}

    @GetMapping("/api/{visionBoardId}/quotes/{quoteHtmlId}")
    public Quote getQuoteByHtmlId(@PathVariable long visionBoardId, @PathVariable String quoteHtmlId){
        return visionBoardStorage.findQuoteByHtmlId(quoteHtmlId, visionBoardId);
    }

    @DeleteMapping("/api/quotes/{quoteId}/delete")
    public void deleteQuote(@PathVariable long quoteId) {
        quoteStorage.deleteQuote(quoteId);
    }

    @PostMapping("/api/visionboards/{visionBoardId}/addquote")
    public void addQuoteToVisionBoard(@PathVariable long visionBoardId, @RequestBody Quote quote) {
        VisionBoard visionBoard = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        quote.setVisionBoard(visionBoard);
        quoteStorage.saveQuote(quote);
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteIsZoomed")
    public Quote updateQuoteIsZoomed(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteIsZoomed(quote.isQuoteIsZoomed());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteHasBorder")
    public Quote updateQuoteHasBorder(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteHasBorder(quote.isQuoteHasBorder());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteBorderRadius")
    public Quote updateQuoteBorderRadius(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteBorderRadius(quote.getQuoteBorderRadius());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteRotate")
    public Quote updateQuoteRotate(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteRotate(quote.getQuoteRotate());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteIsFlipped")
    public Quote updateQuoteIsFlipped(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteIsFlipped(quote.isQuoteIsFlipped());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }

    @PatchMapping("/api/quotes/{quoteId}/updateQuoteParentElement")
    public Quote updateQuoteParentElement(@PathVariable long quoteId, @RequestBody Quote quote) {
        Quote quoteToUpdate = quoteStorage.retrieveQuoteById(quoteId);
        quoteToUpdate.setQuoteParentElement(quote.getQuoteParentElement());
        quoteStorage.saveQuote(quoteToUpdate);
        return quoteToUpdate;
    }
}