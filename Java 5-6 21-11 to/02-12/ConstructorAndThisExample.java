class Student {
    String name;
    int rollNo;
    static String college = "ABCD";

    // default constructor automatically provided by JVM
    Student() {
    }

    // Constructor overloading --> If any class contains more than one constructor
    // constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Constructor: " + this);
    }

    // assigning values logic moved to constructor
    // void assignValues(String n, int r) {
    //     name = n;
    //     rollNo = r;
    // }

    void study() {
        System.out.println("Student: " + this.name + " is studying..");
    }

    // static method
    static void showCollegeName() {
        System.out.println("All students are studing in college " + college);
    }
}

class ConstructorAndThisExample {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        // s1.name = "John";
        // s1.rollNo = 101;
        // s1.assignValues("John", 101);
        System.out.println(s1);
        System.out.println(s1.name);
        // Accessing static variable
        System.out.println(Student.college);

        Student s2 = new Student("Ashok", 102);
        // s2.name = "Ashok";
        // s2.rollNo = 102;
        // s2.assignValues("Ashok", 102);
        System.out.println(s2.name);
        // calling study method using s2
        s2.study();
        // calling static method
        Student.showCollegeName();
    }
}