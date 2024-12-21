package main;

abstract class Mobile{
    // abstract
    abstract void calling();

    // non abstract methods
    void run(){
        System.out.println("running");
    }
}

class MobileImpl extends Mobile{
    void calling(){
        System.out.println("calling");
    }
}

public class AbstractionTest {
    public static void main(String[] args){
        Mobile m1 = new MobileImpl();
        m1.calling();
        m1.run();

        A a3 = new A();
        a3.id = 101;
    }
}