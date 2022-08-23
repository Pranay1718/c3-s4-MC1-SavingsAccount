package com.savings;

public class CurrentAccount extends BankAccount{

    private int gstNo ;
    private String businessName;
    private String businessAddress;

    public int getGstNo() {
        return gstNo;
    }

    public void setGstNo(int gstNo) {
        this.gstNo = gstNo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public CurrentAccount(String accountName,long accountNumber, String dateOfOpening, String accountStatus, double accountBalance,int gstNo,String businessName,String businessAddress) {
        super(accountName,accountNumber, dateOfOpening, accountStatus, accountBalance);
        this.gstNo=gstNo;
        this.businessName=businessName;
        this.businessAddress=businessAddress;

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
        System.out.println("Business Name : "+getBusinessName());
        System.out.println("Business Address : "+getBusinessAddress());
        System.out.println("GST NO. "+gstNo);
        super.display();
    }
}
