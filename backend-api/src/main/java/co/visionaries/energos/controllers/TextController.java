package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Text;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.TextStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TextController {
    TextStorage textStorage;
    VisionBoardStorage visionBoardStorage;

    public TextController(TextStorage textStorage, VisionBoardStorage visionBoardStorage) {
        this.textStorage = textStorage;
        this.visionBoardStorage = visionBoardStorage;
    }

    @GetMapping("/api/texts/visionboard/{visionBoardId}")
    public Collection<Text> getAllTexts(@PathVariable long visionBoardId) {
        return visionBoardStorage.retrieveVisionBoardbyId(visionBoardId).getTexts();
    }

    @GetMapping("/api/texts/{textId}")
    public Text getTextById(@PathVariable long textId) {
        return textStorage.retrieveTextById(textId);
    }

    @DeleteMapping("/api/texts/{textId}/delete")
    public void deleteText(@PathVariable long textId) {
        textStorage.deleteText(textId);
    }

    @PostMapping("/api/visionboards/{visionBoardId}/addtext")
    public void addTextToVisionBoard(@PathVariable long visionBoardId, @RequestBody Text text) {
        VisionBoard visionBoard = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        text.setVisionBoard(visionBoard);
        textStorage.saveText(text);
    }

    @PatchMapping("/api/texts/{textId}/updateTextContent")
    public Text updateText(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setTextContent(text.getTextContent());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateFontSize")
    public Text updateFontSize(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontSize(text.getFontSize());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateHasFontShadow")
    public Text updateHasFontShadow (@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setHasFontShadow(text.getHasFontShadow());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }
}



//        textToUpdate.setFontShadowColor(text.getFontShadowColor());
//        textToUpdate.setFontColor(text.getFontColor());
//        textToUpdate.setFontFamily(text.getFontFamily());
//        textToUpdate.setFontBold(text.getFontBold());
//        textToUpdate.setFontItalicized(text.getFontItalicized());
//        textToUpdate.setFontUnderlined(text.getFontUnderlined());
//        textToUpdate.setTextParentElement(text.getTextParentElement());


