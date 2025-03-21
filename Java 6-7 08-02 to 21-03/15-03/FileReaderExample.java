import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:\\Kiran\\Java 6-7 08-02\\15-03\\demo.txt");
            BufferedReader br = new BufferedReader(fr);

            fw = new FileWriter("D:\\Kiran\\Java 6-7 08-02\\15-03\\demo2.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            // int val = fr.read();

            String val = br.readLine();

            // while(val != -1) {
            //     System.out.print((char) val);
            //     val = fr.read();
            // }

            while(val != null) {
                System.out.println(val);
                
                bw.write(val);
                bw.newLine();
                System.out.println("line written");

                val = br.readLine();
            }

            br.close();
            bw.close();
            fw.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}