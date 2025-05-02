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
            // check amount valid or not
            if(amount < fromBank.balance) {
                System.out.println("Transaction successful..");
            }
            else {
                throw new InsufficientBalanceException("Not enough balance...");
            }
        }
        else {
            throw new NotValidAccountException("Not valid account...");
        }
    }

    public static void main(String[] args) {
        BankingExample bs = new BankingExample();

        // create two bank accounts
        Bank from = new Bank("SB123", 10000);

        Bank to = new Bank("SB789", 2000);

        try {
            bs.processTransaction("SB789", to, 5000, from);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
