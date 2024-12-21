import java.util.Scanner;

public class ArrayExample{
    // method which takes array as input and add all elements and return
    static int add(int[] a){
        int sum = 0;
        for(int i=0; i<=a.length-1; i++){
            sum = sum + a[i];
        }

        return sum;
    }

    public static void main(String[] args){
        // array declaration
        int[] arr1 = new int[5];

        Scanner sc = new Scanner(System.in);

        // to get array size;
        int len = arr1.length;

        // insert 8, 10, 5, 12, 7
        // manually
        arr1[0] = 8;
        arr1[1] = 10;
        arr1[2] = 5;
        arr1[3] = 12;
        arr1[4] = 7;

        // through looping
        for(int i=0; i<=len-1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Array filled...");

        System.out.println(add(arr1));

        for(int i=0; i<=len-1; i++){
            System.out.println(arr1[i]);
        }

    }
}