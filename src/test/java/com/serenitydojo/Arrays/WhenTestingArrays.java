package com.serenitydojo.Arrays;

import org.junit.Test;

import java.util.Arrays;

public class WhenTestingArrays {

    @Test
    public void instantiatingArrayAndArrayLiteral(){
        int[] intArray;
        intArray = new int[10];
        /**
         * The Java programming language contains a shortcut for
         * instantiating arrays of primitive types and strings.
         * If you already know what values to insert into the array,
         * you can use an array literal.
        */
        int[]   ints2 = new int[]{ 10,9,8,7,6,5,4,3,2,1 }; // older version
        System.out.println(java.util.Arrays.toString(ints2));
        int[] intArray1 = {1,2,3,4,5,6,7,8,9,10}; // Array Literal newer version
        System.out.println(Arrays.toString(intArray1));
        System.out.println("Length of the array:   "+intArray1.length);
        String[] strings = {"one", "two", "three"};
        System.out.println(Arrays.toString(strings));
        /**
         * The Arrays.sort() example shown earlier only works for
         * Java arrays of primitive data types. Java's primitive data types
         * have a natural ordering, either their numeric order, or
         * the order of the characters in the ASCII table
         * (the binary number representing the character).
         */
        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));
        /**
         * Iterating through an array
         */
        for (String string: strings) {
            System.out.println(" forEachValue of Sting Array : "+string);
        }
        for (int i= 0;i<strings.length;i++){
            System.out.println(" for Value of Sting Array : "+strings[i]);
        }

    }
    @Test
    public void findingMinimumValueInAnArray(){
        int[] ints = {0,2,4,6,8,10};
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i < ints.length; i++){
            if(ints[i] < minVal){
                minVal = ints[i];
            }
        }
        System.out.println("minVal = " + minVal);
    }
    @Test
    public void findingMaximumValueInAnArray(){
        int[] ints = {0,2,4,6,8,10};
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < ints.length; i++){
            if(ints[i] > maxVal){
                maxVal = ints[i];
            }
        }
        System.out.println("maxVal = " + maxVal);
    }
    @Test
    public void copyingAnArray(){
        int[] source = new int[10];

        for(int i=0; i < source.length; i++) {
            source[i] = i;
        }
        System.out.println("source Array " + Arrays.toString(source));
        /**
         * he Arrays.copyOf() method takes 2 parameters.
         * The first parameter is the array to copy.
         * The second parameter is the length of the new array.
         * This parameter can be used to specify how many elements from the source array to copy.
         */
        int[] dest = Arrays.copyOf(source, source.length);
        System.out.println("copied Array " + Arrays.toString(dest));
        int[] dest1 = Arrays.copyOfRange(source, 5, source.length);
        System.out.println("copied range from start at index: 5 Array " + Arrays.toString(dest1));
    }
@Test
public void insertingElementInToArray(){
    int[] ints   = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    ints[1] = 20;
    System.out.println(Arrays.toString(ints));
    insertIntoArray(ints, 0, 10);
    System.out.println(Arrays.toString(ints));
    insertIntoArray(ints, 1, 23);
    System.out.println(Arrays.toString(ints));
    insertIntoArray(ints, 9, 67);
    System.out.println(Arrays.toString(ints));
    }

    private void insertIntoArray(
            int[] array, int insertIndex, int newValue){
        //move elements below insertion point.
        for(int i=array.length-1; i > insertIndex; i--){
            array[i] = array[i-1];
        }
        //insert new value
        array[insertIndex] = newValue;
        System.out.println("new Value : "+array[insertIndex]);
    }
    private void removeFromArray(
            int[] array, int removeIndex){

        for(int i = removeIndex; i < array.length -1; i++){
            array[i] = array[i + 1];
        }
    }
}
