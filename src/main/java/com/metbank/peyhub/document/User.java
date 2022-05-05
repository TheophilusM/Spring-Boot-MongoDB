package com.metbank.peyhub.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
@Builder
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Email email;
    private Phone phone;
    private Gender gender;
    private Address address;
    private LocalDateTime createdAt;
    private LocalDateTime lastModified;
    private Status status;
    private List<String> favourites;

    public User(String firstName,
                String lastName,
                Email email,
                Phone phone,
                Gender gender,
                Address address,
                LocalDateTime createdAt,
                LocalDateTime lastModified,
                Status status,
                List<String> favourites) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.createdAt = createdAt;
        this.lastModified = lastModified;
        this.status = status;
        this.favourites = favourites;
    }
}
