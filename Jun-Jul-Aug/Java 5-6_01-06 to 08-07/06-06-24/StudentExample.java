
class Student {
    // variables
    int id;
    String name;
    int age;
    int year;

    // methods
}

public class StudentExample {
    public static void main(String[] args) {
        // object creation / object instantiation
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Kiran";
        s1.age = 25;
        s1.year = 4;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Rajesh";
        s2.age = 22;
        s2.year = 2;

        Student s3 = new Student();

        System.out.println("id = " + s1.id + ", name = " + s1.name + ", age = " + s1.age);
    }   
}