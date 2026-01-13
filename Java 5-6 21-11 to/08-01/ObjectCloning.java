class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address(City: " + this.city + ", State: " + this.state + ")";
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee(Id: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ")";
    }

    public boolean equals(Employee e) {
        return (this.id == e.id && this.name == e.name);
    }

    // shallow copy
    // @Override
    // public Employee clone() throws CloneNotSupportedException {
    //     return (Employee) super.clone();
    // }

    // deep copy
    @Override
    public Employee clone() throws CloneNotSupportedException {
        Address copyAdd = new Address(this.address.city, this.address.state);
        Employee empCopy = new Employee(this.id, this.name, copyAdd);
        return empCopy;
    }
}

class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add1 = new Address("vskp", "AP");
        Employee e1 = new Employee(101, "John", add1);
        // Employee e2 = new Employee(101, "John", add1);
        // System.out.println(e2);
        // System.out.println(e1.equals(e2));
        // cloning e1 object into e3
        Employee e3 = e1.clone();
        e1.id = 103;
        e1.address.city = "vzm";
        System.out.println("===== After cloning e1 to e3 =====");
        System.out.println(e1);
        System.out.println(e3);
    }
}