import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-6\\08-07-24\\dummy.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // fw.write("Hello how are you?");
            bw.write("Hello how are you?.....");

            System.out.println("success");
            bw.close();
            fw.close();
        }
        catch(Exception e){

        }
    }
}
