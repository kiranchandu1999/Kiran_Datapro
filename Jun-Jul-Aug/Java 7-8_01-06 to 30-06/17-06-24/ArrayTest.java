import java.util.Scanner;

public class ArrayTest{
    public static void main(String[] args){
        // array declaration
        int[] arr1 = new int[5];

        Scanner sc = new Scanner(System.in);

        // declaration + initialization
        int[] arr2 = {2, 3, 4, 5, 6};

        // data insertion
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        // insertion through loops
        for(int i=0; i<=4; i++){
            arr1[i] = sc.nextInt();
        }

        // reading data
        // System.out.println(arr1[2]);
        // for(int i=0; i<=4; i++){
        //     System.out.println(arr1[i]);
        // }

        // enhanced for loop / for each loop
        for(int val : arr1){
            System.out.println(val);
        }
    }
}