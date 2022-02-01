package winterproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import winterproject.domain.Cafe;

import java.util.List;
import java.util.Optional;

public interface JpaCafeRepository extends JpaRepository<Cafe, Long>, CafeRepository {

    List<Cafe> findByLocation(String location);

}
