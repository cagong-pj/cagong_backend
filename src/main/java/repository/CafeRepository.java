package repository;

import domain.Cafe;
import domain.CafeReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CafeRepository extends JpaRepository<Cafe,Long> {
    List<Cafe>getAllCafe();
}
