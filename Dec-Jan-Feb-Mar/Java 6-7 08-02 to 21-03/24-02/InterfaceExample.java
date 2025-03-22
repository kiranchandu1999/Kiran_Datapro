interface Mobile {
    String name = "name";

    void calling();
}

class MobileImpl implements Mobile {
    @Override
    public void calling() {
        System.out.println("calling to someone");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // object
        Mobile m1 = new MobileImpl();
        m1.calling();
    }
}