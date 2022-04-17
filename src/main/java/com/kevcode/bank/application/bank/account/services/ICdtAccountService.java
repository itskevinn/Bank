package com.kevcode.bank.application.bank.account.services;

import com.kevcode.bank.application.bank.account.http.dto.CdtAccountDto;
import com.kevcode.bank.application.bank.account.http.request.CdtAccountRequest;
import com.kevcode.bank.application.shared.Response;

import java.util.List;

public interface ICdtAccountService {
    Response<List<CdtAccountDto>> getByCustomerId(Long customerId);

    Response<CdtAccountDto> save(CdtAccountRequest cdtAccountRequest);
}
