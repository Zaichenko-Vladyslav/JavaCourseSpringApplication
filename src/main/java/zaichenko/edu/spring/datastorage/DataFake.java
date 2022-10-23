package zaichenko.edu.spring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaichenko.edu.spring.model.Chair;
import zaichenko.edu.spring.model.Group;
import zaichenko.edu.spring.repository.ChairRepository;
import zaichenko.edu.spring.repository.GroupRepository;
import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    ChairRepository chairRepository;

    @Autowired
    GroupRepository groupRepository;

    private List<Chair> chairs = new LinkedList<>(Arrays.asList(
            new Chair("IPZ","Name Surname","Design"),
            new Chair("YTH","Name Surname","Programming"),
            new Chair("FJf","Name Surname","Data Science")
    ));

    @PostConstruct
    private void init(){
        chairRepository.deleteAll();
        chairRepository.saveAll(chairs);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);

    }

    private List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("1","KN-41","KNUTE", chairs.get(0)),
            new Group("2","KN-42","KNUTE", chairs.get(1)),
            new Group("3","KN-43","KNUTE", chairs.get(2))
    ));

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Chair> getChairs(){
        return chairs;
    }

    public void setChairs(List<Chair> chairs){
        this.chairs = chairs;
    }
}