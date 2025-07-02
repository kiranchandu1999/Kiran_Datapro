class Student {
    // properties
    int id;
    String name;
    int age;
    static String college = "SGEC";

    // default constructor - automatically created by jvm
    // Student() {}

    // constructor (parameterized constructor)
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // cannot use this inside static
    // static void printThis() {
    //     System.out.println(this);
    // }

    void printThis() {
        int sum = 0;
        System.out.println(this);
    }
}

class ThisAndStaticExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 21);
        System.out.println(s1.name);

        Student s2 = new Student(102, "Balu", 22);
        System.out.println(s2.age);

        System.out.println(s1);
        s1.printThis();
        System.out.println(s2);
        s2.printThis();

        System.out.println("College name is: " + Student.college);
    }
}