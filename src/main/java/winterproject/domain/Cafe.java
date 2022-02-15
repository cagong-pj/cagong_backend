package winterproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
}
