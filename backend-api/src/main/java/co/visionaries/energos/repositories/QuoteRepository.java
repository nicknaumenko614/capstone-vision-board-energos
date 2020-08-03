package co.visionaries.energos.repositories;

import co.visionaries.energos.entities.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
}
