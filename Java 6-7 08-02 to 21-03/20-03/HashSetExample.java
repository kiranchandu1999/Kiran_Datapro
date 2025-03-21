import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // add
        set.add(5);
        set.add(10);
        set.add(20);
        set.add(18);

        // get
        for(int x: set) {
            System.out.println(x);
        }

        // remove
        set.remove(20);

        System.out.println(set);
    }
}
