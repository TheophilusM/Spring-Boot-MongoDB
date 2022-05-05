package com.metbank.peyhub.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Phone {
    private String phoneNumber;
    private Boolean verified;
}
