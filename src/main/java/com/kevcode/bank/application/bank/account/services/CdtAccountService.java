package com.kevcode.bank.application.bank.account.services;

import com.kevcode.bank.application.bank.account.http.dto.CdtAccountDto;
import com.kevcode.bank.application.bank.account.http.request.CdtAccountRequest;
import com.kevcode.bank.application.shared.Response;
import com.kevcode.bank.domain.bank.accounts.entities.CdtAccount;
import com.kevcode.bank.domain.bank.accounts.exceptions.InsufficientFundsException;
import com.kevcode.bank.domain.bank.accounts.exceptions.InvalidValueException;
import com.kevcode.bank.domain.bank.accounts.service.INationalTransactionsService;
import com.kevcode.bank.infrastructure.bank.accounts.feignclients.ICdtAccountFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdtAccountService implements INationalTransactionsService, ICdtAccountService {

    private final ICdtAccountFeignClient _cdtAccountFeignClient;

    @Autowired
    public CdtAccountService(ICdtAccountFeignClient cdtAccountFeignClient) {
        _cdtAccountFeignClient = cdtAccountFeignClient;
    }

    @Override
    public Long withdraw(Long value, Long accountId) throws InsufficientFundsException, InvalidValueException {
        return null;
    }

    @Override
    public Long deposit(Long value, Long accountId) throws InvalidValueException {
        return null;
    }

    @Override
    public Long getBalance(Long accountId) throws InvalidValueException {
        return null;
    }

    @Override
    public Response<List<CdtAccountDto>> getByCustomerId(Long customerId) {
        try {
            return _cdtAccountFeignClient.getByCustomerId(customerId);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error", e);
        }
    }

    @Override
    public Response<CdtAccountDto> save(CdtAccountRequest cdtAccountRequest) {
        try {
            return _cdtAccountFeignClient.save(cdtAccountRequest);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error", e);
        }
    }
}
