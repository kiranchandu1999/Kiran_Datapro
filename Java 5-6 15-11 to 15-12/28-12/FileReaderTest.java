import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("D:\\Kiran\\Java 5-6 15-11 to 15-12\\28-12\\sample.txt");
            br = new BufferedReader(fr);
            // int val = br.read();
            
            // while(val != -1) {
            //     System.out.print(((char) val));
            //     val = br.read();
            // }

            // using readLine method of BufferedReader
            String val = br.readLine();

            while(val != null) {
                System.out.println(val);
                val = br.readLine();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            br.close();
            fr.close();
        }
    }
}