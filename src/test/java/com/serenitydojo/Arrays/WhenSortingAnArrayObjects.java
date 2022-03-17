package com.serenitydojo.Arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class WhenSortingAnArrayObjects {
    /**
     * The Arrays class has set of methods called fill().
     * These Arrays.fill() methods can fill an array with a given value.
     * This is easier than iterating through the array and inserting the value
     */
    /**
     * There is a version of the Arrays.fill() method
     * which takes a from and to index, so only elements with indexes
     * in this interval are filled with the given value.
     */
 @Test
 public void fillingArraysWithArraysDotFills(){
     int[] intArray = new int[10];
     Arrays.fill(intArray, 123);
     System.out.println(Arrays.toString(intArray));

     int[] intArray2 = new int[10];
     Arrays.fill(intArray2, 3, 5, 123) ;

     System.out.println(Arrays.toString(intArray2));

 }

    /**
     * The Arrays class contains a set of methods called binarySearch().
     * This method helps you perform a binary search in an array.
     * The array must first be sorted. You can do so yourself,
     * or via the Arrays.sort() method covered earlier in this text.
     */
    @Test
public void searchingArraysWithArraysDotBuinarySearch(){
    int[] ints = {0,2,4,6,8,10};
    int index = Arrays.binarySearch(ints, 6);
    System.out.println(index);
}

    /**
     * The java.util.Arrays class contains a set of methods called equals()
     * which can be used to check if two Java arrays are equal.
     * Two arrays are considered equal if the arrays have the same length,
     * and the elements are equal to each other
     * in the order they are found in the array.
     */
    @Test
    public void checkingArraysAreEqual(){
        int[] ints1 = {0,2,4,6,8,10};
        int[] ints2 = {0,2,4,6,8,10};
        int[] ints3 = {10,8,6,4,2,0};

        boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
        boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

        System.out.println(ints1EqualsInts2);
        System.out.println(ints1EqualsInts3);
    }

/**
 * The Comparator is an interface.
 * Interfaces are covered in my tutorial about Java interfaces.
 * The Comparator interfaces is covered in more detail in my
 * Java Collections tutorial, in the text about Java Collections - Sorting tutorial.
 * If you don't understand Java interfaces or the Comparator interface,
 */



@Test
public void sortingArrayObjects(){
    Employee[] employeeArray = new Employee[3];
    employeeArray[0] = new Employee("Xander", 1);
    employeeArray[1] = new Employee("John"  , 3);
    employeeArray[2] = new Employee("Anna"  , 2);

    java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    });

    System.out.println("sorted by name *****************************************");
    for(int i=0; i < employeeArray.length; i++) {

        System.out.println(employeeArray[i].name);
    }
    //**************************************************************



    java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.employeeId - e2.employeeId;
        }
    });

    for(int i=0; i < employeeArray.length; i++) {

        System.out.println(employeeArray[i].name);
    }
}






private static class Employee{
    public String name;
    public int    employeeId;

    public Employee(String name, int employeeId){
        this.name       = name;
        this.employeeId = employeeId;
    }
}
}
