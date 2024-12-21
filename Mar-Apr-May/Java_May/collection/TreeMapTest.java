package collection;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer, String> tm = new TreeMap<>();

        tm.put(104, "student4");
        tm.put(102, "student2");
        tm.put(110, "student10");
        tm.put(108, "student8");

        System.out.println(tm);
    }
}
