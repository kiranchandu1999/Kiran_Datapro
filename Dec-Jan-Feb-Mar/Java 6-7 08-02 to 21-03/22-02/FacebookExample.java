abstract class Facebook {
    abstract boolean login(String id, String pwd);

    void type() {
        System.out.println("Facebook class object");
    }
}

class FacebookImpl extends Facebook {
    boolean login(String id, String pwd) {
        if(id.equals(pwd)) {
            return true;
        } else {
            return false;
        }
    }
}

public class FacebookExample {
    public static void main(String[] args) {
        // object
        // Facebook fb1 = new Facebook();
        // boolean res = fb1.login("abc", "xyz");

        Facebook fb2 = new FacebookImpl();
        boolean res = fb2.login("abc", "abc");

        System.out.println(res);
    }
}
