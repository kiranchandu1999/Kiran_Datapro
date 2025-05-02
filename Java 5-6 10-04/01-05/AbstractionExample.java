abstract class Facebook {
    abstract void login();

    void hello() {
        System.out.println("saying hello..");
    }
}

class FacebookImpl extends Facebook {
    @Override
    void login() {
        System.out.println("Logged in..... ");
    }

    // restricted method
    void delete() {
        System.out.println("Deleted");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // can't create object for abstract class
        // Facebook fb1 = new Facebook();
        // fb1.login();

        Facebook fb1 = new FacebookImpl();
        fb1.login();
        fb1.hello();
        // doesn't allow methods which are not in parent
        // fb1.delete();
    }
}
