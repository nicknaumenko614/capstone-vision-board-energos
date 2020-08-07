package co.visionaries.energos;

import co.visionaries.energos.entities.*;

import co.visionaries.energos.repositories.VisionBoardRepository;
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

    public void run(String... args) throws Exception {

        visionBoardRepo.save(visionBoardFactory.createDefaultBoard());

    }

}
