abstract class Facebook {
    // abstract method
    abstract void login(String userId, String password);

    // concrete method
    void displayLogo() {
        System.out.println("This is Facebook logo..");
    }
}

class FacebookImpl extends Facebook {
    @Override
    void login(String userId, String password) {
        System.out.println("Verifying data from database..");
        System.out.println("Login successful...");
    }
}

class AbstractExample {
    public static void main(String[] args) {
        // Facebook fb1 = new Facebook();
        // fb1.login("user1", "1234");
        // fb1.displayLogo();

        Facebook fb1 = new FacebookImpl(); // upcasting
        fb1.login("user1", "1234");
        fb1.displayLogo();
    }
}