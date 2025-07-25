class Student {
    // variables (instance variables have default values)
    int rollNo;
    String name;
    int age;
    String emailId;
    // static variables
    static String college = "SEIT";

    Student() {
        
    }

    // constructor is used to configure base setup for object creation
    Student(int rollNo, String name, int age, String emailId) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    void greetStudent() {
        // local variables must be initialized
        // String greet;
        // System.out.println(greet + name);
    }
}

class ThisAndStaticExample {
    public static void main(String[] args) {
        // student object
        Student s1 = new Student(102, "Deepak", 20, "deep@gmail.com");
        // s1.name = "Deepak";
        // s1.age = 20;
        // s1.rollNo = 102;
        // s1.emailId = "deep@gmail.com";

        s1.greetStudent();
        
        System.out.println(Student.college);

        Student s2 = new Student(105, "Priya", 22, "pri@gmail.com");
        // s2.name = "Priya";
        // s2.age = 22;
        // s2.rollNo = 105;
        // s2.emailId = "pri@gmail.com";

        // static members shouldn't be accessed in following way
        // System.out.println(s2.college);

        System.out.println(s2.name);

        Student s3 = new Student();
    }
}