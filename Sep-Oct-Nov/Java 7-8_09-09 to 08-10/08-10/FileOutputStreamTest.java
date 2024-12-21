import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        // should create file output stream object to write data into file
        try{
            FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 7-8_09-09 to 08-10\\08-10\\sample.txt");

            String s1 = "Hello Puja, How are you?";
            byte[] data = s1.getBytes();

            // fout.write('H');
            fout.write(data);
            fout.close();

            System.out.println("success..");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
