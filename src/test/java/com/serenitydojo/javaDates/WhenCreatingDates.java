package com.serenitydojo.javaDates;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WhenCreatingDates {

   private  LocalDate localDate;
   private DateTimeFormatter dateTimeFormatter;

    @Test
    public void creatingSimpleDate(){
        LocalDate lDt = LocalDate.parse("2022-01-26");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(lDt);
        System.out.println("Date Formatted to dd/MM/yyyy:   " +dateTimeFormatter.format(lDt));
//
       try {
            LocalDate format = LocalDate.parse("26/01/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //  yyyy/MM/dd   dd/MM/yyyy
            System.out.println(format);
       } catch (Exception e) {
            e.printStackTrace();
       }

    }
}
