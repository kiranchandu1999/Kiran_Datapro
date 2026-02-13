abstract class Facebook {
    abstract void login(String username, String password);

    void displayLogo() {
        System.out.println("Displaying facebook logo - FB");
    }
}

class FacebookImpl extends Facebook {
    @Override
    void login(String username, String password) {
        System.out.println("Checking username: " + username + " in db");
        System.out.println("Checking password: " + password + " in db");
        System.out.println("Login success..");
    }

    void sendRequest() {
        System.out.println("Sending request to a friend");
    }
}

class AbstractionExample {
    public static void main(String[] args) {
        // Cannot create object for abstract class
        // Facebook fb1 = new Facebook();
        // can login fb1 account
        // fb1.login("user1", "use1r@123");
        Facebook fb1 = new FacebookImpl(); // upcasting
        fb1.login("user2", "user2@123");
        fb1.displayLogo();
        FacebookImpl chFb1 = (FacebookImpl) fb1; // down casting (explicit)
        ((FacebookImpl) fb1).sendRequest();
    }
}