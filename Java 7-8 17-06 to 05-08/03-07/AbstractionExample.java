abstract class Facebook {
    // abstract method - means method without body (implementation)
    abstract void login(String id, String password);

    // void printName() {
    //     System.out.println("Hello Facebook...");
    // }
}

class FacebookImpl extends Facebook {
    @Override
    void login(String id, String password) {
        // logic for validating id and password
        System.out.println("Successfully logged in...!");
    }

    void printName() {
        System.out.println("Hello FacebookImpl...");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // can't create object for abstract class
        // Facebook fb1 = new Facebook();
        // fb1.login("user1", "1234");

        // upcasting
        Facebook fb1 = new FacebookImpl();
        fb1.login("user1", "1234");
        
        // downcasting
        FacebookImpl childFb1 = (FacebookImpl) fb1;
        childFb1.printName();
    }
}
