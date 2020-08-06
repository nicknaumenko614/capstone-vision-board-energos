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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        Image image2 = new Image ("img2", false, "/images/gallery-images/baby-berner1.jpg",
                false, "0px", 0, false, "images-container");
        Image image3 = new Image ("img3", false, "/images/gallery-images/baby-berner2.jpg",
                false, "0px", 0, false, "images-container");
        Image image4 = new Image ("img4", false, "/images/gallery-images/dollars.jpg",
                false, "0px", 0, false, "images-container");
        Image image5 = new Image ("img5", false, "/images/gallery-images/family-sunset.jpg",
                false, "0px", 0, false, "images-container");
        Image image6 = new Image ("img6", false, "/images/gallery-images/grad-cap.jpg",
                false, "0px", 0, false, "images-container");
        Image image7 = new Image ("img7", false, "/images/gallery-images/health-is-wealth.jpg",
                false, "0px", 0, false, "images-container");
        Image image8 = new Image ("img8", false, "/images/gallery-images/health.jpg",
                false, "0px", 0, false, "images-container");
        Image image9 = new Image ("img9", false, "/images/gallery-images/house-pool.jpg",
                false, "0px", 0, false, "images-container");
        Image image10 = new Image ("img10", false, "/images/gallery-images/luggage-beach.jpg",
                false, "0px", 0, false, "images-container");
        Image image11 = new Image ("img11", false, "/images/gallery-images/mercedes.jpg",
                false, "0px", 0, false, "images-container");
        Image image12 = new Image ("img12", false, "/images/gallery-images/paper-love.jpg",
                false, "0px", 0, false, "images-container");
        Image image13 = new Image ("img13", false, "/images/gallery-images/pom.jpg",
                false, "0px", 0, false, "images-container");
        Image image14 = new Image ("img14", false, "/images/gallery-images/running.jpg",
                false, "0px", 0, false, "images-container");
        Image image15 = new Image ("img15", false, "/images/gallery-images/runningII.jpg",
                false, "0px", 0, false, "images-container");
        Image image16 = new Image ("img16", false, "/images/gallery-images/success-focus-life-achievements.jpeg",
                false, "0px", 0, false, "images-container");
        Image image17 = new Image ("img17", false, "/images/gallery-images/wedding.jpeg",
                false, "0px", 0, false, "images-container");
        Image image18 = new Image ("img18", false, "/images/gallery-images/woman-and-man-hugging-on-street.jpg",
                false, "0px", 0, false, "images-container");

        imageRepo.save(image1);
        imageRepo.save(image2);
        imageRepo.save(image3);
        imageRepo.save(image4);
        imageRepo.save(image5);
        imageRepo.save(image6);
        imageRepo.save(image7);
        imageRepo.save(image8);
        imageRepo.save(image9);
        imageRepo.save(image10);
        imageRepo.save(image11);
        imageRepo.save(image12);
        imageRepo.save(image13);
        imageRepo.save(image14);
        imageRepo.save(image15);
        imageRepo.save(image16);
        imageRepo.save(image17);
        imageRepo.save(image18);


        ArrayList<Image> presetImages = new ArrayList<>(List.of(image1, image2, image3,image4, image5, image6, image7, image8,
                image9, image10, image11, image12, image13, image14, image15, image16, image17, image18));


        VisionBoard visionBoard1 = new VisionBoard("Default", false, true, "10px",
                "0%", "2px", "#393E41", "solid", "",
                "#F9FCFF", "0", presetImages);
    }

}
