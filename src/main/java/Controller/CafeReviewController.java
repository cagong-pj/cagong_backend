package Controller;

import Repository.UserRepository;
import Service.CafeReviewService;
import domain.Cafe;
import domain.CafeReview;
import domain.User;
import dto.CafeReviewRequestDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CafeReviewController {

    @NonNull
    private final UserRepository UR;
    @NonNull
    private final CafeReviewService cafeReviewService;

    // 사용자 정보 얻을때 principal or authentication 토큰 사용
    @PostMapping("/add/{cafe_ID}")
    public ResponseEntity<List<CafeReview>> addComment(@PathVariable Long cafe_ID,@RequestBody CafeReviewRequestDto cafereviewrequestdto, Principal principal){
        cafereviewrequestdto.setCafeNo(cafe_ID);
        cafereviewrequestdto.setCreated_by(principal.getName());
        Optional<User> find_ID=UR.findByUserId(principal.getName());

        find_ID.ifPresent(findUser_ID->{
            cafereviewrequestdto.setUser_id(findUser_ID.getUser_id());
            CafeReview Cr = this.cafeReviewService.createComment(내용 mapper 어캐할까,findUser_ID,cafereviewrequestdto.getCafe_ID())
        });
        return new ResponseEntity<>(this.cafeReviewService.listComment(cafe_ID), HttpStatus.CREATED);

        //api 응답 ->entitny or body 사용
    }

    // READ
    @GetMapping("/list/{cafe_ID}")
    public ResponseEntity<List<CafeReview>> List_Comment(@PathVariable Long cafe_ID){
        return new ResponseEntity<>(this.cafeReviewService.listComment(cafe_ID),HttpStatus.CREATED);
    }

    //DELETE
    @DeleteMapping("/delete/{cafe_ID}/{commentsNo}")
    public ResponseEntity<List<CafeReview>> Delete_Comment(@PathVariable Long cafe_ID,@PathVariable Long commentsNo) {
        return new ResponseEntity<>(this.cafeReviewService.deleteComment(commentsNo,cafe_ID),HttpStatus.CREATED);
    }
}
