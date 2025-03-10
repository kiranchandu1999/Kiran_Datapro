import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        // doubly ended queue
        Deque<String> dq1 = new ArrayDeque<>();

        // adding elements
        dq1.add("item1");
        dq1.addFirst("item2");
        dq1.addLast("item3");

        // getting elements from queue
        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.getFirst());
        System.out.println(dq1.peekLast());

        // remove
        while(!dq1.isEmpty()) {
            System.out.println(dq1.pollLast());
        }

        System.out.println(dq1);
    }
}
