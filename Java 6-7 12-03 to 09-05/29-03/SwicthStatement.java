import java.util.Scanner;

public class SwicthStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int monthDays = sc.nextInt();
        // int monthDays = 27;
        // String ch = "Hi";

        switch(monthDays) {
            case 30:
                System.out.println("30 days months...");
                break;
            case 31:
                System.out.println("31 days months..");
                break;
            case 28:
                System.out.println("28 days month..");
                break;
            default:
                System.out.println("Not a valid month..");
        }
    }
}
