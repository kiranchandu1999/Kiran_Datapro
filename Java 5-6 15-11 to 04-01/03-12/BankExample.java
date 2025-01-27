public class BankExample {
    public static void main(String[] args) {
        // object creation
        BankAcct bc1 = new BankAcct();
        bc1.createAcct(031220241, "Rakesh", 5000);
        bc1.deposit(500);
        System.out.println(bc1.balance);

        BankAcct bc2 = new BankAcct();
        bc2.acctNo = 031220242;
        bc2.holderName = "Krishna";
        bc2.balance = 1000;
        bc2.withdraw(500);

        // using constructor
        BankAcct bc3 = new BankAcct(031220243, "Sita", 2000);

        BankAcct bc4 = new BankAcct(031220245, "Pavan", 1000);
        // static variables should be called using class name
        System.out.println(BankAcct.bankName);
    }
}

class BankAcct {
    // variables
    int acctNo;
    String holderName;
    int balance;
    // common name
    static String bankName = "SBI";

    // default constructor automatically created by JVM
    // it is not visible but it looks like as follows
    BankAcct() {
    }

    // constructor
    BankAcct(int acctNo, String hName, int bal) {
        this.acctNo = acctNo;
        this.holderName = hName;
        // balance = bal;
        this.balance = bal;
    }

    void createAcct(int acctNo, String hName, int bal) {
        this.acctNo = acctNo;
        this.holderName = hName;
        // balance = bal;
        this.balance = bal;
    }

    // methods
    void deposit(int amnt) {
        balance = balance + amnt;
        System.out.println(amnt + " deposited");
    }

    int withdraw(int amnt) {
        balance = balance - amnt;
        return amnt;
    }
}