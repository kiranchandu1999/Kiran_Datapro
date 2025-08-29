import java.util.Scanner;

class Bank {
    String accNo;
    int balance;

    Bank(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        this.balance -= amount;
    }
}

public class BankingExample {
    static void processTransaction(String toAccNo, Bank toBank, Bank fromBank, int amount) {
        if(toAccNo.equals(toBank.accNo)) {
            if(fromBank.balance >= amount) {
                fromBank.withdraw(amount);
                toBank.deposit(amount);
                System.out.println("Transferred amount: " + amount);
            }
            else {
                throw new InsufficientBalanceException("Sorry, Balance is not enough to transfer..");
            }
        }
        else {
            System.out.println("Not a valid bank account...");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("SB101", 5000);
        Bank b2 = new Bank("SB201", 2000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account no to tranfer the money:");
        String toAccNo = sc.next();
        try {
            processTransaction(toAccNo, b2, b1, 10000);
        }
        catch(InsufficientBalanceException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("Scanner resource closed..");
        }
        System.out.println("Remaining program..");
    }
}
