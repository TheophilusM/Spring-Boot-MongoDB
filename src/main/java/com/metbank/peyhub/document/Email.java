package com.metbank.peyhub.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Email {
    private String emailId;
    private Boolean verified;
}
