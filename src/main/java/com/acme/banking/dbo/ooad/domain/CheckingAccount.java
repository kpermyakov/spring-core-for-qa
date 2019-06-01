package com.acme.banking.dbo.ooad.domain;

/**
 * Inheritance as Code Reuse
 */
public class CheckingAccount extends SavingAccount {
    private double overdraft;

    public CheckingAccount(long id, double amount, double overdraft) {
        super(id, amount);
        this.overdraft = overdraft;
    }

    @Override
    protected boolean validate(double amount) {
        return super.validate(amount - overdraft);
    }
}
