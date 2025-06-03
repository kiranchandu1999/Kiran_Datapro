// base class
class Employee {
    String empName;
    String empId;

    Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }

    // work
    void work() {
        System.out.println("Employee working...");
    }
}

// child class 1
class Manager extends Employee {
    int teamSize;

    Manager(String empName, String empId, int teamSize) {
        super(empName, empId);
        this.teamSize = teamSize;
    }

    void conductMeeting() {
        System.out.println("Manager " + empName + " conducted meeting to team members of " + teamSize + " people");
    }
}

// child class 2
class Developer extends Employee {
    String programmingLanguage;

    Developer(String empName, String empId, String lang) {
        super(empName, empId);
        this.programmingLanguage = lang;
    }

    void developCode() {
        System.out.println("Developer " + empName + " writing code in " + programmingLanguage);
    }
}

public class EmployManagement {
    public static void main(String[] args) {
        // create Developer
        Developer dev1 = new Developer("Chandrish", "1015", "Java");
        dev1.work();
        dev1.developCode();

        Manager man1 = new Manager("Santosh", "5895", 10);
        man1.work();
        man1.conductMeeting();
    }
}
