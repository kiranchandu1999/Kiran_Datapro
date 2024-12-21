package OOPS;

class A {
    int a = 5;
    
    static class B {
        void run() {
            System.out.println("inner class run");
        }
    }

    B make () {
        return new B();
    }

    void run() {
        System.out.println("outer class run");
    }
}
public class NestedClassTest {
    public static void main(String[] args) {
        // A ob1 = new A();
        // A.B ob2 = ob1.make();

        // ob2.run();

        A.B obj = new A.B();

        obj.run();
    }
}
