package zaichenko.edu.spring.dao.chair.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaichenko.edu.spring.dao.chair.interfaces.IDaoChair;
import zaichenko.edu.spring.datastorage.DataFake;
import zaichenko.edu.spring.model.Chair;
import java.util.List;

@Repository
public class DaoChairImpl implements IDaoChair {

    @Autowired
    DataFake dataFake;

    @Override
    public Chair create(Chair chair) {
        return null;
    }

    @Override
    public Chair get(String id) {
        return null;
    }

    @Override
    public Chair delete(String id) {
        return null;
    }

    @Override
    public Chair update(Chair chair) {
        return null;
    }

    @Override
    public List<Chair> getAll() {
        return dataFake.getChairs();
    }
}