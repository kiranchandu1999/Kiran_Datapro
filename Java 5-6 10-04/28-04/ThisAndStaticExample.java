class Student {
    // instance variables
    int id;
    String name;
    String email;
    // static variable common throughout all ojects of this class
    static String college = "VGAR";

    // default constructor provided by jvm
    Student() {}

    // if we defined more than 1 constructor then it's called Constructor overloading
    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    void study() {
        System.out.println("Student: " + name + " studying...");
    }

    // static method
    static void printCollege() {
        System.out.println("All Student class objects belongs to college: " + college);
    }
}

class ThisAndStaticExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ashok", "ashok@gamil");

        System.out.println(s1.name);
        System.out.println(Student.college);
        s1.study();
        Student.printCollege();

        Student s2 = new Student(102, "Chandrish", "chandrish@gamil");

        System.out.println(s2.name);
        System.out.println(Student.college);
        s2.study();
    }
}