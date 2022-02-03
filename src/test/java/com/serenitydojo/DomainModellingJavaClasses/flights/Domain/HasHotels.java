package com.serenitydojo.DomainModellingJavaClasses.flights.Domain;

import java.util.List;
import java.util.stream.Collectors;

public interface HasHotels {
    List<Hotel> findHotel();
   default List<Hotel> findHotelByStarRating(int numberOfStars){
        return findHotel().stream().filter(hotel -> hotel.getStars() == numberOfStars).collect(Collectors.toList());
    };
}
