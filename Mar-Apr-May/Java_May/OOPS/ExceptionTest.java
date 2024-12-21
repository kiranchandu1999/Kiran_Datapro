package OOPS;

class ExampleClass {
    int[] arr = {1, 2, 3};
    int divide(int a, int b){
        // Scanner sc = new Scanner(System.in);
        int res = 0;
        try{
            res = a / b;
            res = res + arr[3];
        } catch (NullPointerException e) {
            System.out.println("index out of bound!!!");
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("finally");
        }
        return res;
    }
}
public class ExceptionTest {
    public static void main(String[] args) {
        ExampleClass e1 = new ExampleClass();

        int val = e1.divide(20, 10);
        System.out.println(val);
        System.out.println("output");
    }
}
