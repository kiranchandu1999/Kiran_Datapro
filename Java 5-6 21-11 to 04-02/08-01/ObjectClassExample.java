class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{Id: " + this.id + ", Name: " + this.name + "}";  
    }
}

public class ObjectClassExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
