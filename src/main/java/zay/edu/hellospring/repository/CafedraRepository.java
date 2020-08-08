package zay.edu.hellospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zay.edu.hellospring.model.Cafedra;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra,String> {
}

