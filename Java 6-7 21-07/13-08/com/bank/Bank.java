package com.bank;

public class Bank {
    private String accNo; // private
    private double balance; // private
    String bankName; // default access modifier

    public Bank(String accNo, double balance, String bankName) {
        this.accNo = accNo;
        this.balance = balance;
        this.bankName = bankName;
    }

    protected void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposited amount: " + amount + ", Available balance: " + this.balance);
        }
        else {
            System.out.println("Invalid amount: " + amount); // -500
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
