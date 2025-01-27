import java.util.Scanner;

public class MathClassTest {
    public static void main(String[] args) {
        // Math class import and methods
        int rad = 5;

        System.out.println(Math.PI * rad * rad);

        System.out.println(Math.abs(-25));

        System.out.println(Math.sqrt(16));

        System.out.println(Math.round(Math.pow(2, 3)));

        System.out.println(Math.ceil(3.53) + " " + Math.floor(3.53));

        System.out.println(Math.random());

        // Scanner sc = new Scanner(System.in);
        // int x = (int) Math.round(Math.random() * 100);
        // System.out.println("random value: " + x);
        // int val = sc.nextInt();

        // while(val != x) {
        //     System.out.println("Wrong, try again...");
        //     val = sc.nextInt();
        // }

        // System.out.println("Yes, Won the game..");

        int[] arr = new int[] {-5, -18, -12, -30, -15};
        int maxi = Integer.MIN_VALUE;
        for(int a : arr) {
            maxi = Math.max(maxi, a);
        }

        System.out.println("max number: " +  maxi);
    }
}