import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        
        list.stream().map(n -> n*n).filter((n) -> {return n%2 == 0;}).forEach(x -> System.out.println(x));

        // List<Integer> res1 = stream.collect(Collectors.toList());

        // System.out.println(res1);


        // stream.forEach(n -> System.out.println("Value is: " + n));

        List<Integer> marks = Arrays.asList(80, 50, 95, 75, 60, 88);

        int total = marks.stream().reduce((n1, n2) -> {return n1 + n2;}).get();

        System.out.println("Total marks is: " + total);


        List<List<Integer>> list1 = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        // {1,2,3,4,5,6,7,8,9}

        List<Integer> finalList = list1.stream().flatMap(li -> li.stream()).collect(Collectors.toList());

        System.out.println(finalList);

        // sort the below arraylist
        List<Integer> al = Arrays.asList(8, 5, 10, 2, 6, 5, 12, 6);

        al.stream().distinct().sorted().forEach(x -> System.out.println(x));


        // anyMatch() and allMatch() on marks list
        System.out.println(marks.stream().anyMatch(m -> m > 90));

        System.out.println(marks.stream().allMatch(m -> m > 90));

    }
}
