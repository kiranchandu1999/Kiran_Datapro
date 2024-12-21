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
    int a = 5;
    // method overridning
    void calling(){
        System.out.println("number dailed ----> network connected");
    }    
}

public class AbstractionTest {
    public static void main(String[] args){
        Mobile m1 = new MobileImpl();
        m1.calling();

        A a1 = new A();
        System.out.println(a1.name);
    }
}