import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:\\Kiran\\Java 5-6 21-01\\01-03\\demo.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String data1 = "This is first content to be written in the demo file";
            String data2 = "This is second content to be written in the demo file";

            String[] courses = {"Java", "HTML", "CSS", "Python"};
            // fw.write(data1);
            // fw.write(data2);

            bw.write(data1);
            bw.newLine();
            bw.write(data2);

            for(String s: courses) {
                bw.newLine();
                bw.write(s);
            }
            System.out.println("successfully written");

            bw.close();
            fw.close();
            System.out.println("resource closed");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}