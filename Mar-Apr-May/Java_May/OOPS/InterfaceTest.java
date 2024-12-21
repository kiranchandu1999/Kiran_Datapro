package OOPS;

interface Interface1 {
    int a = 5;
    void run();

    static void m1 () {
        System.out.println("implement");
    }
}

interface Interface2 extends Interface1{
    void run2();
}

class InterfaceChild1 implements Interface2 {
    public void run () {
        System.out.println("running");
    }
    public void run2 () {
        System.out.println("running");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Interface1 ob1 = new InterfaceChild1();
        ob1.run();
    }
}
