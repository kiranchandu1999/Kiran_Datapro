abstract class FaceBook {
    int a;
    abstract void login(String id, String pwd);

    void print() {
        System.out.println("Hii");
    }
}

class FacebookImpl extends FaceBook {
    @Override
    void login(String id, String pwd) {
        System.out.println("Login successful!!");
    }

    void hello() {
        System.out.println("hello");
    }

    void sum(long a) {

    }
}


class AbstractionRepeat {
    public static void main(String[] args) {
        // FaceBook fb1 = new FaceBook();
        // fb1.print();
        // fb1.login("user1", "1234");
        FaceBook fb1 = new FacebookImpl();
        fb1.login("user1", "1234");
        fb1.print();
        FacebookImpl child = (FacebookImpl) fb1;
        child.hello();

        child.sum(10);

    }
}