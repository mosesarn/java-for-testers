package com.serenitydojo.DomainModellingJavaClasses.flights.Domain;

import java.util.List;
import java.util.stream.Collectors;

public class InternationalAirport extends AirPort implements CanFlyOverseas,HasHotels{


    private final List<String> servicedCountries;
    private final List<Hotel> hotels;
    public InternationalAirport(String name, String code, String country, List<String> servicedCountries, List<Hotel> hotels) {
        super(name, code, country);
        this.servicedCountries = servicedCountries;
        this.hotels = hotels;
    }


    @Override
    public boolean canFlyOverseas() {
        System.out.println("CALLING CAN FLY OVERSEAS IN THE INTERNATIONAL AIRPORT CLASS");
        return true;
    }

    @Override
    public List<String> getServicedCountries() {
        return servicedCountries;
    }

    @Override
    public List<Hotel> findHotel() {
        return hotels;
    }

    @Override
    public List<Hotel> findHotelByStarRating(int numberOfStars) {
        return hotels.stream().filter(hotel -> hotel.getStars() == numberOfStars).collect(Collectors.toList());
    }
}
