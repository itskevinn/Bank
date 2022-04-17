package com.kevcode.bank.domain.bank.accounts.repository;

public interface INationalTransactionsRepository {
    Long withdraw(Long value, Long accountId);

    Long deposit(Long value, Long accountId);

    Long getBalance(Long accountId);
}
