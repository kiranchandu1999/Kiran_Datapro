public class ConditionalStatements {
    public static void main(String[] args) {
        // If statement
        // Calculate salary with bonus(10%) if they are eligible for bonus
        double salary = 1000;
        boolean bonus = false;

        if(bonus) {
            salary = salary + salary * 0.1;
        }

        System.out.println("Salary: " + salary);

        // If else statement
        // Print whether voter is eligible for voting
        int age = 15;
        
        if(age >= 18) {
            System.out.println("Eligible for voting..");
        }
        else {
            System.out.println("Not eligible for voting..");
        }

        // If else if statement
        // print greatest number among three values
        int n1 = 10, n2 = 12, n3 = 9;

        if(n1 > n2 && n1 > n3) {
            System.out.println("N1 is greatest");
        }
        else if(n2 > n1 && n2 > n3) {
            System.out.println("N2 is greatest");
        }
        else {
            System.out.println("N3 is greatest");
        }

        // try above example using nested if
        
    }
}
