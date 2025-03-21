import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2-D array
        int[][] arr = new int[4][3];

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // values assign
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("moving to next index in outer array");
        }

        // accessing values inside array
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("printing values using for each loop:");
        // using forEach loop
        for(int[] x : arr) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}