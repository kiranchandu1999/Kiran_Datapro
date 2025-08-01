class ControlStatements {
    public static void main(String[] args) {
        boolean isRaining = false;
        System.out.println("Get ready for outing..");
        // if statement -> executes statements when condition gets true
        // else -> whenever if conditions gets failed
        if(!isRaining) {
            System.out.println("Bring sunglasses");
        }
        else {
            System.out.println("Bring umbrella");
        }
        System.out.println("Enjoy the outing");


        // find out bigger number
        int n1 = 8, n2 = 15, n3 = 12;

        if(n1>n2 && n1>n3) {
            System.out.println("Number1 is greater");
        }
        else if(n2>n1 && n2>n3) {
            System.out.println("Number2 is greater");
        }
        else {
            System.out.println("Number3 is greater");
        }


        // switch statement
        int week = 2;

        if(week == 1) {
            System.out.println("First week of the month");
        }
        else if(week == 2) {
            System.out.println("Second week of the month");
        }
        else if(week == 3) {
            System.out.println("Third week of the month");
        }
        else if(week == 4) {
            System.out.println("Forth week of the month");
        }
        else {
            System.out.println("Not valid week");
        }


        switch(week) {
            case 1:
                System.out.println("First week of the month");
                break;
            case 2:
                System.out.println("Second week of the month");
                break;
            default:
                System.out.println("Not valid week");
                break;
            case 3:
                System.out.println("Third week of the month");
                break;
            case 4:
                System.out.println("Forth week of the month");
                break;
        }
    }
}