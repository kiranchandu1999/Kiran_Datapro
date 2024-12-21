import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.addLast(15);
        ll.addFirst(9);

        ll.removeLast();

        // ll.set(2, 15);
        ll.add(2, 20);

        ll.clear();

        System.out.println(ll);
    }
}
