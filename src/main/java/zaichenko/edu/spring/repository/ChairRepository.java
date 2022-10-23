package zaichenko.edu.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zaichenko.edu.spring.model.Chair;

@Repository
public interface ChairRepository extends MongoRepository<Chair, String> {

}