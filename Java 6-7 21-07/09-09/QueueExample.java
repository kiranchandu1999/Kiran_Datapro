import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // queue declaration
        Queue<Integer> q1 = new ArrayDeque<>(); // FIFO
        // adding elements
        // q1.add(10); // throws IlleagalStatementException
        q1.offer(6);
        q1.offer(15);
        q1.offer(11);
        q1.offer(8);
        q1.offer(21);

        // accessing values
        System.out.println("Front value: " + q1.peek()); // 6

        // removing values
        System.out.println("Removed value: " + q1.poll()); // removes first

        // removing 8
        q1.remove(8);

        // clearing
        System.out.println(q1.contains(21));

        System.out.println(q1);


        // Doubly ended queue (Deque)
        Deque<Integer> dq = new ArrayDeque<>();
        // adding
        dq.offer(18);
        dq.offer(11);
        dq.offerFirst(21);
        dq.offerLast(8); // 21 18 11 8

        // accessing
        System.out.println("Peek: " + dq.peek());
        System.out.println("PeekFirst " + dq.peekFirst());

        // removing
        System.out.println("remove: " + dq.poll());
        System.out.println("removeLast: " + dq.pollLast());
    }
}
