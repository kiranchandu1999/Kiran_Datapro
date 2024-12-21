package collection;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(12);
        ts.add(8);
        ts.add(4);
        ts.add(10);
        ts.add(5);

        ts.remove(10);

        for(int a : ts){
            System.out.println(a);
        }

        System.out.println(ts);
    }
}
