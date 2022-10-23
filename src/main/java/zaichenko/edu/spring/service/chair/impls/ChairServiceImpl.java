package zaichenko.edu.spring.service.chair.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.spring.dao.chair.impls.DaoChairImpl;
import zaichenko.edu.spring.service.chair.interfaces.IChairService;
import zaichenko.edu.spring.model.Chair;
import zaichenko.edu.spring.repository.ChairRepository;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChairServiceImpl implements IChairService {

    @Autowired
    DaoChairImpl daoChair;

    @Autowired
    ChairRepository chairRepository;

    @Override
    public Chair create(Chair chair) {
        chair.setCreatedAt(LocalDateTime.now());
        chair.setUpdatedAt(LocalDateTime.now());
        return chairRepository.save(chair);
    }

    @Override
    public Chair get(String id) {
        return chairRepository.findById(id).orElse(null);
    }

    @Override
    public Chair delete(String id) {
        Chair chair = this.get(id);
        chairRepository.deleteById(chair.getId());
        return chair;
    }

    @Override
    public Chair update(Chair chair) {
        chair.setUpdatedAt(LocalDateTime.now());
        return chairRepository.save(chair);
    }

    @Override
    public List<Chair> getAll() {
        return chairRepository.findAll();
    }
}