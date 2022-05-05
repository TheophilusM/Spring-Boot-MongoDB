package com.metbank.peyhub.repository;

import com.metbank.peyhub.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByEmail_EmailId(String emailId);
    // Can use mongo raw queries
}
