import java.util.Arrays;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;
    int[] marksAbove90;

    Student(int id, String name, int age, int qty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marksAbove90 = new int[qty];
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.age;
    }

    @Override
    public int compareTo(Student s) {
        // negative (order doesn't change)
        // positive (order will be reversed)
        return this.id - s.id;
        // return s.name.compareTo(this.name);
        // if(this.marksAbove90.length < s.marksAbove90.length) {
        //     return -1;
        // }
        // else {
        //     return 1;
        // }
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