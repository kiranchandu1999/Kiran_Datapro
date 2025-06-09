import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("D:\\Kiran\\Java 7-8 02-06 (extended)\\02-06\\input.txt");
            fw = new FileWriter("D:\\Kiran\\Java 7-8 02-06 (extended)\\02-06\\output.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            // Reading and writing data using FileReader and FileWriter
            // int val = fr.read();

            // while(val != -1) {
            //     // System.out.print((char) val);
            //     fw.write(val);
            //     val = fr.read();
            // }

            // Buffered classed gives more efficiency in reading and writing data
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

            System.out.println("File data copied..");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            // closing resources at the end
            br.close();
            bw.close();
            fw.close();
            fr.close();
        }
    }
}