package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Background;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.storage.BackgroundStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BackgroundController {
    BackgroundStorage backgroundStorage;
    VisionBoardStorage visionBoardStorage;


public BackgroundController(BackgroundStorage backgroundStorage, VisionBoardStorage visionBoardStorage) {
    this.backgroundStorage = backgroundStorage;
    this.visionBoardStorage = visionBoardStorage;
}

@GetMapping("/api/backgrounds")
public Collection<Background> getAllBackgrounds() { return backgroundStorage.getAllBackgrounds();}


@DeleteMapping("/api/backgrounds/{backgroundId}/delete")
public void deleteBackground(@PathVariable long backgroundId) { backgroundStorage.deleteBackground(backgroundId);}

@PostMapping("api/backgrounds/{visionBoardId}/add")
public void addBackgroundToVisionBoard(@PathVariable long visionBoardId, @RequestBody Background background) {
    VisionBoard visionBoard = visionBoardStorage.retrieveVisionBoardbyId(visionBoardId);
    background.setVisionBoard(visionBoard);
    backgroundStorage.saveBackground(background);
}


}
