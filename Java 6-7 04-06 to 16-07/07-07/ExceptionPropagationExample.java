import java.util.Scanner;

class ExceptionPropagationExample {
    void m1() throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("m1() execution started..");
        // throwing unchecked exeception
        try {
            int val = 100/0;
            // throw new ArithmeticException();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally statement..");
            sc.close();
            System.out.println("Scanner resource closed...");
        }
        System.out.println("m1() execution ended..");

        // checked exception throwing
        System.out.println("m1() checked exception started..");

        // try {
        //     System.out.println(Class.forName("java.lang.String"));
        // } catch(ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
        System.out.println(Class.forName("java.lang.String"));
    }

    void m2() {
        System.out.println("m2() started");
        try {
            m1();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("m2() ended..");
    }

    void m3() {
        System.out.println("m3() started");
        m2();
        System.out.println("m3() ended..");
    }

    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();

        obj.m3();
        // try {
        //     obj.m3();
        // } catch(Exception e) {
        //     e.printStackTrace();
        // }

        System.out.println("Remaining program..");

        System.out.println("Program ending...");
    }
}