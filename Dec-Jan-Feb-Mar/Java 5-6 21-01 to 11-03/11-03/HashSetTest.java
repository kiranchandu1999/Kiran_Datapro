import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(15);
        set1.add(10);
        System.out.println(set1.add(16));
        set1.add(8);
        System.out.println(set1.add(16));

        System.out.println(set1.remove(8));

        System.out.println(set1.contains(8));

        // iterating set elements
        for(int x: set1) {
            System.out.println(x);
        }

        Iterator<Integer> bag = set1.iterator();

        while(bag.hasNext()) {
            System.out.println(bag.next());
        }

        System.out.println(set1);
    }
}