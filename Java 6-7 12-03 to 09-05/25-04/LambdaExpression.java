import java.util.Arrays;

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

public class LambdaExpression {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "krishna", 22);
        Student1 s2 = new Student1(102, "Deepak", 23);
        Student1 s3 = new Student1(103, "Jitesh", 20);

        Student1[] students = {s1, s2, s3};

        // age sorting
        // Arrays.sort(students, new AgeSorting());

        // name sorting
        // Arrays.sort(students, new NameSorting());

        // name sorting using lambda
        Arrays.sort(students, (Student1 o1, Student1 o2) -> {
            return o1.name.compareTo(o2.name);
        });

        // age sorting
        Arrays.sort(students, (Student1 o1, Student1 o2) -> {
            return o1.age - o2.age;
        });

        for(Student1 s: students) {
            System.out.println(s);
        }
    }
}
