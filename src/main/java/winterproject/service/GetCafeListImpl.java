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
@AllArgsConstructor
@Component
@Transactional
public class GetCafeListImpl implements GetCafeList{


    private final JpaCafeRepository jpaCafeRepository;

    @Override
    public List<Cafe> getCafeByLocation(String location) {
        return null;
    }

//    @Transactional
//    public Optional<Cafe> getList(Long id){
//        return jpaCafeRepository.findById(id);
//    }
//
//    @Transactional
//    public List<Cafe> getAll() {
//        return jpaCafeRepository.findAll();
//    }


}
