// Abstraction -> Hiding the method implementation details and it forces child classes to override parent class abstract methods
// abstract method --> method without implementation

class Payment {
    // abstract method
    pay(amount) {
        throw new Error("pay() method should be implemented in child class");
    }
}

class UPIPayment extends Payment {
    // method to pay amount
    pay(amount) {
        console.log(`Amount paid ${amount} using UPI...`);
    }
}

class CardPayment extends Payment {
    payy(amount) {
        console.log(`Amount paid ${amount} using Card...`);
    }
}

// function for processing the payment with given payment mode and given amount
function process_payment(payment_mode, amount) {
    // pay the amount using selected payment mode 
    payment_mode.pay(amount);
}


process_payment(new UPIPayment(), 1000); // paying amount using UPI
process_payment(new CardPayment(), 1200); // paying amount using Card