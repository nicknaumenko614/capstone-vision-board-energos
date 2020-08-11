package co.visionaries.energos.entities;

import co.visionaries.energos.storage.*;
import org.springframework.stereotype.Component;

@Component
public class VisionBoardFactory {
    private VisionBoardStorage visionBoardStorage;
    private TextStorage textStorage;
    private QuoteStorage quoteStorage;
    private BackgroundStorage backgroundStorage;
    private ImageStorage imageStorage;

    public VisionBoardFactory(VisionBoardStorage visionBoardStorage, TextStorage textStorage,
                              QuoteStorage quoteStorage, BackgroundStorage backgroundStorage,
                              ImageStorage imageStorage) {
        this.visionBoardStorage = visionBoardStorage;
        this.textStorage = textStorage;
        this.quoteStorage = quoteStorage;
        this.backgroundStorage = backgroundStorage;
        this.imageStorage = imageStorage;
    }


    public VisionBoard createDefaultBoard(String boardName) {
        VisionBoard visionBoard = new VisionBoard(boardName, false, true, "10px", "0%",
                "2px", "#393E41", "solid", "", "#F9FCFF", 0);

        visionBoardStorage.saveVisionBoard(visionBoard);

        Image image1 = new Image("img1", false, "/images/gallery-images/airplane.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image2 = new Image("img2", false, "/images/gallery-images/baby-berner1.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image3 = new Image ("img3", false, "/images/gallery-images/baby-berner2.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image4 = new Image ("img4", false, "/images/gallery-images/dollars.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image5 = new Image ("img5", false, "/images/gallery-images/family-sunset.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image6 = new Image ("img6", false, "/images/gallery-images/grad-cap.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image7 = new Image ("img7", false, "/images/gallery-images/health-is-wealth.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image8 = new Image ("img8", false, "/images/gallery-images/health.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image9 = new Image ("img9", false, "/images/gallery-images/house-pool.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image10 = new Image ("img10", false, "/images/gallery-images/luggage-beach.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image11 = new Image ("img11", false, "/images/gallery-images/mercedes.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image12 = new Image ("img12", false, "/images/gallery-images/paper-love.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image13 = new Image ("img13", false, "/images/gallery-images/pom.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image14 = new Image ("img14", false, "/images/gallery-images/running.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image15 = new Image ("img15", false, "/images/gallery-images/runningII.jpg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image16 = new Image ("img16", false, "/images/gallery-images/success-focus-life-achievements.jpeg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image17 = new Image ("img17", false, "/images/gallery-images/wedding.jpeg",
                false, "0%", 0, false, "images-container", visionBoard);
        Image image18 = new Image ("img18", false, "/images/gallery-images/woman-and-man-hugging-on-street.jpg",
                false, "0%", 0, false, "images-container", visionBoard);

        imageStorage.saveImage(image1);
        imageStorage.saveImage(image2);
        imageStorage.saveImage(image3);
        imageStorage.saveImage(image4);
        imageStorage.saveImage(image5);
        imageStorage.saveImage(image6);
        imageStorage.saveImage(image7);
        imageStorage.saveImage(image8);
        imageStorage.saveImage(image9);
        imageStorage.saveImage(image10);
        imageStorage.saveImage(image11);
        imageStorage.saveImage(image12);
        imageStorage.saveImage(image13);
        imageStorage.saveImage(image14);
        imageStorage.saveImage(image15);
        imageStorage.saveImage(image16);
        imageStorage.saveImage(image17);
        imageStorage.saveImage(image18);

        Quote quote1 = new Quote("quote-img1", false, "/images/quotes/quote1.png", false, "0%",
                0, false, "quotes-container", visionBoard);
        Quote quote2 = new Quote("quote-img2", false, "/images/quotes/quote2.jpg", false, "0%",
                0, false, "quotes-container", visionBoard);
        Quote quote3 = new Quote("quote-img3", false, "/images/quotes/quote3.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote4 = new Quote("quote-img4", false, "/images/quotes/quote4.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote5 = new Quote("quote-img5", false, "/images/quotes/quote5.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote6 = new Quote("quote-img6", false, "/images/quotes/quote6.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote7 = new Quote("quote-img7", false, "/images/quotes/quote7.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote8 = new Quote("quote-img8", false, "/images/quotes/quote8.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote9 = new Quote("quote-img9", false, "/images/quotes/quote9.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote10 = new Quote("quote-img10", false, "/images/quotes/quote10.png", false, "0%",
                0, false,"quotes-container", visionBoard);
        Quote quote11 = new Quote("quote-img11", false, "/images/quotes/quote11.png", false, "0%",
                0, false,"quotes-container", visionBoard);

        quoteStorage.saveQuote(quote1);
        quoteStorage.saveQuote(quote2);
        quoteStorage.saveQuote(quote3);
        quoteStorage.saveQuote(quote4);
        quoteStorage.saveQuote(quote5);
        quoteStorage.saveQuote(quote6);
        quoteStorage.saveQuote(quote7);
        quoteStorage.saveQuote(quote8);
        quoteStorage.saveQuote(quote9);
        quoteStorage.saveQuote(quote10);
        quoteStorage.saveQuote(quote11);

        Text text1 = new Text("text1", "Dream Big!", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text2 = new Text("text2", "Be your own inspiration", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text3 = new Text("text3", "CONFIDENT", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text4 = new Text("text4", "Success is based on your drive!", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text5 = new Text("text5", "Success doesn't come to you, you go to it", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text6 = new Text("text6", "Vision Board 2020", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text7 = new Text("text7", "NAME", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text8 = new Text("text8", "#GOALS", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text9 = new Text("text9", "Smile", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);
        Text text10 = new Text("text10", "Go for it!", "12pt", false, "#393E41", "#393E41",
                "Amaranth", false, false, false, "text-container", visionBoard);

        textStorage.saveText(text1);
        textStorage.saveText(text2);
        textStorage.saveText(text3);
        textStorage.saveText(text4);
        textStorage.saveText(text5);
        textStorage.saveText(text6);
        textStorage.saveText(text7);
        textStorage.saveText(text8);
        textStorage.saveText(text9);
        textStorage.saveText(text10);

        Background background1 = new Background("./images/backgrounds/background1.jpg", visionBoard);
        Background background2 = new Background("./images/backgrounds/background2.jpg", visionBoard);
        Background background3 = new Background("./images/backgrounds/background3.jpeg", visionBoard);
        Background background4 = new Background("./images/backgrounds/background4.jpg", visionBoard);
        Background background5 = new Background("./images/backgrounds/background5.jpg", visionBoard);
        Background background6 = new Background("./images/backgrounds/background6.jpg", visionBoard);
        Background background7 = new Background("./images/backgrounds/background7.jpg", visionBoard);

        backgroundStorage.saveBackground(background1);
        backgroundStorage.saveBackground(background2);
        backgroundStorage.saveBackground(background3);
        backgroundStorage.saveBackground(background4);
        backgroundStorage.saveBackground(background5);
        backgroundStorage.saveBackground(background6);
        backgroundStorage.saveBackground(background7);
        
        return visionBoard;
    }


}


