package com.serenitydojo.DomainModellingJavaClasses.flights;

import com.serenitydojo.DomainModellingJavaClasses.flights.Domain.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WhenBookingFlights {

    List<Hotel> londonHotels = Arrays.asList(new Hotel("Hilton",5),new Hotel("Holiday Inn",3));
    List<Hotel> barcelonaHotels = Arrays.asList(new Hotel("Hilton",5),new Hotel("Holiday Inn",3),new Hotel("Double Tree",5));
    List<Hotel> halifaxHotels = Arrays.asList(new Hotel("Holiday Inn",3));

    @Test
    public void shouldHaveAListOfServicedAirports(){
        AirPort heathrow = new InternationalAirport("Heathrow","LHR","United Kingdom", Arrays.asList("France","spain","USA","Canada"), londonHotels);
        AirPort barcelona = new InternationalAirport("Barcelona","BCN","Spain", Arrays.asList("UK","France","Italy"), barcelonaHotels);
        AirPort halifax = new RegionalAirport("Halifax", "YHZ", "Canada",halifaxHotels);
    List<AirPort> airPorts = Arrays.asList(heathrow,barcelona,halifax);
    for(AirPort airPort:airPorts){
        System.out.println("AIRPORT CODE :  "+ airPort.getCode());
        System.out.println("FLIES OVERSEAS :  "+ airPort.canFlyOverseas());
        if(airPort instanceof HasHotels){
            HasHotels airportWithHotels = (HasHotels) airPort;
            System.out.println("5 STAR HOTELS: " +airportWithHotels.findHotelByStarRating(5));
        }
    }
       // HasHotels heathrowInternationalAirports = (HasHotels) halifax;
//        heathrowInternationalAirports.findHotelByStarRating(5);
//        ((InternationalAirport) heathrow).findHotelByStarRating(5);
      //  System.out.println("5 STAR HOTELS: " +heathrowInternationalAirports.findHotelByStarRating(5));
    }
}
