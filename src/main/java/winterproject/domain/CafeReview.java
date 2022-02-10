//package winterproject.domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class CafeReview {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(name="content",nullable = false, length = 100)
//    private String content;
//    @OneToMany(mappedBy="CafeReview")
//    private List<CafeReview> hashtaglists;
//    @ManyToOne
//    @JoinColumn(name="CafeId")
//    private Cafe cafe;
//    @ManyToOne
//    @JoinColumn(name="userId")
//    private User user;
//}