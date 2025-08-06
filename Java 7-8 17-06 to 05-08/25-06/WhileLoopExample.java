public class WhileLoopExample {
    public static void main(String[] args) {
        // while loop
        // print sum of digits in a number
        int num = 2385; // 18
        int sum = 0;
        int rem = 0;
        
        // rem = num % 10; // 5
        // sum = sum + rem;
        // num = num / 10; // 238

        // rem = num % 10; // 8
        // sum = sum + rem;
        // num = num / 10; // 23

        // rem = num % 10; // 3
        // sum = sum + rem;
        // num = num / 10; // 2

        // rem = num % 10; // 2
        // sum = sum + rem;
        // num = num / 10; // 0

        while(num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
