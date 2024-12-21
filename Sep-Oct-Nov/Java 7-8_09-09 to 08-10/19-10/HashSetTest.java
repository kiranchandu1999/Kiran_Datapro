import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(8);
        set.add(2);
        set.add(3);
        set.add(5);

        set.remove(3);

        System.out.println(set);
    }
}
