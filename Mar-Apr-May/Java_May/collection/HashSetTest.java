package collection;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(3);
        set.add(8);
        set.add(2);
        set.add(3);
        set.add(5);

        System.out.println(set);
    }
}
