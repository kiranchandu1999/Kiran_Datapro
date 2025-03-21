public class ControlStatements {
    public static void main(String[] args) {
        // if else control statement example
        int age = 15;

        if(age >= 18) {
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not eligible for voting");
        }

        // if else if ladder example
        int a = 3, b = 8, c = 16;

        if(a > b && a > c) {
            System.out.println("A is bigger");
        }
        else if (b > a && b > c) {
            System.out.println("B is bigger");
        }
        else {
            System.out.println("C is bigger");
        }
    }
}
