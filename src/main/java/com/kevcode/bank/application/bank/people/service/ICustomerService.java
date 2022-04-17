package com.kevcode.bank.application.bank.people.service;

import com.kevcode.bank.application.bank.people.http.dto.CustomerDto;
import com.kevcode.bank.application.bank.people.http.request.CustomerRequest;
import com.kevcode.bank.application.shared.Response;

import java.util.List;

public interface ICustomerService {
    Response<CustomerDto> save(CustomerRequest customerRequest);

    Response<List<CustomerDto>> findAll();

    Response<CustomerDto> findByAccountId(Long accountId);
}
