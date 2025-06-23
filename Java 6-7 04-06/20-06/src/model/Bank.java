package model;

public class Bank {
    // private access variables
    private String accNo;
    private String holderName;
    private double balance;
    // default access
    String bankName = "VBI";

    public Bank(String acc, String name, double balance) {
        this.accNo = acc;
        this.holderName = name;
        this.balance = balance;
    }

    // setters and getters
    public String getAccNo() {
        return this.accNo;
    }

    // setter for account no (logically we shouldn't change accNo so disabling it)
    // public void setAccNo(String accNo) {
    //     this.accNo = accNo;
    // }

    public String getHolderName() {
        return this.holderName;
    }

    public double getBalance() {
        return this.balance;
    }

    // protected access method
    protected void deposit(double amount) {
        this.balance += amount;
        System.out.println("Hi " + this.holderName + ", " + amount + " deposited");
    }
}