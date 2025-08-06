import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int num1 = 0, num2 = 0, res = 0;
        System.out.println("Enter num1: ");
        input = sc.next();
        try {
            num1 = Integer.parseInt(input);
            System.out.println("Enter num2: ");
            input = sc.next();
            num2 = Integer.parseInt(input);
            res = num1 / num2;
        } 
        catch(ArithmeticException ae) {
            // System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        catch(NumberFormatException ne) {
            System.out.println(ne);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Result is: " + res);

        System.out.println("Remaing program");
    }
}