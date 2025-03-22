import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>((a, b)-> {
            return b - a;
        });

        ts1.add(18);
        ts1.add(21);
        ts1.add(12);
        ts1.add(15);
        ts1.add(13);

        System.out.println("ceiling element: " + ts1.ceiling(16));

        System.out.println("floor element: " + ts1.floor(19));

        Iterator<Integer> bag = ts1.iterator();

        while(bag.hasNext()) {
            System.out.println(bag.next());
        }

        System.out.println(ts1);


        // tree set to store student class objects
        // Set<Student> ts2 = new TreeSet<>(new RollNoComparator());
        TreeSet<Student> ts2 = new TreeSet<>(new NameComparator());


        // objects creation
        Student s1 = new Student(101, "sai");
        Student s2 = new Student(102, "deepak");
        Student s3 = new Student(103, "tarun");

        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);

        Iterator<Student> bag2 = ts2.iterator();

        while(bag2.hasNext()) {
            System.out.println(bag2.next().name);
        }
    }
}
