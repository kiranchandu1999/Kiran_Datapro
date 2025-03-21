import java.util.PriorityQueue;
import java.util.Queue;

interface Parent {
    void print();
}

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>((a, b)-> {
            return b.compareTo(a);
        });

        pq.add("item4");
        pq.add("item2");
        pq.add("item1");
        pq.add("item3");

        System.out.println("peek element: " + pq.peek());

        System.out.println("peek removed: " + pq.poll());

        // while(!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }

        System.out.println(pq);
    }
}
