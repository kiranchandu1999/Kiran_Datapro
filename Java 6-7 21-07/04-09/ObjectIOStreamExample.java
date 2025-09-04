import java.io.*;

class Employee implements Serializable {
    private static final long SerialVersionUID = 1l;
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Employee(Id: " + id + ", Name: " + name + ")";
    }
}

public class ObjectIOStreamExample {
    public static void main(String[] args) {
        File f = new File("D:\\Kiran\\Java 6-7 21-07\\04-09\\object_data.txt");
        try(
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fin);
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
        ) {
            Employee e1 = new Employee(101, "John");

            // writing object into file
            oos.writeObject(e1);
            System.out.println("Employee data written into file..");

            // reading object from file
            System.out.println("=== Employee object ===");
            System.out.println((Employee) ois.readObject());
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
