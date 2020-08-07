package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Text;
import co.visionaries.energos.storage.TextStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TextController {
    TextStorage textStorage;
    VisionBoardStorage visionBoardStorage;

    public TextController(TextStorage textStorage, VisionBoardStorage visionBoardStorage) {
        this.textStorage = textStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

//    @GetMapping("/api/texts")
//    public Collection<Text> getAllTexts {
//        return textStorage.getAllTexts()
//    }
}
