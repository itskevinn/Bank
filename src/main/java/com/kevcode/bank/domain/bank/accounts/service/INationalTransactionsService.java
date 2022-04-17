package com.kevcode.bank.domain.bank.accounts.service;

import com.kevcode.bank.domain.bank.accounts.exceptions.InvalidValueException;
import com.kevcode.bank.domain.bank.accounts.exceptions.InsufficientFundsException;

public interface INationalTransactionsService {
    Long withdraw(Long value, Long accountId) throws InsufficientFundsException, InvalidValueException;

    Long deposit(Long value, Long accountId) throws InvalidValueException;

    Long getBalance(Long accountId) throws InvalidValueException;
}