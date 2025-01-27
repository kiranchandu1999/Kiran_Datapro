public class ControlStatements {
    public static void main(String[] args) {
        int age = 21;

        // if (age >= 18) {
        //     System.out.println("Eligible for vote...");
        // }
        // else {
        //     System.out.println("Not eligible for vote..");
        // }

        // more than 1 condition
        int a = 10, b = 13, c = 17;

        if(a > b && a > c) {
            System.out.println("A is bigger");
        }
        else if(b > a && b > c) {
            System.out.println("B is bigger");
        }
        else {
            System.out.println("C is bigger");
        }


        if(a > b) {
            if(a > c) {
                System.out.println("A is bigger");
            }
            else {
                System.out.println("C is bigger");
            }
        }
        else if(b > a) {
            if(b > c) {
                System.out.println("B is bigger");
            }
            else {
                System.out.println("C is bigger");
            }
        }

        // switch case
        int week = 2;

        if(week == 1) {
            System.out.println("Sunday");
        }
        else if(week == 2) {
            System.out.println("Monday");
        }
        else if(week == 3) {
            System.out.println("Tuesday");
        }
        else if(week == 4) {
            System.out.println("Wednesday");
        }
        else {
            System.out.println("No week day");
        }

        switch(week) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No week day");
        }
    }
}