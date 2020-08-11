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
//       VisionBoard newVisionBoard = visionBoardStorage.retrieveVisionBoardByName(boardName);
//       long newVisionBoardId = newVisionBoard.getId();
//       return newVisionBoardId;
    }

//    @DeleteMapping("/api/visionboards/{visionBoardId}/delete")
//    public void deleteVisionBoard(@PathVariable long visionBoardId) {
//        visionBoardStorage.deleteVisionBoard(visionBoardId);
//    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateThemeDark")
    public VisionBoard updateThemeDark(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setThemeDark(visionBoard.isThemeDark());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateBackgroundColor")
    public VisionBoard updateBackgroundColor(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setBackgroundColor(visionBoard.getBackgroundColor());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridSpacing")
    public VisionBoard updateGridSpacing(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridSpacing(visionBoard.getGridSpacing());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridBorderColor")
    public VisionBoard updateGridBorderColor(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridBorderColor(visionBoard.getGridBorderColor());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridBorderRadius")
    public VisionBoard updateGridBorderRadius(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridBorderRadius(visionBoard.getGridBorderRadius());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridBorderStyle")
    public VisionBoard updateGridBorderStyle(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridBorderStyle(visionBoard.getGridBorderStyle());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridBorderThickness")
    public VisionBoard updateGridBorderThickness(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridBorderThickness(visionBoard.getGridBorderThickness());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateBorderHasGrid")
    public VisionBoard updateBorderHasGrid(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setHasGrid(visionBoard.isHasGrid());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }


    @PatchMapping("/api/visionboards/{visionBoardId}/updateGridTemplateName")
    public VisionBoard updateGridTemplateName(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setGridTemplateName(visionBoard.getGridTemplateName());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

    @PatchMapping("/api/visionboards/{visionBoardId}/updateBackgroundImageLink")
    public VisionBoard updateBackgroundImageLink(@PathVariable long visionBoardId, @RequestBody VisionBoard visionBoard) {
        VisionBoard visionBoardToUpdate = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
        visionBoardToUpdate.setBackgroundImageLink(visionBoard.getBackgroundImageLink());
        visionBoardStorage.saveVisionBoard(visionBoardToUpdate);
        return visionBoardToUpdate;
    }

}
