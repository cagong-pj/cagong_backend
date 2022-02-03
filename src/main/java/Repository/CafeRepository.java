package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import domain.Cafe;

public interface CafeRepository extends JpaRepository<Cafe,Long> {
}
