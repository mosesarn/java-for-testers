package com.serenitydojo.javaDates;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WhenWorkingWithDates {

    @Test
    public void creatingATimeStampForToday(){
        LocalDate today = LocalDate.now();
        System.out.println("Today is :  "+ today);
    }
    @Test
    public void creatingAGivenDate(){
        LocalDate fourthOfJuly = LocalDate.of(2022, 07, 4);
        System.out.println(fourthOfJuly);
    }
    @Test
    public void parsingADate(){
        String dateInStringForm = "2022-05-01";
        LocalDate firstOfMay = LocalDate.parse(dateInStringForm);
        System.out.println(firstOfMay);
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
        System.out.println(yesterday);
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
