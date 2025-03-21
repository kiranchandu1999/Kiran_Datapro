public class WhileLoopTest {
    public static void main(String[] args) {
        // while loop
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // sum of digits 145 ----> 1+4+5 = 10
        int num = 145;
        int sum = 0;
        int rem = 0;

        // rem = num % 10; // here num = 145, rem = 5
        // sum = sum + rem;
        // num = num / 10; // here num becomes 14

        // rem = num % 10; // 4
        // sum = sum + rem;
        // num = num / 10; // here num becomes 1

        // rem = num % 10;
        // sum = sum + rem;
        // num = num / 10; // here num becomes 0

        // System.out.println(sum);

        // using while loop

        while(num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
    }
}
