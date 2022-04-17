package com.kevcode.bank.domain.shared;

import javax.persistence.*;

@MappedSuperclass
public class EntityBase {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
