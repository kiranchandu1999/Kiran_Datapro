package Basic;
public class Operators {
    public static void main(String[] args) {
        // variable declaration
        // dataType variableName assignmentOperator value
        // int number1 = 5;
        // int number2 = 6;

        int sum = 5 + 6;

        int product = 5 * 6;

        String str1 = "kiran";  

        
        System.out.println(sum);

        System.out.println(product);
        // This is the sum 11
        System.out.println("This is the sum " + sum);

        System.out.println(11 % 3);

        // sum = sum + 1;
        sum += 1;
        System.out.println(sum);

        System.out.println(sum == 24 || sum == 12 );

        // sum = 12
        int a = 5;
        sum = sum + a--;
        System.out.println(sum);
        System.out.println(a);
    }
}
