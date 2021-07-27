package com.serenitydojo.Banking;

public class SavingsAccount extends BankAccount implements InterestBearing {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.interestRate = interestRate;
    setBalance(initialBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
public double calculateMonthlyInterest(){
        return interestRate * getBalance() / 12 ;
}

}
