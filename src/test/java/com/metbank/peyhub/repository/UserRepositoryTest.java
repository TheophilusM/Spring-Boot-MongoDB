package com.metbank.peyhub.repository;

import com.metbank.peyhub.document.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class UserRepositoryTest {
    UserRepository userRepository;
    MongoTemplate mongoTemplate;

    @Test
    public void registerUser() throws IllegalAccessException {
        Email email = Email
                .builder()
                .emailId("theotakumug@gmail.com")
                .verified(false)
                .build();

        Phone phone = Phone
                .builder()
                .phoneNumber("+237737155613")
                .verified(false)
                .build();

        Address address = Address
                .builder()
                .zipCode("00263")
                .country("Zimbabwe")
                .province("Mashonaland West")
                .city("Harare")
                .street("Brentwood")
                .postCode("15")
                .build();

        User user = User
                .builder()
                .firstName("Theophilus")
                .lastName("Muganhu")
                .email(email)
                .phone(phone)
                .gender(Gender.Male)
                .address(address)
                .createdAt((new Date()).getTime())
                .lastModified((new Date()).getTime())
                .status(Status.active)
                .favourites(List.of("Food", "Gadgets"))
                .password("myCompl3x123")
                .build();

        // check if email exists using mongo repository custom method
        getUserByEmail(email);

        Query query = new Query();

        // check if email exists using mongo template
        query.addCriteria(Criteria.where("email").is(email.getEmailId()));
        List<User> users = mongoTemplate.find(query, User.class);

        // throw user email exists error
        if (users.size() > 1) {
            throw new IllegalAccessException("User with email already exists: " + email.getEmailId());
        }

        // save user
        if (users.isEmpty()) {
            userRepository.save(user);
            System.out.println("User registration successful");
        } else {
            System.out.println("User email already exists");
        }
    }

    // check if email exists using mongo repository custom method
    public void getUserByEmail(Email email) throws IllegalAccessException {
        userRepository
                .findUserByEmail_EmailId(email.getEmailId())
                .ifPresentOrElse(
                    user -> {
                        System.out.println(user);
                    },
                    () -> {
                        System.out.println("Not found");
                    }
        );
    }
}