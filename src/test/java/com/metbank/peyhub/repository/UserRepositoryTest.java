package com.metbank.peyhub.repository;

import com.metbank.peyhub.document.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class UserRepositoryTest {
    UserRepository userRepository;

    @Test
    public void registerUser() {
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
                .createdAt(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .status(Status.active)
                .favourites(List.of("Food", "Gadgets"))
                .build();

        userRepository.save(user);

        System.out.println("User registration successful");
    }
}