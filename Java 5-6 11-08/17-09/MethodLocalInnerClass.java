class Bank {
    String accNo;

    void checkBalance() {
        class PassCodeGenerator {
            String generatePassCode() {
                return "" + Math.random();
            }
        }

        PassCodeGenerator ps = new PassCodeGenerator();
        String passCode = ps.generatePassCode();
        if(!passCode.isEmpty()) {
            System.out.println("Balance checked..");
        }
        else {
            System.out.println("Not a valid passcode, so balance cannot be checked..");
        }
    }
}

class MethodLocalInnerClass {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.checkBalance();
    }
}