import java.util.Arrays;

public class ArraysClassTest {
    public static void main(String[] args) {
        int[] arr1 = {15, 25, 10, 8, 18};
        int n = arr1.length;

        int[] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr2[i] = arr1[i];
        }

        // System.out.println(arr1[0] + " " + arr2[0]);

        System.out.println(Arrays.binarySearch(arr1, 25));

        Arrays.sort(arr1);

        System.out.println(Arrays.binarySearch(arr1, 25));

        int[] arr3 = new int[5];
        Arrays.fill(arr3, Integer.MAX_VALUE);


        for(int x: arr3) {
            System.out.println(x);
        }

        int[] arr4 = Arrays.copyOf(arr3, 3);
    }
}
