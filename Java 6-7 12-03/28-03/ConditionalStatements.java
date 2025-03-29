public class ConditionalStatements {
    public static void main(String[] args) {
        // if statement
        int num1 = 25;
        // int num2 = 32;

        if(num1 % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        System.out.println("If statement end..");

        // if else if statements 
        int monthDays = 30;

        if(monthDays == 31) {
            System.out.println("Jan, Mar, May, Jul, Aug, Oct, Dec");
        }
        else if(monthDays == 30) {
            System.out.println("Apr, Jun, Sept, Nov");
        }
        else if(monthDays == 28) {
            System.out.println("Feb");
        }
        else {
            System.out.println("Not a valid month");
        }
    }
}
