class Payment {
   void makePayment(int amount) {
        System.out.println("Paid Rs." + amount + " using general process");
   }
}

class CardPayment extends Payment {
    @Override
    void makePayment(int amount) {
        System.out.println("Paid Rs." + amount + " using card");
    }

    void generateInvoice(int amount) {
        System.out.println("Invoice generated for amount " + amount + " using card");
    }
}

class UpiPayment extends Payment {
    @Override
    void makePayment(int amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }

    void generateInvoice(int amount) {
        System.out.println("Invoice generated for amount " + amount + " using UPI");
    }
}

class PaymentService {
    void processPayment(Payment payment, int amount) {
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
        // service.processPayment(new Payment(), 500);
    }
}