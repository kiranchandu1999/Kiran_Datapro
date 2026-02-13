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
        return "Student(Id: " + this.id + ", Name: " + this.name + ", Age: " + this.age + ")"; 
    }
}

class NameSorting implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeSorting implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        return o2.age - o1.age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Ramesh", 22);
        Student1 s2 = new Student1(102, "Ashok", 24);
        Student1 s3 = new Student1(103, "Deepak", 21);

        Student1[] students = {s1, s2, s3};

        // Sorting students array
        // sort based on name ASC
        Arrays.sort(students, new NameSorting());

        // sort based on age DESC
        // Arrays.sort(students, new AgeSorting());

        // using lambda expression
        Arrays.sort(students, (o1, o2) -> {
            return o2.age - o1.age;
        });

        for(Student1 s: students) {
            System.out.println(s);
        }
    }
}
