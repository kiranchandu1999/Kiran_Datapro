interface Payment {
   void makePayment(int amount);

   // java 8 features in an interface (dafult and static methods with body)
   // common functionality
    default void generateInvoice(int amount) {
        System.out.println("Invoice generated for amount " + amount);
    }

    // static method can be called without object
    static boolean isAmountValid(int amount) {
        if(amount > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

class CardPayment implements Payment {
    @Override
    public void makePayment(int amount) {
        System.out.println("Paid Rs." + amount + " using card");
    }
}

class UpiPayment implements Payment {
    @Override
    public void makePayment(int amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class PaymentService {
    void processPayment(Payment payment, int amount) {
        if(!Payment.isAmountValid(amount)) {
            System.out.println("Not a valid amount: " + amount);
            return;
        }
        payment.makePayment(amount);
        // down casting
        if(payment instanceof CardPayment) {
            CardPayment cp = (CardPayment) payment;
            cp.generateInvoice(amount);
        }
        else {
            UpiPayment up = (UpiPayment) payment;
            up.generateInvoice(amount);
        }
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        // CardPayment cp = new CardPayment();
        service.processPayment(new CardPayment(), 1000);
        service.processPayment(new UpiPayment(), 2500);
        service.processPayment(new CardPayment(), -500);
    }
}