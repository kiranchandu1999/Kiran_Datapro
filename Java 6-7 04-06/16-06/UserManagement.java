// parent class
class User {
    String name;
    String email;

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

    Customer(String name, String email, String shippingAddress) {
        // calling parent class constructor
        super(name, email);
        this.shippingAddress = shippingAddress;
    }

    void placeOrder(String item) {
        System.out.println("Item " + item + " dispatched to address: " + shippingAddress);
    }
}

public class UserManagement {
    public static void main(String[] args) {
        Customer c1 = new Customer("Chandrish", "chandrish@gmail", "vizag");

        // login
        c1.login();
        // place an order
        c1.placeOrder("Iphone 15 pro");
    }
}
