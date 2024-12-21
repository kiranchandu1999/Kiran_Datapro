class Person {
    int id;
    String name;
    
    // default constructor created by jvm by default
    // Person(){}

    // no parameterized constructor
    Person(){
        System.out.println("no args constructor");
    }

    // parameterized constructors
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    Person(String name, int id){
        // calling no args construc
        // this();
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(this.id);
    }

}

class Employee extends Person {
    int id;
    // default construct by jvm
    // Employee(){
    //     super();
    // }

    Employee(int a, String b){
        super(a, b);
    }

    void display(){
        System.out.println(super.name);
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        Person p1 = new Person(101, "sai");
        // p1.display("sai");
        // System.out.println(p1.name);

        Employee emp = new Employee(101, "sai");
        emp.display();
    }
}