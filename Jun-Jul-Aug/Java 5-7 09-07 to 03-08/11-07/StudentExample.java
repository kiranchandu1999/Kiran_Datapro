
class Student {
    // variables
    int id;
    String name;
    int age;
    int year;
    static String college;

    Student(){
        
    }

    static void study(){
        System.out.println("Studying");
    }
}

public class StudentExample {
    public static void main(String[] args) {
        // object creation / object instantiation
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Kiran";
        s1.age = 25;
        s1.year = 4;
        Student.college = "ABC";

        // calling static method with the class name
        Student.study();

        System.out.println(Student.college);

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Rajesh";
        s2.age = 22;
        s2.year = 2;

        System.out.println(s2.college);

        // Student s3 = new Student();

        System.out.println("id = " + s1.id + ", name = " + s1.name + ", age = " + s1.age);
        System.out.printf("id = %d, name = %s, age = %d, year = %d", s1.id, s1.name, s1.age, s1.year);
    }   
}