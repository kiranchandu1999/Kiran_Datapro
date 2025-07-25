// parent class
class User {
    String name;
    String email;

    // default constructor
    // User() {}

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void login() {
        System.out.println("User logged in with email: " + email);
    }
}

// child class
class Customer extends User {
    String shippingAddress;

    // default constructor
    // Customer() {
    //     super();
    // }

    Customer(String name, String email, String shippingAddress) {
        // calling parent class constructor
        super(name, email);
        this.shippingAddress = shippingAddress;
    }

    void placeOrder(String item) {
        System.out.println("Item " + item + " dispatched to address: " + shippingAddress);
    }
}

// multilevel inheritance
class PrimeCustomer extends Customer {
    int discountCoins;

    // default constructor
    // PrimeCustomer() {
    //     super();
    // }

    PrimeCustomer(String name, String email, String shippingAddress, int discountCoins) {
        super(name, email, shippingAddress);
        this.discountCoins = discountCoins;
    }

    // method overrding (or) Runtime polymorphism
    @Override
    void placeOrder(String item) {
        System.out.println("Availed discount of " + discountCoins);
        System.out.println("Item " + item + " dispatched to address: " + shippingAddress);
    }
}

public class UserManagement {
    public static void main(String[] args) {
        Customer c1 = new Customer("raju", "raju@gmail", "vizag");

        // login
        c1.login();
        // place an order
        c1.placeOrder("Iphone 15 pro");

        // Prime customer
        PrimeCustomer pmc = new PrimeCustomer("Alok", "alok@gmail", "Hyd", 500);
        // place an order through prime customer
        pmc.placeOrder("Lenovo thinkpad 14");
    }
}
