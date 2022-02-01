package winterproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import winterproject.domain.Cafe;
import winterproject.repository.JpaCafeRepository;
import winterproject.service.GetCafeList;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class HomeController {

    private final JpaCafeRepository jpaCafeRepository;
    private final GetCafeList getCafeList;

    @GetMapping("cafe")
    public List<Cafe> findAllCafe() {
        return jpaCafeRepository.findAll();
    }

    @PostMapping("cafe")
    public Cafe saveCafe() {
        final Cafe cafe = Cafe.builder()
                .name("cafe1")
                .address("mapogu")
                .location("sangsudong")
                .opentime("12:00")
                .closetime("19:00")
                .phoneNum("0109131231")
                .build();
        return jpaCafeRepository.save(cafe);
    }

    //location 쿼리로 get요청 되는지 test용
    @GetMapping("cafe/{location}")
    public List<Cafe> findByLocation(@PathVariable String location) {
//        System.out.println(location);
        return getCafeList.getCafeByLocation(location);
    }
}
