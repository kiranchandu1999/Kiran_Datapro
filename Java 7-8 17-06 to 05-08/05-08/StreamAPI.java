import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // without stream API
        List<Integer> marks = new ArrayList<>(Arrays.asList(95, 80, 72, 92, 65, 96));
        List<Integer> above75 = new ArrayList<>();
        // for(int m: marks) {
        //     if(m > 75) {
        //         above75.add(m);
        //     }
        // }

        // using stream API
        above75 = marks.stream().filter((n)-> {return n>75;}).filter(n->n%2==0).toList();

        for(int x: above75) {
            System.out.print(x + " ");
        }

        // Arrays into stream
        int[] arr = {5, 8, 13, 2, 6};

        Arrays.stream(arr).forEach(n -> System.out.println(n));

        Arrays.stream(arr).map(n -> n*3).forEach(x -> System.out.println(x));
        

        // flatMap() used for nested lists
        Integer[][] matrix = {
            {6, 10, 3},
            {4, 5, 8},
            {1, 12, 9}
        };

        Arrays.stream(matrix).flatMap(x -> Arrays.stream(x)).sorted().distinct().forEach(n -> System.out.println(n));


        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        int sum = Arrays.stream(primes).reduce((a, b) -> {return a+b;}).getAsInt();
        System.out.println(sum);

        boolean r1 = Arrays.stream(primes).anyMatch(n -> n>15);
        boolean r2 = Arrays.stream(primes).allMatch(n -> n>15);
        System.out.println(r1);
        System.out.println(r2);
    }
}
