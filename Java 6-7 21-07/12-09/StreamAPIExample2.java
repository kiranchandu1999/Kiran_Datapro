import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

class StreamAPIExample2 {
    public static void main(String[] args) {
        List<List<Integer>> nums = Arrays.asList(
                                Arrays.asList(1, 2, 3), 
                                Arrays.asList(4, 5, 6, 8), 
                                Arrays.asList(7, 8, 9));

        int[][] matrix = new int[nums.size()][];
        int idx = 0;
        for(List<Integer> l: nums) {
            int[] arr = new int[l.size()];
            for(int i=0; i<l.size(); i++) {
                arr[i] = l.get(i);
            }
            matrix[idx++] = arr;
        }

        for(int[] m: matrix) {
            for(int x: m) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // calculate sum of these nums
        // Stream<Integer> stream = nums.stream().flatMap(l -> l.stream());
        int sum = nums.stream().flatMap(l -> l.stream()).distinct().mapToInt(x -> x.intValue()).sum();
        double avg = nums.stream().flatMap(l -> l.stream()).mapToDouble(x -> x.doubleValue()).average().orElse(0.0);
        System.out.println("Sum of nums: " + sum);
        System.out.println("Average of nums: " + avg);


        int[] values = {13, 6, 9, 5, 11, 21, 10};

        int maxi = Arrays.stream(values).reduce((v1, v2) -> v1>v2 ? v1:v2).getAsInt();
        System.out.println("Max value: " + maxi);

        // check all elements in values array are > 8
        boolean ans = Arrays.stream(values).allMatch(x -> x>8);
        System.out.println(ans); // false

        boolean ans2 = Arrays.stream(values).anyMatch(x -> x>20);
        System.out.println(ans2); // true
    }
}