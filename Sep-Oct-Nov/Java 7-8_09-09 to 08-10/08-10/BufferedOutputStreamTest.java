import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-6\\06-07-24\\sample.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String s1 = "Hello Aasritha.... 123";
            byte[] data = s1.getBytes();

            // bout.write(65);
            bout.write(data);
            bout.close();
            fout.close();

            System.out.println("success..");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
