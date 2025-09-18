import java.util.Scanner;

class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            int n1 = Integer.parseInt(input); // NumberFormatException
            input = sc.next();
            int n2 = Integer.parseInt(input);
            System.out.println(n1/n2); // ArithmeticException
            System.out.println("n1 divided by n2 successfully..");
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
        }
        catch(NumberFormatException ne) {
            ne.printStackTrace();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("remaing program...");
    }
}