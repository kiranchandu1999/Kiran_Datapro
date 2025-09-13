abstract class Payment {
    abstract void pay(double amount);
}

interface Refundable {
    void refund(double amount);
}

class CreditCardPayment extends Payment implements Refundable {
    @Override
    void pay(double amount) {
        System.out.println("Card number and CVV matched.");
        System.out.println("Paid amount: " + amount + " using credit card..");
    }

    void creditCardOffer() {
        System.out.println("Applied 10% cashback to credit card payment..");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund amount: " + amount + " to credit card..");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI id is verified..");
        System.out.println("Paid amount: " + amount + " using UPI..");
    }
}

class PaymentService {
    void processPayment(Payment paymentMode, double amount) {
        // applying credit card offer
        if(paymentMode instanceof CreditCardPayment) {
            CreditCardPayment cc = (CreditCardPayment) paymentMode;
            cc.creditCardOffer(); // down casting
            cc.refund(amount-500);
        }
        // paying amount
        paymentMode.pay(amount);
    }

    public static void main(String[] args) {
        PaymentService pm = new PaymentService();
        // payment using creditcard
        pm.processPayment(new CreditCardPayment(), 1000);
        // payment using upi
        pm.processPayment(new UpiPayment(), 2000);
    }
}