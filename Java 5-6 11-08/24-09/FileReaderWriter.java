import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Kiran\\Java 5-6 11-08\\24-09\\input.txt");
        FileWriter fw = new FileWriter("D:\\Kiran\\Java 5-6 11-08\\24-09\\output.txt");
        int val = fr.read();
        System.out.println((char) val);

        String data = "Welcome to Datapro!!";
        // byte[] bytes = data.getBytes();
        fw.write(data);

        fw.close();
        fr.close();
    }
}
