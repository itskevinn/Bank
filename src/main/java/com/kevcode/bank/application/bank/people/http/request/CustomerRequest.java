package com.kevcode.bank.application.bank.people.http.request;

import com.kevcode.bank.application.bank.people.base.http.request.AddressRequest;
import com.kevcode.bank.application.bank.people.base.http.request.ContactRequest;

public class CustomerRequest {
    private AddressRequest addressRequest;
    private ContactRequest contactRequest;
    private String name;
    private String houseNumber;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }

    public ContactRequest getContactRequest() {
        return contactRequest;
    }

    public void setContactRequest(ContactRequest contactRequest) {
        this.contactRequest = contactRequest;
    }

}
