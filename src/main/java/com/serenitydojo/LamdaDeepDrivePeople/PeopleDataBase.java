package com.serenitydojo.LamdaDeepDrivePeople;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeopleDataBase {
    List<Person> allThePeople;

    public PeopleDataBase(List<Person> allThePeople) {
        this.allThePeople = allThePeople;
    }

    public List<Person> findPeopleUnder35() {
        List<Person> peopleUnder35 = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getAge()< 35){
                peopleUnder35.add(person);
            }
        }
       return peopleUnder35;
    }

    public List<Person> findPeopleWhoLikeRed() {
        List<Person> peopleWhoLikeRedColor = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getFavouriteColor().equals("Red")){
                peopleWhoLikeRedColor.add(person);
            }
        }
        return peopleWhoLikeRedColor;
    }

    public List<Person> findPeopleBetween(int lowestAge, int highestAge) {
        List<Person> matchingPeople = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getAge() >=20 &&  person.getAge()<=40){
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }

    public List<Person> findPeopleWho(Predicate<Person> check) {
        return allThePeople.stream()
                .filter(check)
                .collect(Collectors.toList());
//        List<Person> likeRedOrAge30OrUnder = new ArrayList<>();
//        for(Person person : allThePeople){
//            if(check.test(person)){
//                likeRedOrAge30OrUnder.add(person);
//            }
//        }
//        return likeRedOrAge30OrUnder;
    }
}
