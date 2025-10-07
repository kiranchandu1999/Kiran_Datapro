import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        String input = sc.next(); // "20"
        int n1 = Integer.parseInt(input);
        System.out.println("Enter next number:");
        input = sc.next(); // "8"
        int n2 = Integer.parseInt(input);

        try {
            System.out.println("Division: " + (n1/n2));
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
        }

        System.out.println("Remaining program..");
        System.out.println("Program end...");
    }
}
