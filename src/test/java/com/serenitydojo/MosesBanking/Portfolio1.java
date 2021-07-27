package com.serenitydojo.MosesBanking;

import java.util.ArrayList;
import java.util.List;

public class Portfolio1 {
    private List<BearingInterest> accounts = new ArrayList<>();

    public void add(BearingInterest account) {
        accounts.add(account);
        
    }

    public double calculateMonthlyInterest() {
        double sum = 0.0;
        for(BearingInterest account : accounts){
            sum = sum + account.calculateMonthlyInterest();
        }
        return sum;
    }
}
