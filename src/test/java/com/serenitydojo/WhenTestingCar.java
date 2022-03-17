package com.serenitydojo;


import com.serenitydojo.StringCalculator.Car;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class WhenTestingCar {

    Car myCar = new Car("AUDI",2023);

    @Test
    public void verifyModel(){
        Assertions.assertEquals(myCar.getYear(), 2023);
        System.out.println("Car Model:  " + myCar.getModel());
        System.out.println("Car Year:   " + myCar.getYear());

    }



}
