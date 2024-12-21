interface Mobile{
    int a = 10;
    // abstract
    void calling();

    // non abstract method we can't write
    // void run(){
    //     System.out.println("running");
    // }
}

class MobileImpl implements Mobile{
    // here i dont want to implement
    public void calling(){
        System.out.println("number enetered, signal connected");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // cannot create object for interface
        Mobile m1 = new MobileImpl();
        m1.calling();
    }
}
