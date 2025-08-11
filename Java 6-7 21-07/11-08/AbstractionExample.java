// abstract class
abstract class Facebook {
    // asbtract method
    abstract void login(String id, String pwd);

    // concrete method
    void displayLogo() {
        System.out.println("Displaying FB logo..");
    }
}

class FacebookImpl extends Facebook {
    @Override
    void login(String id, String pwd) {
        // abstract method implementation
        System.out.println("Seraching in database..");
        System.out.println("Data matched..");
        System.out.println("Login successful...");
    }
}

class AbstractionExample {
    public static void main(String[] args) {
        // Facebook acc1 = new Facebook();
        // acc1.displayLogo();
        // acc1.login("user1", "1234");
        Facebook acc1 = new FacebookImpl(); // upcasting
        acc1.login("user1", "1234");
    }
}