package co.visionaries.energos.entities;

import co.visionaries.energos.repositories.ImageRepository;

public class VisionBoardFactory {
    private ImageRepository imageRepo;

    public VisionBoardFactory(ImageRepository imageRepository) {
        this.imageRepo = imageRepository;
    }

    public VisionBoard createDefaultBoard() {
        VisionBoard visionBoard = new VisionBoard("Default", false, true, "10px", "0%", "2px", "#393E41", "solid", "", "#F9FCFF"
    }
}


