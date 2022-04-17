package com.kevcode.bank.api.controllers.bank.people;

import com.kevcode.bank.application.bank.people.http.dto.CustomerDto;
import com.kevcode.bank.application.bank.people.http.request.CustomerRequest;
import com.kevcode.bank.application.bank.people.service.ICustomerService;
import com.kevcode.bank.application.shared.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
    private final ICustomerService _customerService;

    @Autowired
    public CustomerController(ICustomerService customerService) {
        _customerService = customerService;
    }

    @PostMapping("/Create")
    public Response<CustomerDto> save(@RequestBody CustomerRequest customerRequest) {
        return _customerService.save(customerRequest);
    }

    @GetMapping("/GetAll")
    public Response<List<CustomerDto>> findAll() {
        return _customerService.findAll();
    }
}
