import java.util.Scanner;

public class MarksManagementSystem {
    static void printArray(int[] a) {
        for(int i=0; i<=a.length-1; i++) {
            System.out.println("Value at " + i + " index: " + a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array declaration
        int[] arr = new int[6];
        // array initialization
        // int[] arr2 = {5, 3, 8, 4, 6, 10};

        // assigning values
        System.out.println("Enter values:");
        for(int i=0; i<=arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("--------------");

        printArray(arr);
    }
}