package zaichenko.edu.spring.service.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.spring.dao.group.impls.DaoGroupImpl;
import zaichenko.edu.spring.service.group.interfaces.IGroupService;
import zaichenko.edu.spring.model.Group;
import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    DaoGroupImpl daoGroup;

    @Override
    public Group create(Group group) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public Group update(Group group) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return daoGroup.getAll();
    }
}