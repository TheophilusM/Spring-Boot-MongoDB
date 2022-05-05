package com.metbank.peyhub.document;

import lombok.Data;

@Data
public class Address {
    private String zipCode;
    private String country;
    private String province;
    private String city;
    private String street;
    private String postCode;
}
