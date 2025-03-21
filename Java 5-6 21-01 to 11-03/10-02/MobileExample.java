abstract class Mobile {
    // variables
    
    // methods
    abstract void call(String phNum);

    void ring() {
        System.out.println("ringing...");
    }
}

class MobileImpl extends Mobile {
    void call(String phNum) {
        System.out.println("calling...");
    }
}

public class MobileExample {
    public static void main(String[] args) {
        Mobile m1 = new MobileImpl();
        m1.call("98656");
    }
}