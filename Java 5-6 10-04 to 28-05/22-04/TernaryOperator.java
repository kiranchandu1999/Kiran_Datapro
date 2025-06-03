public class TernaryOperator {
    public static void main(String[] args) {
        // find maximum of below numbers
        int a = 10, b = 18;
        String result = "";
        // using if else
        if(a > b) {
            result = "a is maximum";
        }
        else {
            result = "b is maximum";
        }

        System.out.println(result);

        // Ternary operator
        // (condition) ? true statement : false statement;
        a = 18;
        b = 10;
        result = (a > b) ? "a is maximum" : "b is maximum";

        System.out.println(result);
    }
}
