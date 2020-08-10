package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.entities.VisionBoardFactory;
import co.visionaries.energos.storage.ImageStorage;
import co.visionaries.energos.storage.QuoteStorage;
import co.visionaries.energos.storage.TextStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class VisionBoardController {
    VisionBoardStorage visionBoardStorage;
    ImageStorage imageStorage;
    QuoteStorage quoteStorage;
    TextStorage textStorage;
    VisionBoardFactory visionBoardFactory;

    public VisionBoardController(VisionBoardFactory visionBoardFactory, VisionBoardStorage visionBoardStorage, ImageStorage imageStorage, QuoteStorage quoteStorage, TextStorage textStorage) {
        this.visionBoardFactory = visionBoardFactory;
        this.visionBoardStorage = visionBoardStorage;
        this.imageStorage = imageStorage;
        this.quoteStorage = quoteStorage;
        this.textStorage = textStorage;
    }
    @GetMapping("/api/visionboards")
    public Collection<VisionBoard> getAllVisionBoards() {
        return visionBoardStorage.getAllVisionBoards();
    }

    @GetMapping("/api/visionboards/{visionBoardId}")
    public VisionBoard getVisionBoardById(@PathVariable long visionBoardId) {
        return visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
    }

    @PostMapping("/api/visionboards/add/{boardName}")
    public void addVisionBoard(@PathVariable String boardName) {
       visionBoardFactory.createDefaultBoard(boardName);

       VisionBoard newVisionBoard = visionBoardStorage.retrieveVisionBoardByName(boardName);

//       long newVisionBoardId = newVisionBoard.getId();
//
//       return newVisionBoardId;
    }

//    @DeleteMapping("/api/visionboards/{visionBoardId}/delete")
//    public void deleteVisionBoard(@PathVariable long visionBoardId) {
//        visionBoardStorage.deleteVisionBoard(visionBoardId);
//    }

    @PatchMapping("/api/visionboards/{visionBoardId}/update")
    public VisionBoard updateVisionBoard(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setBackgroundColor(visionBoard.getBackgroundColor());
        visionBoardToUpdate.setGridSpacing(visionBoard.getGridSpacing());
        visionBoardToUpdate.setGridBorderColor(visionBoard.getGridBorderColor());
        visionBoardToUpdate.setGridBorderRadius(visionBoard.getGridBorderRadius());
        visionBoardToUpdate.setGridBorderStyle(visionBoard.getGridBorderStyle());
        visionBoardToUpdate.setGridBorderThickness(visionBoard.getGridBorderThickness());
        visionBoardToUpdate.setHasGrid(visionBoard.isHasGrid());
        visionBoardToUpdate.setThemeDark(visionBoard.isThemeDark());
        visionBoardToUpdate.setGridTemplateName(visionBoard.getGridTemplateName());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);

        return visionBoardToUpdate;
    }


}
