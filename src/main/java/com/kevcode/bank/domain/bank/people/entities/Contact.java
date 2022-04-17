package com.kevcode.bank.domain.bank.people.entities;


import com.kevcode.bank.domain.shared.EntityBase;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

    private String phoneNumber;
    private String emailAddress;

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

}
