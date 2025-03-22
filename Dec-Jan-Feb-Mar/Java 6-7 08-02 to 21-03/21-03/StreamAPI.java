import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 8, 9));

        Stream<Integer> stream = list.stream().map((n)-> {return n+2;}).filter(n -> n%2 == 0);

        // List<Integer> res1 = stream.collect(Collectors.toList());

        // System.out.println(res1);


        // stream.forEach(n -> System.out.println("Value is: " + n));

        int sum = stream.reduce(10, (n1, n2) -> {return n1 + n2;});

        System.out.println(sum);


        List<List<Integer>> list1 = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> finalList = list1.stream().flatMap(li -> li.stream()).collect(Collectors.toList());

        System.out.println(finalList);

    }
}
