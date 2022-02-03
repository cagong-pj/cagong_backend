package dto;

import domain.Cafe;
import domain.CafeReview;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@NoArgsConstructor
public class CafeReviewRequestDto {


    @NotNull
    private String content;

    @NotNull
    private Long user_id;

    @NotNull
    private Long cafe_id;

    @NotNull
    private String created_by;

    public Long getUser_id(Long user_id){
        return user_id;
    }

    public  void setUser_id(@NotNull Long user_id){
        this.user_id = user_id;
    }


    public void setCafeNo(Long cafe_id) {
        this.cafe_id = cafe_id;
    }

    public void setCreated_by(String name) {
        this.created_by = name;
    }

    public long getCafe_ID() {
        return cafe_id;
    }
}
