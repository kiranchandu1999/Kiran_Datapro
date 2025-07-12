import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        // byte stream
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("D:\\Kiran\\Java 6-7 04-06\\11-07\\input.txt");
            fout = new FileOutputStream("D:\\Kiran\\Java 6-7 04-06\\11-07\\output.txt");
            // reading byte wise
            // int input = fin.read();
            // while(input!= -1) {
            //     System.out.print((char) input);
            //     input = fin.read();
            // }

            byte[] data = new byte[5];
            int count = fin.read(data);

            // for(byte b: data) {
            //     System.out.print((char) b);
            // }
            while(count != -1) {
                fout.write(data);
                count = fin.read(data);
            }

            System.out.println("Write successful");

        } catch(IOException e) {
            System.out.println(e);
        } finally {
            fin.close();
            fout.close();
        }
    }
}
