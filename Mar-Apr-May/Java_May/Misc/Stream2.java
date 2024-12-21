package Misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Stream2 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\dataro\\Desktop\\Java_Kiran\\file.txt");
            String sentence = "Welcome to datapro dwarakanagr \n new line";
            fw.write(sentence);
            fw.close();
            System.out.println("data added");

            FileReader fr = new FileReader("C:\\Users\\dataro\\Desktop\\Java_Kiran\\file.txt");
            BufferedReader br = new BufferedReader(fr);
            // int val = fr.read();

            // while(val != -1){
            //     System.out.print((char) val);
            //     val = fr.read();
            // }
            
            // fr.close();

            String val = br.readLine();
            System.out.println(val);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
