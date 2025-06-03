import java.util.Scanner;

class MultiDimensionalArray {
    public static void main(String[] args) {
        // multi dimension array
        int[][] arr = new int[4][2];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("--------------");

        // for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<arr[i].length; j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        for(int[] x: arr) {
            for(int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}