class IfElseConditionalStatements {
    public static void main(String[] args) {
        // if statement
        // calculate total income including bonus
        // int salary = 20000;
        // double bonus = 3;
        // double totalIncome = salary;
        // if(bonus > 0) {
        //     totalIncome = salary * bonus;
        // }

        // System.out.println("Total income: " + totalIncome);

        // if else statement
        // just print voter eligibilty based on age
        // int age = 18;

        // if(age >= 18) {
        //     System.out.println("Eligible for voting...");
        // }
        // else {
        //     System.out.println("Not eligible for voting...");
        // }


        // print weekday based on weekday number
        int weekDay = 3;

        if(weekDay == 1) {
            System.out.println("Sunday");
        }
        else if(weekDay == 2) {
            System.out.println("Monday");
        }
        else if(weekDay == 3) {
            System.out.println("Tuesday");
        }
        else if(weekDay >= 4 && weekDay <= 7) {
            System.out.println("Remaining week days..");
        }
        else {
            System.out.println("Not a valid week day");
        }
    }
}