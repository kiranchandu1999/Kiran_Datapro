package main;
interface MoblieInterface{
    // by default public, static and final
    int a = 5;

    // abstract
    void calling();

    // non abstract methods can't be created
    // void run(){
    //     System.out.println("running");
    // }
}

class MobileInterfaceImpl implements MoblieInterface{
    // method overridning
    public void calling(){
        System.out.println("number dailed ----> network connected");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        MoblieInterface m1 = new MobileInterfaceImpl();
        m1.calling();

        A a1 = new A();
        // System.out.println(a1.name);
    }
}
