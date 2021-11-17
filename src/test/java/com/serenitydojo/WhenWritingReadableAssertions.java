package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is 35
        assertEquals(35,sum);
        assertThat(sum).isBetween(30,40);
        assertThat(sum).isEqualTo(35);
        Assertions.assertThat(sum).isCloseTo(30, Percentage.withPercentage(17));
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;
        // Check that the sum is greater than 30
        assertThat(sum).isGreaterThan(30);
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Check that the sum is between 10 and 20
        assertThat(sum).isBetween(10,20);
    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;
        double a = 50;
        double b = 40;
        double sum = a+b;
        // Check that the sum is within 10% of 100
        assertThat(sum).isCloseTo(100,Percentage.withPercentage(10));
        assertThat(roughlyOneHundred).isCloseTo(100,Percentage.withPercentage(1));

    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        assertThat(color).isEqualTo("red");
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        assertThat(color).isEqualToIgnoringCase("red");
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        assertThat(licenseNumber).containsPattern("[0-9]");
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        assertThat(colors).startsWith("red");
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        assertThat(colors).endsWith("blue");
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red"
        assertThat(colors).contains("red");
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red" and "blue
        assertThat(colors).contains("red","blue");
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains 3 elements
        assertThat(colors).hasSize(3);
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","green" and "blue" in any order
        assertThat(colors).containsExactly("red","green","blue");
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","blue" and "green" in any order
        assertThat(colors).containsExactlyInAnyOrder("red","blue","green");
    }




}