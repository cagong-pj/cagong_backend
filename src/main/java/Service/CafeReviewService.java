package Service;


import Repository.CafeRepository;
import Repository.CafeReviewRepository;
import domain.Cafe;
import domain.CafeReview;
import domain.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired)) // ?


public class CafeReviewService {

    @NonNull
    private CafeRepository cafeRepository;
    @NonNull
    private CafeReviewRepository cafeReviewRepository;
    @NonNull
    private User user;

    public CafeReview createComment(@NotNull CafeReview comment, User user, long cafe_ID) {

        Optional<Cafe> cafe = cafeRepository.findById(cafe_ID);
        // Optional = 레포에서 원하는값이 있으면 받고 없으면 예외처리

        cafe.ifPresent(re->{
            comment.changePost(re);
        });
        comment.changeAuthor(user);
        return this.cafeReviewRepository.save(comment);
    }

    //리스트
    @Transactional(readOnly = true)
    public List<CafeReview> listComment(long cafe_ID) {
        return this.cafeReviewRepository.getCommentsOfPost(cafe_ID);
    }

    //삭제
    @Transactional
    public List<CafeReview> deleteComment(long commentsNo, long cafe_ID) {
        this.cafeReviewRepository.deleteById(commentsNo);
        return this.cafeReviewRepository.getCommentsOfPost(cafe_ID);
    }




}
