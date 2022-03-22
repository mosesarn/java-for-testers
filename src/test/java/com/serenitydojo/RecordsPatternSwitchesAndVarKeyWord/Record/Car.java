package com.serenitydojo.RecordsPatternSwitchesAndVarKeyWord.Record;

import java.util.Objects;

public class Car {
    private final String make;
    private final String model;
    private final  int makeYear;
    private final String numberPlate;

    public Car(String make, String model, int makeYear, String numberPlate) {
        this.make = make;
        this.model = model;
        this.makeYear = makeYear;
        this.numberPlate = numberPlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return makeYear == car.makeYear && make.equals(car.make) && model.equals(car.model) && numberPlate.equals(car.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, makeYear, numberPlate);
    }
}
