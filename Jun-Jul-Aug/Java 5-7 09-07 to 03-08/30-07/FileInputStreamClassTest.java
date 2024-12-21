import java.io.FileInputStream;

public class FileInputStreamClassTest{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-7 09-07 to 17-07\\30-07\\sample.txt");

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