package com.kevcode.bank.application.bank.people.http.dto;

import com.kevcode.bank.application.bank.people.base.http.dto.AddressDto;
import com.kevcode.bank.application.bank.people.base.http.dto.ContactDto;
import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private AddressDto addressDto;
    private ContactDto contactDto;
}
