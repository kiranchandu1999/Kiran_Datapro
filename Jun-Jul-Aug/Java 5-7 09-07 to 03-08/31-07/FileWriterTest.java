import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-7 09-07 to 03-08\\31-07\\dummy.txt");

            String s = "Hello Ajelia, How are you?";
            fw.write(s);

            System.out.println("success");
            fw.close();
        }
        catch(Exception e){

        }
    }
}
