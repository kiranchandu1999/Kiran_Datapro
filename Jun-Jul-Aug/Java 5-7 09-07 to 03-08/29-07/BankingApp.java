class Bank{
    private int amount;

    void deposit(int amt){
        this.amount = this.amount + amt;
    }

    void withdraw(int amt) throws InsufficientBalanceException{
        if(this.amount >= amt){
            this.amount = this.amount - amt;
        }
        else{
            throw new InsufficientBalanceException("Insufficient balance, so please check before withdraw...");
        }
    }

    int getAmount(){
        return this.amount;
    }
}

public class BankingApp{
    public static void main(String[] args){
        Bank sbi = new Bank();

        sbi.deposit(1000);
        sbi.deposit(500);

        try{
            sbi.withdraw(1200);
            sbi.withdraw(500);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(sbi.getAmount());
    }
}