// base class
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void work() {
        System.out.println("working in office...");
    }
}

// child class 1
class Developer extends Employee {

    Developer(int empId, String name) {
        super(empId, name);
    }

    void writeCode(String programmingLanguage) {
        System.out.println(name + " developer writing code in " + programmingLanguage);
    }
}

class Manager extends Employee {

    Manager(int empId, String name) {
        super(empId, name);
    }

    void conductMeeting(int teamSize) {
        System.out.println(name + " manager conducting meeting for team size " + teamSize );
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Developer dev1 = new Developer(1010, "John");
        Manager manager1 = new Manager(2010, "Rahul");

        dev1.work();
        manager1.work();

        dev1.writeCode("Java");
        manager1.conductMeeting(10);
    }
}