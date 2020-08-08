package zay.edu.hellospring.service.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zay.edu.hellospring.dao.group.impls.DaoGroupImpl;
import zay.edu.hellospring.model.Group;
import zay.edu.hellospring.service.group.interfaces.IGroupService;

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
