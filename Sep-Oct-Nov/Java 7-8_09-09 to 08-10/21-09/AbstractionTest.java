abstract class Mobile{
    int a;
    // abstract
    abstract void calling();

    // non abstract methods
    void run(){
        System.out.println("running");
    }
}

class MobileImpl extends Mobile{
    int a = 10;
    void calling(){
        System.out.println("calling");
    }
}

public class AbstractionTest {
    public static void main(String[] args){
        Mobile m1 = new MobileImpl();
        m1.calling();
        m1.run();
        System.out.println(m1.a);
    }
}