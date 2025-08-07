class Employee {
    int empId;
    String name;
    double salary;

    // default
    // Employee() {}

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working..");
    }
}
// Single level
class Manager extends Employee {
    int teamSize;

    // default constructor
    // Manager() {
    //     super();
    // }

    Manager(int empId, String name, double salary, int teamSize) {
        super(empId, name, salary);
        this.teamSize = teamSize;
    }

    void conductMeeting(int size) {
        System.out.println("Meeting is going on for " + size + " members..");
    }
}


class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(201, "John", 20000);
        e1.work();
        Manager m1 = new Manager(301, "David", 50000, 10);
        m1.empId = 101; // inherits from parent
        m1.conductMeeting(5);
        m1.work(); // inherits from parent
    }
}