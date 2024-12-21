package pack1;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // array declaration
        int[] arr1 = new int[5];

        // array declare and initialize
        int[] arr2 = new int[] {10, 5, 15, 20};
        // or
        // int[] arr3 = {10, 5, 15, 20};

        // values assign
        arr1[2] = 15;
        arr1[1] = 10;
        arr1[0] = 5;
        arr1[3] = 10;
        arr1[4] = 8;

        // user input
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=arr1.length-1; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println(arr1[2]);
    }
}

