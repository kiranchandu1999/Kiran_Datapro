import java.io.*;

class Person implements Serializable {
    String city;
}

class Department implements Serializable {
    String dept_name;

    Department(String name) {
        dept_name = name;
    }
}

class Employee extends Person {
    int id;
    String name;
    // transient is used for the sensitive fields
    transient String password; // sensitive data
    Department department;

    Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class SerializationDeserialization {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee(101, "John", "1234");
        e1.city = "VSKP";
        Department d1 = new Department("IT");
        e1.department = d1;

        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // internal memory
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // serialization
        oos.writeObject(e1); // employee object will be stored into file

        System.out.println("Serialized object bytes size: " + baos.size());

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        // Deserialization
        Employee e2 = (Employee) ois.readObject(); // byte stream to employee object
        System.out.println("Id: " + e2.id);
        System.out.println("Name: " + e2.name);
        System.out.println("Passowrd: " + e2.password); // should be null
        System.out.println("City: " + e2.city);
        System.out.println("Department: " + e2.department.dept_name);
    }
}
