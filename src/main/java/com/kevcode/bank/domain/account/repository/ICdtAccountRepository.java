package com.kevcode.bank.domain.account.repository;

import com.kevcode.bank.domain.account.entities.CdtAccount;

import java.util.List;

public interface ICdtAccountRepository {
    CdtAccount save(CdtAccount account);

    CdtAccount findById(Long id);

    List<CdtAccount> findAll();
}
