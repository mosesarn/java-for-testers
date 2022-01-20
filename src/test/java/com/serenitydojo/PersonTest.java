package com.serenitydojo;

import com.serenitydojo.people.PeopleDataBase;
import com.serenitydojo.people.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PersonTest {


    Person sam = new Person("Sam", com.serenitydojo.LamdaDeepDrivePeople.Person.Gender.FEMALE,30,"Red");
    Person bill = new Person("Bill", com.serenitydojo.LamdaDeepDrivePeople.Person.Gender.MALE,40,"Blue");
    Person tim = new Person("Tim", com.serenitydojo.LamdaDeepDrivePeople.Person.Gender.MALE,10,"Green");
    Person susan = new Person("Susan", com.serenitydojo.LamdaDeepDrivePeople.Person.Gender.FEMALE,50,"Yellow");
    // Person sam = new Person("sM", com.serenitydojo.LamdaDeepDrivePeople.Person.Gender.FEMALE,30,"Red");
    List<Person> allThePeople = Arrays.asList(sam,bill,tim,susan);

    @Test
    public void ICanCreateSomePeople(){
// Search for people under 35.
        PeopleDataBase people = new PeopleDataBase(allThePeople);
List<Person> peopleUnder35 = people.findUnder35();
        Assertions.assertThat(peopleUnder35).contains(sam,tim);

    }
}
