import java.io.FileInputStream;

public class FileInputStreamClassTest{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\dataro\\Desktop\\Kiran\\Java 5-6\\06-07-24\\sample.txt");

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