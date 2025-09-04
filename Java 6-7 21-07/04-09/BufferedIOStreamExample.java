import java.io.*;

class BufferedIOStreamExample {
    public static void main(String[] args) {
        try(
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 6-7 21-07\\04-09\\input_image.jpg");
            BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 6-7 21-07\\04-09\\output_image.jpg");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
        ) {
            byte[] buffer = new byte[1024];
            int readBytes = fin.read(buffer);

            // ----------- copying data using buffer array -----------
            // while(readBytes != -1) {
            //     fout.write(buffer, 0, readBytes);
            //     readBytes = fin.read(buffer);
            // }

            // ----------- copying data using bufferedstream -----------
            // int data = bin.read();
            // while(data != -1) {
            //     bout.write(data);
            //     data = bin.read();
            // }

            // ----------- copying data using ByteArrayOutputStream -----------
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while(readBytes != -1) {
                baos.write(buffer, 0, readBytes);
                readBytes = fin.read(buffer);
            }

            // Data stored internally in ByteArrayOutputStream
            // writing all bytes of data at once into output file
            byte[] dataFromBaos = baos.toByteArray();
            fout.write(dataFromBaos);

            System.out.println("Image copied successfully!");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}