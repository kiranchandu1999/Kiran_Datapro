// parent class (super class)
class User {
    String name;
    String email;

    // default constructor
    // User() {};

    // constructor
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void login() {
        System.out.println("Log in successful!!");
    }
}

// child class (sub class)
class Customer extends User {
    String address;

    // default constructor
    // Customer() {
    //     super();
    // };

    Customer(String name, String email, String address) {
        super(name, email);
        this.address = address;
    }

    void login() {
        System.out.println("dummy login..");
    }

    void placeOrder(String item) {
        super.login();
        System.out.println(super.name + " placed an order of item - " + item);
    }
}

class UserManagement {
    public static void main(String[] args) {
        User u1 = new User("Akhila", "akhila@gmail.com");

        Customer c1 = new Customer("Mukul", "mukul@gmailc.om", "vsp 530000, AP");
        // c1.name = "Mukul";
        // c1.email = "mukul@gmailc.om";
        // c1.address = "vsp 530000, AP";
        c1.placeOrder("Iphone 16 pro");
    }
}