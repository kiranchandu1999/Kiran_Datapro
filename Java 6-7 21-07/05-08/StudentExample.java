class Student {
    // properties
    int id;
    String name;
    int age;

    // Constructor overloading - writing multiple constructors in the same class

    // default constructor
    Student() {
        System.out.println("Constructor 1 called..");
    }

    Student(int id) {
        System.out.println("Constructor 2 called..");
    }

    // constructor
    Student(int i, String n, int a) {
        // constructor body
        this.id = i;
        this.name = n;
        this.age = a;
    }

    // methods
    void study() {
        System.out.println("Student is studying..");
    }

    void walk() {
        System.out.println("Student is walking..");
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        // assigning values
        // s1.id = 101;
        // s1.name = "John";
        // s1.age = 22;
        Student s2 = new Student(102, "Alice", 20);
        // s2.id = 102;
        // s2.name = "Alice";
        // s2.age = 20;

        System.out.println(s1.name); // John
        System.out.println(s2.age); // 20
    }
}
