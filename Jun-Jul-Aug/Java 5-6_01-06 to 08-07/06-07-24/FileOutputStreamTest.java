import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        // should create file output stream object to write data into file
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-6\\06-07-24\\sample.txt");

            String s1 = "Hello Aasritha";
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
