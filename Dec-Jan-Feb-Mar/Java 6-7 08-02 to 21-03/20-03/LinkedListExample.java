import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListExample {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(102);
        set.add(98);
        set.add(105);
        set.add(100);


        for(int x: set) {
            System.out.println(x);
        }

        set.remove(105);

        System.out.println(set);
    }
}
