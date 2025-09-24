import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileInputOutputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 5-6 11-08\\24-09\\input_img.jpg");
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 5-6 11-08\\24-09\\output_img.jpg");
            // reading data from input file and print
            // int val = fin.read();
            // while(val != -1) {
            //     System.out.print((char) val);
            //     val = fin.read();
            // }

            // read and write data from input to output file
            // while(val != -1) {
            //     fout.write(val);
            //     val = fin.read();
            // }

            // read and write with chunks
            // byte[] data = new byte[6];
            // int len = fin.read(data);
            // while(len != -1) {
            //     fout.write(data, 0, len);
            //     len = fin.read(data);
            // }

            // copying image from one file to another
            byte[] chunk = new byte[2048];
            int len = fin.read(chunk);
            while(len != -1) {
                fout.write(chunk, 0, len);
                len = fin.read(chunk);
            }

            System.out.println("Data written into output file..");
        }
        catch(IOException ie) {
            System.out.println(ie);
        }
    }
}