import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {
        // lambda expression
        // negetive --> same order
        // positive ---> order reverse
        PriorityQueue<String> pq = new PriorityQueue<>((a, b)->{
            return b.compareTo(a);
        });
        // adding
        pq.offer("mango");
        pq.offer("apple");
        pq.offer("kiwi");
        pq.offer("guava");

        System.out.println("Peek: " + pq.peek());

        System.out.println("remove first: " + pq.poll());

        System.out.println(pq);
    }
}
