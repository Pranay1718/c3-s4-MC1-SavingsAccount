package com.savings;

public class BankAccountImpl {
    public static void main(String [] args)
    {
        BankAccount b1= new SavingsAccount("Pranay",56568775L,"17-09-2021","active",544545.0);
        b1.setDeposit_amt(443);
        b1.credit();
        b1.display();
        b1.setWithdraw_amt(900);
        b1.debit();
        b1.display();
        BankAccount b2=new CurrentAccount("Pranay",766456778L,"17-09-2021","actice",673256.0,433,"PR Estate","Kushaiguda");
        b2.display();
    }
}
