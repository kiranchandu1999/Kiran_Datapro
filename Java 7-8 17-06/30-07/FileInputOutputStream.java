import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("D:\\Kiran\\Kiran_Datapro\\Java 7-8 17-06\\30-07\\input.txt");
            fout = new FileOutputStream("D:\\Kiran\\Kiran_Datapro\\Java 7-8 17-06\\30-07\\output.txt");

            // int ch = fin.read();
            // while(ch != -1) {
            //     System.out.print((char) ch);
            //     ch = fin.read();
            // }

            // we can read data in set of bytes
            byte[] data = new byte[10];
            int qty = fin.read(data);
            while(qty != -1) {
                // String str = new String(data, StandardCharsets.UTF_8);
                // System.out.print(str);

                // writing data into output file
                fout.write(data);
                qty = fin.read(data);
            }
        }
        catch(IOException e) { 
            System.out.println(e);
        }
        finally {
            fin.close();
            fout.close();
        }
    }
}
