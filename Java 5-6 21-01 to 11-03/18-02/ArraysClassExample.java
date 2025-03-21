import java.util.Arrays;

public class ArraysClassExample {
    public static void main(String[] args) {
        int[] arr1 = {8, 15, 20, 10, 24};

        int index = Arrays.binarySearch(arr1, 10);

        System.out.println(index);

        Arrays.sort(arr1);

       for(int x: arr1) {
        System.out.println(x);
       }

       int[] arr2 = new int[10];

       Arrays.fill(arr2, -1);

       for(int x: arr2) {
        System.out.println(x);
       }

       int[] arr3 = Arrays.copyOf(arr1, 3);

    //    for(int i=0; i<arr1.length; i++) {
    //     arr3[i] = arr1[i];
    //    }

       for(int x: arr3) {
        System.out.println(x);
       }
    }
}
