package co.visionaries.energos.storage;

import co.visionaries.energos.entities.Background;
import co.visionaries.energos.repositories.BackgroundRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BackgroundStorage {

    private BackgroundRepository backgroundRepo;

    public BackgroundStorage(BackgroundRepository backgroundRepo) {
        this.backgroundRepo = backgroundRepo;
    }

    public Collection<Background> getAllBackgrounds (){
        return (Collection<Background>)backgroundRepo.findAll();
    }

    public Background retrieveBackgroundById (long backgroundId) {
        return backgroundRepo.findById(backgroundId).get();
    }

    public Background saveBackground (Background background) {
        return backgroundRepo.save(background);
    }

    public void deleteBackground (long backgroundId) {
        backgroundRepo.deleteById(backgroundId);
    }
}
