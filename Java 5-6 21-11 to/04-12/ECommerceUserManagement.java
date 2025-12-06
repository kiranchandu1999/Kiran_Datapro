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

class PrimeCustomer extends Customer {
    int rewardPoints;

    PrimeCustomer(String userId, String password, String address, int rewardPoints) {
        super(userId, password, address);
        this.rewardPoints = rewardPoints;
    }

    void applyDiscount() {
        System.out.println("Discount applied: " + rewardPoints);
    }
}

class ECommerceUserManagement {
    public static void main(String[] args) {
        // creating prime customer
        PrimeCustomer p1 = new PrimeCustomer("user3", "user3@123", "VZM", 50);
        p1.login(); // from parent of parent
        p1.placeOrder(); // from parent
        p1.applyDiscount(); // self
    }
}