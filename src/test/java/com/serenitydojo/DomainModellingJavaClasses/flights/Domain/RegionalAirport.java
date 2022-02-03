package com.serenitydojo.DomainModellingJavaClasses.flights.Domain;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalAirport extends AirPort implements HasHotels{

    private  final List<Hotel> hotels;
    public RegionalAirport(String name, String code, String country, List<Hotel> hotels) {
        super(name, code, country);
        this.hotels = hotels;
    }
    @Override
    public boolean canFlyOverseas() {
        System.out.println("CALLING CAN FLY OVERSEAS IN THE REGIONAL AIRPORT CLASS");
        return false;
    }

    @Override
    public List<Hotel> findHotel() {
        return hotels ;
    }

    @Override
    public List<Hotel> findHotelByStarRating(int numberOfStars) {
        return hotels.stream().filter(hotel -> hotel.getStars() == numberOfStars).collect(Collectors.toList());
    }
}
