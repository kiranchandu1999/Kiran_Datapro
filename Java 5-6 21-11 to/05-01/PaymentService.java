abstract class Payment {
    // dummy method
    abstract void pay(int amount);
}

interface Refundable {
    void refund();
}

class CreditCardPayment extends Payment {
    void pay(int amount) {
        // credit card payment logic
        System.out.println("Amount paid using credit card: " + amount);
    }
}

class UpiPayment extends Payment implements Refundable {
    void pay(int amount) {
        // upi payment logic
        System.out.println("Amount paid using UPI payment: " + amount);
    }

    public void refund() {
        System.out.println("Amount refunded for UPI payment");
    }
}

class PaymentService {
    void processPayment(Payment paymentMode, int amount) {
        // Paying amount using selected payment mode
        paymentMode.pay(amount);
        // if payment mode is UPI and amount is <= 1000 then do refund
        if(paymentMode instanceof UpiPayment && amount <= 1000) {
            ((UpiPayment) paymentMode).refund();
        }
    }

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.processPayment(new CreditCardPayment(), 2000);
        ps.processPayment(new UpiPayment(), 1500);
        ps.processPayment(new UpiPayment(), 1000); // refund
    }
}