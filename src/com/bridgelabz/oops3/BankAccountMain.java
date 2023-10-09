package com.bridgelabz.oops3;

class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void displayBalance(){
        System.out.println("Current balance: Rs."+balance);
    }
    static class Interest{
        private double rate;

        public Interest(double rate) {
            this.rate = rate;
        }
        public void show(){
            System.out.println("Interest rate:"+rate+"%");
        }
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount obj=new BankAccount(1000);
        obj.displayBalance();

        BankAccount.Interest obj1=new BankAccount.Interest(3.0);
        obj1.show();
    }
}
