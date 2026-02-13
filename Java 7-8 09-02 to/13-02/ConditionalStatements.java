class ConditionalStatements {
    public static void main(String[] args) {
        // if statement example
        // calculate the 10% bonus of an employ if he/she earning greater than or equal to 1000
        // inputs
        int salary = 1200;
        double bonus = 0;
        if(salary >= 1000) {
            bonus = salary * 0.1;
            System.out.println("Bonus is " + bonus);
        }


        // if-else statement example
        // Print whether given age is eligible for voting or not
        int age = 16;

        if(age >= 18) {
            System.out.println("Eligible for voting...");
        } else {
            System.out.println("Not eligible for voting...");
        }


        // if - else if ladder
        // Find the greatest number among given three numbers
        int n1 = 6, n2 = 8, n3 = 4;

        if(n1 > n2 && n1 > n3) {
            System.out.println("Number1 is greatest...");
        }
        else if(n2 > n1 && n2 > n3) {
            System.out.println("Number2 is greatest...");
        }
        else {
            System.out.println("Number3 is greatest...");
        }


        // switch case example
        // print correspoding weekday according to given day number like sunday is 1, monday is 2...
        int day = 4;
    }
}