import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:\\Kiran\\Java 6-7 12-03\\02-05\\input.txt");
            fw = new FileWriter("D:\\Kiran\\Java 6-7 12-03\\02-05\\output.txt");
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            // PrintWriter pw = new PrintWriter(fw);

            // pw.println("Hello world");

            // char[] buffer = new char[10];
            // int val = fr.read();

            // while(val != -1) {
            //     // System.out.print((char) val);
            //     fw.write(val);
            //     val = fr.read();
            // }

            // file data reading and writing using buffered objects
            // String line = br.readLine();

            // while(line != null) {
            //     bw.write(line);
            //     bw.write(",");
            //     line = br.readLine();
            // }

            // copying data with new lines
            int val = br.read();

            while(val != -1) {
                if(((char) val) == ',') {
                    bw.newLine();
                }
                else {
                    bw.write(val);
                }
                val = br.read();
            }

            br.close();
            bw.close();
            fw.close();
            fr.close();
            // pw.close();

            System.out.println("File data copied..");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}