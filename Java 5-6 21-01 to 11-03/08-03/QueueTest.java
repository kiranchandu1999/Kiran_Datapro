import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Queue
        Queue<String> q1 = new ArrayDeque<>();

        // adding elements
        System.out.println(q1.add("item1"));
        System.out.println(q1.offer("item2"));
        System.out.println(q1.offer("item3"));
        System.out.println(q1.offer("item4"));
        System.out.println(q1.offer("item5"));

        // front element in the queue
        System.out.println(q1.peek());

        // removing elements
        while(!q1.isEmpty()) {
            System.out.println(q1.remove());
        }

        System.out.println(q1.poll());

        System.out.println(q1);
    }
}