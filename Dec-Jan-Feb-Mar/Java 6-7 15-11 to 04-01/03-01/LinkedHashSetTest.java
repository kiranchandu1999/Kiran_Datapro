import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();

        set1.add("item1");
        set1.add("item3");
        set1.add("item4");
        set1.add("item2");

        // iterating set elements
        Iterator<String> bag = set1.iterator();

        while(bag.hasNext()) {
            System.out.println(bag.next());
        }

        System.out.println(set1);
    }
}
