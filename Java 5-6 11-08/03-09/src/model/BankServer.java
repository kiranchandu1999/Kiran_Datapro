package model;

public class BankServer {
    public static void main(String[] args) {
        Bank b1 = new Bank("1234", "rahul", 1000);

        System.out.println(b1.getBalance()); // defalut access method
        System.out.println(b1.bankName);
    }
}
