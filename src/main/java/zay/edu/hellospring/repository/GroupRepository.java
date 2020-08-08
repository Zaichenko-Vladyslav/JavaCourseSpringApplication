package zay.edu.hellospring.repository;/*
 @author Vladyslav Zaichenko
 @since 07 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import zay.edu.hellospring.model.Group;

public interface GroupRepository extends MongoRepository<Group, String> {
}
