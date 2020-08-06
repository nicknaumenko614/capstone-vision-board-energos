package co.visionaries.energos;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.ImageRepository;
import co.visionaries.energos.repositories.QuoteRepository;
import co.visionaries.energos.repositories.TextRepository;
import co.visionaries.energos.repositories.VisionBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private ImageRepository imageRepo;

    @Autowired
    private QuoteRepository quoteRepo;

    @Autowired
    private TextRepository textRepo;

    @Autowired
    private VisionBoardRepository visionBoardRepo;

    public void run(String... args) throws Exception {
        Image image1 = new Image ("img1", false, "/images/gallery-images/airplane.jpg",
                false, "0px", 0, false, "images-container");

        VisionBoard visionBoard1 = new VisionBoard("Default", false, true, "10px",
                "0%", "2px", "#393E41", "solid", "",
                "#F9FCFF", "0");
    }

}
