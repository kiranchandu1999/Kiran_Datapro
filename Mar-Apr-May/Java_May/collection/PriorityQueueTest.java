package collection;

import java.util.*;

// class PriorityClass implements Comparator<Integer> {

//     @Override
//     public int compare(Integer a , Integer b) {
//         // -1  ---> same order
//         // 1  ---> reverse
//         // 0   ---> 
//         return a - b; // ascending
//         // return b - a;   // descending order
//     }

    
// }

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a, b)->{
            return a - b;
        });

        // Comparable and Comparator

        pq.add(8);
        pq.add(5);
        pq.add(9);
        pq.add(2);

        // System.out.println(pq);
        pq.remove();
        System.out.println(pq.peek());
        // System.out.println(pq);
    }
}
