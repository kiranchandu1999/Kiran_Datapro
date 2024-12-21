package collection;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        // FIFO
        Queue<Integer> q = new LinkedList();
        //
        Queue<Integer> q1 = new ArrayDeque<>();

        // adding elements
        q.offer(5);
        q.offer(3);
        q.offer(8);

        // removing
        q.poll();
        q.remove();

        // clear
        q.clear();

        

        System.out.println(q.isEmpty());
        // System.out.println(q.peek());
    }
}
