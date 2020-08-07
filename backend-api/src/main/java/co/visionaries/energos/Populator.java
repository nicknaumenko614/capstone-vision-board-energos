package co.visionaries.energos;

import co.visionaries.energos.entities.*;


import co.visionaries.energos.repositories.VisionBoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private VisionBoardRepository visionBoardRepo;

    @Autowired
    private VisionBoardFactory visionBoardFactory;


    public void run(String... args) throws Exception {

        VisionBoard defaultBoard1 = visionBoardFactory.createDefaultBoard("defaultBoard1");
        visionBoardRepo.save(defaultBoard1);

        VisionBoard john = visionBoardFactory.createDefaultBoard("John");
        visionBoardRepo.save(john);

        VisionBoard kendyl = visionBoardFactory.createDefaultBoard("Kendyl");
        visionBoardRepo.save(kendyl);



    }

}
