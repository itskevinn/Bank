package com.kevcode.bank.domain.people.entities;

import com.kevcode.bank.domain.shared.EntityBase;

public abstract class Person extends EntityBase {
    String name;
    Address address;
    Contact contact;
}
