package OOPS;

class Student {
    int id;
    String name;
    static String collegeName;
    // no args constructor
    Student () {
        collegeName = "XYZ";
    }

    Student (int a){

    }

    // parameterized const
    Student (int id, String name) {
        this();
        this.id = id;
        this.name = name;
        this.display();
    }

    void display () {
        System.out.println(this.id + " " + this.name);
    }

}

public class ConstructorExample {
    public static void main(String[] args) {
        // Student.collegeName = "XYZ";

        // object creation
        Student s1 = new Student(1, "student1");
        // s1.id = 1;
        // s1.name = "student1";
        // s1.collegeName = "XYZ";

        Student s2 = new Student(2, "student2");
        // s2.id = 2;
        // s2.name = "student2";
        // s2.collegeName = "XYZ";

        // System.out.println(s1.collegeName);

        // s1.display();
    }
}
