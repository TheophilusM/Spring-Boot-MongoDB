package com.metbank.peyhub.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Address {
    private String zipCode;
    private String country;
    private String province;
    private String city;
    private String street;
    private String postCode;
}
