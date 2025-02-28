class Student {
    String name;
    int rollNo;
    String email;
    static String collegeName;

    Student(String name, int rollNo, String email) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    // non static method
    void study() {
        System.out.println("student studying...");
    }

    // static method
    static void eat() {
        System.out.println("student eating...");
    }
}

class StudentExample {
    public static void main(String[] args) {
        // student object create
        Student s1 = new Student("kishore", 101, "kishore@gmail.com");
        Student.collegeName = "SGPC";

        Student s2 = new Student("sai", 102, "sai@gmail.com");

        Student s3 = new Student("Ram", 103, "ram@gmail.com");
        
        System.out.println(s1.email);
        System.out.println(Student.collegeName);
        s2.study();
        Student.eat();
    }
}