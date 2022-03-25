package com.kevcode.bank.domain.people.entities;

import com.kevcode.bank.domain.shared.EntityBase;

public class Contact extends EntityBase {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String emailAddress;
}
