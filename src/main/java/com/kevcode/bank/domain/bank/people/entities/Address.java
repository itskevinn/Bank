package com.kevcode.bank.domain.bank.people.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String mainRoadType;
    private String mainRoadNumber;
    private String subRoadNumber;
    private String apartment;
    private String neighborhood;
    private String houseNumber;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        houseNumber = houseNumber;
    }

    public String getMainRoadType() {
        return mainRoadType;
    }

    public void setMainRoadType(String mainRoadType) {
        this.mainRoadType = mainRoadType;
    }

    public String getMainRoadNumber() {
        return mainRoadNumber;
    }

    public void setMainRoadNumber(String mainRoadNumber) {
        this.mainRoadNumber = mainRoadNumber;
    }

    public String getSubRoadNumber() {
        return subRoadNumber;
    }

    public void setSubRoadNumber(String subRoadNumber) {
        this.subRoadNumber = subRoadNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

}
