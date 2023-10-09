package com.bridgelabz.oops1;


class BankAccount{
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " from account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient balance for withdrawal from account " + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", 1000.0);
        account1.deposit(100.0);
        System.out.println("Current Balance: Rs." + account1.getBalance());

        account1.withdraw(200.0);
        System.out.println("Current Balance: Rs." + account1.getBalance());
    }
}

