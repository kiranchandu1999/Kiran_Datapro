package OOPS;

import java.util.Scanner;

public class Main {
    static int addition (int num1, int num2){
        int sum = num1 + num2;

        return sum;
    }

    static int multiply (int num1, int num2){
        int product = num1 * num2;

        return product;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int result = addition(a, b);

        // int result = multiply(a, b);
        // System.out.println(result);

        Bank b1 = new Bank();
        System.out.println(b1.amount);
    }
}
