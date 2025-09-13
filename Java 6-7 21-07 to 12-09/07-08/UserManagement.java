class User {
    String userId;
    String email;

    User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    void login() {
        System.out.println("User logged in..");
    }
}

class Customer extends User {
    String address;

    Customer(String userId, String email, String address) {
        super(userId, email);
        this.address = address;
    }

    void placeOrder(String item) {
        System.out.println("Order placed: " + item + " by userID: " + super.userId);
    }
}
// Multi level inheritance
class PrimeCustomer extends Customer {
    int discountCoins;

    PrimeCustomer(String userId, String email, String address, int discountCoins) {
        super(userId, email, address);
        this.discountCoins = discountCoins;
    }

    void placeOrderWithDiscount(String item) {
        System.out.println("Order placed: " + item + " with discount of " + this.discountCoins);
    }
}

public class UserManagement {
    public static void main(String[] args) {
        // Customer creation
        Customer c1 = new Customer("user1", "user@123", "vskp");
        c1.placeOrder("Vivo X200");

        // Prime customer
        PrimeCustomer pc1 = new PrimeCustomer("user2", "user@987", "vzm", 100);
        pc1.login(); // inherits from User class
        pc1.placeOrder("Apple mac x256"); // inherits from Customer class
        pc1.placeOrderWithDiscount("Iphone 16 pro");
    }
}
