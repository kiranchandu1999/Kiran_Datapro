import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rem = 0;
        try {
            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());
            if(num1 < num2) {
                rem = num2 % num1;
            }
            else {
                rem = num1 % num2;
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Exception occured due to inavlid number string");
        }
        catch(ArithmeticException e) {
            System.out.println("Exception occured with 0");
        }
        catch(Exception e) {
            System.out.println("Exception occured");
        }

        System.out.println("Reminder is: " + rem);

        System.out.println("Program end...");
    }
}