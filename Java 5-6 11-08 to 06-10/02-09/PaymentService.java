abstract class Payment {
    abstract void pay(double amount);
}

interface Refundable {
    int a = 10; // public, static and final

    void refund(double amount);
}

class CardPayment extends Payment implements Refundable {
    void pay(double amount) {
        System.out.println("Entered CVV matched..");
        System.out.println("Amount: " + amount + " paid using card..");
    }

    void applyCardOffer() {
        System.out.println("10% cashback offer applied using credit card..");
    }

    public void refund(double amount) {
        System.out.println("Refund applied for card payment, amount: " + amount);
    }
}

class UPIPayment extends Payment implements Refundable {
    void pay(double amount) {
        System.out.println("UPI ID verified..");
        System.out.println("Amount: " + amount + " paid using UPI..");
    }

    public void refund(double amount) {
        System.out.println("Refund applied for UPI payment, amount: " + amount);
    }
}

class BankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Bank details verified.");
        System.out.println("Amount: " + amount + " paid using Netbanking..");
    }
}

class PaymentService {
    void processPayment(Payment paymentMode, double amount) {
        // offer applying
        if(paymentMode instanceof CardPayment) {
            CardPayment cp = (CardPayment) paymentMode;
            cp.applyCardOffer(); // down casting
            cp.refund(amount*0.1); // down casting
            amount = amount * 0.9;
        }
        paymentMode.pay(amount);
    }

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        // using card payment
        ps.processPayment(new CardPayment(), 5000);
        // using UPI
        ps.processPayment(new UPIPayment(), 2000);

        System.out.println(Refundable.a);
    }
}
