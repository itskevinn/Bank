package com.kevcode.bank.application.bank.people.base.http.request;

import lombok.Data;

@Data
public class AddressRequest {
    private String mainRoadType;
    private String mainRoadNumber;
    private String subRoadNumber;
    private String apartment;
    private String neighborhood;
    private String houseNumber;
}
