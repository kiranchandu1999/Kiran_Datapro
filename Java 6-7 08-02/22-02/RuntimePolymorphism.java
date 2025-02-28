class Person {
    void type() {
        System.out.println("Person class object");
    }
}

class Employee extends Person {
    @Override
    void type() {
        System.out.println("Employee class object");
    }
}


public class RuntimePolymorphism {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.type();

        Employee e1 = new Employee();
        e1.type();
    }
}
