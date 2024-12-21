import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderTest{
    public static void main(String[] args) throws IOException{

        // Scanner sc = new Scanner(System.in);

        // to take input from keyboard similiar to scanner class
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(ir);

        String str = br1.readLine();
        System.out.println(str);

        try{
            FileReader fr = new FileReader("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-6\\08-07-24\\dummy.txt");
            BufferedReader br = new BufferedReader(fr);

            // int val = fr.read();

            // while(val != -1){
            //     System.out.print((char) val);
            //     val = fr.read();
            // }

            String s = br.readLine();
            // System.out.println(s);

            while(s != null){
                System.out.println(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}