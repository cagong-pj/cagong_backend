package winterproject.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import winterproject.domain.Cafe;
import winterproject.repository.JpaCafeRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Component
@AllArgsConstructor
public class GetCafeListImpl implements GetCafeList {


    private final JpaCafeRepository jpaCafeRepository;

    @Override
    public List<Cafe> getCafeByLocation(String location) {
        return jpaCafeRepository.findByLocation(location);
    }


}
