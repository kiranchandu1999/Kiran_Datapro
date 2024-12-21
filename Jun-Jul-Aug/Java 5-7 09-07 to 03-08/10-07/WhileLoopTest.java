public class WhileLoopTest {
    public static void main(String[] args) {
        // I have one number, print sum of all digits in that number
        int num = 0;

        int sum = 0;

        // 356 % 10 ---> 6
        // 356 / 10 ---> 35

        // 35 % 10 ---> 5
        // 35 / 10 ---> 3

        // 3 % 10 ---> 3
        // 3 / 10 ---> 0

        int n = num; 

        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
            System.out.println("Hii");
        }

        System.out.println(sum);
    }
}
