public class WhileLoopExample {
    public static void main(String[] args) {
        // While loop
        // Print the sum of digits in given number (ex: 456 --> 15)
        int num = 456;
        int sum = 0;
        int digit = 0;

        while(num != 0) {
            digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("Final result: " + sum);

        // Reverse the given number (ex: 1234 --> 4321)
        int num2 = 1234;
        int revNum2 = 0;
        int digit2 = 0;

        while(num2 != 0) {
            digit2 = num2%10;
            revNum2 = (revNum2 * 10) + digit2;
            num2 /= 10;
        }
        System.out.println("Reversed number: " + revNum2);


        // do while loop
        int n = 12;
        do {
            System.out.println("Number is: " + n);
            n++;
        } while(n <= 10);
    }
}
