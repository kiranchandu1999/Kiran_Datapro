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
            if(amount <= fromBank.balance) {
                System.out.println("Transaction successful..");
            }
            else {
                throw new InsufficientBalanceException("You're trying to transfer Rs: " + amount + " but this account has balance of Rs: " + fromBank.balance);
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
            try{
                bs.processTransaction("SB787", to, 5000, from);
            }
            catch(InsufficientBalanceException | NotValidAccountException e) {
                e.printStackTrace();
            }
            System.out.println("Hello");
            System.out.println("Hii");
            System.out.println("How are you");
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("remaining program...");
    }
}
