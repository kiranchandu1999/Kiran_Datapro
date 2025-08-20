class ConditionalStatements {
    public static void main(String[] args) {
        // if statement --> when we check 1 condition
        // problem statement: check whether the person is eligible for voting or not
        int age = 22;
        if(age >= 18) {
            System.out.println("Eligible for voting...");
        }

        // if else statement --> 2 outcomes based on 1 condition
        // problem: Print Even or Odd based on given number
        int number = 18;

        if(number % 2 != 0) {
            System.out.println("Given number is Odd..");
        }
        else {
            System.out.println("Given number is Even...");
        }


        // if else if: when there are multiple conditions to check
        // problem: Calculate grade based on given marks
        // { 91-100(A) 81-90(B) 71-80(C) 51-70(D) lessthan 50(E)}
        int marks = 69;

        if(marks > 90) {
            System.out.println("Grade-A");
        }
        else if(marks > 80) {
            System.out.println("Grade-B");
        }
        else if(marks > 70) {
            System.out.println("Grade-C");
        }
        else if(marks > 50) {
            System.out.println("Grade-D");
        }
        else {
            System.out.println("Grade-E");
        }


        // switch statement: similar to if else if
        // problem: Print week name based on week number
        int weekDay = 5;

        if(weekDay == 1) {
            System.out.println("Sunday");
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
        else {
            System.out.println("Saturday");
        }


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
            default:
                System.out.println("Saturday");
        }


        // Nested if statement
        // problem: Find the given number is positive, negetive or zero,
        // if positive find whether it is greater than 100 or not
        int value = 85;

        if(value >= 0) {
            // check it is equal to zero or not
            if(value == 0) {
                System.out.println("Given value is positive and zero");
            }
            else if(value > 100) {
                System.out.println("It is positive and greaterthan 100");
            }
            else {
                System.out.println("It is positive and lessthan 100");
            }
        }
        else {
            System.out.println("Given value is negative");
        }
    }
}