package control_loops;

public class whileLoop {
    public static void main(String[] args) {
        int number = 95842;
        int sum = 0; // 2 + 4 + 8 + 5 + 9

        while(number > 0){
            int rem = number % 10;
            sum = sum + rem;
            // updatinh number
            number = number / 10;
        }

        // System.out.println(sum);

        int i = 1;

        // while(i <= 5){
        //     System.out.println("Hii");
        // }

        // do while loop
        do{
            // statements
            System.out.println("Hii");
            // i++;
        } while(i <= 5);
    }
}
