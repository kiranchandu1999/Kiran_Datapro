import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:\\Kiran\\Java 7-8_09-09 to 08-10\\09-10\\dummy.txt");

            String s = "Hello Puja, How are you?";
            fw.write(s);

            System.out.println("success");
            fw.close();
        }
        catch(Exception e){

        }
    }
}
