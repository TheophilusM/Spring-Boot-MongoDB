package com.metbank.peyhub.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Email email;
    private Phone phone;
    private Gender gender;
    private Address address;
    private ZonedDateTime createdAt;
    private long lastModified;
    private Status status;
    private List<String> favourites;
}
