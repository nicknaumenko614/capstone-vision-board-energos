package co.visionaries.energos.storage;

import co.visionaries.energos.entities.VisionBoard;
import co.visionaries.energos.repositories.VisionBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class VisionBoardStorage {
    private VisionBoardRepository visionBoardRepo;

    public VisionBoardStorage(VisionBoardRepository visionBoardRepo) {
        this.visionBoardRepo = visionBoardRepo;
    }

    public VisionBoard retrieveVisionBoardbyId(long visionBoardId) {
        return visionBoardRepo.findById(visionBoardId).get();
    }

    public VisionBoard saveVisionBoard(VisionBoard visionBoard) {
        return visionBoardRepo.save(visionBoard);
    }

    public void deleteVisionBoard(long visionBoardId) {
        visionBoardRepo.deleteById(visionBoardId);
    }
}
