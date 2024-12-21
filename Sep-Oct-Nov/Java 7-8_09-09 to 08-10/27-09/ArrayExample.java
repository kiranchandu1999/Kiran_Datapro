import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // for(int val : arr){
        //     System.out.println(val);
        // }

        // int res = getDuplicateElementInArray(arr);
    }

    // static int getDuplicateElementInArray(int[] arr){
    //     // write code here
    // }
}
