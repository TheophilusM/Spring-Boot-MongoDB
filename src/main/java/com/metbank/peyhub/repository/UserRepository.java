package com.metbank.peyhub.repository;

import com.metbank.peyhub.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
