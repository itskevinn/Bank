package com.kevcode.bank.application.bank.account.http.dto;

import lombok.Data;

@Data
public class CdtAccountDto {
    private Long id;
    private Long balance;
    private Long customerId;
}
