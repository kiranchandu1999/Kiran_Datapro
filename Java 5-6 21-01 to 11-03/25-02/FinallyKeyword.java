import java.util.Scanner;

public class FinallyKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid number:");
        String input = sc.next();

        int num = 0;

        try {
            num = Integer.parseInt(input);
            // num = num / 0;
            // throwing custom exception
            throw new CustomException("this is custom exception");
            // System.out.println("Given number is : " + num);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            sc.close();
            System.out.println("resources closed");
        }

        System.out.println("Program end...");
    }
}
