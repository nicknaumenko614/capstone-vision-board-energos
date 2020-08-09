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

    @GetMapping("/api/texts")
    public Collection<Text> getAllTexts() {
        return textStorage.getAllTexts();
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

    @PatchMapping("/api/texts/updatetext")
    public Text updateText (@RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(text.getId());
        textToUpdate.setTextContent(text.getTextContent());
        textToUpdate.setFontSize(text.getFontSize());
        textToUpdate.setHasFontShadow(text.getHasFontShadow());
        textToUpdate.setFontShadowColor(text.getFontShadowColor());
        textToUpdate.setFontColor(text.getFontColor());
        textToUpdate.setFontFamily(text.getFontFamily());
        textToUpdate.setFontBold(text.getFontBold());
        textToUpdate.setFontItalicized(text.getFontItalicized());
        textToUpdate.setFontUnderlined(text.getFontUnderlined());
        textToUpdate.setTextParentElement(text.getTextParentElement());
        textStorage.saveText(textToUpdate);
        return textToUpdate;


    }
}



