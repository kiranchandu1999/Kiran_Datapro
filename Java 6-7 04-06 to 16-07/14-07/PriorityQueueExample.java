import java.util.PriorityQueue;

class Student {
    String name;
    int id;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.name + " " + this.id;
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> {
            return b - a;
        });

        // add
        pq.offer(15);
        pq.offer(5);
        pq.offer(18);
        pq.offer(6);
        pq.offer(8);
        pq.offer(5);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println(pq);

        Student s1 = new Student(201, "krishna");
        Student s2 = new Student(221, "rahul");
        Student s3 = new Student(198, "santosh");

        PriorityQueue<Student> pq1 = new PriorityQueue<>((a, b)-> {
            return b.name.compareTo(a.name);
        });

        pq1.offer(s1);
        pq1.offer(s2);
        pq1.offer(s3);

        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
    }
}
