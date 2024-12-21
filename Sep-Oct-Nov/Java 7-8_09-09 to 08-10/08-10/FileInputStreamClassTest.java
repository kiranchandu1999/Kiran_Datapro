import java.io.FileInputStream;

public class FileInputStreamClassTest{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\Kiran\\Java 7-8_09-09 to 08-10\\08-10\\sample.txt");

            int val = fin.read();

            while(val != -1){
                System.out.print((char) val);

                val = fin.read();
            }

            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}