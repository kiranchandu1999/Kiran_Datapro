class Person {
    // variables
    String name;
    int age;
    String phNum;

    // methods
    void talk() {
        System.out.println("Person talking....");
    }

    void walk() {
        System.out.println("Person walking...");
    }
}

class Employee extends Person {
    int salary;

    // methods
    void work() {
        System.out.println("Employee working..");
    }
}

// multi level inheritance
class Engineer extends Employee {
    String department;
}

class Doctor extends Employee {
    
}

// hierarchical inheritance
class Student2 extends Person {
    int HTNo;
}


public class InheritanceExample {
    public static void main(String[] args) {
        // person object
        Person p1 = new Person();
        p1.name = "vardhan";
        p1.talk();

        // Employee object
        Employee e1 = new Employee();
        e1.name = "Rakesh";
        e1.work();
        e1.talk();

        Engineer eng1 = new Engineer();
        eng1.name = "sudheer";

        Student2 st1 = new Student2();
        st1.name = "vinay";

        System.out.println(p1.name);
        System.out.println(e1.name);
    }
}
