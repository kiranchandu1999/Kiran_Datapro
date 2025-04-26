class Payment {
    void process() {
        System.out.println("start processing...");
    }
}

class CardPayment extends Payment {
    void validateCard() {
        System.out.println("card validating...");
    }
}

class UPIPayment extends Payment {
    void validateUPI() {
        System.out.println("validate UPI");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // upcasting
        Payment cp = new CardPayment();
        Payment up = new UPIPayment();

        // card payment
        cp.process();
        // downcasting
        CardPayment cp1 = (CardPayment) cp;
        cp1.validateCard();
    }
}
