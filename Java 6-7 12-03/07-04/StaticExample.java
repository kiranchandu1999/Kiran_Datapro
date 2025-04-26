class Student {
    int id;
    String name;
    int age;
    static String college;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Deepa", 20);
        Student s2 = new Student(102, "Pujitha", 21);
        Student s3 = new Student(103, "Mahalakshmi", 19);

        Student.college = "SGPV";

        System.out.println(s3.name);
        System.out.println(s1.age);
        System.out.println(s2.id);
        System.out.println(Student.college);
    }
}
