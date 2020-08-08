package zay.edu.hellospring.dao.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zay.edu.hellospring.dao.group.interfaces.IDaoGroup;
import zay.edu.hellospring.datastorage.DataFake;
import zay.edu.hellospring.model.Group;

import java.util.List;

@Repository
public class DaoGroupImpl implements IDaoGroup {

    @Autowired
    DataFake dataFake;

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
        return dataFake.getGroups();
    }
}
