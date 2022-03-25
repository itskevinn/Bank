package com.kevcode.bank.domain.account.entities;


public abstract class Account{
    private Long balance;
    private Long personId;

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
