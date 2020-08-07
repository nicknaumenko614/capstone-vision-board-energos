package co.visionaries.energos.controllers;

import co.visionaries.energos.entities.Background;
import co.visionaries.energos.storage.BackgroundStorage;
import co.visionaries.energos.storage.VisionBoardStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
