import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        // using maps in java we can store data in the form key and value pairs
        HashMap<Integer, String> map1 = new HashMap<>();

        // adding elements
        map1.put(101, "item1");
        map1.put(103, "item2");
        map1.put(102, "item3");
        map1.put(103, "item5"); // item2 will be overriden by item5 becoz 103 key is already exists

        // getting elements
        // System.out.println(map1.get(102));

        // iterating values using keySet from map
        for(int key: map1.keySet()) {
            System.out.println(map1.get(key));
        }

        // iterating elements using entrySet
        for(Map.Entry<Integer, String> entry: map1.entrySet()) {
            System.out.println(entry);
        }

        // getting only values using values() method
        System.out.println(map1.values());

        // removing
        System.out.println(map1.remove(103));

        System.out.println(map1);
    }
}