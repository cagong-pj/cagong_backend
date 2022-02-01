package winterproject.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cafe")
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cafeId;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 100)
    private String address;
    @Column(nullable = false, length = 100)
    private String location;
    @Column(nullable = false, length = 100)
    private String opentime;
    @Column(nullable = false, length = 100)
    private String closetime;
    @Column(nullable = false, length = 100)
    private String phoneNum;


}
