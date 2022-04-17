package com.kevcode.bank.application.bank.people.base.http.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String mainRoadType;
    private String mainRoadNumber;
    private String subRoadNumber;
    private String apartment;
    private String neighborhood;
}
