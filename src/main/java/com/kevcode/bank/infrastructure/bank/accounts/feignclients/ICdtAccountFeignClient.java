package com.kevcode.bank.infrastructure.bank.accounts.feignclients;

import com.kevcode.bank.application.bank.account.http.dto.CdtAccountDto;
import com.kevcode.bank.application.bank.account.http.request.CdtAccountRequest;
import com.kevcode.bank.application.shared.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "CdtAccountService", url = "http://localhost:8083/api/CdtAccount")
public interface ICdtAccountFeignClient {

    @GetMapping("/GetByCustomerId/{customerId}")
    Response<List<CdtAccountDto>> getByCustomerId(@PathVariable Long customerId);

    @GetMapping("/Create")
    Response<CdtAccountDto> save(@RequestBody CdtAccountRequest cdtAccountRequest);
}
