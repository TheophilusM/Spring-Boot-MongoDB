package com.metbank.peyhub.entity;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class User {
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
