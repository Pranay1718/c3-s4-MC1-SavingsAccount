package com.savings;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountName,long accountNumber, String dateOfOpening, String accountStatus, double accountBalance) {
        super(accountName,accountNumber, dateOfOpening, accountStatus, accountBalance);
    }

    @Override
    public double debit() {
        return super.debit();
    }

    @Override
    public double credit() {
        return super.credit();
    }

    @Override
    public void display() {
        super.display();
    }
}
