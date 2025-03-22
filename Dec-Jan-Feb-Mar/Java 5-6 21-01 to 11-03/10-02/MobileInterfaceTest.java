interface MobileInterface {
    // variables (by default public, static and final)
    int a = 5;

    // methods (by default public and abstract)
    void call(String cntNum);

    void ring();
}

class MobileInterfaceImpl implements MobileInterface {
    public void call(String cntNum) {
        System.out.println("calling...");
    }

    public void ring() {
        System.out.println("ringing...");
    }
}

public class MobileInterfaceTest {
    public static void main(String[] args) {
        MobileInterface m1 = new MobileInterfaceImpl();
        m1.call("8547");
        System.out.println(MobileInterface.a);

        A obj1 = new A();
        obj1.num2 = 30;
        System.out.println(obj1.num2);
    }
}
