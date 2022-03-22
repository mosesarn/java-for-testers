package com.serenitydojo.RecordsPatternSwitchesAndVarKeyWord.Record;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithRecords {

    @Test
    public void creatingAnImmutableObject(){
        Car car = new Car("Tesla","Model s",2020, "ABC123");
        assertThat(car.getMake()).isEqualTo("Tesla");
    }
    @Test
    public void creatingASetOfCars(){
        Car car1 = new Car("Tesla","Model s",2020, "ABC123");
        Car car2 = new Car("Tesla","Model s",2020, "ABC123");
        Set<Car> theCars = new HashSet<Car>();
        theCars.add(car1);
        theCars.add(car2);
        Assertions.assertThat(theCars).hasSize(1);
    }
    @Test
    public void creatingASetOfVehicles(){
        Vehicle car1 = new Vehicle("Tesla","Model s",2020, "ABC123");
        Vehicle car2 = new Vehicle("Tesla","Model s",2020, "ABC123");
        Set<Vehicle> theCars = new HashSet<Vehicle>();
        theCars.add(car1);
        theCars.add(car2);
        Assertions.assertThat(car1.make()).isEqualTo("Tesla");
        Assertions.assertThat(theCars).hasSize(1);
    }
}
