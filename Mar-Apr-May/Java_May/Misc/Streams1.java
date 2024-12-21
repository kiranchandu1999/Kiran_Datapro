package Misc;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.util.Scanner;

public class Streams1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // System.out.println("Hello");

        // create file output stream class object
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\dataro\\Desktop\\Java_Kiran\\file.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String sentence = "Welcome to datapro";
            byte[] barr = sentence.getBytes();
            bout.write(barr);
            bout.close();
            System.out.println("data added");


            // input stream to read data from files
            FileInputStream fin = new FileInputStream("C:\\Users\\dataro\\Desktop\\Java_Kiran\\file.txt");
            int val = fin.read();
            fin.close();

            System.out.println((char) val);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}