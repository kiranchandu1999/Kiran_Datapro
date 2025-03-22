import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 20, 0};

        // accessing out of bound index element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();

        System.out.println("Enter the index to get divisor");
        int index = sc.nextInt();

        try{
            int divisor = arr[index];

            int res = dividend / divisor;
    
            System.out.println("result is: " + res);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are exceeded the index number");
        }
        catch(ArithmeticException e) {
            System.out.println("You are dividing the number with zero");
        }
        catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("program end...");
    }
}