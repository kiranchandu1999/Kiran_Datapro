class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    public String toString() {
        return "Department(Name: " + this.deptName + ")";
    }
}

class Employee extends Object {
    int id;
    String name;
    Department department;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee(Id: " + this.id + ", Name: " + this.name + ", Department: " + this.department + ")";
    }

    public boolean equals(Employee obj) {
        if(this.id == obj.id && this.name.equals(obj.name)) {
            return true;
        }
        return false;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee copy = new Employee(this.id, this.name);
        // deep copy
        copy.department = new Department(this.department.deptName);
        return copy;
    }
}

class ObjectClassExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(101, "John");
        System.out.println(e1.toString()); // same as printing e1 object
        System.out.println(e1);
        Employee e2 = new Employee(101, "John");
        System.out.println(e1.equals(e2)); // false
        Employee e3 = e1;
        System.out.println(e1.equals(e3)); // true

        // object cloning
        Employee e4 = new Employee(102, "Daniel");
        Department d1 = new Department("IT");
        e4.department = d1;
        // cloning e4 object
        // shallow clone
        Employee e5 = e4.clone();
        // changing e4 data
        e4.id = 103;
        e4.department.deptName = "Eng";
        System.out.println(e5);
    }
}