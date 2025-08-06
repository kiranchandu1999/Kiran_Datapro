class Student {
    // properties
    int id;
    String name;
    int age;
    // static variable
    static String college;

    // static block
    static {
        college = "AVPV";
    }

    // instance block (instance == object)
    {
        System.out.println("Instnace block called..");
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Constructor called");
    }

    // methods
    void writeExam() {
        System.out.println(this.name + " writing exam...");
    }

    // static method
    static void printCollegeAddress() {
        System.out.println("Dwarakanagar, Visakhapatnam..");
    }
}

class StudentDataManagement {
    public static void main(String[] args) {
        Student s1 = new Student(201, "Mukul", 22);
        Student s2 = new Student(202, "John", 20);
        Student s3 = new Student(203, "Alice", 21);

        System.out.println(Student.college);
        System.out.println(s2.id);

        s3.writeExam();
        Student.printCollegeAddress();
    }
}