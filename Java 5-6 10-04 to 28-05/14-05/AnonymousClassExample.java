import java.util.Arrays;
import java.util.Comparator;

class Student1 {
    int id;
    String name;
    int age;

    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.age;
    }
}

class IdSorting implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.id - o2.id;
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "krishna", 22);
        Student1 s2 = new Student1(102, "Deepak", 23);
        Student1 s3 = new Student1(103, "Jitesh", 20);

        Student1[] students = {s1, s2, s3};

        // name sorting
        Arrays.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.id - o2.id;
            }
        });

        for(Student1 s: students) {
            System.out.println(s);
        }
    }
}
