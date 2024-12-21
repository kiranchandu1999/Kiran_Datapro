class Person{
    String name;
    int age;

    void talk(){
        System.out.println("person talking");
    }
}

class Employee extends Person{
    int id;
    int salary;

    void work(){
        System.out.println("employee working");
    }
}

class Citizen extends Employee{
    int adhar;

    void talk(){
        System.out.println("citizen talking");
    }
}

class Student1 extends Person{
    int rollNo;
    String college;
}

public class InheritanceTest {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "kiran";
        e1.talk();

        Student1 s1 = new Student1();
        s1.rollNo = 101;
        s1.name = "sai";

        Citizen c1 = new Citizen();
        c1.talk();
    }
}