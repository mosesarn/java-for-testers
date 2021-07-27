package com.serenitydojo.Banking;

public class CurrentAccount extends BankAccount {
    private double overDraft;
    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}
