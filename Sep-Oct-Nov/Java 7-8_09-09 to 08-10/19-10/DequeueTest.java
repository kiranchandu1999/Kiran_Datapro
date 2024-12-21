
import java.util.*;

public class DequeueTest {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(5);
        dq.add(3);
        dq.add(6);
        dq.addFirst(8);

        dq.removeLast();
        dq.addLast(9);
        // clear
        // dq.clear();

        // dq.size();

        System.out.println(dq);
    }
}
