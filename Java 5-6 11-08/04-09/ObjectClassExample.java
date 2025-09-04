class Employee extends Object {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee(Id: " + this.id + ", Name: " + this.name + ")";
    }

    public boolean equals(Employee obj) {
        if(this.id == obj.id && this.name.equals(obj.name)) {
            return true;
        }
        return false;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return new Employee(this.id, this.name);
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
        // cloning e4 object
        // shallow clone
        Employee e5 = e4.clone();
        System.out.println(e5);
    }
}