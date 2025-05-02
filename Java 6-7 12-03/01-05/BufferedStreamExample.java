import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStreamExample {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\Kiran\\Java 6-7 12-03\\01-05\\data\\input.txt");
            BufferedInputStream bin = new BufferedInputStream(fin, 20);
            
            // reading first 5 bytes
            for(int i=1; i<=5; i++) {
                System.out.print((char) bin.read());
            }

            // setting mark at position 6 (after 5 bytes) with read limit 10
            bin.mark(10);
            System.out.println("\nmark set at position 6 with limit 10");

            // now read next 5 bytes
            for(int i=1; i<=5; i++) {
                System.out.print((char) bin.read());
            }

            // now reset the pointer to marked position which is 6
            bin.reset();
            System.out.println("\npointer reset to marked position");

            // // read 8 bytes (within the limit)
            for(int i=1; i<=8; i++) {
                System.out.print((char) bin.read());
            }

            System.out.println("\nreading extra bytes which is exceeding the limit");

            for(int i=1; i<=5; i++) {
                System.out.print((char) bin.read());
            }

            // // after exceeds the limit agian reset, 
            // it will throw exception due to mark invalid
            bin.reset();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
