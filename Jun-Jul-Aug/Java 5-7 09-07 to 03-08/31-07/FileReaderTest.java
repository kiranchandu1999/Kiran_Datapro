import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest{
    public static void main(String[] args) throws IOException{

        try{
            FileReader fr = new FileReader("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-7 09-07 to 03-08\\31-07\\dummy.txt");
            BufferedReader br = new BufferedReader(fr);

            // int val = fr.read();

            // while(val != -1){
            //     System.out.print((char) val);
            //     val = fr.read();
            // }

            String val = br.readLine();
            System.out.println(val);

            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}