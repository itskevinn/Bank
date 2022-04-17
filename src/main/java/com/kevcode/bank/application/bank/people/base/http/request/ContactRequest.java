package com.kevcode.bank.application.bank.people.base.http.request;

import lombok.Data;

@Data
public class ContactRequest {
    private String phoneNumber;
    private String emailAddress;
}
