package com.kevcode.bank.domain.bank.people.entities;

import com.kevcode.bank.domain.shared.EntityBase;


import javax.persistence.*;

@MappedSuperclass
public abstract class Person extends EntityBase {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
