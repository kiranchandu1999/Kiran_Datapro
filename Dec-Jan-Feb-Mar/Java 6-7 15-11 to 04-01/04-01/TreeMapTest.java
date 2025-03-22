import java.util.*;
// Class 1
// Helper class representing Student
class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name;
    }
}

// Class 2
// Helper class - Comparator implementation
class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return b.rollno - a.rollno;
    }
}

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap1 = new TreeMap<>();

        tmap1.put(303, "item1");
        tmap1.put(305, "item4");
        tmap1.put(301, "item3");
        tmap1.put(304, "item5");

        System.out.println(tmap1);

        // treemap storing student class objects
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll()); // O(1)

        Student s1 = new Student(111, "bbbb", "london");
        Student s2 = new Student(131, "aaaa", "nyc");
        Student s3 = new Student(121, "cccc", "jaipur");

        tree_map.put(s1, 2);
        tree_map.put(s2, 3);
        tree_map.put(s3, 1);

        System.out.println("TreeMap: " + tree_map);
    }
}
