package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

//import static org.assertj.core.api.assertThat;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList(){
        List simpleList = new ArrayList(); // List simpleList = new LinkedList(); linked list is more faster if you are adding a new element. array list takes more memory if adding a new element.

        simpleList.add("a string value");
        simpleList.add(123);
        simpleList.add(true);
Assertions.assertThat(simpleList).contains("a string value",123);
        //assertThat(simpleList).contains("a string value");
        Assert.assertEquals(simpleList.get(0).toString(),"a string value");
    }
    @Test
    public void createATypedList(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar");
        List<Integer> ages = Arrays.asList(10,9);
        // Number can hold all types of numeric.
        List<Number> favourateNumber = Arrays.asList(10,9,10000000000000L,3.149876);
        Assert.assertEquals(ages.get(0).toString(),"10");
        Assert.assertEquals(names.get(0).toString(),"Moses");
        Assert.assertEquals(favourateNumber.get(0).toString(),"10");
    }
    @Test
    public void removingListItem(){
        List<String> names = new ArrayList<String>();
        List<Integer> ages = new ArrayList<Integer>();
        names.add("Moses");
        names.add("Kishore");
        names.remove("Kishore");
        Assert.assertEquals(names.get(0).toString(),"Moses");
        names.clear();
        Assert.assertEquals(names.contains("Moses"),false);
    }
    @Test
    public void findingElementsInAList(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar","Arnold","Kishore");
        // names.add("Kumar")// java.lang.unsupportedException
        int indexOfArnold = names.indexOf("Arnold");
        int lastIndexOfArnold = names.lastIndexOf("Arnold");
        Assert.assertEquals(indexOfArnold,1);
        Assert.assertEquals(lastIndexOfArnold,3);
    }
    @Test
    public void findingASubList(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar","Arnold","Kishore");
        List<String> middleNames = names.subList(1,3);
        Assert.assertEquals(middleNames.get(1),"Kumar");
        Assertions.assertThat(middleNames).contains("Arnold","Kumar","Arnold");
    }
    @Test
    public void findingTheSize(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar","Arnold","Kishore");
        Assert.assertEquals(names.size(),5);
    }
    @Test
    public void convertingListToASet(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar","Arnold","Kishore");
        Set<String> uniqueNames = new HashSet<>(names);
        //assertThat(uniqueNames).containsExactlyInAnyOrder(Moses","Arnold","Kumar","Kishore");
        Assert.assertEquals(names.contains("Moses"),true);
    }
    @Test
    public void sortingAList(){
        List<String> names = Arrays.asList("Moses","Arnold","Kumar","Arnold","Kishore");
        Collections.sort(names);
        Assert.assertEquals(names.get(0),"Arnold");
    }
    @Test
    public void findingMaxMinValue(){
        List<Integer> ages = Arrays.asList(10,9,57,89);
        Assert.assertEquals(Collections.max(ages).intValue(),89);
        Assert.assertEquals(Collections.min(ages).intValue(),9);
    }
    @Test
    public void combiningAList(){
        List<String> names = new ArrayList<String>();
        List<Integer> ages = new ArrayList<Integer>();
        names.add("Moses");
        names.add("Kishore");
        List<String> moreNames = new ArrayList<String>();
        names.add("Paul");
        names.add("Daniel");
        Assert.assertEquals(names.get(1).toString(),"Kishore");
        names.addAll(moreNames);
        Assert.assertEquals(names.get(3).toString(),"Daniel");
        names.clear();
        Assert.assertEquals(names.contains("Moses"),false);
    }
}
