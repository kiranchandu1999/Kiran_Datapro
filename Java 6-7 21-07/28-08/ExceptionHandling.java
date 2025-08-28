import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        String input = sc.next();
        int num1 = 0, num2 = 0, res = 0;
        // int[] arr = {5, 3, 2};
        // System.out.println(arr[5]);
        try {
            num1 = Integer.parseInt(input);
            System.out.println("Enter second number:");
            input = sc.next();
            num2 = Integer.parseInt(input);
            res = num1 / num2;
        }
        catch(NumberFormatException ne) {
            ne.printStackTrace();
        }
        catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        catch(RuntimeException re) {
            
        }
        catch(Exception ne) {
            ne.printStackTrace();
        }
        System.out.println("Result: " + res);

        System.out.println("Remaining program...");
    }
}