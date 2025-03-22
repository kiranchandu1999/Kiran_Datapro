class ControlStatements {
    public static void main(String[] args) {
        // if statement
        int age = 15;

        // if(age >= 18) {
        //     System.out.println("Eligible for voting...");
        // }
        
        // if else statement
        if(age >= 18) {
            System.out.println("Eligible for voting...");
        }
        else {
            System.out.println("Not eligible for voting...");
        }


        // if else if ladder
        int weekDay = 5;

        if(weekDay == 1) {

        }


        else if(weekDay == 2) {
            System.out.println("Monday");
        }
        else if(weekDay == 3) {
            System.out.println("Tuesday");
        }
        else if(weekDay == 4) {
            System.out.println("Wednesday");
        }
        else if(weekDay == 5) {
            System.out.println("Thursday");
        }
        else if(weekDay == 6) {
            System.out.println("Friday");
        }
        else if(weekDay == 7) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("No week day...");
        }
        

        // switch statement
        switch(weekDay) {
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
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No week day");
        }
    }
}