import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // random value
        int random = (int) Math.round(Math.random() * 10);
        System.out.println("Random number: " + random);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        int guess = sc.nextInt();

        while(guess != random) {
            System.out.println("Please try agian!!!");
            guess = sc.nextInt();
        }

        System.out.println("You won the game!!!");
    }
}
