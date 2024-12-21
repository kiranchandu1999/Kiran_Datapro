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
    public void calling(){
        System.out.println("calling");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        MoblieInterface m1 = new MobileInterfaceImpl();
        m1.calling();

        // accessing static variable in interface
        System.out.println(MoblieInterface.a);
    }
}
