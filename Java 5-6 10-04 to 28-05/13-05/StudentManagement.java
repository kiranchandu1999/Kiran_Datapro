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
        return "Id: " + this.id + ", Name: " + this.name + ", age: " + this.age;
    }

    @Override
    public int compareTo(Student s) {
        // negetive values ---> order doesn't change
        // positive values ---> order will be reversed
        // sorting based on id
        // return s.id - this.id;
        // age based sorting
        // return s.age - this.age;
        // name based sorting
        // return this.name.compareTo(s.name);
        if(this.marks.length < s.marks.length) {
            return -1;
        }
        else {
            return 1;
        }
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