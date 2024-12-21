class Student{
    int id;
    String name;
    int age;
    static String college;

    // default constructor
    Student(){
        System.out.println();
    }

    // constructor
    Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    // void assign(int i, String n, int a){
    //     id = i;
    //     name = n;
    //     age = a;
    // }


    void study(){
        System.out.println(name);
    }

    int add(int a, int b){
        return a + b;
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "sai", 20);
        // s1.id = 101;
        // s1.name = "Sai";
        // s1.age = 20;
        // s1.college = "Gitam";
        // s1.assign(101, "Sai", 20);

        Student.college = "Gitam";

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Kishore";
        s2.age = 22;
        // s1.college = "Gitam";

        int res = s1.add(5, 4);

        System.out.println(s1.name);


    }
}
