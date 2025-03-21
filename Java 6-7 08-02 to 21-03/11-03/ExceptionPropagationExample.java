import java.util.Scanner;

class Example1 {
    void m1() throws ClassNotFoundException {
        m2();
    }

    void m2() throws ClassNotFoundException {
        m3();
    }

    void m3() throws ClassNotFoundException {
        // int[] arr = {};
        // System.out.println(arr[0]);
        throw new ArrayIndexOutOfBoundsException();
        // throw new ClassNotFoundException();
    }
}

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Example1 e1 = new Example1();

        try {
            e1.m1();
        }
        catch(ClassNotFoundException e) {
            System.out.println(e);
        }
        finally {
            sc.close();
            System.out.println("resource closed");
        }

        System.out.println("program end..");
    }
}