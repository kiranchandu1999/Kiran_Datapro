import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val = sc.next();
        try{
            int num = Integer.parseInt(val);
            System.out.println(num);
        }
        catch(ArithmeticException e) {
            
        }
        finally {
            sc.close();
            System.out.println("closed");
        }
    }
}
