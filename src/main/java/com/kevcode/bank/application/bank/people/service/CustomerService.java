package com.kevcode.bank.application.bank.people.service;

import com.kevcode.bank.application.bank.people.base.http.dto.AddressDto;
import com.kevcode.bank.application.bank.people.base.http.dto.ContactDto;
import com.kevcode.bank.application.bank.people.http.dto.CustomerDto;
import com.kevcode.bank.application.bank.people.http.request.CustomerRequest;
import com.kevcode.bank.application.shared.Response;
import com.kevcode.bank.domain.bank.people.entities.Customer;
import com.kevcode.bank.infrastructure.bank.people.repository.ICustomerRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private final ModelMapper _modelMapper;
    private final ICustomerRepository _customerRepository;

    @Autowired
    public CustomerService(ICustomerRepository customerRepository,
                           ModelMapper modelMapper
    ) {
        _customerRepository = customerRepository;
        _modelMapper = modelMapper;
    }

    @Override
    public Response<CustomerDto> save(CustomerRequest customerRequest) {
        try {
            Customer customer = _modelMapper.map(customerRequest, Customer.class);
            customer = _customerRepository.save(customer);
            CustomerDto customerDto = _modelMapper.map(customer, CustomerDto.class);
            return new Response<>(customerDto, HttpStatus.OK, "Cliente guardado");
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ocurrió un error", e);
        }
    }

    @Override
    public Response<List<CustomerDto>> findAll() {
        try {
            List<Customer> customers = _customerRepository.findAll();
            List<CustomerDto> customerDtos = _modelMapper.map(customers, new TypeToken<>() {
            }.getType());
            return new Response<>(customerDtos, HttpStatus.OK, "Clientes recuperados");
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error", e);
        }
    }

    @Override
    public Response<CustomerDto> findByAccountId(Long accountId) {
        return null;
    }

    private void setMatchingStrategyStrictModelMapper() {
        _modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }
}
