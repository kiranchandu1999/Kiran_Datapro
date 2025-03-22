import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\Kiran\\Java 5-6 21-01\\01-03\\demo.txt");
            BufferedReader br = new BufferedReader(fr);

            // int val = fr.read();
            // System.out.println((char) val);

            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
