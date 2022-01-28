package winterproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import winterproject.domain.Cafe;

import java.util.List;
import java.util.Optional;



public interface CafeRepository extends JpaRepository<Cafe,Long> {

    List<Cafe> findAllById(Long id);
    List<Cafe> findAll();
    List<Cafe> findAllByLocation(String location);

}
