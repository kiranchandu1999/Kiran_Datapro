public class WhileLoopExample {
    public static void main(String[] args) {
        // while loop
        int i = 1;
        while(i <= 10) {
            // loop body
            System.out.println(i);
            // updation
            i++;
        }

        // sum of the digits in a given number
        int num = 5896;
        int sum = 0;
        int rem = 0;

        // rem = num % 10;
        // sum = sum + rem;
        // num = num / 10;
        // // 589
        // rem = num % 10;
        // sum =  sum + rem;
        // num = num / 10;
        // // 58
        // rem = num % 10;
        // sum =  sum + rem;
        // num = num / 10;
        // // 5
        // rem = num % 10;
        // sum =  sum + rem;
        // num = num / 10;
        // // 0

        while(num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println(sum);

        int j = 1;
        while(j <= 10) {
            if(j == 5) {
                continue;
            }
            System.out.println(j);
        }
    }
}
