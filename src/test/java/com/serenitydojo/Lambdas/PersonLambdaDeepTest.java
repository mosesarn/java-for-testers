package com.serenitydojo.Lambdas;

import com.serenitydojo.LamdaDeepDrivePeople.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonLambdaDeepTest {

    Person sam = new Person("Sam", Person.Gender.FEMALE,30,"Red");
    Person bill = new Person("Bill", Person.Gender.MALE,40,"Blue");
    Person tim = new Person("Tim", Person.Gender.MALE,10,"Red");
    Person susan = new Person("Susan", Person.Gender.FEMALE,50,"Yellow");
    Person sarah = new Person("Sarah", Person.Gender.FEMALE,50,"Orange");
    Person paul = new Person("Paul", Person.Gender.MALE,40,"Cyan");

    PersonChecker likeBlue = person -> person.getFavouriteColor().equals("Blue");
    PersonChecker likeRed = person -> person.getFavouriteColor().equals("Red");
    PersonChecker likeGreen = person -> person.getFavouriteColor().equals("Green");
    PersonChecker peopleUnder35 = person -> person.getAge()<35;
    PersonChecker likeRedOrUnder30 = person -> person.getFavouriteColor().equals("Red")||person.getAge()<30;
    List<Person> allThePeople = Arrays.asList(sam,bill,tim,susan,sarah,paul);
    PeopleDataBase people = new PeopleDataBase(allThePeople);
    @Test
    public void ICanCreateSomePeople(){

        System.out.println(allThePeople);

    }
    @Test
    public void ICanSearchForPeopleByAge(){
        //Search for people under 35
        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> peopleUnder35 = people.findPeopleUnder35() ; //???
        Assertions.assertThat(peopleUnder35).contains(sam,tim);


    }
    @Test
    public void ICanSearchForPeopleWhoLikeRed(){
        //Search for people under 35
        List<Person> peopleWhoLikeRed = people.findPeopleWhoLikeRed() ; //???
        Assertions.assertThat(peopleWhoLikeRed).contains(sam,tim);
    }
    @Test
    public void ICanSearchForPeopleBetween20and40(){
        //Search for people under 35
        List<Person> PeopleBetween20and40 = people.findPeopleBetween(20,40) ; //???
        Assertions.assertThat(PeopleBetween20and40).contains(sam,bill);
    }
    @Test
    public void ICanSearchForPeopleWhoLikeRedOrWhoAre30OrUnder(){
        //Search for people under 35
        //LikeREdOrUnder30 likeRedOrUnder30 = new LikeREdOrUnder30();
        List<Person> PeopleWhoLikeRedAndUnder30 = people.findPeopleWho((Predicate<Person>) likeRedOrUnder30) ; //???
        Assertions.assertThat(PeopleWhoLikeRedAndUnder30).contains(sam,tim);
    }
    @Test
    public void ICanSearchForPeopleWhoLikeGreenOrWhoAre30OrUnder(){
        //Search for people under 35
        LikeGreen likeGreen = new LikeGreen();
        List<Person> PeopleWhoLikeGreenAndUnder30 = people.findPeopleWho((Predicate<Person>) likeGreen); //???
        Assertions.assertThat(PeopleWhoLikeGreenAndUnder30).contains(sam,tim);
    }
    @Test
    public void ICanSearchForPeopleWhoLikeBlue(){
        //Search for people under 35
//        PersonChecker likeBlue = new PersonChecker() {
//            @Override
//            public boolean test(Person person) {
//                return person.getFavouriteColor().equals("Blue");
//            }
//        };
        PersonChecker likeBlue = person -> person.getFavouriteColor().equals("Blue");
        List<Person> PeopleWhoLikeBlue = people.findPeopleWho((Predicate<Person>) likeBlue); //???
        Assertions.assertThat(PeopleWhoLikeBlue).contains(bill);
    }

    @Test
    public void peopleCanEarnPoints(){
        // allThePeople.stream().parallelStream() or allThePeople.parallelStream()
        allThePeople.forEach(
                person -> {
                    person.earnPoints(200);
                }
        );
        allThePeople.forEach(person -> System.out.println("Point For  " + person.getName()+ "-->"+person.getPoints()));
    }
    @Test
    public void parallelPeopleCanEarnPoints(){
        // allThePeople.stream().parallelStream() or allThePeople.parallelStream()
        allThePeople.stream()
                .peek(person -> System.out.println("Point For  " + person.getName()+ "-->"+person.getPoints()))
                .peek(person -> person.earnPoints(250))
                .forEach(person -> System.out.println("Updated Points  " + person.getName()+ "-->"+person.getPoints()));

        //List all the colors of the people
        List<String> allTheColors = allThePeople.stream()
                .map(Person::getFavouriteColor) //same as : person -> person.getFavouriteColor()
                .collect(Collectors.toList());
        System.out.println(allTheColors);

    }
}
