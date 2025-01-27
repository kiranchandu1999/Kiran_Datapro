abstract class Mobile {
    // variables

    // methods
    abstract void calling(String cntNum);

    void ring() {
        System.out.println("ringing...");
    }
}

class MobileImpl extends Mobile {
    void calling(String cntNum) {
        System.out.println("calling... " + cntNum);
    }
}

public class MobileExample {
    public static void main(String[] args) {
        Mobile m1 = new MobileImpl();
        m1.ring();
        m1.calling("12345");
    }
}