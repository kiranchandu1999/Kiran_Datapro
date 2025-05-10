import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr1 = {5, 15, 18, 2, 8, 6};

        // sorting
        Arrays.sort(arr1); // 2, 5, 6, 8, 15, 18

        // searching
        int pos = Arrays.binarySearch(arr1, 8);
        System.out.println("key found at: " + pos);

        // // copying
        int[] copy = Arrays.copyOf(arr1, arr1.length);

        // // comparing
        System.out.println(Arrays.equals(arr1, copy)); // true

        // // filling
        Arrays.fill(copy, 7);

        // // string
        String res = Arrays.toString(copy);
        System.out.println(res);

        for(int x: copy) {
            System.out.println(x);
        }
    }
}
