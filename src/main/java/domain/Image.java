package domain;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="imageurl",nullable = false, length = 100)
    private String imageurl;
    @ManyToOne
    @JoinColumn(name="ReviewId")
    private CafeReview cafeReview;
    @ManyToOne
    @JoinColumn(name="CafeId")
    private Cafe cafe;
}
