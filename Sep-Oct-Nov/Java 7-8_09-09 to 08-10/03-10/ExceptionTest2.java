import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[1]);

            num = 100 / num;
        }
        catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array out of bound exception thrown");
            System.out.println(ae);
        }
        catch(ArithmeticException ae) {
            System.out.println("Arithmetic exception thrown");
            System.out.println(ae);
        }
        catch(RuntimeException re) {
            System.out.println("Runtime exception thrown");
            System.out.println(re);
        }

        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        
        System.out.println("program ending...");

    }
}