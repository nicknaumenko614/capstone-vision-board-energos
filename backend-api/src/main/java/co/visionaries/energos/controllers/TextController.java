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
    public Text updateHasFontShadow(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setHasFontShadow(text.getHasFontShadow());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateFontShadowColor")
    public Text updateFontShadowColor(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontShadowColor(text.getFontShadowColor());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateFontColor")
    public Text updateFontColor(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontColor(text.getFontColor());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateFontFamily")
    public Text updateFontFamily(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontFamily(text.getFontFamily());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateIsFontBold")
    public Text updateIsFontBold(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontBold(text.getFontBold());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateIsFontItalicized")
    public Text updateIsFontItalicized(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontItalicized(text.getFontItalicized());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateIsFontUnderlined")
    public Text updateIsFontUnderlined(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setFontUnderlined(text.getFontUnderlined());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }

    @PatchMapping("/api/texts/{textId}/updateTextParentElement")
    public Text updateTextParentElement(@PathVariable long textId, @RequestBody Text text) {
        Text textToUpdate = textStorage.retrieveTextById(textId);
        textToUpdate.setTextParentElement(text.getTextParentElement());
        textStorage.saveText(textToUpdate);
        return textToUpdate;
    }
}




