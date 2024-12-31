
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<String>();

        // adding elements
        ll1.add("elem1");
        ll1.add("elem3");
        ll1.add(1, "elem2");
        ll1.add("elem5");

        // updating
        ll1.set(2, "elem4");

        // removing
        ll1.remove("elem2");

        // for(int i=0; i<ll1.size(); i++) {
        //     System.out.println(ll1.get(i));
        // }

        ll1.addFirst("first1");

        ll1.addLast("last1");

        ll1.removeFirst();

        ll1.removeLast();

        ll1.clear();

        System.out.println(ll1);
    }
}