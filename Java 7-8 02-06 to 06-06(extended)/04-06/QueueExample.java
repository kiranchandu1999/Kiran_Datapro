import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();

        // adding
        q.offer("item1");
        q.offer("item2");
        q.offer("item3");
        q.offer("item4");
        q.offer("item5");

        // get (FIFO)
        System.out.println(q.peek());

        // remove
        // System.out.println(q.poll());
        // q.remove("item3");

        Queue<String> temp = new ArrayDeque<>();

        while(!q.isEmpty() && q.peek() != "item3") {
            temp.offer(q.poll());
        }

        // removing item3
        q.poll();

        // after removing item3, moving remaining items to temp queue
        while(!q.isEmpty()) {
            temp.offer(q.poll());
        }

        while(!temp.isEmpty()) {
            q.offer(temp.poll());
        }

        System.out.println(q);


        // doubly ended queue
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offer(15);
        dq.offerFirst(8);
        // 8, 10, 20, 15
        // remove
        dq.poll();
        dq.pollLast();

        System.out.println(dq);
    }
}
