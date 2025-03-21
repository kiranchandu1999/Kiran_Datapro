class Example2 {
    void m1() throws ClassNotFoundException {
        m2();
    }

    void m2() throws ClassNotFoundException {
        m3();
    }

    void m3() throws ClassNotFoundException {
        // try {
        //     throw new ClassNotFoundException();
        // }
        // catch(Exception e) {
        //     System.out.println(e);
        // }
        // returning checked exception from this method
        throw new ClassNotFoundException();
    }
}

public class CheckedExceptionPropagation {
    public static void main(String[] args) {
        Example2 e1 = new Example2();
        try {
            e1.m1();
        }
        catch(ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("program end...");
    }
}
