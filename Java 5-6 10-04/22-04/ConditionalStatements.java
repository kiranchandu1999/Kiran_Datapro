class ConditionalStatements {
    public static void main(String[] args) {
        int num = 32;
        // if-else statement
        if(num%2 == 0) {
            System.out.println("It's an Even number");
        }
        else {
            System.out.println("It's an Odd number");
        }

        // if else if ladder
        // find month category name from no of days in a month
        int days = 28;

        if(days == 31) {
            System.out.println("Category 1: Jan, Mar, May, Jul, Aug, Oct, Dec");
        }
        else if(days == 30) {
            System.out.println("Category 2: Apr, Jun, Sept, Nov");
        }
        else if(days == 28) {
            System.out.println("Category 3: Feb");
        }
        else {
            System.out.println("Not a valid month");
        }
    }
}