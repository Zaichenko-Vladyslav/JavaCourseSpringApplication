package zaichenko.edu.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zaichenko.edu.spring.model.Group;

public interface GroupRepository extends MongoRepository<Group, String> {

}