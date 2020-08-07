package co.visionaries.energos.controllers;

import co.visionaries.energos.storage.QuoteStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    QuoteStorage quoteStorage;
    VisionBoardStorage visionBoardStorage;

    public QuoteController(QuoteStorage quoteStorage, VisionBoardStorage visionBoardStorage){
        this.quoteStorage = quoteStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    


}
