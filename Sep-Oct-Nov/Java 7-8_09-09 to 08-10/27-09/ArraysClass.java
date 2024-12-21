import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 24, 12};

        int[] arr2 = {5, 8, 15, 24, 12};

        // for(int i=0; i<=arr.length-1; i++){
        //     arr[i] = (int)(Math.random()*100);
        // }

        System.out.println(Arrays.binarySearch(arr, 24));

        System.out.println(Arrays.equals(arr, arr2));

        Arrays.fill(arr2, 5);

        // for(int e : arr2){
        //     System.out.println(e);
        // }

        int[] arr3 = Arrays.copyOf(arr, arr.length);
        // for(int e: arr3){
        //     System.out.println(e);
        // }

        Arrays.sort(arr);
        for(int e: arr){
            System.out.println(e);
        }
    }
}
