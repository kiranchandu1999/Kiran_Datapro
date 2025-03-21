import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("D:\\Kiran\\Java 5-6 15-11 to 15-12\\27-12\\sample.txt");

            int val = fi.read();
            while(val != -1) {
                System.out.print((char) val);
                val = fi.read();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            fi.close();
        }
    }
}
