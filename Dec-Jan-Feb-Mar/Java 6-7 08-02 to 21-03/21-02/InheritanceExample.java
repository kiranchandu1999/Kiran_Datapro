class Person {
    String name;
    int age;

    // default constructor
    // Person(){
    // }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void talk() {
        System.out.println("talking...");
    }
}

class Employee extends Person {
    int empId;
    int salary;

    // default constructor
    // Employee() {
    //     super();
    // }
    Employee(String name, int age, int empId, int salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void work() {
        System.out.println("working...");
    }
}

class Student2 extends Person {
    int rollNo;
    String email;

    Student2(String name, int age, int rollNo, String email) {
        super(name, age);
        this.rollNo = rollNo;
        this.email = email;
    }

    void talk() {
        System.out.println("student talking...");
    }

    void study() {
        super.talk();
        System.out.println("studying...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Person p1 = new Person("sai", 25);
        // p1.name = "sai";
        // p1.age = 25;

        p1.talk();

        Employee e1 = new Employee("sudeer", 20, 101, 30000);
        e1.name = "sudeer";
        e1.age = 20;

        e1.talk();

        Student2 st = new Student2("krishna", 22, 201, "krish@gmail");
        st.study();
    }
}
