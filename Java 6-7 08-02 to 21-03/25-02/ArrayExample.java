import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // array declaration
        int[] arr = new int[4];

        // array initializtion
        int[] arr2 = {5, 10, 20, 15, 8};

        // assigning values
        // arr[0] = 2;
        // arr[1] = 4;
        // arr[2] = 6;
        // arr[3] = 8;
        // arr[4] = 10;

        // accessing values
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("values inside array");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for-each loop (or) enhanced forloop
        for(int x : arr) {
            System.out.println(x);
        }
    }
}