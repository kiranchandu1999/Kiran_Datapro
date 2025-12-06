class User {
    String userId;
    String password;

    // default constructor
    // User() {}

    User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        System.out.println("User address: " + this);
    }

    void login() {
        System.out.println("User logged In...");
    }
}

// Customer class inherting from User class
class Customer extends User {
    String address;

    // Default constructor inside child class
    // Customer() {
    //     super(); // It's calling parent class constructor
    // }

    Customer(String userId, String password, String address) {
        super(userId, password);
        this.address = address;
        System.out.println("Customer address: " + this);
    }

    void placeOrder() {
        System.out.println(super.userId + " placed an Order...");
    }
}

public class UserManagement {
    public static void main(String[] args) {
        // Creating user object
        User u1 = new User("user1", "user1@123");
        u1.login();
        System.out.println(u1.userId);

        // Creating Customer object
        Customer c1 = new Customer("user2", "user2@123", "VSKP");
        c1.login(); // inherited from User class
        c1.placeOrder(); // own method of Customer class
        System.out.println(c1.userId);
    }
}
