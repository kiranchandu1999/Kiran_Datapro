import java.util.Scanner;

public class MultiDimenArrayTest {
    public static void main(String[] args) {
        // 2D array
        int[][] arr1 = new int[4][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced forloop (or) forEach loop
        // int[] oneDimArr1 = new int[] {1, 2, 3};
        // for(int x : oneDimArr1) {
        //     System.out.println(x);
        // }

        for(int[] x : arr1) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}