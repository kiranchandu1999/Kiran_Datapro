package com.bank;

public class Bank {
    private String accNo; // private
    private double balance; // private
    String bankName; // default access modifier

    Bank(String accNo, double balance, String bankName) {
        this.accNo = accNo;
        this.balance = balance;
        this.bankName = bankName;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposited amount: " + amount + ", Available balance: " + this.balance);
        }
        else {
            System.out.println("Invalid amount: " + amount); // -500
        }
    }

    double getBalance() {
        return this.balance;
    }
}
