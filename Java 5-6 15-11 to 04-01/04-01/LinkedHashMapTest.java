import java.util.*;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(202, "valu1");
        map1.put(203, "value3");
        map1.put(201, "value3");

        System.out.println(map1);
    }
}
