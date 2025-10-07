import java.util.Scanner;

class Bank {
    String accNo;
    int balance;

    Bank(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class BankingExceptionHandling {
    void transfer(String toAcc, Bank toBank, Bank fromBank, int amount) throws InsufficientBalanceException {
        // check account no correct or not
        if(toAcc.equals(toBank.accNo)) {
            // check balance in from bank
            if(fromBank.balance >= amount) {
                fromBank.balance -= amount;
                toBank.balance += amount;
                System.out.println("Amount withdrawn successfully: " + amount);
            }
            else {
                throw new InsufficientBalanceException("Don't have enough balance..");
            }
        }
        else {
            throw new InvalidAccountException("Not a valid account number..");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("IC101", 15000); // from bank
        Bank b2 = new Bank("IC203", 4000); // to bank
        Scanner sc = new Scanner(System.in);
        BankingExceptionHandling obj = new BankingExceptionHandling();
        String toAcc = sc.next();
        try {
            obj.transfer(toAcc, b2, b1, 5000);
        }
        catch(InsufficientBalanceException ise) {
            ise.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("Scanner closed..");
        }

        // check balance in both bank accounts
        System.out.println("From bank balance: " + b1.balance);
        System.out.println("To bank balance: " + b2.balance);
    }
}