import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 7-8 02-06 (extended)\\02-06\\input.txt");
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 7-8 02-06 (extended)\\02-06\\output.txt");

            // reading data byte by byte
            // int data;
            // while((data = fin.read()) != -1) {
            //     System.out.print((char)data);
            //     fout.write(data);
            // }


            // reading data in the form of chunks
            byte[] chunk = new byte[10];
            int data = fin.read(chunk);
            while(data != -1) {
                System.out.println(data);
                fout.write(chunk, 0, data);
                data = fin.read(chunk);
            }

            System.out.println("\nSuccessfully written data into output file");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
