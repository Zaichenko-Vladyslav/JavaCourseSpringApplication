package zay.edu.hellospring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zay.edu.hellospring.model.Cafedra;
import zay.edu.hellospring.model.Group;
import zay.edu.hellospring.repository.CafedraRepository;
import zay.edu.hellospring.repository.GroupRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository

public class DataFake {
    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;

    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ","Ivanov","Engeneering"),
            new Cafedra("YTH","Injfn","Engeneering"),
            new Cafedra("FJf","Fbnjdbv","Engeneering")
    ));

    @PostConstruct
    private void init(){
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);

    }

    private List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("1","543","ChNU",cafedras.get(0)),
            new Group("2","KN-42","UzhNU",cafedras.get(1)),
            new Group("3","6.04.51.15.01","khNEU",cafedras.get(2))
    ));

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Cafedra> getCafedras(){
        return cafedras;
    }

    public void setCafedras(List<Cafedra> cafedras){
        this.cafedras = cafedras;
    }

}
