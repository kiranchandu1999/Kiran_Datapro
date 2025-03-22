public class WhileLoopTest {
    public static void main(String[] args) {
        // while loop
        int i = 1;
        while(i <= 10) {
            System.out.println("Datapro");
            i++;
        }

        // Sum of digits in given number
        int num = 65896;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            sum += rem;
            // updation
            num /= 10;
        }

        System.out.println(sum);
    }
}
