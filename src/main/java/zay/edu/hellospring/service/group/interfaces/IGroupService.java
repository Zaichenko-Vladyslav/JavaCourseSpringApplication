package zay.edu.hellospring.service.group.interfaces;

import zay.edu.hellospring.model.Group;

import java.util.List;

public interface IGroupService {
        Group create(Group group);
        Group get(String id);
        Group delete(String id);
        Group update(Group group);
        List<Group> getAll();

}
