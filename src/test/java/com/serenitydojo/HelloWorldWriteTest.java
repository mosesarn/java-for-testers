package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriteTest {
    @Test
    public void shouldWriteHelloWorldToConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
    @Test
    public void declaringNumericVariables(){
        // Integer variable
        Integer age = 46;

        age = age+1;
        System.out.println(" Integer age: -- "+age);
        // Integer Final variable cannot be assigned to a value.
        final int ageThisYear = 27;
        System.out.println(" final int This year age : " +ageThisYear);
        int ageNextYear = ageThisYear+1;
        System.out.println(" int Next year age : " +ageNextYear);

        //Decimal Values
        long starsInTheGalaxy = 10000000000L;
        float weight = 15.5F;
        double weight1 = 18.5;
    }
    @Test
    public void workingWithStrings(){
        String firstName = "  Moses Arnold  ";
        System.out.println("first Name  : " +firstName);
        System.out.println("replace first Name  : " +firstName.replace("Arnold", "Kishore"));
        String upperCaseFirstName = firstName.toUpperCase();
        System.out.println("first Name in Upper case : " +upperCaseFirstName);
        System.out.println("first Name length : " +upperCaseFirstName.trim().length());
    }
}
