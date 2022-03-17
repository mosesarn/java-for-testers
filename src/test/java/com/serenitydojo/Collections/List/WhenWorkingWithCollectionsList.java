package com.serenitydojo.Collections.List;

import org.junit.Test;

import java.util.*;

public class WhenWorkingWithCollectionsList {

    /**
     * List listA = new ArrayList(); List listB = new LinkedList(); List listC =
     * new Vector(); List listD = new Stack();
     *
     *
     */
    @Test
    public void listImplementaion() {
        List<String> list = new ArrayList<>();
        list.add("BIBLE");
        list.add("GENESIS");
        list.add("DANIEL");
        list.add("JOHN");
        list.add("PROVERB");
        // Inserting an element at a specific index
        list.add(0, "Addam");
        list.add(1, "Benjamin");
        list.add(7, "James");
        System.out.println(list);
        for (Object s : list) {
            System.out.print(s + "  ");
        }

    }
    @Test
    public void emptyList() {
        Object element = null;

        List<Object> list = new ArrayList<>();

        list.add(element);
        System.out.println(list);
    }
    @Test
    public void insertAllElementsFromOneListToAnother() {
        List<String> listSource = new ArrayList<>();

        listSource.add("123");
        listSource.add("456");
        System.out.println("List Source:  " + listSource);
        List<String> listDest = new ArrayList<>();

        listDest.addAll(listSource);
        System.out.println("List Destination:  " + listDest);
    }
    @Test
    public void getElementsFromTheList() {
        List<String> listA = new ArrayList<>();

        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");

        // access via index
        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(2);
        System.out.println(element0);
        System.out.println(element1);
        System.out.println(element3);
    }
    @Test
    public void findElementsInAlist() {
        List<String> list = new ArrayList<>();

        String element1 = "element 1";
        String element2 = "element 2";
        String element3 = "element 3";

        list.add(element1);
        list.add(element2);
        list.add(element3);
        int index1 = list.indexOf(element1);
        int index2 = list.indexOf(element2);
        int index3 = list.lastIndexOf(element3);

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        System.out.println("index3 = " + index3);
    }
    /**
     * if the input parameter to contains() is null, the contains() method
     * will not use the equals() method to compare against each element, but
     * rather use the == operator.
     *
     */
    @Test
    public void checkingListContainsElement() {
        List<String> list = new ArrayList<>();

        String element1 = "element 1";

        list.add(element1);

        boolean containsElement = list.contains("element 1");

        System.out.println(containsElement);
        // Example 2 : -

        list.add(null);

        containsElement = list.contains(null);

        System.out.println(containsElement);

    }
    @Test
    public void hashTableInplementaion() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("name", "Moses");
        hashtable.put("place", "USA");
        hashtable.put("tool", "selenium");
        hashtable.put("Expertise", "Designing");
        System.out.println("KeySet" + hashtable.keySet());
        System.out.println("Values" + hashtable.values());
        System.out.println("name:  " + hashtable.get("name"));

    }
    @Test
    public void removeElementFromList() {
        List<String> list = new ArrayList<>();

        list.add("element 0");
        list.add("element 1");
        list.add("element 2");
        System.out.println(list);
        list.remove("element 1");
        list.remove(0);
        System.out.println(" After Remove :  " + list);
    }
    /**
     * Retain All Elements From One List in Another First two lists are
     * created. Second, 3 elements are added to list and 3 elements are
     * added to otherList. Third, the retainAll() method is called on list,
     * passing otherList as parameter. After list.retainAll(otherList) has
     * finished executing, the list will only contain those elements which
     * were both present in list and otherList before retainAll() was
     * called. More specifically, that is element1 and element3 .
     *
     *
     */
    @Test
    public void removeAllElementsFromAJavaList() {
        List<String> list = new ArrayList<>();

        list.add("object 1");
        list.add("object 2");
        // etc.
        System.out.println(" Before clear :  " + list);
        list.clear();
        System.out.println(" After clear :  " + list);


        List<String> list1 = new ArrayList<>();
        List<String> otherList = new ArrayList<>();

        String element1 = "element 1";
        String element2 = "element 2";
        String element3 = "element 3";
        String element4 = "element 4";

        list1.add(element1);
        list1.add(element2);
        list1.add(element3);
        list1.add(element4);
        List<String> sublist = list1.subList(1, 3);
        System.out.println("SubList " + sublist);
        System.out.println("SubList " + sublist.size());
        otherList.add(element1);
        otherList.add(element3);
        otherList.add(element4);

        list1.retainAll(otherList);
        System.out.println("AfterRetainAlllist: " + list1);

    }

    @Test
    public void convertingListToSetArrayToList() {
        List<String> list = new ArrayList<>();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 3");
        System.out.println(list);
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        // Converting List To Array
        System.out.println("List  " + list);
        String[] listToArrayStrings = list.toArray(new String[0]);
        System.out.println("converting list to array size is :  "
                + listToArrayStrings.length);
    }

    @Test
    public void convertingArraysToList() {
        String[] values = new String[]{"one", "two", "three"};
        System.out.println("converting list to array size is :  "
                + values.length + "-----" + values[0] + values[1] + values[2]);
        List<String> list = Arrays.asList(values);
        System.out.println("List Values : " + list);
    }
    @Test
    public void sortListComperableObjects() {
        List<String> list = new ArrayList<>();

        list.add("c");
        list.add("b");
        list.add("a");
        System.out.println("Before Sort : " + list);
        Collections.sort(list);
        System.out.println("After Sort : " + list);
    }

}
