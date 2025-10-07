class Student {
    String name;
    int id;
    int age;
    String email;

    // constructor - for basic setup of any object
    Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void study() {
        System.out.println("Student studying...");
    }

    void writeExam() {
        System.out.println("Student writing exam..");
    }
}

class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 20, "john@gmail.com");
        System.out.println(s1.name); // John

        // Student s2 = new Student();
        // s2.id = 102;
        // s2.name = "Alice";
        // s2.age = 22;
        // s2.email = "alice@gmail.com";
    }
}
