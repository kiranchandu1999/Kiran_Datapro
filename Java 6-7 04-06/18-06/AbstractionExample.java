abstract class Facebook {
    // abstract method
    abstract void login(String id, String pwd);

    // non abstract method
    void hello() {
        System.out.println("Hello Facebook...");
    }
}

class FacebookImpl extends Facebook {
    @Override
    void login(String id, String pwd) {
        System.out.println("Login successful...");
    }

    void logout() {
        System.out.println("Logout successfully..");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Facebook fb1 = new Facebook();
        // fb1.hello();
        // fb1.login("id1101", "1234");

        // upcasting
        Facebook fb1 = new FacebookImpl();
        fb1.login("id102", "8985");
        ((FacebookImpl) fb1).logout();
        // down casting
        FacebookImpl fb2 = (FacebookImpl) fb1;
        fb2.logout();
    }
}
