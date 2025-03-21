class Bank {
    int amount;
    
    void deposite(int amount) {
        this.amount += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) throws InsufficientBalanceException {
        if(this.amount > amount) {
            this.amount -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else {
            throw new InsufficientBalanceException("Insufficient balance, please try again..");
        }
    }
}

public class BankingExample {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.deposite(1000);

        try {
            b1.withdraw(500);
            b1.withdraw(600);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
