package zay.edu.hellospring.dao.group.interfaces;

import zay.edu.hellospring.model.Cafedra;
import zay.edu.hellospring.model.Group;

import java.util.List;

public interface IDaoGroup {
    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();
}
