import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        // should create file output stream object to write data into file
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-7 09-07 to 17-07\\30-07\\sample.txt");

            String s1 = "Hello Ajelia";
            byte[] data = s1.getBytes();

            // fout.write(65);
            fout.write(data);
            fout.close();

            System.out.println("success..");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
