import java.util.Arrays;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student(Id: " + this.id + ", Name: " + this.name + ", Age: " + this.age + ")"; 
    }

    @Override
    public int compareTo(Student s) {
        // negative value --> maintains same order
        // positive value --> order will be reversed
        // age wise sorting
        // return s.age - this.age;
        // name wise sorting
        return this.name.compareTo(s.name);
    }
}

class ComparableExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ramesh", 22);
        Student s2 = new Student(102, "Ashok", 24);
        Student s3 = new Student(103, "Deepak", 21);

        Student[] students = {s1, s2, s3};

        // Sorting students array
        Arrays.sort(students);

        for(Student s: students) {
            System.out.println(s);
        }
    }
}