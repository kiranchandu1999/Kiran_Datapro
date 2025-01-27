interface MobileInterface {
    // variables (by default public, static and final)
    int v1 = 10;

    // methods (by default public and abstract)
    void calling(String cntNum);

    void ring();
}

class MobileImplInterface implements MobileInterface {
    public void calling(String cntNum) {
        System.out.println("calling... " + cntNum);
    }

    public void ring() {
        System.out.println("ringing...");
    }
}

public class MobileInterfaceTest {
    public static void main(String[] args) {
        MobileInterface m1 = new MobileImplInterface();
        m1.ring();
        m1.calling("54123");
        System.out.println(MobileInterface.v1);
    }
}
