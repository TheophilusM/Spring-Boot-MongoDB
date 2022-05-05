package com.metbank.peyhub.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@Builder
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private Email email;
    private Phone phone;
    private Gender gender;
    private Address address;
    private long createdAt;
    private long lastModified;
    private Status status;
    private List<String> favourites;
    private String password;

    public User(String firstName,
                String lastName,
                Email email,
                Phone phone,
                Gender gender,
                Address address,
                long createdAt,
                long lastModified,
                Status status,
                List<String> favourites,
                String password) {
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
        this.password = password;
    }
}
