import java.util.Arrays;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;
    int[] marks;

    Student(int id, String name, int age, int qty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = new int[qty];
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        // negative value -> order won't change
        // positive value -> order will reverse
        // return o.age - this.age;
        return this.name.compareTo(o.name);
    }
}

class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "krishna", 22, 4);
        Student s2 = new Student(102, "Deepak", 23, 2);
        Student s3 = new Student(103, "Jitesh", 20, 5);

        Student[] students = {s1, s2, s3};

        Arrays.sort(students);

        for(Student s: students) {
            System.out.println(s);
        }
    }
}