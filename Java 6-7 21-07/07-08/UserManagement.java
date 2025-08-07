class User {
    String userId;
    String email;

    void login() {
        System.out.println("User logged in..");
    }
}

class Customer extends User {
    String address;

    void placeOrder(String item) {
        System.out.println("Order placed: " + item);
    }
}
// Multi level inheritance
class PrimeCustomer extends Customer {
    int discountCoins;

    void placeOrderWithDiscount(String item) {
        System.out.println("Order placed with discount: " + item);
    }
}

public class UserManagement {
    public static void main(String[] args) {
        // Customer creation
        Customer c1 = new Customer();
        c1.placeOrder("Vivo X200");

        // Prime customer
        PrimeCustomer pc1 = new PrimeCustomer();
        pc1.login(); // inherits from User class
        pc1.placeOrder("Apple mac x256"); // inherits from Customer class
        pc1.placeOrderWithDiscount("Iphone 16 pro");
    }
}
