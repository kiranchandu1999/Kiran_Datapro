import java.io.*;

class FileWriterReaderExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("D:\\Kiran\\Java 6-7 21-07\\05-09\\file_data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // fw.write("Hello world!");
            // fw.write("\nSecond line data");
            // fw.write("\nThird line data");

            bw.write("Hello world!");
            bw.write("\nSecond line data");
            bw.newLine();
            bw.write("Third line data");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader("D:\\Kiran\\Java 6-7 21-07\\05-09\\file_data.txt");
            BufferedReader br = new BufferedReader(fr);    
        ) {
            // int val = fr.read();
            // while(val != -1) {
            //     System.out.print((char) val);
            //     val = fr.read();
            // }

            // using buffered reader
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}