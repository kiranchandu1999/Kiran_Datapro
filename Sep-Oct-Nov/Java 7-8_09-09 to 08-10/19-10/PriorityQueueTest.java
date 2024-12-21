import java.util.*;

// class Sorting1 implements Comparator<Integer> {
//     // 3, 5, 8, 2 ---> order
//     // 2, 5, 8, 3
//     // 2, 3, 8, 5
//     // 2, 3, 5, 8
//     public int compare(Integer a, Integer b) {
//         // negative for same order and positive for reverse order
//         return b-a;
//     }
// }

public class PriorityQueueTest {
    public static void main(String[] args) {
        // anonymous class
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a , Integer b) {
        //         // -1  ---> same order
        //         // 1  ---> reverse
        //         // 0   ---> 
        //         // return a - b; // ascending
        //         return b - a;   // descending order
        //     }
        // };

        // lambda function is only for functional interfaces
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>(new Sorting1());

        // using lambda function
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
            return b-a;
        });

        // Comparable and Comparator

        pq.add(8);
        pq.add(9);
        pq.add(5);
        pq.add(2);
        pq.add(6);

        System.out.println(pq);
        // pq.remove();
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
        // System.out.println(pq.peek());
        // System.out.println(pq);
    }
}
