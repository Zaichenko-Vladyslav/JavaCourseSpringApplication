package zaichenko.edu.spring.dao.chair.interfaces;

import zaichenko.edu.spring.model.Chair;
import java.util.List;

public interface IDaoChair {

    Chair create(Chair chair);
    Chair get(String id);
    Chair delete(String id);
    Chair update(Chair chair);
    List<Chair> getAll();
}