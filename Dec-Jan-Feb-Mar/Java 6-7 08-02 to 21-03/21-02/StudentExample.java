class Student {
    // variables
    int rollNo;
    String name;
    int age;
    String email;
    // static
    static String college;

    // constructor
    Student(int rollNo, String name, int age, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // methods
    void study() {
        System.out.println("studying...");
    }

    Student getObject() {
        return this;
    }
}

class StudentExample {
    public static void main(String[] args) {
        int a = 10;
        // student objects
        Student s1 = new Student(101, "asha", 20, "as@gmail.com");
        Student.college = "SGPV";

        System.out.println(s1.email);
        System.out.println(s1);
        System.out.println(s1.getObject());
        s1.study();
    }
}