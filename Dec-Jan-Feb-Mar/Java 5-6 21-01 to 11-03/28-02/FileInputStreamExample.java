import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 5-6 21-01\\28-02\\demo.txt");

            int val = fin.read();

            while(val != -1) {
                System.out.print((char) val);
                val = fin.read();
            }

            fin.close();
            System.out.println("\nfile resource closed");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}