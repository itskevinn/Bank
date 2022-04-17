package com.kevcode.bank.domain.bank.people.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Customer extends Person {
    @Embedded
    Address address;
    @Embedded
    Contact contact;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
