import java.util.UUID;

class Bank {
    String bankName;

    void checkBalance() {
        // method local inner class
        class PasscodeGenerator {
            String generatePasscode() {
                return UUID.randomUUID().toString();
            }
        }

        PasscodeGenerator gen = new PasscodeGenerator();
        String randomPasscode = gen.generatePasscode();

        if(randomPasscode != null) {
            System.out.println("Balance checked...");
        }
        else {
            System.out.println("No passcode provided");
        }
    }

}

public class BankLockerSystem {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.checkBalance();
    }
}
