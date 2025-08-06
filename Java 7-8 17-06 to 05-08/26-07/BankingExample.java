import java.util.Scanner;

class Bank {
    String accNo;
    int balance;

    Bank(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

public class BankingExample {
    void processTransaction(String toAcc, Bank toBank, int amount, Bank fromBank) throws InsufficientBalanceException, NotValidAccountException {
        // check to bank account number
        if(toBank.accNo.equals(toAcc)) {
            if(amount <= fromBank.balance) {
                System.out.println("Amount transferred: " + amount);
                throw new ArithmeticException();
            }
            else {
                throw new InsufficientBalanceException("This acc not have enough balance..");
            }
        }
        else {
            throw new NotValidAccountException("Incorrect account number..");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingExample bs = new BankingExample();

        // create two bank accounts
        Bank bank1 = new Bank("SB123", 10000);
        Bank bank2 = new Bank("SB789", 2000);
        System.out.println("Enter TO Account no: ");
        String input = sc.next();

        try {
            bs.processTransaction(input, bank2, 5000, bank1);
        }
        catch(InsufficientBalanceException | NotValidAccountException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("Scanner closed");
        }

        System.out.println("remaining program...");
    }
}
