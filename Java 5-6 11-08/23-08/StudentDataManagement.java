class Student {
    int id;
    String name;
    int age;
    static String college;

    // default constructor
    Student() {
        // empty body
        System.out.println("This is default constructor");
    }

    // constructor
    Student(int id, String name, int age) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        // System.out.println(this);
    }

    // static block
    static {
        college = "ASET";
        System.out.println("Static block called");
    }

    // instance block (instance == object)
    {
        System.out.println("Instance block called..");
    }

    // method
    void study() {
        System.out.println(this.name + " studying...");
    }

    static void printCollegeName() {
        System.out.println("College: " + college);
    }
}

class StudentDataManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 20);
        Student s2 = new Student(102, "Rahul", 21);
        System.out.println(s1.name);
        System.out.println(s1);
        System.out.println(s2);
        Student s3 = new Student();
        System.out.println(Student.college);
        s1.study();
        s2.study();
        Student.printCollegeName();
    }
}