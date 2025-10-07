abstract class Payment {
    abstract void pay(double amount);
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Entered CVV matched..");
        System.out.println("Amount: " + amount + " paid using card..");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI ID verified..");
        System.out.println("Amount: " + amount + " paid using UPI..");
    }
}

class PaymentService {
    void processPayment(Payment paymentMode, double amount) {
        paymentMode.pay(amount);
    }
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        // using card payment
        ps.processPayment(new CardPayment(), 5000);
        // using UPI
        ps.processPayment(new UPIPayment(), 2000);
    }
}
