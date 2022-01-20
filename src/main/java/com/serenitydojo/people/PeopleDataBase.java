package com.serenitydojo.people;

import java.util.ArrayList;
import java.util.List;

public class PeopleDataBase {
    List<Person> allThePeople;

    public PeopleDataBase(List<Person> allThePeople) {
        this.allThePeople = allThePeople;
    }

    public List<Person> findUnder35() {
        List<Person> peopleUnder35 = new ArrayList<>();
        for (Person person : allThePeople){
            if (person.age <35){
                peopleUnder35.add(person);
            }
        }
        return peopleUnder35;
    }
}
