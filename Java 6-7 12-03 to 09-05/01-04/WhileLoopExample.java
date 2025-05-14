public class WhileLoopExample {
    public static void main(String[] args) {
        // print even numbers 1 to 15
        int i = 1;
        while(i <= 15) {
            if(i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // sum of digits in a given number
        // ex: 532  ---> 10
        int num = 532;
        int sum = 0;
        int rem = 0;

        // rem = num % 10; // 2
        // sum = sum + rem;
        // num = num / 10; // 53

        // rem = num % 10; // 3
        // sum = sum + rem;
        // num = num / 10; // 5

        // rem = num % 10; // 5
        // sum = sum + rem;
        // num = num / 10;  // 0

        while(num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
