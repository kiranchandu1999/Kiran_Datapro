import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number from 1 to 10");
        String input = sc.next();
        try {
            int num1 = Integer.parseInt(input);
            System.out.println("Enter second number from 1 to 10");
            input = sc.next();
            int num2 = Integer.parseInt(input);

            System.out.println("Result is: " + (num1/num2));
        } catch(NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        } catch(RuntimeException e) {
            // System.out.println(nfe.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("Remaining program...");

        System.out.println("Program end..");
    }
}