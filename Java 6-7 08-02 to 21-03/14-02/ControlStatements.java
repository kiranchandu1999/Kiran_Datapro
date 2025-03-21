class ControlStatements {
    public static void main(String[] args) {
        // if statements
        // int age = 10;

        // if(age >= 18) {
        //     System.out.println("Eligible for voting...");
        // }
        // else {
        //     System.out.println("Not eligible for voting...");
        // }


        // if else if ladder
        int day = 2;

        // if(day == 1) {
        //     System.out.println("Sunday");
        // }
        // else if(day == 2) {
        //     System.out.println("Monday");
        // }
        // else if(day == 3) {
        //     System.out.println("Tuesday");
        // }
        // else {
        //     System.out.println("Not a week day");
        // }

        // switch case
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not a week day");
        }

        // nested if statements
        // check the given number is an even number which should divisible by 7
        int num = 20;

        if(num % 2 == 0) {
            if(num % 7 == 0) {
                System.out.println("It's divisible");
            }
            else {
                System.out.println("This even number not divisible by 7");
            }
        }
        else {
            System.out.println("Not an even number");
        }

        
        String s = (day <= 7) ? "Week day" : "Not a week day";

    }
}