import java.util.Arrays;

public class ArraysClassTest {
    public static void main(String[] args) {
        // Arrays methods

        int[] arr = {12, 1, 3, 18, 11, 14, 21};
        // Arrays.sort(arr);

        int[] arr2 = Arrays.copyOf(arr, 3);

        Arrays.fill(arr, 5);

        for(int a : arr2) {
            System.out.println(a);
        }

        System.out.println(Arrays.binarySearch(arr, 16));

    }
}
