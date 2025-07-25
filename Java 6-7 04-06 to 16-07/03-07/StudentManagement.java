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

    public String toString() {
        return String.format("Id is %d, Name is %s, Age is %d", id, name, age);
    }

    @Override
    public int compareTo(Student s) {
        // id comparison
        // negative values (order doesn't change)
        // positive values (order will reverse)
        // return s.id - this.id;
        
        // name comparison
        // return this.name.compareTo(s.name);
        return this.marks.length - s.marks.length;
    }
}

class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Krishna", 22, 4);
        Student s2 = new Student(102, "Deepak", 23, 2);
        Student s3 = new Student(103, "Jitesh", 20, 5);

        Student[] students = {s1, s2, s3};
        Arrays.sort(students);

        for(Student s: students) {
            System.out.println(s);
        }
    }
}