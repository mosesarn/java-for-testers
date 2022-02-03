package com.serenitydojo.DomainModellingJavaClasses.flights.Domain;

public abstract class AirPort {
    private final String name;
    private final String code;
    private final String country;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public AirPort(String name, String code, String country) {

        this.name = name;
        this.code = code;
        this.country = country;
    }

    public abstract boolean canFlyOverseas();


}
