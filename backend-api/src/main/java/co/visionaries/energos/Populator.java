package co.visionaries.energos;

import co.visionaries.energos.entities.*;


import co.visionaries.energos.repositories.VisionBoardRepository;

import co.visionaries.energos.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private VisionBoardRepository visionBoardRepo;

    @Autowired
    private VisionBoardFactory visionBoardFactory;

    @Autowired
    private BackgroundRepository backgroundRepo;




    public void run(String... args) throws Exception {

        visionBoardRepo.save(visionBoardFactory.createDefaultBoard());

        Background background1 = new Background("background1", "./images/backgrounds/background1.jpg", visionBoard);
        Background background2 = new Background("background2", "./images/backgrounds/background2.jpg", visionBoard);
        Background background3 = new Background("background3", "./images/backgrounds/background3.jpeg", visionBoard);
        Background background4 = new Background("background4", "./images/backgrounds/background4.jpg", visionBoard);
        Background background5 = new Background("background5", "./images/backgrounds/background5.jpg", visionBoard);
        Background background6 = new Background("background6", "./images/backgrounds/background6.jpg", visionBoard);
        Background background7 = new Background("background7", "./images/backgrounds/background7.jpg", visionBoard);

        backgroundRepo.save(background1);
        backgroundRepo.save(background2);
        backgroundRepo.save(background3);
        backgroundRepo.save(background4);
        backgroundRepo.save(background5);
        backgroundRepo.save(background6);
        backgroundRepo.save(background7);


    }

}
