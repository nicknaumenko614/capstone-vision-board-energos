package co.visionaries.energos.repositories;

import co.visionaries.energos.entities.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ImageRepository extends CrudRepository<Image, Long> {
    Optional<Image> findByHtmlId(String imageHtmlId);
}
