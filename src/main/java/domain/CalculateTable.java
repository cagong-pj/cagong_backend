package domain;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalculateTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="hash1",nullable = false, length = 100)
    private Integer hash1;
    @Column(name="hash2",nullable = false, length = 100)
    private Integer hash2;
    @Column(name="hash3",nullable = false, length = 100)
    private Integer hash3;
    @Column(name="hash4",nullable = false, length = 100)
    private Integer hash4;
    @Column(name="hash5",nullable = false, length = 100)
    private Integer hash5;
    @Column(name="hash6",nullable = false, length = 100)
    private Integer hash6;
    @ManyToOne
    @JoinColumn(name="CafeId")
    private Cafe cafe;
}
