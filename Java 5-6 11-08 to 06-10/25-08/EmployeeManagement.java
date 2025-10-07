// Base class
class Employee {
    // properties
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // methods
    void login() {
        System.out.println("Employee: " + this.name + " login successful..");
    }
}

// Single level
// Derived class
class Developer extends Employee {
    String technology;

    // default constructor of derived class
    // Developer() {
    //     super();
    // }

    Developer(int id, String name, double salary, String technology) {
        super(id, name, salary);
        this.technology = technology;
    }

    void writeCode() {
        System.out.println("Developer: " + super.name + " writing code in " + this.technology);
    }
}

// Heirarchical
// class Doctor extends Employee {

// }

class EmployeeManagement {
    public static void main(String[] args) {
        // Employee object
        Employee e1 = new Employee(101, "Abdul", 10000);
        // e1.id = 101;
        // e1.name = "Abdul";
        // e1.salary = 10000;
        // e1.technology = "Java"; // this class didn't have this property

        Developer d1 = new Developer(102, "Sudeer", 15000, "Java");
        // d1.technology = "Java";
        // d1.name = "Sudeer"; // inherits from Employee class
        // d1.salary = 15000; // inherits
        d1.login(); // inherited from Employee
        d1.writeCode();
    }
}