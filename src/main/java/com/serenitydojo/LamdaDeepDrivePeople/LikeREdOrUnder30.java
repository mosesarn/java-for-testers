package com.serenitydojo.LamdaDeepDrivePeople;

public class LikeREdOrUnder30 implements PersonChecker{
    @Override
    public boolean test(Person person){
        return(person.getFavouriteColor().equals("Red") || person.getAge()<=30);
    }
}
