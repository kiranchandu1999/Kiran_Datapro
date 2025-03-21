import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("D:\\Kiran\\Java 5-6 15-11 to 15-12\\27-12\\sample.txt");

            String data = "welcome to datapro";
            byte[] byteData = data.getBytes();


            fo.write(byteData);
            System.out.println("data inserted");
        }
        catch (Exception e) {

        }
        finally {
            fo.close();
        }
    }
}