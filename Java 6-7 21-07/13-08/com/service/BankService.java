package com.service;

import com.bank.Customer;
import com.bank.Bank;

public class BankService {
    void depositService(Customer customer, double amount) {
        customer.depositToMyAccount(amount);
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank("AC123", 1000, "SBH");
        Customer cust1 = new Customer("John", bank1);
        // before depositing amount
        System.out.println("Before deposit: " + cust1.getBank().getBalance());
        BankService bs1 = new BankService();
        bs1.depositService(cust1, 500);
        // after deposit
        System.out.println("After deposit: " + cust1.getBank().getBalance());
    }
}
