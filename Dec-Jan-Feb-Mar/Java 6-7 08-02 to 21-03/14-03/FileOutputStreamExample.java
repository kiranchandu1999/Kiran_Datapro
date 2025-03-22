import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        try {
            fout = new FileOutputStream("D:\\Kiran\\Java 6-7 08-02\\14-03\\sample.txt");

            fin = new FileInputStream("D:\\Kiran\\Java 6-7 08-02\\14-03\\sample.txt");

            String data = "Hello world!";
            byte[] bytes = data.getBytes();

            fout.write(bytes);
            // fout.write(bytes, 6 ,5);
            // fout.write(65);

            System.out.println("Data succesfully written..");
            // System.out.println(fout.getChannel());

            // int val = fin.read();
            // // fin.skip(2);
            // while(val != -1) {
            //     System.out.println((char)val);
            //     System.out.println("remaining: " + fin.available());
            //     val = fin.read();
            // }

            byte[] arr = new byte[5];

            fin.read(arr);

            for(byte x: arr) {
                System.out.println((char) x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fout.flush();
            fout.close();
        }
    }
}