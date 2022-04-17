package com.kevcode.bank.infrastructure.bank.people.repository;

import com.kevcode.bank.domain.bank.people.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
