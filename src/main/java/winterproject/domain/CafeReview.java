package winterproject.domain;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CafeReview extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="content",nullable = false, length = 100)
    private String content;
    @OneToMany(mappedBy="CafeReview")
    private List<CafeReview> hashtaglists;
    @ManyToOne
    @JoinColumn(name="CafeId")
    private Cafe cafe;
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;
}