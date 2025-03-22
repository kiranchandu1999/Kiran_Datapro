import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 5-6 21-01\\28-02\\demo.txt", true);

            // fout.write(65);

            String data = "this is extra data to be added";
            byte[] b = data.getBytes();

            fout.write(32);
            fout.write(b);
            System.out.println("data written successfully!");

            fout.close();
            System.out.println("file resource closed!");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
