package domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.lang.reflect.Member;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@ToString(exclude = "cafe") // ?
@Table(name="CafeReview")
@EqualsAndHashCode(of="COMMNETS_NO")

public class CafeReview extends BaseTimeEntity{ // BaseTime ??

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  뜻이 뭘까 ?
    @Column(name = "COMMENTS_NO")
    private Long id;

    @NonNull
    @Column(name = "CONTENT")
    private String content;

    @NonNull
    @Column(name = "DEL_YN")
    @ColumnDefault(value = "false")
    private Boolean deleted;

    @NonNull
    @Column(name="CREATED_BY")
    private String created_by;

    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY) // 무슨 뜻?
    @JoinColumn(name="cafe_ID")
    @ToString.Exclude
    private Cafe cafe;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="user_ID")
    private User user;

/*
    @ManyToOne
    @JoinColumn(name="CafeId")
    private Cafe cafe;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;
*/


    /* 빌더사용해서 해보다가  그냥 함수로 변경해서 사용
    public CafeReview(Long id , String content , Cafe cafe, User user){
        this.id = id;
        this.conten = content;
        this.cafe = cafe;
        this.user = user;
    }  */

    public void changeAuthor(User author){
        this.user = author;
    }
    // 이건 보류
    public void changePost (Cafe cafe){
        this.cafe =cafe ;

    }
}
