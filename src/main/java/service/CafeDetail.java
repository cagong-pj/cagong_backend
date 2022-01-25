package service;

import domain.Cafe;
import domain.CafeReview;
import domain.Image;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.CafeRepository;
import repository.CafeReviewRepository;
import repository.ImageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class CafeDetail {

    private CafeReviewRepository cafeReviewRepository;
    private CafeRepository cafeRepository;
    @Transactional
    public Long getCafeId(Cafe cafe){
        return cafe.getId();
    }
    @Transactional
    public String getCafePhoneNum(Cafe cafe){
        return cafe.getPhoneNum();
    }
    @Transactional
    public String getCafeOpenTime(Cafe cafe){
        return cafe.getOpentime();
    }
    @Transactional
    public List<Cafe>getAll(){
        return cafeRepository.findAll();
    }
    @Transactional
    public
}
