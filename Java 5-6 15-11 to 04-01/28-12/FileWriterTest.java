import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("D:\\Kiran\\Java 5-6 15-11 to 15-12\\28-12\\sample.txt", true);
            bw = new BufferedWriter(fw);
            
            String data = "\nThis content belongs to fifth line.......";

            // fw.write(data);
            bw.newLine();
            bw.write(data);
            System.out.println("success");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            bw.close();
            fw.close();
        }
    }
}
