package Repository;

import domain.CafeReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CafeReviewRepository extends JpaRepository<CafeReview,Long> {

    @Query("SELECT c from Comments c where c.post.id=:postNo and c.id>0 order by c.id ASC ")
    public List<CafeReview> getCommentsOfPost(@Param("postNo") Long postNo);

}
