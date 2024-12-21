abstract class Mobile{
    abstract void calling();

    // non abstract method
    void run(){
        System.out.println("running");
    }
}

class MobileImpl extends Mobile{
    // here i dont want to implement
    void calling(){
        System.out.println("number enetered, signal connected");
    }
}

public class AbstractionTest {
    public static void main(String[] args){
        // cannot create object for abstract class
        Mobile m1 = new MobileImpl();
        m1.calling();
    }
}