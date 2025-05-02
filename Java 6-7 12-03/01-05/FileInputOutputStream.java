import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("D:\\Kiran\\Java 6-7 12-03\\01-05\\data\\input.txt");
            fout = new FileOutputStream("D:\\Kiran\\Java 6-7 12-03\\01-05\\data\\output.txt");

            // copying data byte-by-byte
            // int val = fin.read();
            // while(val != -1) {
            //     // write values into output file
            //     fout.write(val);
            //     // read next byte
            //     val = fin.read();
            // }

            // copy data by small chunks
            byte[] buffer = new byte[10];
            int data = fin.read(buffer);
            while(data != -1) {
                fout.write(buffer);
                System.out.println(data);
                data = fin.read(buffer);
            }

            System.out.println("File copied to output file..");
        }
        catch(Exception e) {

        }
        finally {
            fin.close();
            fout.close();
        }
    }
}
