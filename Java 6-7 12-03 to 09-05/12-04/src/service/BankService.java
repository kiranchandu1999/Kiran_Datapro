package service;

import main.Bank;

class BankEmployee extends Bank {
    BankEmployee(String acc, String name, double balance) {
        super(acc, name, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
}

class BankService {
    public static void main(String[] args) {
        // import bank class
        Bank bankAcc = new Bank("12546", "Raju", 5000);
        // bankAcc.balance = 20000; // cannot modify

        System.out.println(bankAcc.getAccNo());
        System.out.println(bankAcc.getHolderName());
        System.out.println(bankAcc.getBalance());

        // through bank employee
        BankEmployee emp = new BankEmployee("7895", "Puja", 10000);
        // depositing 5000
        emp.deposit(5000);
        System.out.println(emp.getBalance());
    }
}