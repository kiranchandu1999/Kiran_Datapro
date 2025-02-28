class Example1 {
    // methods
    void m1() {
        System.out.println("before calling m2");
        m2();  // propagated to here
        System.out.println("after calling m2");
    }

    void m2() {
        System.out.println("before calling m3");
        m3();  // propagated to here
        System.out.println("after calling m3");
    }

    void m3() {
        // not handling the exception here
        int res = 20 / 0;  // exception raised here
        System.out.println(res);
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        Example1 obj1 = new Example1();
        try {
            obj1.m1();  // propagated to here
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
        }

        System.out.println("program end...");
    }
}