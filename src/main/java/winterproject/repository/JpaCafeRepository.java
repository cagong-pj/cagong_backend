package winterproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import winterproject.domain.Cafe;

import java.util.Optional;

public interface JpaCafeRepository extends JpaRepository<Cafe, Long> {

    Optional<Cafe> findById(Long id);

}
