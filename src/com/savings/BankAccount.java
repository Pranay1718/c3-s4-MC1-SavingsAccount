package com.savings;

public class BankAccount {
    private String accountName;
    private long accountNumber;
    private String dateOfOpening;
    private String accountStatus;
    private double accountBalance;
    private double withdraw_amt;
    private double deposit_amt;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getWithdraw_amt() {
        return withdraw_amt;
    }

    public void setWithdraw_amt(double withdraw_amt) {
        this.withdraw_amt = withdraw_amt;
    }

    public double getDeposit_amt() {
        return deposit_amt;
    }

    public void setDeposit_amt(double deposit_amt) {
        this.deposit_amt = deposit_amt;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(String dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }



    public BankAccount(String accountName,long accountNumber,String dateOfOpening,String accountStatus,double accountBalance)
    {
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.dateOfOpening=dateOfOpening;
        this.accountStatus=accountStatus;
        this.accountBalance=accountBalance;
    }

    public double debit()
    {
        if(getAccountStatus().equals("active")&&getAccountBalance()>0)
        {
            double balance = getAccountBalance() - getWithdraw_amt();
            return balance;
        }
        else
            return getAccountBalance();
    }
    public double credit()
    {
        if (getAccountStatus().equals("active"))
        {
            double balance = getAccountBalance() - getDeposit_amt();
            return balance;
        }
        else
        {
            return getAccountBalance();
        }
    }
    public void display()
    {
        System.out.println("Account Name : "+getAccountName());
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Status : "+getAccountStatus());
        System.out.println("Date of Opening : "+getDateOfOpening());
        System.out.println("Account Balance : "+getAccountBalance());
        System.out.println("");
    }
}
