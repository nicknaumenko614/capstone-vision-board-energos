package co.visionaries.energos.repositories;

import co.visionaries.energos.entities.VisionBoard;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VisionBoardRepository extends CrudRepository<VisionBoard, Long> {
    Optional<VisionBoard> findByVisionBoardName(String boardName);
}