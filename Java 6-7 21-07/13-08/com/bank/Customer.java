package com.bank;

public class Customer {
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public Bank getBank() {
        return this.bank;
    }

    public void depositToMyAccount(double amount) {
        this.bank.deposit(amount);
    }

    void displayBankName() {
        System.out.println(this.name + " has an account in " + this.bank.bankName);
    }
}
