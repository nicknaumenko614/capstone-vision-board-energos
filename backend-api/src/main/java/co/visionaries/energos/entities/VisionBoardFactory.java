package co.visionaries.energos.entities;

import co.visionaries.energos.repositories.BackgroundRepository;
import co.visionaries.energos.repositories.ImageRepository;
import co.visionaries.energos.repositories.QuoteRepository;
import co.visionaries.energos.repositories.TextRepository;
import co.visionaries.energos.storage.ImageStorage;
import org.springframework.stereotype.Component;

@Component
public class VisionBoardFactory {
    private ImageStorage imageStorage;
    private ImageRepository imageRepo;
    private TextRepository textRepo;
    private QuoteRepository quoteRepo;
    private BackgroundRepository backgroundRepo;



    public VisionBoardFactory(ImageStorage imageStorage, ImageRepository imageRepo, TextRepository textRepo, QuoteRepository quoteRepo, BackgroundRepository backgroundRepo) {
        this.imageStorage = imageStorage;
        this.imageRepo = imageRepo;
        this.textRepo = textRepo;
        this.quoteRepo = quoteRepo;
        this.backgroundRepo = backgroundRepo;
    }

    public VisionBoard createDefaultBoard() {
        VisionBoard visionBoard = new VisionBoard("Default", false, true, "10px", "0%",
                "2px", "#393E41", "solid", "", "#F9FCFF", "0");

        Image image1 = new Image ("img1", false, "/images/gallery-images/airplane.jpg",
                false, "0px", 0, false, "images-container", visionBoard);
        Image image2 = new Image ("img2", false, "/images/gallery-images/baby-berner1.jpg",
                false, "0px", 0, false, "images-container", visionBoard);
//        Image image3 = new Image ("img3", false, "/images/gallery-images/baby-berner2.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image4 = new Image ("img4", false, "/images/gallery-images/dollars.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image5 = new Image ("img5", false, "/images/gallery-images/family-sunset.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image6 = new Image ("img6", false, "/images/gallery-images/grad-cap.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image7 = new Image ("img7", false, "/images/gallery-images/health-is-wealth.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image8 = new Image ("img8", false, "/images/gallery-images/health.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image9 = new Image ("img9", false, "/images/gallery-images/house-pool.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image10 = new Image ("img10", false, "/images/gallery-images/luggage-beach.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image11 = new Image ("img11", false, "/images/gallery-images/mercedes.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image12 = new Image ("img12", false, "/images/gallery-images/paper-love.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image13 = new Image ("img13", false, "/images/gallery-images/pom.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image14 = new Image ("img14", false, "/images/gallery-images/running.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image15 = new Image ("img15", false, "/images/gallery-images/runningII.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image16 = new Image ("img16", false, "/images/gallery-images/success-focus-life-achievements.jpeg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image17 = new Image ("img17", false, "/images/gallery-images/wedding.jpeg",
//                false, "0px", 0, false, "images-container", visionBoard);
//        Image image18 = new Image ("img18", false, "/images/gallery-images/woman-and-man-hugging-on-street.jpg",
//                false, "0px", 0, false, "images-container", visionBoard);

        imageStorage.saveImage(image1);
        imageStorage.saveImage(image2);
//        imageRepo.save(image3);
//        imageRepo.save(image4);
//        imageRepo.save(image5);
//        imageRepo.save(image6);
//        imageRepo.save(image7);
//        imageRepo.save(image8);
//        imageRepo.save(image9);
//        imageRepo.save(image10);
//        imageRepo.save(image11);
//        imageRepo.save(image12);
//        imageRepo.save(image13);
//        imageRepo.save(image14);
//        imageRepo.save(image15);
//        imageRepo.save(image16);
//        imageRepo.save(image17);
//        imageRepo.save(image18);

        Quote quote1 = new Quote("quote-img1", false, "/images/quotes/quote1.png", false, "0px",
                0, false,"quotes-container", visionBoard);
        Quote quote2 = new Quote("quote-img2", false, "/images/quotes/quote2.jpg", false, "0px",
                0, false,"quotes-container", visionBoard);
//        Quote quote3 = new Quote("quote-img3", false, "/images/quotes/quote3.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote4 = new Quote("quote-img4", false, "/images/quotes/quote4.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote5 = new Quote("quote-img5", false, "/images/quotes/quote5.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote6 = new Quote("quote-img6", false, "/images/quotes/quote6.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote7 = new Quote("quote-img7", false, "/images/quotes/quote7.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote8 = new Quote("quote-img8", false, "/images/quotes/quote8.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote9 = new Quote("quote-img9", false, "/images/quotes/quote9.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote10 = new Quote("quote-img10", false, "/images/quotes/quote10.png", false, "0px",
//                0, false,"quotes-container", visionBoard);
//        Quote quote11 = new Quote("quote-img11", false, "/images/quotes/quote11.png", false, "0px",
//                0, false,"quotes-container", visionBoard);

        quoteRepo.save(quote1);
        quoteRepo.save(quote2);
//        quoteRepo.save(quote3);
//        quoteRepo.save(quote4);
//        quoteRepo.save(quote5);
//        quoteRepo.save(quote6);
//        quoteRepo.save(quote7);
//        quoteRepo.save(quote8);
//        quoteRepo.save(quote9);
//        quoteRepo.save(quote10);
//        quoteRepo.save(quote11);

        Text text1 = new Text("text1", "Dream Big!", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text2 = new Text("text2", "Be your own inspiration", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text3 = new Text("text3", "CONFIDENT", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text4 = new Text("text4", "Success is based on your drive!", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text5 = new Text("text5", "Success doesn't come to you, you go to it", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text6 = new Text("text6", "Vision Board 2020", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text7 = new Text("text7", "NAME", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);
//        Text text8 = new Text("text8", "#GOALS", "12pt", false, "#393E41", "#393E41",
//                "Amaranth", false, false, false, "text-container", visionBoard);

        textRepo.save(text1);
        textRepo.save(text2);
//        textRepo.save(text3);
//        textRepo.save(text4);
//        textRepo.save(text5);
//        textRepo.save(text6);
//        textRepo.save(text7);
//        textRepo.save(text8);



        return visionBoard;
    }


}


