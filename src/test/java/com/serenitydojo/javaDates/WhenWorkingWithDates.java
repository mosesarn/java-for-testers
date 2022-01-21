package com.serenitydojo.javaDates;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WhenWorkingWithDates {

    @Test
    public void creatingATimeStampForToday(){
        LocalDate today = LocalDate.now();
        LocalDate twentySixthOfJan = LocalDate.parse("26-01-2022",DateTimeFormatter.ofPattern("dd-M-YYYY"));
        DateAssertions.assertThat(twentySixthOfJan).isEqualTo(26,Month.JANUARY,2022);
        System.out.println("Today is :  "+ twentySixthOfJan);
    }
    @Test
    @DisplayName("We can create a date by specifying the year, month and day ")
    public void creatingAGivenDate() {
        LocalDate fourthOfJuly = LocalDate.of(2022, Month.JULY, 04);
       // LocalDate fourthOfJuly_ = LocalDate.parse("04-07-2022",DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        Assertions.assertThat(fourthOfJuly.getYear()).isEqualTo(2022);
        Assertions.assertThat(fourthOfJuly.getMonth()).isEqualTo(Month.JULY);
        Assertions.assertThat(fourthOfJuly.getDayOfMonth()).isEqualTo(04);
        System.out.println(fourthOfJuly);
        DateAssertions.assertThat(fourthOfJuly).isEqualTo(04,Month.JULY,2022);

//        Assertions.assertThat(fourthOfJuly.getYear()).isEqualTo(2022); // comparing the year from the localDate.of year value of integer.
//        Assertions.assertThat(fourthOfJuly.getYear()).isEqualTo(Integer.parseInt(Year.now().toString()));// comparing the year from the localDate.of with year.now().
//        Assertions.assertThat(fourthOfJuly.getMonth()).isEqualTo(Month.JULY);
//        Assertions.assertThat(fourthOfJuly.getDayOfMonth()).isEqualTo(04);
        System.out.println(Year.now());
    }
    @Test
    @DisplayName("We can create a date by using a different formatted string ")
    public void parsingADate(){
        String dateInStringForm = "01-05-2022";
        //LocalDate firstOfMay = LocalDate.parse(dateInStringForm);
        LocalDate firstOfMay_ = LocalDate.parse(dateInStringForm,DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        DateAssertions.assertThat(firstOfMay_).isEqualTo(02,Month.MAY,2022);
        DateAssertions.assertThat(firstOfMay_).isEqualTo(02,Month.MAY,2022);
//        Assertions.assertThat(firstOfMay_.getMonth()).isEqualTo(Month.MAY);
//        Assertions.assertThat(firstOfMay_.getYear()).isEqualTo(2022);
//        Assertions.assertThat(firstOfMay_.getDayOfMonth()).isEqualTo(01);
        System.out.println(firstOfMay_);
        System.out.println(firstOfMay_);
//        Assertions.assertThat(firstOfMay.getMonth()).isEqualTo(Month.MAY);
//        Assertions.assertThat(firstOfMay.getYear()).isEqualTo(2022);
//        Assertions.assertThat(firstOfMay.getDayOfMonth()).isEqualTo(01);
    }
    @Test
    public void parsingADateWithAGivenFormat(){
        LocalDate mayFirst = LocalDate.parse("01/01/2022", DateTimeFormatter.ofPattern("dd/MM/YYYY"));
        System.out.println(mayFirst);
    }
    @Test
    public void yesterday(){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        LocalDate yesterday1 = today.plusDays(-1);
        System.out.println(yesterday1);
    }
    @Test
    public void findTheNextDay(){
        LocalDate jan26 = LocalDate.parse("2022-01-26");
        LocalDate nextDay = jan26.plusDays(1);
        System.out.println(nextDay);
        DateAssertions.assertThat(nextDay).isEqualTo(27,Month.JANUARY,2022);
        LocalDate yesterday1 = jan26.plusDays(-1);
        System.out.println(yesterday1);
    }
    @Test
    public void checkingTheMonth(){
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
            Assertions.assertThat(today).isToday();
    }
    @Test
    public void comparingDates(){
        LocalDate today = LocalDate.now();
        LocalDate firstOfMay = LocalDate.of(2022,05,01);
        LocalDate fifthOfMay = LocalDate.of(2022,05,05);
        LocalDate tenthOfMay = LocalDate.of(2022,05,10);

        Assertions.assertThat(fifthOfMay).isBetween(firstOfMay, tenthOfMay);
    }
    @Test
    public void usingTimes(){
        LocalTime now = LocalTime.now();
        LocalTime fiveHoursAgo = now.minus(5, ChronoUnit.HOURS);

        System.out.println(fiveHoursAgo);
    }
}
