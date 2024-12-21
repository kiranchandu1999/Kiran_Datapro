import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        // adding
        map.put(101, "student1");
        map.put(102, "student2");
        map.put(103, "student3");
        map.put(104, "student4");

        // to get data
        String val = map.get(103);

        // remove
        // map.remove(101);
        System.out.println(map);
        System.out.println(val);

        // to get the keys
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(Integer k : map.keySet()) {
            System.out.println(k + " = " + map.get(k));
        }
    }
}
