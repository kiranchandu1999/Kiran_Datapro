package com.service;

import com.bank.Customer;

public class BankService {
    void depositService(Customer customer, double amount) {
        customer.getBank().deposit(amount);
    }
}
