abstract class Facebook {
    abstract void login(String userId, String password);
}

class FacebookImpl extends Facebook {
    @Override
    void login(String userId, String password) {
        // functionality
        System.out.println("User logged in with userId " + userId);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Facebook fb1 = new FacebookImpl();
        fb1.login("user1", "pass1");
    }
}
