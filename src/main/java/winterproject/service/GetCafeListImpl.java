package winterproject.service;
import org.springframework.stereotype.Service;
import winterproject.domain.Cafe;
import winterproject.repository.JpaCafeRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GetCafeListImpl {


    private final JpaCafeRepository jpaCafeRepository;

    public GetCafeListImpl(JpaCafeRepository jpaCafeRepository) {
        this.jpaCafeRepository = jpaCafeRepository;
    }

    @Transactional
    public Optional<Cafe> getList(Long id){
        return jpaCafeRepository.findById(id);
    }

    @Transactional
    public List<Cafe> getAll() {
        return jpaCafeRepository.findAll();
    }


}
