import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest{
    public static void main(String[] args) throws IOException{

        try{
            FileReader fr = new FileReader("D:\\Kiran\\Java 7-8_09-09 to 08-10\\09-10\\dummy.txt");
            BufferedReader br = new BufferedReader(fr);

            // int val = fr.read();

            // while(val != -1) {
            //     System.out.print((char) val);
            //     val = fr.read();
            // }

            String val = br.readLine();

            while (val != null) {
                System.out.println(val);
                val = br.readLine();
            }
            
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}