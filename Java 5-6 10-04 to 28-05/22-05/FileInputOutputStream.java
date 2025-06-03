import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("D:\\Kiran\\Java 5-6 10-04\\22-05\\input.txt");
            fout = new FileOutputStream("D:\\Kiran\\Java 5-6 10-04\\22-05\\output.txt");

            // copying data byte-by-byte
            // reads 1 byte data
            // int val = fin.read();
            // while(val != -1) {
            //     // write values into output file
            //     fout.write(val);
            //     // read next byte
            //     val = fin.read();
            // }

            // copy data by small chunks
            byte[] chunk = new byte[10];
            int data = fin.read(chunk);
            while(data != -1) {
                fout.write(chunk);
                System.out.println(data);
                data = fin.read(chunk);
            }

            System.out.println("File copied to output file..");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            // this finally block is always execute irrespective of exception occurance
            fin.close();
            fout.close();
        }
    }
}
