import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // take input from user
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // "abc"
        int val = 0;

        try {
            // following statement which might return exception
            val = Integer.parseInt(input);  // cannot covert to int value
        }
        catch(Exception e) {
            System.out.println(e);
        }

        int res = val / 5;

        System.out.println("result is : " + res);

        System.out.println("program end....");
    }
}