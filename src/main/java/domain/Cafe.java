package domain;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="cafeName",nullable = false, length = 100)
    private String name;
    @Column(name="cafeAddress",nullable = false, length = 100)
    private String address;
    @Column(name="cafeLocation",nullable = false, length = 100)
    private String location;
    @Column(name="openTime",nullable = false, length = 100)
    private String opentime;
    @Column(name="closeTime",nullable = false, length = 100)
    private String closetime;
    @Column(name="phoneNum",nullable = false, length = 100)
    private String phoneNum;
    @Column(name="imageUrl",nullable = false, length = 100)
    private String imageUrl;
}
