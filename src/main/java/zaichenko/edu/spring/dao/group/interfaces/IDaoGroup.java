package zaichenko.edu.spring.dao.group.interfaces;

import zaichenko.edu.spring.model.Group;
import java.util.List;

public interface IDaoGroup {

    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();
}