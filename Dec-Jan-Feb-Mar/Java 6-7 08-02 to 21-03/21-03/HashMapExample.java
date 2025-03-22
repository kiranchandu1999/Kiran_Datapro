import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // adding 
        map.put(101, "first item");
        map.put(102, "second item");
        map.put(103, "third item");
        map.putIfAbsent(103, "forth item");
        map.putIfAbsent(104, "fifth item");

        // getting
        System.out.println(map.get(102));

        System.out.println(map.getOrDefault(105, "no value"));


        // iterating
        for(int k: map.keySet()) {
            System.out.println(k + ": " + map.get(k));
        }

        for(String val: map.values()) {
            System.out.println(val);
        }


        for(Map.Entry<Integer, String> e: map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }


        if(map.containsKey(103)) {
            System.out.println(map.get(103));
        }

        // remove
        // map.remove(102);
        // map.remove(102, "item");

        System.out.println(map);

        int[] arr = {8, 5, 1, 4, 6, 5, 2, 4, 8, 5, 1};

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int x: arr) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        System.out.println(countMap);
    }
}