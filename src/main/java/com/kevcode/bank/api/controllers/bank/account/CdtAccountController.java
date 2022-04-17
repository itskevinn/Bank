package com.kevcode.bank.api.controllers.bank.account;

import com.kevcode.bank.application.bank.account.http.dto.CdtAccountDto;
import com.kevcode.bank.application.bank.account.http.request.CdtAccountRequest;
import com.kevcode.bank.application.bank.account.services.ICdtAccountService;
import com.kevcode.bank.application.shared.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CdtAccount")
public class CdtAccountController {
    private final ICdtAccountService _cdtAccountService;

    @Autowired
    public CdtAccountController(ICdtAccountService cdtAccountService) {
        _cdtAccountService = cdtAccountService;
    }

    @PostMapping("/Create")
    public Response<CdtAccountDto> save(@RequestBody CdtAccountRequest cdtAccountRequest) {
        return _cdtAccountService.save(cdtAccountRequest);
    }

    @GetMapping("/GetByCustomerId/{customerId}")
    public Response<List<CdtAccountDto>> getByCustomerId(@PathVariable Long customerId) {
        return _cdtAccountService.getByCustomerId(customerId);
    }
}
