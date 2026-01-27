import java.io.*;

class FileInputOutputStreamExample {
    public static void main(String[] args) {
        // FileInputStream fin = null;
        try(
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 6-7 21-07\\03-09\\input.txt");
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 6-7 21-07\\03-09\\output.txt")) {
            // Reading and writing data byte wise   
            // int val = fin.read();
            // while(val != -1) {
            //     System.out.print((char) val);
            //     fout.write(val);
            //     val = fin.read();
            // }

            // Reading and writing chunk wise (set of bytes)
            byte[] buffer = new byte[5];
            int readBytes = fin.read(buffer);
            while(readBytes != -1) {
                System.out.println("Read bytes from input file: " + readBytes);
                fout.write(buffer, 0, readBytes);
                readBytes = fin.read(buffer);
            }

            System.out.println("Data successfully copied to output file..");
        }
        catch(IOException ie) {
            ie.printStackTrace();
        }
    }
}