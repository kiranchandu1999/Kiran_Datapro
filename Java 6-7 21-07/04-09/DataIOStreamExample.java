import java.io.*;

public class DataIOStreamExample {
    public static void main(String[] args) {
        try(
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 6-7 21-07\\04-09\\output.txt");
            DataInputStream dis = new DataInputStream(fin);
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 6-7 21-07\\04-09\\output.txt");
            DataOutputStream dos = new DataOutputStream(fout);
        ) {
            // data to insert
            int id = 101;
            String name = "John";
            double salary = 10000;

            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeDouble(salary);

            System.out.println("Employee data inserted into output file");

            // Reading primitive data from the file
            System.out.println("==== Employee Data ===");
            System.out.println("Id: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Salary: " + dis.readDouble());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
