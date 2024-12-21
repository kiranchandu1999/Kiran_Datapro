package collection;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // adding
        map.put(101, "student1");
        map.put(102, "student2");
        map.put(103, "student3");
        map.put(104, "student4");

        // to get data
        String val = map.get(104);

        // remove
        // map.remove(101);
        // System.out.println(map);
        // System.out.println(val);

        // to get the keys
        // map.keySet();
        // map.values();
        map.entrySet();

        for(Map.Entry<Integer, String> a : map.entrySet()){
            System.out.println(a);
        }
    }
}
