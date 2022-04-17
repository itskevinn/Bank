package com.kevcode.bank.domain.bank.people.repository;

import com.kevcode.bank.domain.bank.people.entities.Person;

public interface ICustomerDomainRepository {
    Person getPersonByAccountId(Long accountId);
}
